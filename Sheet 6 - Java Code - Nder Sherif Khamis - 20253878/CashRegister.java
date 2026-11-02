/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

class CashRegister {
    private int itemCount;
    private double totalPrice;

    public CashRegister() {
        itemCount = 0;
        totalPrice = 0;
    }

    public CashRegister(int itemCount, double totalPrice) {
        this.itemCount = itemCount;
        this.totalPrice = totalPrice;
    }

    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
    }

    public void clear() {
        itemCount = 0;
        totalPrice = 0;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

public class CashRegister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CashRegister register = new CashRegister();

        System.out.print("Enter the price of item 1: ");
        double price1 = input.nextDouble();

        System.out.print("Enter the price of item 2: ");
        double price2 = input.nextDouble();

        register.addItem(price1);
        register.addItem(price2);

        System.out.println("Item count = " + register.getItemCount());
        System.out.println("Total price = " + register.getTotalPrice());

        input.close();
    }
}
