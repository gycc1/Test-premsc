// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;  
public class DiamondPattern  
{  
public static void main(String args[])  
{  
int row, i, j, space = 1;  
System.out.print("Number of rows : ");  
Scanner sc = new Scanner(System.in);  
row = sc.nextInt();  
space = row - 1;  
for (j = 1; j<= row; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space--;  
for (i = 1; i <= 2 * j - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
space = 1;  
for (j = 1; j<= row - 1; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space++;  
for (i = 1; i<= 2 * (row - j) - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
}  
}
