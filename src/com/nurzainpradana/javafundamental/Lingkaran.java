package com.nurzainpradana.javafundamental;

public class Lingkaran implements BangunDatar {

    private double phi = 3.1415;

    Lingkaran(){

    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }

    public double luas(int r){ //method overload
        return (phi * r * r);
    }

    public double keliling(int r){ //method overload
        return (2 * phi * r);
    }
}
