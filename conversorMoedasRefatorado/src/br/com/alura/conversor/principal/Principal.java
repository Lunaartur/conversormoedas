package br.com.alura.conversor.principal;

import br.com.alura.conversor.modelos.Cambio;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    private static final String API_URL_RADICAL = "https://v6.exchangerate-api.com/v6/";
    private static final String MYKEY = "ad7bb28d3171c8ef9cf46a21"; // Minha API key privada

    public static void main(String[] args) throws Exception {
        double valor;
        String m1, m2;
        String resultado;
        Scanner leitura = new Scanner(System.in);

        while (true) {
            var menu = """
                    **************** Escolha as moedas para conversão
                    
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
                     
                    0 - Sair                                 
                    """;

            System.out.println(menu);
            var opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 0) {
                System.out.println("Saindo do conversor de moedas");
                break;
            }

            valor = retornaValor();

            switch (opcao) {
                case 1:
                    m1 = "USD";
                    m2 = "ARS";
                    break;
                case 2:
                    m1 = "JPY";
                    m2 = "BRL";
                    break;
                case 3:
                    m1 = "EUR";
                    m2 = "CAD";
                    break;
                case 4:
                    m1 = "CNY";
                    m2 = "EUR";
                    break;
                case 5:
                    m1 = "BRL";
                    m2 = "GBP";
                    break;
                case 6:
                    m1 = "ARS";
                    m2 = "INR";
                    break;
                case 7:
                    m1 = "AUD";
                    m2 = "CHF";
                    break;
                case 8:
                    m1 = "EUR";
                    m2 = "USD";
                    break;
                case 9:
                    m1 = "CAD";
                    m2 = "BRL";
                    break;
                case 10:
                    m1 = "ARS";
                    m2 = "GBP";
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    continue;
            }

            try {
                resultado = retornaMoedas(m1, m2, valor);
                System.out.println(resultado);
            } catch (Exception e) {
                System.out.println("Erro ao converter moedas: " + e.getMessage());
            }
        }
    }



    public static String retornaMoedas(String m1, String m2, double valor) throws Exception {

        //Realizando conexão e requisição com a web
        HttpClient httpClient = HttpClient.newHttpClient();
        URI uri = URI.create(API_URL_RADICAL + MYKEY + "/latest/" + m1);

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Falha ao obter dados da API: " + response.statusCode());
        }

        Gson gson = new GsonBuilder().create();
        Cambio cambio = gson.fromJson(response.body(), Cambio.class);

        Map<String, Double> taxasDeCambio = cambio.getTaxasDeCambio();
        Double taxaM2 = taxasDeCambio.get(m2);

        if (taxaM2 == null) {
            throw new RuntimeException("Moeda inválida fornecida.");
        }


        //Convertendo valor dos meus 2 parâmetros
        double valorConvertido = valor * taxaM2;
        return String.format("Valor convertido: %.2f %s", valorConvertido, m2);
    }

    public static double retornaValor() {
        System.out.println("Informe o valor para conversão: ");
        Scanner leitura = new Scanner(System.in);
        double valor = leitura.nextDouble();
        leitura.nextLine();
        return valor;
    }
}
