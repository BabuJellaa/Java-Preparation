package com.tech.assement;

public class BallRebound {

    public static int reboundHeight(int H, int V, int Vn, int N) {
        double e = (double) V / Vn;
        double reboundHeight = H * Math.pow(e, N);
        return (int) reboundHeight;
    }

    public static void main(String[] args) {
        int H1 = 10;
        int V1 = 20;
        int Vn1 = 5;
        int N1 = 2;
        System.out.println("Rebound height after " + N1 + " bounces: " + reboundHeight(H1, V1, Vn1, N1)); // Output: 160

        int H2 = 16;
        int V2 = 5;
        int Vn2 = 5;
        int N2 = 2;
        System.out.println("Rebound height after " + N2 + " bounces: " + reboundHeight(H2, V2, Vn2, N2)); // Output: 16
    }
}


