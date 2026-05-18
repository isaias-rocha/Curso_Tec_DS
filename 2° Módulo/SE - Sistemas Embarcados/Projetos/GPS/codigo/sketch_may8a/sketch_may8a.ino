// Desenvolvimento da Lógica de Programação

1// Inicialmente, realizamos a inclusão de todas as bibliotecas para o Projeto Arduino GPS 6M. Primeiramente, declaramos as bibliotecas SD.h e SPI.h para o módulo leitor de cartão SD.
// Em seguida, declaramos as bibliotecas SoftwareSerial.h e TinyGPS para o módulo GPS NEO-6M
#include <SD.h>
#include <SPI.h>
#include <SoftwareSerial.h>
#include <TinyGPS.h>


// Utilizou-se a biblioteca Software Serial para criar duas portas de comunicação serial, conforme definidas na linha 12. O4 e 03 representam, respectivamente, os pinos Rx e Tx.
SoftwareSerial SerialGPS(4, 3);


// Em seguida, foram definidos os objetos GPS e myFile para os módulos. Posteriormente, declaramos as variáveis e definimos nomes para os pinos de conexão dos Botões e LED.
TinyGPS GPS;
File myFile;

//Logo após as definições de nomes, o fluxo de execução entrará na função setup e realizará as configurações iniciais.
bool controle = 0;
float lat, lon, vel;
unsigned long data, hora;
unsigned short sat;
byte pinoCS = 10;  //Pin 10 para Nano/UNO

#define INICIA 9
#define TERMINA 5
#define LEDVERMELHO 2


//Configurações de Inicialização dos Módulos na Função Setup
void setup() {

  // Primeiramente, o GPS 6M e a comunicação serial serão inicializados. Em seguida, será realizada a inicialização de comunicação do SD Card.
  // Caso ocorra alguma falha de comunicação com o Módulo SD Card, o sistema apresentará uma mensagem de erro no monitor serial.
  SerialGPS.begin(9600);
  Serial.begin(9600);

  Serial.println("Buscando satélites...");

  pinMode(pinoCS, OUTPUT);  //Define o pinoSS como saida
  pinMode(LEDVERMELHO, OUTPUT);

  if (SD.begin())  //Inicializa o SD Card
  {
    Serial.println("SD Card pronto para uso.");  //Imprime na tela
  } else {
    Serial.println("Falha na inicialização do SD Card.");
    return;
  }
}

//  Title: Execução da Lógica Principal do Datalogger de Percurso
void loop() {

  //Inicialmente, o sistema irá realizar a leitura dos botões de Início e Término.
  bool BotaoInicia = digitalRead(INICIA);
  bool BotaoTermina = digitalRead(TERMINA);

  // Quando o usuário pressionar o Botão Iniciar, o fluxo de código entrará na condição a seguir e executará as seguintes linhas de código.
  if (BotaoInicia == 1) {
    controle = 1;
    myFile = SD.open("GPS.txt", FILE_WRITE);  //Cria e abre o arquivo
    delay(1000);
    myFile.print("Latitude");
    myFile.println("  Longitude");
  }


  // Title: Gravação de dados no Cartão de Memória
  // Descricao: Agora, de acordo com o código abaixo, o fluxo entrará na condição de gravação dos dados do GPS no módulo. Após o GPS receber os dados, o sistema irá ligar o LED Vermelho, conforme apresentado na Figura 3. O LED irá sinalizar a coleta e gravação de dados no módulo SD Card.
  if (BotaoTermina == 1) {
    controle = 0;
    myFile.close();
    digitalWrite(LEDVERMELHO, LOW);
  }

  if (controle == 1) {
    while (SerialGPS.available()) {
      if (GPS.encode(SerialGPS.read())) {
        digitalWrite(LEDVERMELHO, HIGH);

      // Logo após as definições de nomes, o fluxo de execução entrará na função setup e realizará as configurações iniciais.

        //latitude e longitude
        GPS.f_get_position(&lat, &lon);


      // Por fim, de acordo com as linhas de código a seguir, os dados serão escritos no arquivo de texto.
      //Conforme é possível observar, foi realizada uma leitura e gravação a cada 1 segundo.
        myFile.print(lat, 6);
        myFile.println(lon, 6);
        delay(10000); 
      }
    }
  }
}



/*
    if(BotaoTermina == 1)
    {
      controle = 0;
      myFile.close();
      digitalWrite(LEDVERMELHO, LOW);
    }
*/

//Primeiramente, a variável controle será colocada para 0. Desse modo, o sistema irá parar de gravar dados no cartão de memória. 
//Em seguida, o arquivo será fechado e o LED Vermelho será desligado, a fim de informar que o sistema parou de capturar dados do módulo GPS.

//Portanto, após esta ação, necessitamos coletar os dados do cartão de memória e apresentá-los em um mapa, para visualizar o percurso realizado.