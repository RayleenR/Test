package quiz1;
import java.util.*;

public class Q1 {
	public static void main(String[] args){
		int [] array = {7,5,3,8};
		for(int column = 0; column<array.length; column++){
			System.out.printf("%4d", array[column]);
		}
		System.out.println();
		System.out.println("The maxium value is: " + printMax(array));
		}
	public static int printMax(int [] numbers){
		int maxValue = numbers[0];
		for(int i=1;i < numbers.length;i++){
			if(numbers[i] > maxValue){
				maxValue = numbers[i];
				}
			}
		return maxValue;
	}
}
