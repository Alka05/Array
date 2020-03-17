package arrayquestions;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] list = { 1,1,13, 4, 5, 6, 17, 8, 9, 10, 5, 12, 13, 2, 2, 15, 16};//list of elements 
		for (int i = 0; i < list.length; i++) {//loop working with 0 index till length of list
			for (int j = i + 1; j < list.length; j++) {//loop working with 1 index to length of list 
				if (list[i] == list[j])//checking first list i and second list j equal or not  
					System.out.println(list[i]);//printing all the duplicate numbers
			}
		}

	}

}
