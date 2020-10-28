class  States
{
String stateName;
int population;
int numberOfDistricts;
int numberOfMlas;
int numberOfMps;
}
class Districts
{
String districtName;
int population;
int numberOfMandals;
int numberOfMlas;
int numberOfMps;
}
class Country
{
public static void main(String args[])
{
 String countryName="INDIA";
 States name =new States();
name.stateName="andhraPradesh";
name.population=4000000;
name.numberOfDistricts=13;
name.numberOfMlas=175;
name.numberOfMps=25;
System.out.println("stateName is ="+name.stateName);
System.out.println("population is="+name.population);
System.out.println("numberofdistrics are="+name.numberOfDistricts);
System.out.println("number of mla are="+name.numberOfMlas);
System.out.println("number of mps are="+name.numberOfMps);

Districts districts=new Districts();
districts.districtName="Guntur";
districts.population=100000;
districts.numberOfMandals=13;
districts.numberOfMlas=17;
districts.numberOfMps=3;
System.out.println("stateName is="+districts.districtName);
System.out.println("population is="+districts.population);
System.out.println("number of mandals are="+districts.numberOfMandals);
System.out.println("number of mla are="+districts.numberOfMlas);
System.out.println("number of mps are="+districts.numberOfMps);

}
}






