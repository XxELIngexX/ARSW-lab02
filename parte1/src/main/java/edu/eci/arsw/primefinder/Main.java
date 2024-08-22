package edu.eci.arsw.primefinder;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) {
		AtomicInteger cont =new AtomicInteger(0);
		
		PrimeFinderThread pft=new PrimeFinderThread(0, 10000000);
		PrimeFinderThread pft1=new PrimeFinderThread(10000000, 20000000);
		PrimeFinderThread pft2=new PrimeFinderThread(20000000, 30000000);

		pft.start();
		pft1.start();
		pft2.start();

//		Thread timerThread = new Thread(() -> {
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// Manejar la excepción
//			}
//            try {
//                pft.wait();
//				pft1.wait();
//				pft2.wait();
//				cont.addAndGet(pft.getPrimes().size());
//				cont.addAndGet(pft1.getPrimes().size());
//				cont.addAndGet(pft2.getPrimes().size());
//				System.out.println("se han encontrado: "+cont+"numeros primos" );
//				// Esperar a que el usuario presione Enter
//				System.out.print("Presione Enter para continuar...");
//				Scanner scanner = new Scanner(System.in);
//				scanner.nextLine();
//
//				pft.notifyAll();
//				pft1.notifyAll();
//				pft2.notifyAll();
//
//
//
//			} catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//		});
//		timerThread.start();




	}
	
}
