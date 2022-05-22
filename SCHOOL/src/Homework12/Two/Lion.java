/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:29:15
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:39:56
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\Two\Lion.java
 * @Description: 
 * 
 */
package src.Homework12.Two;

public class Lion extends Animal implements IBehavior {
    private int toothNumber;
    private double tailLength;

    public Lion() {

    }

    public Lion(double height, Double weight, String bodyColor, int toothNumber, double tailLength) {
        super(height, weight, bodyColor);
        this.toothNumber = toothNumber;
        this.tailLength = tailLength;
    }

    public int getToothNumber() {
        return toothNumber;
    }

    public void setToothNumber(int toothNumber) {
        this.toothNumber = toothNumber;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public void walking() {
        System.out.println("狮子在奔跑！");

    }

    @Override
    public void eating(String food) {
        System.out.println("狮子在吃" + food);

    }

    @Override
    public String toString() {
        return "体重:" + getHeight() + ",身高:" + getWeight() + ",皮色:" + getBodyColor()
                + ",牙齿数:" + getToothNumber() + ",尾巴长度:" + getTailLength();
    }
}
