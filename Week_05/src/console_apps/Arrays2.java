package console_apps;

public class Arrays2 {

	public static void main(String[] args) {
		int[] ns = new int[3]; // initializer expression
		System.out.println("Size of array ns: "+ ns.length);
		System.out.println("1st element:"+ns[0]);
		System.out.println("2st element:"+ns[1]);
		System.out.println("3st element:"+ns[2]);

		System.out.println("After changing elements of the array:");
		
		ns[0] =23; 
		ns[1]=46;
		ns[2]=96;
		System.out.println("Size of array ns: "+ ns.length);
		System.out.println("1st element:"+ns[0]);
		System.out.println("2st element:"+ns[1]);
		System.out.println("3st element:"+ns[2]);
	}

}
