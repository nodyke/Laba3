package Bocharov.threads;

import Bocharov.com.sorts.Sort;

import java.util.List;


/**
 * Created by Nodyke on 30.04.2016.
 */
public class WakeThread extends Thread {
    List<Thread> threads;
    int count=0;


    public WakeThread(List<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public void run() {


synchronized (Sort.monitor) {

    while (true) {

        Sort.monitor.notifyAll();




        }
    }
    }
}


