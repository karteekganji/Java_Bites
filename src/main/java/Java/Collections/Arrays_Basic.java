/*Declare an array in Java: >>>>  type array-name[];
Declaring an array named arr of type int: >>>> int arr[];
Second form to declare an array: >>>> type[] var-name;*/

/*Two declarations are equivalent:
int arr1[] = new int[3];
int[] arr1 = new int[3];*/

/*The following two declaration are also equivalent (multidimensional array):
char twodim1[][] = new char[3][4];
char[][] twodim1 = new char[3][4];*/

/*Declaring several arrays at the same time:
int[] arrs, arr2, arr3; // create three arrays
It is same as writing:
int arrs[], arr2[], arr3[];    // create three arrays */

package Java.Collections;

import java.util.Arrays;

public class Arrays_Basic {

	public static void ArrayPart1() {
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) { // initializing values to array's elements
			arr[i] = i * 2; //Assigning even values to an array by doing (i*2)	
			System.out.println("arr[" + i + "] = " + arr[i]); // printing back, all the values of array with index value
		}
		
		System.out.println("\n"+Arrays.toString(arr)); // printing back the complete array
	}
	
	public static void ArrayPart2(){
		
		int arr1[]={1,2,3,4,5};
		int tot = 0;
		for(int i=0; i < arr1.length; i++)
		{
			System.out.println(arr1[i] + " ");
		}
		for(int i=0; i < arr1.length; i++)
		{
			tot = tot + arr1[i];
		}
		System.out.println("Total is " + tot);
		int maxm = arr1[0];
		for(int i=1; i < arr1.length; i++)
		{
			if (arr1[i] > maxm)
			{
				maxm = arr1[i];
			}
		}
		System.out.println("Max is " + maxm);
		
	}
	public static void main(String[] args) {
		ArrayPart1();
		ArrayPart2();
	}
}
