package src;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Scanner scc = new Scanner(System.in);
    static Product[] programming = {
            new Product("Rasberri pi", "Lenovo", 40),
            new Product("Rasberri pi", "Logitech", 50),
            new Product("Keyboard", "Corsair", 400),
            new Product("Keyboard", "Logitech", 500),
            new Product("Laptop gamer", "AMD", 2255),
            new Product("Laptop gamer", "Lenovo", 2000),
            new Product("Laptop gamer", "Intel", 2500),
            new Product("Laptop gamer", "Asus", 2000),
            new Product("Processor", "AMD", 2000),
            new Product("Processor", "Intel", 1500),
            new Product("Ram memory", "Corsair", 30),
            new Product("Ram memory", "AMD", 40),
            new Product("Screen", "Lenovo", 920),
            new Product("Screen", "Asus", 1000),
            new Product("Memory SSD", "Samsung", 600),
            new Product("Memory SSD", "Corsair", 450),
            new Product("Memory SSD", "Intel", 500)
    };
    static Product[] entertaiment = {
            new Product("Tv", "Samsung", 1500),
            new Product("Tv", "Lg", 1000),
            new Product("Console", "Xbox", 1500),
            new Product("Console", "Play Station", 1500),
            new Product("Laptop gamer", "AMD", 2255),
            new Product("Laptop gamer", "Lenovo", 2000),
            new Product("Laptop gamer", "Intel", 2500),
            new Product("Laptop gamer", "Asus", 2000)
    };
    static Product[] daily = {
            new Product("Multi-socket charger", "AMD", 10),
            new Product("Rice cooker", "Samsung", 60),
            new Product("Rice cooker", "AMD", 50),
            new Product("Rice cooker", "Lg", 100),
            new Product("Refrigerator", "Samsung", 950),
            new Product("Refrigerator", "Lg", 1100),
            new Product("Refrigerator", "AMD", 1000),
            new Product("Blender", "Lg", 200),
            new Product("Blender", "Samsung", 150),
            new Product("Blender", "Asus", 200)
    };
    static Category[] categories = {
            new Category("Programming",programming),
            new Category("Entertaiment",entertaiment),
            new Category("Daily",daily)
    };

    static Catalog catalogo = new Catalog(categories);
    static Shopping carrito = new Shopping();

    public static int orderNum(Scanner sc){
        int opc;
        while (true){
            try{
                System.out.print("Enter a number: ");
                opc = sc.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Error - try again");
                sc.nextLine();
            }
        }
        return opc;
    }
    public static void continuacion(Scanner sc){
        System.out.println("Press a key to continue...");
        sc.nextLine();
    }
    public static int menu(){
        System.out.println("""
                1. Categories
                2. Open category
                3. Search by name
                4. Search by brand
                5. Add product to the cart
                6. Remove product to the cart
                7. Display shopping cart
                8. Exit
                """);
        return orderNum(sc);
    }

    public static boolean opciones(int opc){
        sc.nextLine();
        boolean exit = false;
        if (opc == 1 ){
            System.out.println("\nCategories:");
            catalogo.displayList();
            continuacion(scc);
        } else if (opc == 2) {
            System.out.println("\nCategories:");
            catalogo.displayList();
            System.out.println("Enter the category");
            catalogo.getCategory(orderNum(sc)-1).displayList();
            continuacion(scc);
        }else if (opc == 3){
            System.out.println("\nEnter the name of the product:");
            catalogo.searchName(sc.nextLine());
            continuacion(scc);
        }else if (opc == 4){
            System.out.println("\nEnter the brand of the product:");
            catalogo.searchBrand(sc.nextLine());
            continuacion(scc);
        }else if (opc == 5){
            System.out.println("\nCategories:");
            catalogo.displayList();
            System.out.println("Enter the category");
            int cat = orderNum(sc)-1;
            System.out.println("\nProducts:");
            catalogo.getCategory(cat).displayList();
            System.out.println("Enter the product");
            int pro = orderNum(sc)-1;
            carrito.addProduct(catalogo.getCategory(cat).getProduct(pro));
            System.out.println("The product had been added");
            continuacion(scc);
        }else if (opc == 6){
            System.out.println("\nYour shopping cart");
            carrito.display();
            System.out.println("Enter the product you will remove");
            carrito.deleteProduct(orderNum(sc));
            continuacion(scc);
        }else if (opc == 7){
            System.out.println("\nYour shopping cart:");
            carrito.display();
            if (carrito.total()>0){
                System.out.println("Total: " + "$" + carrito.total());
            }
            continuacion(scc);
        } else if (opc == 8) {
            System.out.println("The program will close");
            exit = true;
        }
        return exit;
    }
    public static void run(){
        boolean exit = false;
        System.out.println("Welcome to the catalog");
        while(!exit){
            exit = opciones(menu());
        }
    }
    public static void main(String[] cfvgbhnj){
        run();
    }
}
