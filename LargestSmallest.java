package arrayquestions;

public class LargestSmallest {

	public static void main(String[] args) {

		int[] number = { 1, 3, 6, 2, 98, 7, 40, 9, 30, 54 };// collection of int element
		int largest = 0;//declare the value in largest variable 
		int smallest = number[0];//
		for (int num = 0; num < number.length; num++) {// using this for loop to taking direct element
			if (num > largest) {// checking largest variable is less then num
				largest = num;// storing largest number in this variable
			}
		}
		System.out.println("larest number of the element" + " " + largest);// print largest number
		for (int num = 0; num < number.length; num++) {// using this for loop to taking direct element
			if (num < smallest) {// checking smallest number is greater then num
				smallest = num;// storing smallest number in this variable
			}
		}
		System.out.println("smallest number of the element" + " " + smallest);// print smallest number

	}
}
