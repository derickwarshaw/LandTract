/**
 * @(#)LandtractTest.java
 *
 *
 * @Derick Warshaw // Lab 13 // COSC1337
 * @version 1.00 2014/5/7
 */

/**The LandtractTest class allows for testing of all public methods and
 *constructors in Landtract.java and Owner.java. */
public class LandtractTest
{

    public static void main(String[] args)
    {
    	// variable initialization
		double area = 1200.0;
		double testArea = 0.0;

		// create owner objects -- initialized
    	Owner myOwner = new Owner("Derick","5553254553");
    	Owner myOwner2 = new Owner("Dayne","5553254555");
    	Owner myOwner3 = new Owner("Miranda","4015066093");
    	Owner myOwner4 = new Owner("Scott","4015066092");

		// create landtract objects -- initialized
    	Landtract myLandtract = new Landtract(40,30, myOwner);
    	Landtract myLandtract2 = new Landtract(40,30, myOwner2);
    	Landtract myLandtract3 = new Landtract(45,30, myOwner3);
    	Landtract myLandtract4 = new Landtract(45,30, myOwner4);



		// create copies of owner and landtract objects for testing
		Owner copyOfOwner;
		Landtract copyOfLandtract;

		System.out.println("TESTING");
		System.out.println("");
		System.out.println("");

		// test the landtract equals method -- expecting equality
		System.out.print("LANDTRACT EQUALS METHOD EXPECT EQUAL ");

		if(myLandtract.equals(myLandtract))
		{
			System.out.println("\t\t\t\t-- PASSED --");
		}
		else
		{
			System.out.println("\t\t\t\t-- FAILED --");
		}
		System.out.println("");

		// test the landtract equals method -- expecting not equal
		System.out.print("LANDTRACT EQUALS METHOD EXPECT NOT EQUAL ");

		if(myLandtract.equals(myLandtract3))
		{
			System.out.println("\t\t\t-- FAILED --");
		}
		else
		{
			System.out.println("\t\t\t-- PASSED --");
		}
		System.out.println("");


		// test the owner equals method -- expecting equality
		System.out.print("OWNER EQUALS METHOD EXPECT EQUAL ");

		if(myOwner.equals(myOwner))
		{
			System.out.println("\t\t\t\t\t-- PASSED --");
		}
		else
		{
			System.out.println("\t\t\t\t\t-- FAILED --");
		}
		System.out.println("");

		// test the owner equals method -- expecting not equal
		System.out.print("OWNER EQUALS METHOD EXPECT NOT EQUAL ");

		if(myOwner.equals(myOwner2))
		{
			System.out.println("\t\t\t\t-- FAILED --");
		}
		else
		{
			System.out.println("\t\t\t\t-- PASSED --");
		}
		System.out.println("");


		// testing landtract constructor
		System.out.print("LANDTRACT CONSTRUCTOR ");

		if(myLandtract.equals(myLandtract))
		{
			System.out.println("\t\t\t\t\t\t\t\t-- PASSED --");
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t\t-- FAILED --");
		}
		System.out.println("");


		// testing owner constructor
		System.out.print("OWNER CONSTRUCTOR ");

		if(myOwner.equals(myOwner))
		{
			System.out.println("\t\t\t\t\t\t\t\t\t-- PASSED --");
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t\t\t-- FAILED --");
		}
		System.out.println("");


		// testing getArea() method
    	System.out.print("GET AREA METHOD ");

    	testArea = myLandtract.getArea();

    	if(area == testArea)
    	{
    	System.out.println("\t\t\t\t\t\t\t\t\t-- PASSED --");
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t\t\t-- FAILED --");
		}
		System.out.println("");

		// testing copy() method for landtract
		System.out.print("COPYING LANDTRACT OBJECT ");
		copyOfLandtract = myLandtract.copy();

		if(copyOfLandtract.equals(myLandtract.copy()))
		{
    		System.out.println("\t\t\t\t\t\t\t-- PASSED --");
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t-- FAILED --");
		}
		System.out.println("");


		// testing copy() method for owner
		System.out.print("COPYING OWNER OBJECT ");
		copyOfOwner = myOwner.copy();


		if(copyOfOwner.equals(myOwner.copy()))
		{
    		System.out.println("\t\t\t\t\t\t\t\t-- PASSED --");
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t\t-- FAILED --");
		}
		System.out.println("");
		// printing toString to console for owner
		System.out.println("CALL TOSTRING METHOD FOR OWNER");
		System.out.println("");
		System.out.println(myOwner.toString());
		System.out.println("");
		System.out.println("");
		// printing toString to console for landtract
		System.out.println("CALL TOSTRING METHOD FOR LANDTRACT");
		System.out.println("");
		System.out.println(myLandtract.toString());
		System.out.println("");
		System.out.println("");

		// printing various owners to console
		System.out.println("PRINT OWNERS TO CONSOLE");
		System.out.println("");
		System.out.println(myLandtract.toString());
		System.out.println("");
		System.out.println("");
		System.out.println(myLandtract2.toString());
		System.out.println("");
		System.out.println("");
		System.out.println(myLandtract3.toString());
		System.out.println("");
		System.out.println("");
		System.out.println(myLandtract4.toString());
		System.out.println("");
		System.out.println("");


		// comparing different owners and displaying results
		System.out.println("COMPARING DIFFERENT OWNERS");
		System.out.println("");

		// comparing myOwner to myOwner2
		System.out.print("myOwner and myOwner2");
		if(myOwner.equals(myOwner2))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");

		// comparing myOwner to myOwner3
		System.out.print("myOwner and myOwner3");
		if(myOwner.equals(myOwner3))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");

		// comparing myOwner to myOwner4
		System.out.print("myOwner and myOwner4");
		if(myOwner.equals(myOwner4))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");

		// comparing myOwner2 to myOwner3
		System.out.print("myOwner2 and myOwner3");
		if(myOwner2.equals(myOwner3))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");


		// comparing myOwner3 to myOwner4
		System.out.print("myOwner3 and myOwner4");
		if(myOwner3.equals(myOwner4))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");

		// comparing myOwner4 to myOwner2
		System.out.print("myOwner4 and myOwner2");
		if(myOwner4.equals(myOwner2))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");


		System.out.println("");


		// comparing different landtracts to eachother
		System.out.println("COMPARING DIFFERENT LANDTRACTS ");
		System.out.println("");

		// comparing myLandract to myLandtract2
		System.out.print("myLandtract and myLandtract2");
		if(myLandtract.equals(myLandtract2))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");

		// comparing myLandract to myLandtract3
		System.out.print("myLandtract and myLandtract3");
		if(myLandtract.equals(myLandtract3))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");

		// comparing myLandract to myLandtract4
		System.out.print("myLandtract and myLandtract4");
		if(myLandtract.equals(myLandtract2))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");

		// comparing myLandract2 to myLandtract3
		System.out.print("myLandtract2 and myLandtract3");
		if(myLandtract2.equals(myLandtract3))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");

		// comparing myLandract2 to myLandtract4
		System.out.print("myLandtract2 and myLandtract4");
		if(myLandtract2.equals(myLandtract4))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");

		// comparing myLandract3 to myLandtract4
		System.out.print("myLandtract3 and myLandtract4");
		if(myLandtract3.equals(myLandtract4))
		{
			System.out.println(" are equal.");
		}
		else
		{
			System.out.println(" are not equal.");
		}
		System.out.println("");
    }


}