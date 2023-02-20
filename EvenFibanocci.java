package review2;
import java.util.Scanner;

public class EvenFibanocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  num=1,num1 = 0,num2 = 1,num3 = 0,count=0;
		System.out.println("Enter the number till which fibanocci series is to be calculated:");
		int a = sc.nextInt();
		while(num>0) {
			
			if(num1%2==0) {
				count++;
				
				if(count==a) {
					System.out.println(+num1);
					
					break;
					
				}
			}
					
			num3=num1+num2;
			num1 = num2;
			num2=num3;
			num++;
			
		
		}
	}

	}
