import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        //Calculadora de pedidos con IVA
        Scanner sc = new Scanner(System.in);

        int precioProducto = 0;
        int totalProductos = 0;

        final double DESCUENTO = 0.10;
        final double IVA = 0.19;
        boolean aplicaDescuento = false;

        do{
            System.out.print("Ingrese el precio del producto (0 para terminar): ");
            precioProducto = sc.nextInt();
            totalProductos += precioProducto;

        } while(precioProducto !=0);
        sc.close();
        System.out.println("Subtotal: $" + totalProductos);
        double precioConIVA = totalProductos * IVA;
        double totalConIva = totalProductos + precioConIVA;
        if(totalConIva > 50000){
            aplicaDescuento = true;
        }
        System.out.println("IVA (19%): $" + precioConIVA);
        double totalConDescuento = totalConIva - (totalConIva * DESCUENTO);
        if(aplicaDescuento){
            System.out.println("Descuento ("+(int)(DESCUENTO*100)+"%): $"+ (int)(totalConIva * DESCUENTO));
            System.out.println("Total a pagar: $" + totalConDescuento);
        }else{
            System.out.println("Total: $" + (int)totalConIva);
        }

    }
}
