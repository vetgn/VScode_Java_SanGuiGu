/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:25:36
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:30:50
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\Two\Animal.java
 * @Description: 
 * 
 */
package src.Homework12.Two;

public class Animal {
    private double height;
    private Double weight;
    private String bodyColor;

    public Animal() {
    }

    public Animal(double height, Double weight, String bodyColor) {
        this.height = height;
        this.weight = weight;
        this.bodyColor = bodyColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

}
