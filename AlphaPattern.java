/*
Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 3
 A
 BB
 CCC
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 26
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF
*/

import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                char J = (char)('A'+i-1);
                System.out.print(J);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }

	}

}
