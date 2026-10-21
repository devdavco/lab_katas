import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la bebida: ");

        String nombreBebida = sc.nextLine();
        System.out.print("Ingrese la temperatura: ");
        float temperatura = sc.nextFloat();
        String textoTemperatura = "";

        if(temperatura > 60){
            textoTemperatura = " Caliente";
        } else if ( temperatura >= 30 && temperatura <= 60) { ///aqui puedo omitir la validación < = 60
            textoTemperatura = "Templada";
        } else {
            textoTemperatura = "Fría";
        }

        System.out.println(nombreBebida + " : " + textoTemperatura);

    }
}
