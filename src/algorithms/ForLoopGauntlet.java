package algorithms;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		for (int j = 100; j > 0; j--) {
			System.out.println(j);
		}
		for(int i = 2; i < 100; i ++) {
			if(i%2== 0) {
				System.out.println(i);
			}
		}
			for(int i = 1; i < 99; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
			}
			for(int i = 1; i<500; i++) {
				if (i%2 == 0) {
					System.out.println(i+" is even");
					
				}
				else {
					
				}
				if(i%2 == 1) {
					System.out.println(i+" is odd");
				}
				
			
			}
			for(int i = 7; i < 784; i++) {
				if(i%7==0) {
					System.out.println(i);
				}
				
			}
		for(int i = 2007; i <2019; i++) {
			System.out.println("In the year "+i+" I was "+(i-2007));
			
		}
	for(int i = 0; i <3; i++) {
		for (int j = 0; j <3; j++) {
			System.out.println(i+" "+j);
		}
		
	}
	for(int i =0;i<9;i+=3) {
		for(int k =1; k<4;k++) {
			System.out.print(k+i+" ");
			
		}
		System.out.println();
	}
	for(int i =0;i<100;i+=10) {
		for(int k =1; k<11;k++) {
			System.out.print(k+i+" ");
			
		}
		System.out.println();
	}
	for(int i =1;i<7;i++) {
		for(int k =0; k<i;k++) {
			System.out.print(" *");
			
		}
		System.out.println();
	}
	for(String s = "";s.length()<14;s+=" *") {
		System.out.println(s);
	}
}
}
