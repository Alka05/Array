package arrayquestions;

public class ExceptElement {

	public static void main(String[] args) {
		int[] number = { 4, 1, 4 };//list of element
		for (int i = 0; i < number.length; i++) {//loop working from 0 index to array length
			int except = 0;//declare variable
			for (int j = 0; j < number.length; j++) {//loop working from 0 index to array length
				if (number[i] == number[j]) {//checking list one element to compare all this element in the list 
					except = except + 1;//increment 
				}
			}
			if (except == 1) {//except value comparing with 1
				System.out.println(number[i]);//if condition is true then print except number
			}
		}

	}

}
