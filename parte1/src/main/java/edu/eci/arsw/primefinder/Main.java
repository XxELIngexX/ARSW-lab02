package edu.eci.arsw.primefinder;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {



	public static void main(String[] args) throws InterruptedException, IOException {

//		AtomicInteger cont =new AtomicInteger(0);




		PrimeFinderThread pft=new PrimeFinderThread(0, 100000000);
		PrimeFinderThread pft1=new PrimeFinderThread(100000000, 200000000);
		PrimeFinderThread pft2=new PrimeFinderThread(200000000, 300000000);

		pft.start();
		pft1.start();
		pft2.start();

		Thread.sleep(5000);
		System.out.println("Se detiene.");
		pft.pause();
		pft1.pause();
		pft2.pause();

//		System.out.print("Presione Enter para continuar...");
//		System.in.read(); // Leer un byte de la entrada estándar






//
//		cont.addAndGet(pft.getPrimes().size());
//		cont.addAndGet(pft1.getPrimes().size());
//		cont.addAndGet(pft2.getPrimes().size());
//		System.out.println("ya pasaron 5 segundos y hay: "+ cont);






	}
	
}
