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
public class SelectionSort extends Sort{

    public SelectionSort(int[] mas) {
        super(mas);
    }

    @Override
    public void sort() {
        int min, temp;

    for (int index = 0; index < mas.length-1; index++){
        min = index;
        for (int scan = index+1; scan < mas.length; scan++)
            if (mas[scan] < mas[min])
                min = scan;

        // Swap the values
        temp = mas[min];
        mas[min] = mas[index];
        mas[index] = temp;
        try {
            synchronized (monitor) {
                monitor.wait(1000); my.updateUI();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
    
    
}
