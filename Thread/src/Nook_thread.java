
public class Nook_thread
{
	 public static void main(String[] args) {
	        Thread t = new Thread() {
	            public void run() {
	                try {
	                    Thread.sleep(5000);
	                    System.out.println("sub 쓰레드 종료");
	                    Thread.sleep(2000);
	                }catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        };
	        t.start();
	        try {
	            t.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("main 쓰레드 종료");
	    }
}
