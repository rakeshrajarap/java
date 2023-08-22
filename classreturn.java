package advancedjava;

public class classreturn {

	public static void main(String[] args) 
	{
		
		employee e1= new employee("rakesh",32);
		employee e2= new employee("srikanth",33);
		employee e3= new employee("raju",34);
		empl empl1=new empl(e2);
		System.out.println(empl1.calretu());
	}
}
class employee
{
  String name ;
  int id;
  employee(String name,int id)
  {
	  this.name=name;
	  this.id=id;
  }
  public String toString()
  {
	  return name+""+id;
  }
}
class empl
{
	employee e;
	empl(employee e)
	{
		this.e=e;
	}
  public employee calretu()
  {
	  return e;
  }
}