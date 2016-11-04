
public class Maths {
	
	public int factorial(int n){
		
		if(n==0)
			return 1;
		if(n<0)
			throw new IllegalArgumentException();
		
		if(n==1)
			return 1;
		else
			return n* factorial(n-1);
		
	}

}
