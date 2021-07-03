package collectionprograms11;
/*a-1 baar chalega loop */
public class Arrayexamsum {
	public static void main(String[] args) {
		int a[]= {5,-1,6,8,6,7};	
		int Arraylength= a.length;
	//	System.out.println(Arraylength);
		for(int i=0;i<Arraylength-1; i++)
		{ boolean sorted=true;
			for(int j=1;j<Arraylength-1; j++)
			{
				if(a[i]<a[j])
				{//swapping values 
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
					 sorted =false;
				}
			}
			 if(sorted)
		    {
				 break;
		    }
		}
			//	for(int i: a) {
			for(int i=1; i<=a.length-1; i++)
			{
				System.out.print( a[i]+" ");	
			}
			
			
		
	}

	}

