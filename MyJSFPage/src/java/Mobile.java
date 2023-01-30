import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Khaled Makkawirelang
 */
@ManagedBean(name = "mobile", eager = true)
@SessionScoped

public class Mobile implements Serializable{

    /**
     * Creates a new instance of Mobile
     */
    
    private String companyname,modelnumber,color;
    private int quantity;
    private double price;
    
    private static final ArrayList<Mobile> mobiles = new ArrayList<Mobile>(Arrays.asList(
            new Mobile("Samsung","S20","Black",7,15000000),
            new Mobile("Apple"," iPhone SE","Yellow",20,5000000),
            new Mobile("Apple","iPhone 13", "White",5,17000000)
    
    
    
    
    ));
    public ArrayList<Mobile> getMobile(){
        return mobiles;
    }
     public Mobile(String companyname, String modelnumber, String color, int quantity, double price) {
        this.companyname = companyname;
        this.modelnumber = modelnumber;
        this.color = color;
        this.quantity = quantity;
        this.price= price;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Mobile(){}
    
}
