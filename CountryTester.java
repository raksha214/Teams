public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("No. of countries");
int num=sc.nextInt();
Country []countrys=new Country[num];
for(int i=0;i<countrys.length;i++)
{
sc.nextLine();
System.out.println("Enter country name:");
String cname=sc.nextLine();
System.out.println("Enter no. of states:");
byte state=sc.nextByte();
System.out.println("Enter population:");
System.out.println();
Country country=new Country();
country.setCountryName(cname);
country.setCapital(cap1);
country.setNoOfStates(state);
country.setPopulation(pop);
countrys[i]=country;
}
for(i=0;i<countrys.length;i++)
{
Country country=countrys[i];
String name=country.getCountryName();
String capital=country.getCapital();
byte.noOfStates=country.getNoOfStates();
short population=country.getPopulation();
System.out.println(name+"\t "+capital+" \t"+noOfStates+"\t "+population);
}
}