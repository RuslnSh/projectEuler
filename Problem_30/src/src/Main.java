package src;

/*
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 1^4 + 6^4 + 3^4 + 4^4
8208 = 8^4 + 2^4 + 0^4 + 8^4
9474 = 9^4 + 4^4 + 7^4 + 4^4
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits. */

public class Main {
	public static void main(String[] args){
		int power = 5;
		int max = 200000;
		int total = 0;
		
		for (int i=0;i<max;i++){
			int tmp = i;
			int sum = 0;
			
			while(tmp>0){
				int digit= tmp%10;
				tmp /= 10;
				
				sum += Math.pow(digit, power);
			}
			if (sum == i){
				total += sum;
			}
		}
		
		System.out.println(total-1);
	}
}
