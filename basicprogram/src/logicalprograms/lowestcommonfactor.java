package logicalprograms;

public class lowestcommonfactor {
	public static void main(String[] args) {
		
	
	int no1=23,no2=45 ,temp=1 ;

 

    for(int i = 1; i <= no1 && i <= no2; ++i) {
      // Checks if i is factor of both integers
      if(no1 % i == 0 && no2 % i == 0)
        //temp = i;
      System.out.println(i);
    }

    int lcm = (no1 * no2) / temp;
    
   System.out.printf("The LCM is"+ lcm);
  }

	/*
	while(no1!=0 &&no2!=0) {
		no1=no1/p; no2=no2/p;
		if(no1%p==0 && no2%p==0) {
			temp=temp*p;
		if(no1%p !=0 && no2%p !=0)
		{
		p++;
		}
		
	}
	//System.out.println(temp);
	}
	System.out.println(temp);*/
	}

