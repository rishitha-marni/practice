package threadss;
//via thread class
public class threadExample extends Thread{
     public static void main(String[] args) {
    	 threadExample te=new threadExample();
    	 te.start();
     }
     
     public void run() {
    	System.out.println("running"); 
     }
}
// via runnable interface
/*public class threadExample implements Runnable{
       public static void main(String[] args) {
    	 threadExample te=new threadExample();
    	 Thread th=new Thread(te);
    	 th.start();
     }
     
     public void run() {
    	System.out.println("running"); 
     }
}*/

