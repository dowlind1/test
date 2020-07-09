package test;

public class lcg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =((21*76)+3)%200;
		int y =((21*x)+3)%200;
		int z =((21*y)+3)%200;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}
 
 
}
