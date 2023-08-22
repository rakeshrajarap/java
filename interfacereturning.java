package advancedjava;

import java.util.*;

public class interfacereturning {

	public static void main(String[] args) 
	{
		Inter i=add.calshow();

	}
}
interface Inter
{
	public void method1();
}
class Interimpl implements Inter
{
   public void method1()	
   {
	   System.out.println("iam in method 1");
   }
}
class add
{
   static  Inter i =new Interimpl();
   public static Inter calshow()
   {
	   i.method1();
	   return i;
   }
}