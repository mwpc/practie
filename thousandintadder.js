package thousandintadder;

public class adder {

	public static void main(String[] args) {
		int Count;
		int Sum;
		Count=1;
		 Sum=0;
		 
		while (Count < 1000){
			if(Count%5==0||Count%3==0){
				Sum = Sum+Count;
				System.out.println(Sum);
				System.out.println(Count);
				}
			Count=Count+1;//either way +1
		}//end while
		System.out.println(Sum);
	}//end main

}
