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

        fahrenheit = (Celsius * 1.8) + 32;
        Kelvin = Celsius + 273.15;

        exibirResultados();

    }

    public void exibirResultados(){

        System.out.println("********************");
        System.out.println(Celsius + "°C equivalem a:");
        System.out.println(fahrenheit + "°F (fahrenheit)");
        System.out.println(Kelvin + "°K (Kelvin)");
        System.out.println("*********************");

    }
}
