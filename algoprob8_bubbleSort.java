package algoprob;

import java.util.Scanner;

public class algoprob8_bubbleSort 
{
//	public int []subarray(int []arr,int last)
//	{
//		int []newarr = new int[last];
//		for(int i=0;i<newarr.length;i++)
//		{
//			newarr[i]=arr[i];
//		}
//		return newarr;
//	}
	public int []bubbleSort(int []arr)
	{
		int temp;
		boolean swapped;
		int size= arr.length;
		for(int i = 0;i<size;i++)
		{
			swapped = false;
			for(int j = 1;j<size;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swapped = true;
				}
				
			}
		}
//		int []arr1 = new int[size-1];
//		arr1= subarray(arr,size-1);
		return arr;
	}
	public void print(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	public static void main(String[] args) 
	{
		algoprob8_bubbleSort sort = new algoprob8_bubbleSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int []arr = new int[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr=sort.bubbleSort(arr);
		sort.print(arr);
	}

}
