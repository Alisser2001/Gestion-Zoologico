/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventory;

import java.util.Scanner;

/**
 *
 * @author Alisser
 */
public class ProductTester {
    public static void main(String[] args) {
        
        //Laboratorio #1
        
        Scanner in = new Scanner(System.in);
        Product p1 = new Product();
        p1.setNameProduct("Cuaderno");
        p1.setIdNumber(1);
        p1.setStock(35);
        p1.setPrice(3500);
        Product p2 = new Product();
        p2.setNameProduct("Lapicero");
        p2.setIdNumber(2);
        p2.setStock(160);
        p2.setPrice(1200);
        Product p3 = new Product("Regla", 3, 15, 2250);
        Product p4 = new Product("Lapiz", 4, 45, 900);
        Product p5 = new Product("Corrector", 5, 8, 2200);
        Product p6 = new Product("Borrador", 6, 46, 700);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        
        //Laboratorio #2
        
        String tempName;
        int tempNumber, tempQty;
        float tempPrice;
        System.out.println("Ingrese el nombre del producto: ");
        tempName = in.next();
        System.out.println("Ingrese el número del producto: ");
        tempNumber = in.nextInt();
        System.out.println("Ingrese la cantidad del producto: ");
        tempQty = in.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        tempPrice = in.nextFloat();
        
        Product p7 = new Product(tempName, tempNumber, tempQty, tempPrice);
        Product p8 = new Product();
        in.nextLine();
        p8.setNameProduct(tempName);
        p8.setIdNumber(tempNumber);
        p8.setStock(tempQty);
        p8.setPrice(tempPrice);
        in.close();
        p7.setStatus(false);
        
        System.out.println(p7.toString());
        System.out.println(p8.toString());
    }
}
