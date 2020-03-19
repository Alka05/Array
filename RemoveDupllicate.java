package arrayquestions;

public class RemoveDupllicate {

	public static void main(String[] args) {
		int num[] = { 1, 1, 2, 4, 4, 5, 6, 6, };// list of elements
		int temp[] = new int[num.length];// create a temporary array list for num array list
		int j = 0;//define j variable 
		for (int i = 0; i < num.length - 1; i++) {// as I define array length. -1 not to go out of index this array list
			if (num[i] != num[i + 1]) {// num first index not equal to next index
				temp[j] = num[i];//assign num[i] in temp[j] variable
				j++;// increment in j variable
				System.out.print(temp[j] = num[i]);
			}
		}
		System.out.print(temp[j] = num[num.length - 1]);

	}
}
