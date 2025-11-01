package com.company;

public class NDrob {
    private int numer;
    private int denom;
    private int unit;

    //конструкторы

    public NDrob() { // конструктор по умолчанию
        this.numer = 0;
        this.denom = 1;
        this.unit = 0;
    }
    public NDrob(int numer, int denom, int unit) {
        this.numer = numer;
        if (denom != 0)
            this.denom = denom;
        else
            this.denom = 1;
        this.unit = unit;
    }
    // сеттеры и геттеры
    void setNumer(int numer) {
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        if (denom != 0)
            this.denom = denom;
        else
            this.denom = 1;
    }

    public int getUnit() {
        return unit;
    }
    // перевод в строки
    @Override
    public String toString() {
        String str = "";
        if (unit != 0)
            str += unit;
        str += numer + "/" + denom;
        return str;
    }
    // основные действия
    public NDrob multy(NDrob secondNDrob) {
        NDrob result = new NDrob();
        result.numer = this.numer * secondNDrob.numer;
        result.denom = this.denom * secondNDrob.denom;
        return result;
    }

    public NDrob div(NDrob secondNDrob) {
        NDrob result = new NDrob();
        result.numer = this.numer * secondNDrob.denom;
        result.denom = this.denom * secondNDrob.numer;
        return result;
    }

    public NDrob add(NDrob secondNDrob) {
        NDrob result = new NDrob();
        result.denom = this.denom * secondNDrob.denom;
        result.numer = (this.numer * secondNDrob.denom) + (secondNDrob.numer * this.denom);
        return result;
    }

    public NDrob sub(NDrob secondNDrob) {
        NDrob result = new NDrob();
        result.denom = this.denom * secondNDrob.denom;
        result.numer = (this.numer * secondNDrob.denom) - (secondNDrob.numer * this.denom);
        return result;
    }

    public int wholePart() {
        return this.numer > this.denom ? this.numer % this.denom : 0;
    }
}






















