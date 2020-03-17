package arrayquestions;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 1, 9, 3 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		int add = 0;
		for (int i = 0; i < num.length; i++) {
			if (number == num[i]) {
				System.out.println(number + " " + "element match");
			} else {
				add = add + 1;
			}
			if (add == num.length) {
				System.out.println("no element match");
			}
		}
	}
}
