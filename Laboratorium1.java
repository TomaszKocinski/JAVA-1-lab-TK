/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.uksw.wmp.prja.laboratorium1;

/**
 *
 * @author Kot
 */
public class Laboratorium1 {

    public static double abs(double arg) {
        if (arg < 0) {
            arg = -arg;
        }
        return arg;
    }

    public static int silnia(int arg) {
        int temp = 1;
        for (int i = 1; i < arg + 1; i++) {
            temp = temp * i;
        }
        return temp;
    }

    public static void fibo(int[] arg) {
        if (arg.length > 0) {
            arg[0] = 1;
        }
        if (arg.length > 1) {
            arg[1] = 1;
        }
        for (int i = 2; i < arg.length; i++) {
            arg[i] = arg[i - 2] + arg[i - 1];
        }
    }

    public static void tablica(int[][] arg) {
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[0].length; j++) {
                arg[i][j] = (i + 2 + j) % 3;
            }
        }
    }

    public static double sin(double arg) {
        double temp = 0;
        boolean underZero = false,negative=false;
        if (arg < 0) {
            underZero = true;
        }
        arg=abs(arg);
        while (arg >= 2*Math.PI) {
            arg = arg - 2*Math.PI;
        }
        if (arg >= Math.PI) {
            negative = true;
            arg = 2*Math.PI - arg;
        }
        if(arg>Math.PI / 2.0){
           arg=Math.PI-arg; 
        }
        System.out.println(arg);
        //Math.toDegrees(arg);

        for (double i = 1; i < 8; i++) {
            double down, right, up;
            if ((i + 1) % 2 == 0) {
                up = 1;
            } else {
                up = -1;
            }
            int tempor = 2 * (int) i - 1;
            down = silnia(tempor);
            right = Math.pow(arg, tempor);
            temp = temp + ((up / down) * right);
            // temp=Math.floor(temp*1000000)/1000000;
        }

        if ((underZero && !negative) || (!underZero && negative)) {
            return -temp;
        } else {
            return temp;
        }
    }

    public static void main(String[] args) { 
        System.out.println(sin(-(Math.PI*5+Math.PI/3)));
        
        
        
        
        
        /* System.out.println(sin(2*Math.PI));
        System.out.println(Math.sin(Math.PI)); // to jest strasznie mala wartosc, zapis naukowy (E-16), blisko zera
        // 0.0
        System.out.println(sin(0.0));
        System.out.println(Math.sin(0.0));
        // 0.0,
        System.out.println(sin(Math.PI / 2.0));
        System.out.println(Math.sin(Math.PI / 2.0));
        //1.0
        System.out.println(sin(0.5));
        System.out.println(Math.sin(0.5));*/
        // assertEquals(Math.sin(0.5), r, 0.000001);
    }
}