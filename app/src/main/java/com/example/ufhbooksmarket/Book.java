package com.example.ufhbooksmarket;

public class Book {
    private String Title;
    private String Seller;
    private int Num_of_Copies;
    private double Price;
    private String BankInfo;



    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSeller() {
        return Seller;
    }

    public void setSeller(String seller) {
        Seller = seller;
    }

    public int getNum_of_Copies() {
        return Num_of_Copies;
    }

    public void setNum_of_Copies(int num_of_Copies) {
        Num_of_Copies = num_of_Copies;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getBankInfo() {
        return BankInfo;
    }

    public void setBankInfo(String bankInfo) {
        BankInfo = bankInfo;
    }
}
