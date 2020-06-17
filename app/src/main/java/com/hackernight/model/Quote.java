package com.hackernight.model;

public class Quote {

    private String quotation;
    private String Author ;

    public Quote(String quotation, String author) {
        this.quotation = quotation;
        Author = author;
    }

    public String getQuotation() {
        return quotation;
    }

    public void setQuotation(String quotation) {
        this.quotation = quotation;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
