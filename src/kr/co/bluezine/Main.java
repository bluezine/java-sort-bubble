package kr.co.bluezine;

public class Main {
	
	
	public static void main(String args[]) {
		new Main().go();
	}
	
	public void go() {
		int data[] = {210, 250, 22, 280, 63};
		Long runningTime = System.currentTimeMillis();
		
		for (int i=0;i<data.length-1;i++) {
			System.out.println("Loop " + (i+1));
			
			for (int j=0;j<data.length-1-i;j++) {
				if (data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
				System.out.print("Loop " + (i+1) + "-" + (j+1) + " => ");
				for (int d : data) {
					System.out.print(d + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.print("RESULT : ");
		for (int d : data) {
			System.out.print(d + " ");
		}
		System.out.println("\n");
		System.out.println("Execute Time : " + (System.currentTimeMillis() - runningTime)/1000.0 + "s");
	}
}

