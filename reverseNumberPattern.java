/*
Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
1
21
321
4321
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321
*/

import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = i;
            while(j>=1){
                System.out.print(j);
                j= j-1;
            }
            System.out.println();
            i = i +1;
        }
	}

}
