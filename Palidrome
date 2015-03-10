package practice;

import java.util.Arrays;

public class Palidrome {

	public static void main(String[] args) {
		long product;
		int largestPalindrome = 0;
		int z=1;
		boolean check=false;
		long[] palidromes= new long[10];
		for(int i=100; i<1000 && i>0;i++){
			//System.out.println(i);
			for (int j=100; j<1000 && j>0; j++){
				//System.out.println(j);
				product=i*j;
				//System.out.println(product);
				String len= ""+product;
				for(int l=0;l<len.length();l++){
					if(len.charAt(l)==(len.charAt(len.length()-l-1))){
						check=true;
						//System.out.println(len);
				}
					else{
						check=false;
					}
				while(check){
					System.out.println(product);
					check=false;
					//System.out.print(palidromes[z]);
				}
				}
			}
		}
		//Arrays.sort(palidromes);
		//System.out.println(Arrays.asList(palidromes));
//		System.out.print("bo");
//		for(int po=0;po<palidromes.length;po++){
//			System.out.println(palidromes[po]);
//		}
	}
}
