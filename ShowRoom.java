class Car
{
	String brandName;
	int topSpeed;
	double mileage;
	String color;
	public Car(String brandName,int topSpeed)
	{
		
		this.brandName = brandName;
		this.topSpeed = topSpeed;
	}
	public Car(String brandName,int topSpeed,double mileage)
	{
		
		this.brandName = brandName;
		this.topSpeed = topSpeed;
		this.mileage=mileage;
	}
	public Car(String brandName,int topSpeed,double mileage,String color) 
	{
		this.brandName = brandName;
		this.topSpeed = topSpeed;
		this.mileage = mileage;
		this.color = color;
	}

}

class ShowRoom
{
public static void main(String[] args) 
{
	Car car=new Car("audi",250);
	Car car1=new Car("benz",300,21.66);
	Car car2=new Car("bmw",400,20.33,"blue");
		System.out.println("==========audi car details are==========");
		System.out.println("car brand name is"+car.brandName);
		System.out.println("car speed is"+car.topSpeed);
		System.out.println("==========benz car details are==========");
		System.out.println("car brand name is"+car1.brandName);
		System.out.println("car speed is"+car1.topSpeed);
		System.out.println("car mileage is"+car1.mileage);
		System.out.println("=========bmw car details are=========");
		System.out.println("car brand name is"+car2.brandName);
		System.out.println("car speed is"+car2.topSpeed);
		System.out.println("car mileage is"+car2.mileage);
		System.out.println("car color is"+car2.color);
}
}