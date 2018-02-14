package com.qait.aotomation.ThreadPackage1;


/* Write a program which create a class having two fields name and id.
Now create two threads (with name as THREAD1,THREAD2) of the same class such that first thread only prints odd value, whereas second thread only prints even value till 50.
 */

public class ThreadExample  extends Thread {  
	
	//String Thread1;
	//String Thread2;
	public static void main(String args[]){  
		
		Thread Thread1 = new Thread();
		
		
		  for(int j=1;j<50;j++){
		
		if (j % 2 != 0){
		try{
			Thread.sleep(500);
			}
		catch(InterruptedException e){
			System.out.println(e);
			}  
		System.out.println("Thread1: " +j);  
	  }
		
   }
	Thread Thread2 = new Thread();
	
		for(int j=1;j<50;j++){
			
			if (j % 2 == 0){
			try{
				Thread.sleep(500);
				}
			catch(InterruptedException e){
				System.out.println(e);
				}  
			System.out.println("Thread2: " +j);  
		}
	 
}
		 Thread1.start();
		  Thread2.start();
	 
}
}