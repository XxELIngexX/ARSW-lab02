package edu.eci.arsw.primefinder;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinderThread extends Thread{

	
	int a,b;
	
	private List<Integer> primes=new LinkedList<Integer>();
	volatile private Boolean pause = false;
	private Object lock = new Object();


	public PrimeFinderThread(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
@Override

public void run() {

		for (int i=a;i<b;i++){
			synchronized (lock) {
			while (pause){
				try {
					// Detener el hilo con wait()
					lock.wait();

				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}

			if (isPrime(i)) {
				primes.add(i);
			}

		}


	}
	System.out.println("termino:  " + Thread.currentThread().getName());

}

	boolean isPrime(int n) {
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	public List<Integer> getPrimes() {
		return primes;
	}
	public void pause()  {
		pause=true;
	}

	public void resumeThread() {
		pause = false;
		synchronized (lock) {
			lock.notify(); // Despierta al hilo
		}

	}



}
