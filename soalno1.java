/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalno1;

import java.util.Scanner;

/**
 *
 * @author Sanie
 */
public class soalno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("koordinat lingkaran x1:");
            int x1 = input.nextInt();
        System.out.println("koordinat lingkaran y1:");
            int y1 = input.nextInt();
        System.out.println("jari-jari lingkaran 1:");
            int r1 = input.nextInt();

        System.out.println("koordinat lingkran x2:");
            int x2 = input.nextInt();
        System.out.println("koordinat lingkaran y2:");
            int y2 = input.nextInt();
        System.out.println("jari-jari lingkaran 2:");
            int r2 = input.nextInt();

               int jarak = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        if (jarak >= (r1 + r2)) {
            System.out.println("c1 dan c2 lepas");
        } else if (jarak < (r1 + r2)) {
            if (r1 < r2) {
                if (((x1 + r1) < (x2 + r2)) && ((x1 - r1) > (x2 - r2))) {
                    if (((y1 + r1) < (y2 + r2)) && ((y1 - r1) > (y2 - r2))) {
                        System.out.println("c1 ada di dalam c2");
                    } else {
                        System.out.println("c1 dan c2 beririsan");
                    }
                } else {
                    if (((y1 + r1) < (y2 + r2)) && ((y1 - r1) > (y2 - r2))) {
                        System.out.println("c1 ada di dalam c2");
                    } else {
                        System.out.println("c1 dan c2 beririsan");
                    }
                }
            } else {
                if (((x1 + r1) > (x2 + r2)) && ((x1 - r1) < (x2 - r2))) {
                    if (((y1 + r1) > (y2 + r2)) && ((y1 - r1) < (y2 - r2))) {
                        System.out.println("c2 ada di dalam c1");
                    } else {
                        System.out.println("c1 dan c2 beririsan");
                    }
                } else {
                    if (((y1 + r1) > (y2 + r2)) && ((y1 - r1) < (y2 - r2))) {
                        System.out.println("c2 ada di dalam c1");
                    } else {
                        System.out.println("c1 dan c2 beririsan");
                    }
                }
            }
        }
    }
}
    

