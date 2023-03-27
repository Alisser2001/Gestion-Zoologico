/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alisser
 */
public class ProductTester {

    public static void main(String[] args) throws Exception {
        int maxSize, menuChoice;
        Scanner in = new Scanner(System.in);

        maxSize = getNumProducts(in);

        if (maxSize == 0) {
            System.out.println("No se requieren productos.");
        } else {
            Product[] productos = new Product[maxSize];
            addToInventory(productos, in);
            do {
                menuChoice = getMenuOption(in);
                executeMenuChoice(menuChoice, productos, in);
            } while (menuChoice != 0);
        }
    }

    public static void executeMenuChoice(int menuChoice, Product[] productos, Scanner in) {
        switch (menuChoice) {
            case 1:
                System.out.println("View Product List\n");
                displayInventory(productos);
                break;
            case 2:
                System.out.println("Add Stock\n");
                addInventory(in, productos);
                break;
            case 3:
                System.out.println("Deduct Stock\n");
                deductInventory(in, productos);
                break;
            case 4:
                System.out.println("Discontinue Stock\n");
                discontinueInventory(in, productos);
                break;
        }
    }

    public static void displayInventory(Product[] productos) {
        for (Product producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public static void addToInventory(Product[] productos, Scanner in) {
        String tempName;
        int tempNumber, tempQty;
        float tempPrice;
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ": ");
            tempName = in.next();
            System.out.println("Ingrese el id del producto: ");
            tempNumber = in.nextInt();
            System.out.println("Ingrese la cantidad del producto: ");
            tempQty = in.nextInt();
            System.out.println("Ingrese el precio del producto: ");
            tempPrice = in.nextFloat();
            Product product = new Product(tempName, tempNumber, tempQty, tempPrice);
            productos[i] = product;
        }
    }

    public static int getNumProducts(Scanner in) {
        int maxSize = 0;
        System.out.println("Enter the number of products you would like to add\nEnter 0 (zero) if you do not wish to add products:");
        do {
            try {
                maxSize = in.nextInt();
                if (maxSize < 0) {
                    System.out.println("Valor incorrecto introducido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de datos incorrecto introducido.");
                maxSize = -1;
            } catch (Exception e) {
                System.out.println("Ocurrió un error.");
                maxSize = -1;
            }
            in.nextLine(); // Limpia el buffer de entrada
        } while (maxSize < 0);
        return maxSize;
    }

    public static int getMenuOption(Scanner in) {
        int option = 0;
        System.out.println("1. View Inventory\n"
                + "2. Add Stock\n"
                + "3. Deduct Stock\n"
                + "4. Discontinue Product\n"
                + "0. Exit\n"
                + "Please enter a menu option:");
        do {
            try {
                option = in.nextInt();
                if (option < 0 || option > 4) {
                    System.out.println("Valor incorrecto introducido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de datos incorrecto introducido.");
                option = -1;
            } catch (Exception e) {
                System.out.println("Ocurrió un error.");
                option = -1;
            }
            in.nextLine(); // Limpia el buffer de entrada
        } while (option < 0 || option > 4);
        return option;
    }

    public static int getProductNumber(Scanner in, Product[] productos) {
        int productChoice = 0;
        System.out.println("Productos: ");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i].getName());
        }
        System.out.println("¿Qué producto quiere actualizar?");
        do {
            try {
                productChoice = in.nextInt();
                if (productChoice < 0 || productChoice > productos.length) {
                    System.out.println("Valor incorrecto introducido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de datos incorrecto introducido.");
                productChoice = -1;
            } catch (Exception e) {
                System.out.println("Ocurrió un error.");
                productChoice = -1;
            }
            in.nextLine(); // Limpia el buffer de entrada
        } while (productChoice < 0 || productChoice > productos.length);
        return productChoice;
    }

    public static void addInventory(Scanner in, Product[] productos) {
        int productChoice, updateValue = 0;
        productChoice = getProductNumber(in, productos);
        System.out.println("¿Cuántos productos quiere agregar?");
        do {
            try {
                updateValue = in.nextInt();
                if (updateValue < 0) {
                    System.out.println("Valor incorrecto introducido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de datos incorrecto introducido.");
                updateValue = -1;
            } catch (Exception e) {
                System.out.println("Ocurrió un error.");
                updateValue = -1;
            }
            in.nextLine(); // Limpia el buffer de entrada
        } while (updateValue < 0);
        productos[productChoice - 1].addToInventory(updateValue);
    }

    public static void deductInventory(Scanner in, Product[] productos) {
        int productChoice, deductValue = 0;
        productChoice = getProductNumber(in, productos);
        System.out.println("¿Cuántos productos quiere restar?");
        do {
            try {
                deductValue = in.nextInt();
                if (deductValue < 0) {
                    System.out.println("Valor incorrecto introducido");
                }
                if (deductValue > productos[productChoice - 1].getQty()) {
                    System.out.println("Valor superior al stock introducido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de datos incorrecto introducido.");
                deductValue = -1;
            } catch (Exception e) {
                System.out.println("Ocurrió un error.");
                deductValue = -1;
            }
            in.nextLine(); // Limpia el buffer de entrada
        } while (deductValue < 0 || deductValue > productos[productChoice - 1].getQty());
        productos[productChoice - 1].deductFromInventory(deductValue);
    }

    public static void discontinueInventory(Scanner in, Product[] productos) {
        int productChoice;
        productChoice = getProductNumber(in, productos);
        productos[productChoice - 1].setStatus(false);
    }
}
