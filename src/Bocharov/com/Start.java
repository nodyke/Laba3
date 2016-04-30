/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocharov.com;

import Bocharov.com.sorts.BubbleSort;
import Bocharov.com.sorts.InsertionSort;
import Bocharov.com.sorts.SelectionSort;
import Bocharov.com.sorts.ShellSort;
import Bocharov.threads.SortThread;
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
        JFrame window = new JFrame();
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.X_AXIS));
        window.setSize(new Dimension(600, 600));
        ArrayList<SortThread> threads = new ArrayList<SortThread>();
        SortThread sort1 = new SortThread(new BubbleSort(mas.clone()));
        threads.add(sort1);
        SortThread sort2 = new SortThread(new InsertionSort(mas.clone()));
        threads.add(sort2);
        SortThread sort3 = new SortThread(new SelectionSort(mas.clone()));
        threads.add(sort3);
        SortThread sort4 = new SortThread(new ShellSort(mas.clone()));
        threads.add(sort4);

        window.add(sort1.sort.my, FlowLayout.LEFT);
        window.add(sort2.sort.my, FlowLayout.LEFT);
        window.add(sort3.sort.my, FlowLayout.LEFT);
        //   window.add(three.my);
        window.add(sort4.sort.my, FlowLayout.LEFT);
        WakeThread wake = new WakeThread(threads);
        window.setVisible(true);


        synchronized (monitor) {
            sort1.start();
            sort2.start();
            sort3.start();
            sort4.start();
            wake.start();


        }


        //three.run();
//    four.run();


    }

}
