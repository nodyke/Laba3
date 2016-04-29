/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocharov.threads;

import Bocharov.com.sorts.Sort;

/**
 *
 * @author Дмитрий
 */
public class SortThread extends Thread{
    Sort sort;
    public static final Object monitor=new Object();
    //JButton start;
    //JButton pause;
    boolean isRunning=false;

    public SortThread(Sort sort) {
        this.sort = sort;
    }

    @Override
    public void run() {
        sort.sort();
       // sort.outArray();//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
