/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaviko;

/**
 *
 * @author dimit
 */
public abstract class Products {

    private double price;
    private char section;

    public abstract double getPrice();

    public abstract void setPrice(double price);

    public abstract char getSection();

    public abstract void setSection(char section);

}
