import java.util.ArrayList;
import java.util.Scanner;

public class Data {
	private ArrayList<int[]> results = new ArrayList<int[]>();
	int choice = 0;
	Scanner scan = new Scanner(System.in);

	public int[] Data(int i, int j, int k, int l, int m, int n, int o, int p) {
		int[] aa = { i, j, k, l, m, n, o, p };
		return aa;
	}

	public void start() {
		load(results);
		do {
			System.out.println("1. Show all results");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				show(results);
				break;
				
			case 2:
				showRecent(results);
				break;
			case 8:
				System.out.println("End");
				break;
			}

		} while (choice != 8);
	}

	private void showRecent(ArrayList<int[]> results2) {
		// TODO Auto-generated method stub
		
	}

	private void show(ArrayList<int[]> results2) {
		for (int i = 0; i < results.size(); i++) {
			System.out.println(toString(results.get(i)[0]) + " " + toString(results.get(i)[1]) + " "
					+ toString(results.get(i)[2]) + " " + toString(results.get(i)[3]) + " "
					+ toString(results.get(i)[4]) + " " + toString(results.get(i)[5]) + " "
					+ toString(results.get(i)[6]) + " " + toString(results.get(i)[7]));
		}

	}

	private String toString(int i) {
		String str = String.format("%02d", i);
		return str;
	}
	private void load(ArrayList<int[]> results2) {
		
		
		
		//results.add(Data()); 5th July 2018
		results.add(Data(2,4,7,17,25,28,34,3));
		results.add(Data(2,5,9,13,24,31,35,16));
		results.add(Data(2,6,7,14,16,29,31,15));
		results.add(Data(14,22,23,24,30,32,34,9));
		results.add(Data(8,9,18,27,29,30,32,6));
		results.add(Data(2,12,14,18,19,23,25,17));
		results.add(Data(3,9,16,25,26,31,34,9));
		results.add(Data(6,14,15,24,26,32,35,14));
		results.add(Data(1, 3, 6, 16, 19, 20, 24, 13));
		results.add(Data(9, 14, 15, 19, 24, 34, 35, 12));
		results.add(Data(4, 5, 9, 13, 25, 32, 33, 7));

	}
}
