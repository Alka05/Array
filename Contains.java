package arrayquestions;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 1, 9, 3 };// list of array
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();// user input
		int add = 0;// declare variable
		for (int i = 0; i < num.length; i++) {// loop working till array length
			if (number == num[i]) {// checking user input equal to elements or not
				System.out.println(number + " " + "element match");// if condition is true so print element is matching
			} else {
				add = add + 1;// adding that value which is not match with user number
			}
			if (add == num.length) {// checking add value is equal to array length or not
				System.out.println("no element match");// if condition is not true then print no element match
			}
		}
	}
}
