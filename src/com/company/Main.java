package com.company;

import java.awt.Graphics;
import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        System.out.println("Point" + calendar.getTime().toString());

        final int size = 100;
        int array[] = new int [size];
        for(int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt() % 2000;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            for(int j = array.length - 1; j > i; j--) {
                if(array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }








    /*public class main extends javax.swing.JApplet {
        private Calendar calendar;

        public void init(){

            calendar = Calendar.getInstance();
            setSize(250, 80);
        }
        public void paint(Graphics g){
            g.drawString("Applet started", 20, 15);
            g.drawString(calendar.getTime().toString(), 20, 35);
        }
	// write your code here
    } */
}
