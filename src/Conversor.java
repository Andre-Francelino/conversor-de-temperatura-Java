import java.util.Scanner;

public class Conversor {

/*
* Objetivo: Criar um conversor de Celsius para Fahrenheit e de Fahrenheit para Celcius
*
* Etapas do projeto:
*
* 1 - Obter do usuário se ele quer converter Celsius ou Fahrenheit
* 2 - Criar duas funções, uma para cada conversão
* 3 - Obter a temperatura em cada uma das funções escolhidas
* 4 - Exibir uma mensagem com a temperatura, ex.: De x C para y F
*
* */

    public static void main(String[] args) {

        System.out.println("\nEscolha uma opção: \n");
        System.out.println("1 - Converter temperatura de Celsius para Fahrenheit.");
        System.out.println("2 - Converter temperatura de Fahrenheit para Celsius.");

        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o valor da temperatura que você quer converter de Celsius para Fahrenheit:");
            double temperatura = entrada.nextDouble();
            double temperaturaConvertida = converteCelsiusParaFahrenheit(temperatura);
            System.out.println("Conversão de " + temperatura + "C" + " para " + temperaturaConvertida + "F realizada com sucesso!");
        } else if (opcao == 2) {
            System.out.println("Digite o valor da temperatura que você quer converter de Fahrenheit para Celsius:");
            double temperatura = entrada.nextDouble();
            double temperaturaConvertida = converteFahrenheitParaCelsius(temperatura);
            System.out.println("Conversão de " + temperatura + "F" + " para " + temperaturaConvertida + "C realizada com sucesso!");
        } else {
            System.out.println("Opção inválida!");
            System.out.println("Execute o programa novamente e escolha uma das opções sugeridas.");
        }

        entrada.close();
        
    }

    public static double converteCelsiusParaFahrenheit(double temperaturaEmCelsius) {
        return (temperaturaEmCelsius * 9/5) + 32;
    }

    public static double converteFahrenheitParaCelsius(double temperaturaEmFahrenheit) {
        return (temperaturaEmFahrenheit - 32) * 5/9;
    }

}
