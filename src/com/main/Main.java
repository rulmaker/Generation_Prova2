package com.main;

import java.util.Scanner;
import com.factura.Factura;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de pedido: ");
        int numero = sc.nextInt();
        System.out.println("Introduce la descripción de producto: ");
        String descripcion = sc.next();
        System.out.println("Ahora la cantidad: ");
        int cantidad = sc.nextInt();
        System.out.println("Por último el precio por producto: ");
        double precioPorItem = sc.nextDouble();

        Factura factura = new Factura(numero, descripcion,cantidad, precioPorItem);

        System.out.println(factura);

        sc.close();
    }
}
