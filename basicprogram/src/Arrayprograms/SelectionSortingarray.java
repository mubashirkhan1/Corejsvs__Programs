package Arrayprograms;

public class SelectionSortingarray {
	public static void main(String[] args) {
		int min;int temp=0;
		int []a= {6,7,9,1,2,4,4};
		for(int i=0;i<a.length;i++ ) {
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
			
					min=j;
				}
			}
			 temp=a[i];
			 a[i]=a[min];
			 a[min]=temp;
			
		}
		 for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
