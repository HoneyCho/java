package Book;

public class authortest extends author{

	public authortest(String name, String email, String gender) {
		super(name, email, gender);
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		author au1=new author("be be" ,"be.com ","female");
		System.out.print(au1);
	}

}
