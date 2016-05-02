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
   public final Sort sort;

    public SortThread(Sort sort) {
        this.sort = sort;
    }

    @Override
    public void run() {
        sort.run();
       // sort.outArray();//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
