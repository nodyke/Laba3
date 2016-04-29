/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocharov.com;

import Bocharov.com.sorts.*;

import javax.swing.*;
import java.awt.*;

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
        Sort bubble = new BubbleSort(mas.clone());
        Thread one = new Thread(bubble);

        Sort insertion = new InsertionSort(mas.clone());
        Thread two = new Thread(insertion);

        Sort selection = new SelectionSort(mas.clone());
        // three.my.setBounds();
        Sort shell = new ShellSort(mas.clone());
        Thread three=new Thread(selection);
        Thread four=new Thread(shell);
        window.add(bubble.my, FlowLayout.LEFT);
        window.add(insertion.my, FlowLayout.LEFT);
         window.add(selection.my, FlowLayout.LEFT);
        //   window.add(three.my);
          window.add(shell.my,FlowLayout.LEFT);
        window.setVisible(true);


        synchronized (monitor) {
            one.start();
            two.start();
            three.start();
            four.start();

        }

    //three.run();
//    four.run();




    }

}
