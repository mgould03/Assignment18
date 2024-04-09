import java.util.Scanner;
public class ShoppingCartPrinter extends ItemToPurchase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Item 1");
        ItemToPurchase item1 = new ItemToPurchase();
        System.out.println("Enter the item name:");
        item1.setName(scanner.nextLine());
        System.out.println("Enter the item price:");
        item1.setPrice(scanner.nextInt());
        System.out.println("Enter the item quantity:");
        item1.setQuantity(scanner.nextInt());
        scanner.nextLine();
        System.out.println("\nItem 2");
        ItemToPurchase item2 = new ItemToPurchase();
        System.out.println("Enter the item name:");
        item2.setName(scanner.nextLine());
        System.out.println("Enter the item price:");
        item2.setPrice(scanner.nextInt());
        System.out.println("Enter the item quantity:");
        item2.setQuantity(scanner.nextInt());
        int totalCost = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
        System.out.println("\nTOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + (item1.getPrice() * item1.getQuantity()));
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + (item2.getPrice() * item2.getQuantity()));
        System.out.println("\nTotal: $" + totalCost);
        scanner.close();
    }
}
