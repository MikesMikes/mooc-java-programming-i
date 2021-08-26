/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Container {

    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }

    public void add(int amount) {

        if (amount > 0) {
            if (this.liquidAmount + amount > 100) {
                this.liquidAmount = 100;
            } else {
                this.liquidAmount += amount;
            }
        }
    }

    public int contains() {
        return this.liquidAmount;
    }

    public void remove(int amount) {
        if (this.liquidAmount - amount < 0) {
            this.liquidAmount = 0;
        } else {
            this.liquidAmount -= amount;
        }
    }

    public String toString() {
        return String.format("%d/100", this.liquidAmount);
    }

}
