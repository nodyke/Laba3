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
public class ShellSort extends Sort {

    public ShellSort(int[] mas) {
        super(mas);
    }

    @Override
    public void sort() {
           int i, j, k, h, m=0, b=mas.length;
   int[] d = { 1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
               84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
               58548857, 157840433, 410151271, 1131376761, 2147483647 };
   while (d[m] < b) ++m;
   while (--m >= 0){
      k = d[m];
      for (i = k; i < b; i++) {     // k-сортировка
          j = i;
          h = mas[i];
          while ((j >= k) && (mas[j - k] > h)) {
              mas[j] = mas[j - k];
              j -= k;
          }
          mas[j] = h;


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
    
    
    
    
}
