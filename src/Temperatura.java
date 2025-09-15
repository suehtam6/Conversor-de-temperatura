import java.util.Scanner;

public class Temperatura{

    double Celsius;
    double fahrenheit;
    double Kelvin;


    public void getData(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a temperatura em celsius que você gostaria de converter?");
        Celsius = leitor.nextDouble();


        calculandoTemperatura();

    }


    public void calculandoTemperatura(){

        fahrenheit = Celsius * 1.8 + 32;
        Kelvin = Celsius + 273.15;

        exibirResultados();

    }

    public void exibirResultados(){

        String resultadoComDoisValoresKelvin = String.format("%.2f", Kelvin);
        String resultadoComDoisValoresFahrenheit = String.format("%.2f", fahrenheit);
        System.out.println("********************");
        System.out.println("Celsius: " + Celsius);
        System.out.println("Fahrenheit: " + resultadoComDoisValoresFahrenheit);
        System.out.println("Kelvin: " + resultadoComDoisValoresKelvin);
        System.out.println("*********************");

    }
}
