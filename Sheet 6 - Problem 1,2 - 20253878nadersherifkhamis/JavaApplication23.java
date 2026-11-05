/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication23;

/**
 *
 * @author STUDENT
 */
import java.util.Scanner;
public class JavaApplication23 {
 public static void main(String[] args) {

        Invoice invoice = new Invoice();

        System.out.println("Invoice ID: " + invoice.getInvoiceID());
        System.out.println("Old Price: " + invoice.getTotalInvoice());

        invoice.setDiscount(5.5);
        invoice.setTotalInvoice(200);

        System.out.println("New Price: " + invoice.getTotalInvoice());
        System.out.println("Price After Discount: "
                + invoice.calculateDiscountPrice());
    }
}
    

