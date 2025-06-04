/*

Problem statement
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

Hint : Use type casting
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= S <= 90
S <= E <=  900
0 <= W <= 80 

Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37

*/

import java.util.*;
public class Solution {

  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		int fahrenhite;

			while(S<=E){
					fahrenhite = ((5*(S-32))/9);
					System.out.println(S +" "+ fahrenhite);
					S+=W;
			}
	}
}
