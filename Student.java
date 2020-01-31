public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass ob1=new StudentClass("ABC",122,7,"CS");
		StudentClass ob2=new StudentClass("DEF",123,7,"CS");
		ob1.display();
		ob2.display();
		System.out.println(ob1.name+" is equal to "+ob2.name+" : "+ob1.equals(ob2));
	}

}

class StudentClass{
	String name;
	int id;
	int sem;
	String branch;
	
	public StudentClass(String n,int i,int s,String b)
	{
		name=n;
		id=i;
		sem=s;
		branch=b;
	}
	
	/*boolean isEqual(StudentClass ob)
	{
		if (name.compareTo(ob.name)!=0)return false;
		if(id!=ob.id)return false;
		if(sem!=ob.sem)return false;
		if(branch.compareTo(ob.branch)!=0)return false;
		return true;
	}*/
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("Sem : "+sem);
		System.out.println("Branch : "+branch+"\n");
		
	}
}
