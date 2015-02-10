package fibonacci_seq_evens;

public class Fibnachhi2 {
	public static void main(String[] args) {
		int First_number;
		int second_number;
		int sum=2;
		int i;
		First_number=1;
		second_number=2;
		sum=2;
		while(First_number<4000000){
			i=First_number+second_number;
			if(i%2==0){
				sum=sum+i;
				First_number = second_number;
				second_number=i;
			}//close if
			else{
				First_number = second_number;
				second_number=i;
			}//close else
		}
		
			System.out.print(sum);
		
	}
}
