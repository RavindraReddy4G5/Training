import.java.util.Scanner;
class College
{
public static void main(String args[])
{
int college_id;
String college_code;
double college_rating;
int college_area;
String college_name;
Scanner scanner=new Scanner(System.in);
System.out.println("========enter college details========");
System.out.println("enter college id===");
college_id=scanner.nextInt();
System.out.println("enter college code ===");
college_code=scanner.next();
System.out.println("enter college rating ===");
college_rating = scanner.nextDouble();
System.out.println("enter college area in acres===");
college_area = scanner.nextInt();
System.out.println("enter college  name===");
college_name = scanner.next();
}

}