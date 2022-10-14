public class Test2 {
	public static void main(String[] args){
		int row = 0;
		int A ;
		
		while (row < 9) {
			A= row;
			if (row >= 5 ) {
				A = 8 - row;
			}
			
			int star = 0;
			while (star <= A){
				System.out.print("*");
				star=star + 1;
			}
		System.out.println("");
		
		row=row + 1;
		}
	}
}
	
	
	
	
	



