/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocharov.com;

import Bocharov.com.sorts.*;
import Bocharov.threads.WakeThread;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author Дмитрий
 */
public class Start {
    public static final Object monitor = new Object();

    public void start() {

        int[] mas = {5, 0, 20, 10, 25, 40, 60, 45, 35, 30, 50, 70, 90, 85, 75, 80, 55, 65, 100, 95};
        JFrame window = getWindow();
        ArrayList<Sort> sorts = getSorts(mas.clone());
        add(sorts,window);

        window.setVisible(true);
        ArrayList <Thread> threads=getThreads(sorts);
        WakeThread wake = new WakeThread(threads);
        synchronized (Sort.monitor) {
            startThread(threads);
            wake.start();


        }


        //three.run();
//    four.run();


    }
    public  JFrame getWindow()
    {
        JFrame window=new JFrame();
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.X_AXIS));
        window.setSize(new Dimension(600, 600));
        return window;
    }
   public ArrayList <Sort> getSorts(int []mas)
   {
       ArrayList<Sort> sorts= new ArrayList <Sort>();
       sorts.add(new BubbleSort(mas.clone()));
       sorts.add(new InsertionSort(mas.clone()));
       sorts.add(new SelectionSort(mas.clone()));
       sorts.add(new ShellSort(mas.clone()));
       return sorts;
   }
    public void add(ArrayList<Sort> sorts,JFrame window)
    {
        for (Sort a:sorts
             ) {window.add(a.my,FlowLayout.LEFT);
        }
    }
    public ArrayList<Thread> getThreads(ArrayList<Sort> sorts)
    {
        ArrayList<Thread> threads=new ArrayList<Thread>();
        for (Sort i:sorts
             ) {threads.add(new Thread(i));

        }
        return threads;
    }
    public void startThread(ArrayList<Thread> threads)
    {
        for (Thread i:threads
             ) {i.start();

        }
    }
}
