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

class Invoice {
    private String invoiceID;
    private double discount;
    private double totalInvoice;

    public Invoice() {
        invoiceID = "1";
        discount = 2.5;
        totalInvoice = 100;
    }

    public Invoice(String id, double d, double total) {
        invoiceID = id;
        discount = d;
        totalInvoice = total;
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



