package com.VRPharma.PharmaArtifact.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class VRDrug {
    //Defining book id as primary key
    @Id
    @Column
    private int drugid;
    @Column
    private String drugName;
    @Column
    private String composition;
    @Column
    private int price;
    @Column
    private int quantity;

    public VRDrug(String drugName, String composition, int price, int quantity) {
        this.drugName = drugName;
        this.composition = composition;
        this.price = price;
        this.quantity = quantity;
    }

    public VRDrug(int drugid, String drugName, String composition, int price, int quantity) {
        this.drugid = drugid;
        this.drugName = drugName;
        this.composition = composition;
        this.price = price;
        this.quantity = quantity;
    }

    public VRDrug() {
    }

    public int getDrugid() {
        return drugid;
    }

    public void setDrugid(int drugid) {
        this.drugid = drugid;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "VRDrug{" +
                "drugid=" + drugid +
                ", drugName='" + drugName + '\'' +
                ", composition='" + composition + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
