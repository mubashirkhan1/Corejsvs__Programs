package src.Arrayprograms;

public class Arraysort11 {
	public static void main(String[] args) {
		
	
		int temp;
	
//	int length;
	int []array= { 3,5,6,2 };
      int	length=array.length;
	for(int i=0;i<=length;i++)
	{
		for(int j=i+1;j<=length-1;j++) {
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			
			
		}
		  //System.out.println(array[i]);
	}     System.out.print("Ascending Order:");
    for (int i = 0; i < length - 1; i++) 
    {
        System.out.print(array[i] + ",");
    }
    System.out.print(array[length - 1]);
	//  System.out.println(array[i]);
	// for(int value:array) {System.out.println(array[value]);}
	}
	}

