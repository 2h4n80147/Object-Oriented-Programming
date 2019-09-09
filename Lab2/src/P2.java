import java.util.Scanner;

class StarTriangle {
	private String triangle = "";
	StarTriangle(int w) {
		for (int i = 0; i < w; i++) { 
			for(int j = 0; j < i + 1; j++)
				triangle += "[*]";
			triangle += "\n";
		}
	}
	public String toString() {
		return triangle;
	}
}
public class P2 {
		
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		StarTriangle small = new StarTriangle(in.nextInt());
		System.out.println(small.toString());
		in.close();
	}
}
