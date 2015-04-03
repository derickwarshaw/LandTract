/**
 * @(#)Landtract.java
 *
 *
 * @Derick Warshaw // Lab 13 // COSC1337
 * @version 1.00 2014/5/7
 */

/**The Landtract class allows the user to create a Landtract object.
 **/
public class Landtract
{
	// private fields
	private double landLength = 0;
	private double landWidth = 0;
	private Owner owner;


	/**Landtract constructor performs setup operations */
    public Landtract(double inputLength, double inputWidth, Owner inputOwner)
    {
    	landLength = inputLength;
    	landWidth = inputWidth;
		owner = new Owner(inputOwner);


    }
	/**The copy() method allows a clone of an object to be created.
	 *@returns A copy of the landtract */
    public Landtract copy()
    {

    	Landtract objectCopy = new Landtract(landLength, landWidth, owner);
    	return objectCopy;

    }
	/**The getArea() method is a getter that performs calculations for finding
	 *the area of a landtract
	 *@returns tractArea The area of a landtract. */
    public double getArea()
    {

    	double tractArea;



    	tractArea = landLength * landWidth;

    	return tractArea;

    }
	/**The toString() method returns a string of information regarding the
	 *landtract.
	 *@returns str Information about the landtract str such as who the owner is,
	 * the length and width, as well as a calculation of the area. */
    public String toString()
    {
    	String str = owner +
    		         "\nLand Length: " + landLength + " feet" +
    		         "\nLand Width: " + landWidth +" feet" +
    		         "\nLand Area: " + landLength * landWidth + " square feet";

    	return str;


    }


	/**The equals() method allows for the comparison of landtract length and
	 *width
	 *@param Landtract object2 is a Landtract type variable that is used
	 *for comparison
	 *@returns status A boolean value status true or false based on whether the
	 * length and width are equal. */
	public boolean equals(Landtract object2)
	{
		boolean status;

		if(landLength == object2.landLength && landWidth == object2.landWidth)
		{

			status = true;


		}
		else
		{


			status = false;

		}

		return status;
	}
}