package review2;
import java.util.*;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the 1 st  number:");
		num1=sc.nextInt();
		System.out.println("Enter the 2 nd number:");
		num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("The new numbers are:"+num1  +" "+ "&"+ " " +num2);
		
		
	}

}
