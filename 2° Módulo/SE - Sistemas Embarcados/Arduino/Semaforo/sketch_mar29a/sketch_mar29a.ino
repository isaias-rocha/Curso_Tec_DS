void setup() {
  pinMode (8, OUTPUT);
  pinMode (9, OUTPUT);
  pinMode (10, OUTPUT);
}


void loop() { 

// Led verde
  digitalWrite(8, HIGH);
  delay (10000);
  digitalWrite(8, LOW);

  //led amarelo
  digitalWrite(9, HIGH); 
  delay (3000);
  digitalWrite(9, LOW);

  // led vermelho
  digitalWrite(10, HIGH);
  delay (10000);
  digitalWrite(10, LOW); 
}