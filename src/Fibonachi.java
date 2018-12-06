
public class Fibonachi {

	public static void main(String[] args) {
		int hi = 0;
		int okwd= 1;
	System.out.println(hi);
	System.out.println(okwd);
		for (int i = 0; i < 12; i++) {
			int joe = hi+okwd;
			hi=okwd;
			okwd=joe;
			System.out.println(joe);
			
		}
		

	}

}
	