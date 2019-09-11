package com.zhaku.p1;

class Temperature {
    private double value;
    private String scale;


    public double getValue() {
        return value;
    }

    public String getScale() {
        return scale;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(String scale) {
        this.scale = scale;

    }
    public void setValueAndScale(double value, String scale) {
        setScale(scale);
        setValue(value);
    }
    Temperature() {
        value = 0;
        scale = "C";
    }
    Temperature (double value) {
        setValue(value);
        scale = "C";
    }
    Temperature (String scale) {
        setScale(scale);
        value = 0;
    }
    Temperature (double value, String scale) {
        setValueAndScale(value, scale);
    }

    public double degreesF() {
        if (scale.equals("C"))
            return 5 * (value - 32) / 9;
        else
            return value;
    }

    public double degreeC() {
        if (scale.equals( "F"))
            return 9 * (value/5) + 32;
        else
            return value;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
}
