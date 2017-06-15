package concurrency;

class implementRunable implements Runnable{
	protected int countDown = 3;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	public implementRunable() {
		// TODO Auto-generated constructor stub
		System.out.println("Task:"+id+"-->start");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(countDown-->0){
			System.out.println("this is task:"+id+"-->and "+countDown+"be called");
			Thread.yield();
		}
		System.out.println("Task:"+id+"-->end");
	}
	
}
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			new Thread(new implementRunable()).start();
			
		}
	}

}
