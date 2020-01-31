class PersonClass{
	String fname;
	String lname;
	int age;
	int uid;
	int salary;
	
	PersonClass(String fn,String ln,int a,int u,int s)
	{
		fname=fn;
		lname=ln;
		age=a;
		uid=u;
		salary=s;
	}
}

class Politician extends PersonClass{
	String party;
	
	Politician(String fn, String ln, int a, int u, int s,String p) {
		super(fn, ln, a, u, s);
		party=p;
		// TODO Auto-generated constructor stub
	}
}

class Sportsman extends PersonClass{
	String sports;
	
	Sportsman(String fn, String ln, int a, int u, int s,String sp) {
		super(fn, ln, a, u, s);
		sports=sp;
		// TODO Auto-generated constructor stub
	}
	
}

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
