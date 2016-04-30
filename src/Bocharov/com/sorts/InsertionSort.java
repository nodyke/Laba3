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
public class InsertionSort extends Sort{

    public InsertionSort(int[] mas) {
        super(mas);
    }

    @Override
    public void sort() {
     for(int i = 1; i < mas.length; i++){
        int currElem = mas[i];
        int prevKey = i - 1;
        while(prevKey >= 0 && mas[prevKey] > currElem){
            mas[prevKey+1] = mas[prevKey];
            prevKey--;
        }
        mas[prevKey+1] = currElem;
        ;

         try {
             synchronized (monitor) {
                 my.updateUI();this.isPause=true;
                 monitor.wait();

             }
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

    }
    }
    
    
}
