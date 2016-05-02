/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocharov.com.sorts;

/**
 *
 * @author Дмитрий
 */
public class BubbleSort extends Sort {

    public BubbleSort(int[] mas) {
        super(mas);
    }


    @Override
    public synchronized void sort() {

         for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++)
                if (mas[j] > mas[j + 1]) {
                    int t = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = t;
                    update();






                }


                }
        }
    }

    
    

