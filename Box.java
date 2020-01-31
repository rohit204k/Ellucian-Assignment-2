class BoxClass{
	double length;
	double breadth;
	double height;
	
	BoxClass(double l,double b,double h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	
	BoxClass(BoxClass ob)
	{
		System.out.println("Initialised using constructor that takes object as parameter");
		
		length=ob.length;
		breadth=ob.breadth;
		height=ob.height;
	}
	
	double volume()
	{
		return length*breadth*height;
	}
}
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxClass ob1=new BoxClass(20,45,75);
		BoxClass ob2=new BoxClass(ob1);
		System.out.println("Volume of the box is = "+ob2.volume());
	}

}
