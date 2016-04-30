package Bocharov.threads;

import Bocharov.com.sorts.Sort;

import java.util.List;

/**
 * Created by Nodyke on 30.04.2016.
 */
public class WakeThread extends Thread {
    List<SortThread> threads;
    public final Object monitor = Sort.monitor;

    public WakeThread(List<SortThread> threads) {
        this.threads = threads;
    }

    @Override
    public void run() {


synchronized (monitor) {
    monitor.notifyAll();
}

        }
}
