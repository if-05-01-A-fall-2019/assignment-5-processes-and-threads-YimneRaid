/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.htlleonding.fibonacci;

/**
 *
 * @author Patrick Spisak
 */
public class TheRunnable implements Runnable {
    public int result;
    int n;
    public TheRunnable(int n) {
        this.n = n;
    }
    
    @Override
    public void run() {
        result = Fibonacci.getNumberSingle(n);
    }
    
}
