package concurrency;

public class BasicThreads {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting for LiftOff");
		for(int i=0;i<100;i++){
			System.out.print(i+"");
		}
	}

}
