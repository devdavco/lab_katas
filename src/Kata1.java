import java.util.Scanner;

public class Kata1 {
//Calcular propina

    public static void main(String[] args) {

        boolean porceentajeValido = true;
        boolean totalValido = true;
        String mensajePropina = "";
        String mensajeError = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el total de la cuenta:");
        int total_cuenta = sc.nextInt();

        System.out.print("Ingresa el porcentaje de propina:");
        int porcentajePropina = sc.nextInt();

        sc.close();


        if(porcentajePropina < 0 || porcentajePropina > 100){
            porceentajeValido = false;
            mensajeError = "Error: porcentaje inválido";
        }else if(porcentajePropina>30){
            mensajePropina = "¡Propina generosa!";
        }else if( porcentajePropina < 5){
            mensajePropina = "Propina muy baja";
        }

        if(total_cuenta < 0){
            totalValido = false;
            mensajeError = "Error: total inválido";
        }
        if(totalValido && porceentajeValido){
            int calcularPropina = porcentajePropina * total_cuenta/100;
            int costoTotal= total_cuenta+ calcularPropina;
            System.out.println("Propina: " + costoTotal);
            System.out.println(mensajePropina);
        }else {
            System.out.println(mensajeError);
        }

    }

}

