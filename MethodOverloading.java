class Athelete
{
 void run(int a)
{
System.out.println("fast run for  " +a+"  kilometers");
}
void run(int b,String fruit)
{
System.out.println("slow run for   "+b +" kilometers and "+"  eat one fruit is     "+fruit );
}
void run(int b,int c,String food)
{
System.out.println("walk for   "+b+"  kilometers  and sleep for"+c+"  and eat food   "+food);
}
}
public class MethodOverloading
{
public static void main(String args[])
{
Athelete athelete=new Athelete();
athelete.run(5);
athelete.run(3,"apple");
athelete.run(4,5,"dhal");
}
}