class Nokia
{
String modelName;
int price;
int ramSpeed;
int cameraQuality;
float androidVersion;
}
class Samsung
{
String modelName;
int price;
int batterymah;
String color;
String mobileType;
}
class Mobile
{
public static void main(String args[])
{
Nokia nokia=new Nokia();
nokia.modelName="X2";
nokia.price=3000;
nokia.ramSpeed=2;
nokia.cameraQuality=4;
nokia.androidVersion=1.3f;
System.out.println("model name is="+nokia.modelName);
System.out.println("cost of mobile is="+nokia.price);
System.out.println("ram speed in GB's is="+nokia.ramSpeed);
System.out.println("camera quality in megapixels is="+nokia.cameraQuality);
System.out.println("android version is="+nokia.androidVersion);
Samsung samsung=new Samsung();
samsung.modelName="M30";
samsung.price=15000;
samsung.batterymah=6000;
samsung.color="NavyBlue";
samsung.mobileType="Android";
System.out.println("model name is="+samsung.modelName);
System.out.println("cost of mobile is="+samsung.price);
System.out.println("battery in mah is="+samsung.batterymah);
System.out.println("color is="+samsung.color);
System.out.println("type of mobile is="+samsung.mobileType);
}
}

