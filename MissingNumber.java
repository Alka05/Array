package arrayquestions;

public class MissingNumber {

	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,6,8,9,10};//list of elements 
		int totalelements =list.length+1;//adding one because one element is missing in list
		int total = totalelements*(totalelements +1)/2 ;//this is formula to finding sum of natural number
		int sum=0;//declare the sum value 0 because we don't know sum of elements
		for(int i = 0;i<list.length;i++) {//loop working till array length 
			sum=sum+list[i];//store sum with array element
		}
		System.out.println(total-sum);//from total array we reduce sum 
	}
	
}