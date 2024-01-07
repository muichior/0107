package pet_1111410053;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Puppy Mydog=new Puppy ("皮皮");
		Puppy Mycat=new Puppy ("kitty", "cat","Gray");
		double totel ;
		totel=Mydog.check(0,1);
		 System.out.printf("總金額為%8.2f%n%n",totel);
		totel=Mycat.check(0,1,3);
		 System.out.printf("總金額為%8.2f%n%n",totel);

	}

}
