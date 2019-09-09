import java.util.Scanner;

class Data {
	private double max;
	private double sum;
	private int count;
	Data() {
		max = sum = count = 0;
	}
	public void addValue(double a) {
		max = Math.max(max, a);
		count++;
		sum += a;
	}
	public double getAverage () {
		return sum / count;
	}
	public double getLargest() {
		return max;
	}
}
public class Analyzer {
	public static void main(String args[]) {
		Data data = new Data();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Enter number (Q to quit): ");
			
			String d = scan.next();
			if (d.charAt(0) == 'Q') {
				break;
			}
			double val = Double.parseDouble(d);
			data.addValue(val);
		}
		System.out.println("Average = " + data.getAverage());
		System.out.println("Maximum = " + data.getLargest());
		
		scan.close();
	}
}

