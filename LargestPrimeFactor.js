package fibonacci_seq_evens;

public class LargestPrimeFactor{

	public static void main(String[] args) {
		long mother_factor;
		mother_factor= 600851475143L;
		boolean statement=true;
		long i=2;
		do{
			
			while (mother_factor>i){
				
				while (mother_factor%i==0){
					mother_factor= mother_factor/i;
				}
				i++;
			}
			i--;
				statement=false;
				System.out.println(i);
				System.out.println(mother_factor);
			
		}while(statement);{
		}
	}

}
