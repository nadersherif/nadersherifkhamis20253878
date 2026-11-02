/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Invoice {
    private String invoiceID;
    private double discount;
    private double totalInvoice;

    public Invoice() {
        invoiceID = "1";
        discount = 2.5;
        totalInvoice = 100;
    }

    public Invoice(String invoiceID, double discount,
                   double totalInvoice) {
        this.invoiceID = invoiceID;
        this.discount = discount;
        this.totalInvoice = totalInvoice;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalInvoice() {
        return totalInvoice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTotalInvoice(double totalInvoice) {
        this.totalInvoice = totalInvoice;
    }

    public double calculateDiscountPrice() {
        return totalInvoice - (totalInvoice * discount / 100);
    }
}

public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice();

        System.out.println("Invoice ID = " + invoice.getInvoiceID());
        System.out.println("Old price = " + invoice.getTotalInvoice());
        System.out.println("Price after discount = "
                + invoice.calculateDiscountPrice());

        invoice.setDiscount(5.5);
        invoice.setTotalInvoice(200);

        System.out.println("New total price = "
                + invoice.getTotalInvoice());
        System.out.println("New price after discount = "
                + invoice.calculateDiscountPrice());
    }
}