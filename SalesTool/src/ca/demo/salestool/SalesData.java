package ca.demo.salestool;

public class SalesData {
	int data[] = {-1, 0, 4, 42, 84};
	
	public void display() {
		System.out.println("Data: ");
		for (int i: data) {
			
			System.out.println("Next value: " + data[i]);
			
		}
	}

}