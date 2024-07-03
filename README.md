![javaconversor](https://github.com/Lunaartur/conversormoedas/assets/125662966/bc91b320-b38b-49b8-b45f-63f4f03219c5)
# 🚀 Coversor De Moedas

O Conversor de Moedas utiliza a Api ExchangeRate-Api para realizar as 10 conversões já predefinindas, permitindo que o usuário escolha entre uma das 10 opções de conversão e entre com um valor para que a converaõ seja realizada.

### 📋 Pré-requisitos e Links 

- Ferramenta de Desenvolvimento: IntelliJ IDEA.
link para download: https://www.jetbrains.com/pt-br/idea/
- Versão Java: Java 22.
- Pacote Gson V2.10.1 -> Pode ser Obtido pelo link abaixo
link para download: https://mvnrepository.com/artifact/com.google.code.gson/gson

obs: Pode ser utilida outra IDEA, desde que tenha suporte aos recursos Java.

# ⚙️ Testando

- Assim que o Projeto for executado, selecionar as moedas desejadas para conversão.
- Informar a quantidade para conversão.

## 🛠️ Explicação do Código

- A classe Principal solicita a api os detalhes com a moeda desejada que foi escolhida no menu como sendo parâmetro
- O código manipula um objeto json que foi retornado pela API com essa m1(moeda desejada) como parâmetro principal.
- Classe câmbio recebe todos os objetos.
- Manipulamos o objeto "taxasDeCambio" sendo mapeado.
- Dentro da minha Principal é referenciado o objeto e então o segundo parâmetro m2(moeda para conversão com m1).
- Usuário entra com valor para conversão e então conversão é realizada
- Apresentado os valores para o usuário.

## 📌 Conversões Possíveis

                    1 - Dólar => Peso argentino
                    2 - Iene Japonês => Real
                    3 - Euro => Dólar Canadense
                    4 - Yuan Chinês => Euro
                    5 - Real => Libra Esterlina
                    6 - Peso Argentino => Rupia Indiana
                    7 - Dólar Australiano => Franco Suíço
                    8 - Euro => Dólar
                    9 - Dólar Canadense => Real
                    10 - Peso Argentino => Libra Esterlina


&copy; 2024 Conversor de Moedas, POWERED BY Luna, Arthur


