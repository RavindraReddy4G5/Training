class Student 
{
 int  Student_id;
 Float Student_percentage;
 static String college;
}
class Employee
{
 int  Employee_id;
 int Employee_salary;
 static String company_name;
}
  
class Variable
{
public static void main(String args[])
{
Student ravi=new Student();
ravi.Student_id=438;
ravi.Student_percentage=69.72f;
Student.college="vasavi institute of engineering";
System.out.println("----------The Student Detalis are---------");
System.out.println("Student_id=" +ravi.Student_id);
System.out.println("Student_percentage="+ravi.Student_percentage);
System.out.println("college="+Student.college);
Employee ravindraReddy=new Employee();
ravindraReddy.Employee_id=1;
ravindraReddy.Employee_salary=20000;
Employee.company_name="JNIT Technology";
System.out.println("----------The Employee Detalis are---------");
System.out.println("Employee_id="+ravindraReddy.Employee_id);
System.out.println("Employee_salary="+ravindraReddy.Employee_salary);
System.out.println("company_name="+ravindraReddy.company_name);

}
}