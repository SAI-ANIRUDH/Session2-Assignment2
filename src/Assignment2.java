import java.util.Scanner;
public class Assignment2_2 {

	public static void main(String[] args) {
				
		Scanner scr=new Scanner(System.in); //Using Scanner Class to input variables from user//
		int n;
		System.out.println("Enter the number of rows. ");
		n=scr.nextInt();


		char c;
		for(int i=1;i<=n;++i)        // FOR LOOP FOR NUMBER OF ROWS //
		{
		c='a';
		for(int j=i;j<n;++j)        // FOR LOOP FOR PRINTING SPACES //
		{
		System.out.print(" ");
		}
		for(int k=1;k<=i;++k)      // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER // 
		{
		System.out.print(c);
		++c;
		}
		c-=2;
		for(int l=1;l<i;++l)      // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER //
		{
		System.out.print(c);
		--c;
		}
		System.out.println();    // INTRODUCING NEW LINE //

		}
		for(int i=n;i>=1;i--)        // FOR LOOP FOR NUMBER OF ROWS by decrementing order//
		{
		c='a';
		for(int j=n+1;j>i;j--)        // FOR LOOP FOR PRINTING SPACES by decrementing order//
		{
		System.out.print(" ");
		}
		for(int k=1;k<=i;++k)      // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER  
		{
		System.out.print(c);
		++c;
		}
		c-=2;
		for(int l=1;l<i;++l)      // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER
		{
		System.out.print(c);
		--c;
		}
		System.out.println();    // INTRODUCING NEW LINE

		}
		} 
		} 

