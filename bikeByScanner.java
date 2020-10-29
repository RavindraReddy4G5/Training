import.java.util.Scanner;
class Bike
{
public static void main(String args[])
{
int bike_model;
String bike_company;
double bike_rating;
int bike_price;
String bike_name;
Scanner scanner=new Scanner(System.in);
System.out.println("========enter bike details========");
System.out.println("enter bike model===");
bike_model=scanner.nextInt();
System.out.println("enter bike company ===");
bike_company=scanner.next();
System.out.println("enter bike rating ===");
bike_rating = scanner.nextDouble();
System.out.println("enter bike price===");
bike_price = scanner.nextInt();
System.out.println("enter bike  name===");
bike_name = scanner.next();
}

}