// ---------- SWITCH DE TEMA CLARO / ESCURO ----------
document.addEventListener("DOMContentLoaded", () => {
    const toggle = document.getElementById("toggle-theme");
    const temaSalvo = localStorage.getItem("tema") || "dark";

    // Aplica o tema salvo
    document.body.classList.remove("light-mode", "dark-mode");
    document.body.classList.add(temaSalvo + "-mode");
    toggle.checked = temaSalvo === "light";

    // Quando alternar
    toggle.addEventListener("change", () => {
        if (toggle.checked) {
            document.body.classList.replace("dark-mode", "light-mode");
            localStorage.setItem("tema", "light");
        } else {
            document.body.classList.replace("light-mode", "dark-mode");
            localStorage.setItem("tema", "dark");
        }
    });
});


// ---------- ADICIONAR AO CARRINHO ----------
document.addEventListener("DOMContentLoaded", () => {
    const botoes = document.querySelectorAll(".add-to-cart");
    botoes.forEach(botao => {
        botao.addEventListener("click", () => {
            const nome = botao.dataset.nome;
            const preco = parseFloat(botao.dataset.preco);

            const carrinho = JSON.parse(localStorage.getItem("carrinho")) || [];
            carrinho.push({ nome, preco });

            localStorage.setItem("carrinho", JSON.stringify(carrinho));
            alert(`${nome} foi adicionado ao carrinho!`);
        });
    });

    // ---------- MOSTRAR CARRINHO NA PÁGINA FINALIZAR ----------
    const lista = document.getElementById("cart-items");
    const total = document.getElementById("cart-total");
    if (lista && total) {
        const carrinho = JSON.parse(localStorage.getItem("carrinho")) || [];

        lista.innerHTML = "";
        let soma = 0;

        carrinho.forEach(item => {
            const li = document.createElement("li");
            li.textContent = `${item.nome} - R$ ${item.preco.toFixed(2)}`;
            lista.appendChild(li);
            soma += item.preco;
        });

        total.textContent = soma.toFixed(2);

        // Botão de limpar
        const clearBtn = document.getElementById("clear-cart");
        clearBtn.addEventListener("click", () => {
            localStorage.removeItem("carrinho");
            alert("Carrinho esvaziado!");
            window.location.reload();
        });

        // Finalizar compra
        const form = document.getElementById("checkout-form");
        form.addEventListener("submit", e => {
            e.preventDefault();
            alert("Compra finalizada com sucesso! Obrigado pela preferência.");
            localStorage.removeItem("carrinho");
            window.location.href = "index.html";
        });
    }
});




