
public class FirstQuestion2 {
	public static void main (String[] args) {
		int sum = 0;
		int power = 1;
		for (int i = 0; i < 25; i++)
		{
		sum += power;
		power = power << 1;
		}
		
	}
}
/* 1- sum = sum + power which is 0 + 1 = 1 and power = power <<1 which is 10 in binary and 2 decimal and i = 1.
   
   2- sum = 1 + 2 = 3 and power = 10<<1 which is 100 in binary and 4 in decimal and i = 2.
   
   3- sum = 3 + 4 = 7 and power = 100<< 1 which is 1000 which equals to 8 in decimal and i becomes 3.
   
   4- sum = 7 + 8 = 15 and power = 1000<<1 which is 10000 = 16 in decimal.
   .
   .
   .
   .
   .
   so for i = 24 the sum becomes 33554431 because for every i the power is shifted to the left i+1 times and the
   sum is equal power - 1
   thus for i = 24 power is shifted 25 to the left therfore it is equal to 1 * 10^24 in binary and 2^25 - 1 = 3554431 in decimal */

