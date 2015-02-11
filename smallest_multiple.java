package fibonacci_seq_evens;

public class smallest_multiple {

	public static void main(String[] args) {
		int count=1;
		boolean gate=true;
		int range=20;
		long solution=2520;//because its where 1-10 left off
		while(gate){
			while(solution%count==0 || count==1){
				count++;
				if(count==20 && solution%range==0){
					gate=false;
				}
			}
			if(solution%range>0||count!=range){
				solution=solution+2;
				count=1;
				continue;
			}
		}
		solution=solution-2;
		System.out.println(solution);
	}

}
