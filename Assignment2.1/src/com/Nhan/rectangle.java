package com.Nhan;

public class rectangle {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    //Constructor
    public rectangle (double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public rectangle () {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 1;
        this.y2 = 1;
    }

    public rectangle (double x2, double y2) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = x2;
        this.y2 = y2;
    }

    //setter and getter

    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getY1() {
        return y1;
    }
    public void setY1(double y1) {
        this.y1 = y1;
    }
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getY2() {
        return y2;
    }
    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double width () {
        return Math.abs(x2-x1);
    }

    public double height () {
        return Math.abs(y2-y1);
    }
    public double area () {
        return Math.abs((x2-x1)*(y2-y1));
    }
}
