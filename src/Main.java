import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            int choice;
            char size;
            boolean pepp, saus, mush, vegan;
            PizzaOrder myOrder = new PizzaOrder();
            Scanner keyboard = new Scanner(System.in);


            do {
                System.out.println("~~~Welcome to MiraCosta's Pizza Parlor~~~");
                System.out.println("Enter (1) to order a Pizza");
                System.out.println("Enter (2) to view order");
                System.out.println("Enter (3) to checkout");
                choice = keyboard.nextInt();
                System.out.println();
                keyboard.nextLine();
// next line reads whole line, next just reads the next word

                switch (choice) {
                    case 1:
                        System.out.println("What size pizza would you like (S, M, L)?");
                        size = keyboard.next().toUpperCase().charAt(0);
                        System.out.println("Please enter your toppings:");
                        System.out.print("Pepperoni (Y/N)? ");
                        pepp = keyboard.next().equalsIgnoreCase("Y");
                        System.out.print("Sausage   (Y/N)? ");
                        saus = keyboard.next().equalsIgnoreCase("Y");
                        System.out.print("Mushrooms (Y/N)? ");
                        mush = keyboard.next().equalsIgnoreCase("Y");
                        System.out.print("Vegan     (Y/N)? ");
                        vegan = keyboard.next().equalsIgnoreCase("Y");

                        myOrder.addPizzaToOrder(size, pepp, mush, saus, vegan);
                        break;

                    case 2:
                        System.out.println(myOrder);
                        break;

                    case 3:
                        NumberFormat currency = NumberFormat.getCurrencyInstance();
                        System.out.println("Please pay " + currency.format(myOrder.calcCost()) +" at the counter. \nThank you for visiting MiraCosta's Pizza Parlor!");
                        break;
                }
                System.out.println();
            } while (choice != 3);

            keyboard.close();
        }
    }

