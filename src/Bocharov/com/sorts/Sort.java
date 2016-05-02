/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocharov.com.sorts;

import Bocharov.Graphigs.PainterPanel;

/**
 *
 * @author Дмитрий
 */
public abstract class Sort implements Runnable
{ 
   protected int[] mas;
    public static final Object monitor=new Object();
    public final PainterPanel my;
   public boolean isRunning=false;
   public boolean isPause=false;
   public  abstract void sort();



    public Sort(int[] mas) {
        this.mas = mas;
        my=new PainterPanel(this.mas);
    }
   public static void outArray(int[] mas)
   {
       for (int a:mas)System.out.print(a+" ");
       System.out.println();
   }

    @Override
    public void run() {
        synchronized (monitor) {
            isRunning = true;
            sort();
        }

    }
    public void update() {
        synchronized (monitor) {
            try {
                my.updateUI();
                this.isPause = true;
                monitor.wait();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
    }

