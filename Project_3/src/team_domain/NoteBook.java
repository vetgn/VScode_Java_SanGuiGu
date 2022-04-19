/*
 * @Author: vetgn
 * @Date: 2022-04-07 20:39:43
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-08 15:48:45
 * @FilePath: \Project_3\src\team_domain\NoteBook.java
 * @Description: 
 * 
 */
package team_domain;

public class NoteBook implements Equipment {
    private String model;//机器的型号
    private double price;//机器的价格

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }

}
