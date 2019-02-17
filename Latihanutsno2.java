/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuts;

import java.util.Scanner;

/**
 *
 * @author Sanie
 */
public class Latihanutsno2 {

  public static void main(String[] args) {
      
        int jumlahdata;
        Scanner input = new Scanner(System.in);

            System.out.print("Masukkan jumlah data: ");
        jumlahdata = input.nextInt();
        int data[] = new int[jumlahdata];

                System.out.println("");
                    for (int i = 0; i < jumlahdata; i++) {
                System.out.printf("Masukkan data ke-%d: ", (i + 1));
                data[i] = input.nextInt();
        }

        for (int x = 0; x < jumlahdata - 1; x++) {
            for (int i = 0; i < jumlahdata - 1; i++) {
                if (data[i] < data[i + 1]) {
                    int j = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = j;
                }
            }
        }
        System.out.println("");
        System.out.println("Hasil pengurutan bilangan: ");
        for (int a = 0; a < 3; a++) {
            System.out.print(data[a] + ", ");
        }
        System.out.println("");
  }
}
