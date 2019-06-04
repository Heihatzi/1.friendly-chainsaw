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
public class Orange extends Products {

    private static double price = 2.0;
    private static char section = 'B';

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public char getSection() {
        return section;
    }

    @Override
    public void setSection(char section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Orange{" + "price=" + price + ", section=" + section + '}';
    }

}
