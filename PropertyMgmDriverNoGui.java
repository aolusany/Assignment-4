public class PropertyMgmDriverNoGui {

public static void main(String[] args) {

 

//Creates property objects

Property p1 = new Property ("Belmar", "Silver Spring", 1200, "John Smith");

Property p2 = new Property ("Camden Lakeway", "Rockville", 5000, "Ann Taylor");

Property p3 = new Property ("Hamptons", "Rockville", 1250, "Rick Steves");

Property p4 = new Property ("Mallory Square", "Wheaton", 1000, "Abbey McDonald");

Property p5 = new Property ("Lakewood", "Rockville", 3000, "Alex Tan");

//Creates management company object

ManagementCompany m = new ManagementCompany("Alliance", "1235",6);

//Adds the properties to the list of properties of the management company

System.out.println(m.addProperty(p1));   //Should add the property and display the index where the property is added to the array

System.out.println(m.addProperty(p2));

System.out.println(m.addProperty(p3));

System.out.println(m.addProperty(p4));

System.out.println(m.addProperty(p5));   

System.out.println(m.addProperty(p5));   //it should display -1 to indicate the property is not added to the array

//Displays the information of the property that has the maximum rent amount

System.out.println("The property with the highest rent:\n" + m.displayPropertyAtIndex(m.maxPropertyRentIndex())); 

//Displays the total rent of the properties within the management company

System.out.println("\nTotal Rent of the properties: "+m.totalRent()+ "\n");  

System.out.println(m); //Lists the information of all the properties and the total management fee 

}

 

}