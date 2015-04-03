/**
 * @(#)Owner.java
 *
 *
 * @Derick Warshaw // Lab 13 // COSC1337
 * @version 1.00 2014/5/7
 */

/**The Owner class allows for the creation of an Owner object which has a name
 *and phone number. */
public class Owner
{
	private String ownerName = " ";
	private String ownerPhone = " ";

	/**The Owner constructor performs setup operations and doesn't allow for
	 *negative phone numbers to be entered. */
    public Owner(String inputOwner, String inputPhone)
    {
		double checkNumber;

		// parse string to double to make suer it isn't negative
		checkNumber = Double.parseDouble(inputPhone);

		// if number is less than 0 set phone number to 0000000000
		if (checkNumber < 0)
		{

			ownerPhone = "0000000000";

		}
		else
		{

			ownerPhone = inputPhone;

		}

    	ownerName = inputOwner;


    }
	/**The Owner copy constructor initializes the object as a copy of another
	 *Owner object
	 *@param objectCopy is the object to copy  */
    public Owner (Owner objectCopy)
    {

    	ownerName = objectCopy.ownerName;
    	ownerPhone = objectCopy.ownerPhone;

    }
	/**The Owner copy() method returns a copy of the Owner object
	 *@param OwnerName field info
	 *@param ownerPhone field info
	 *@returns a copy of the owner object */
    public Owner copy()
    {

    	Owner objectCopy = new Owner(ownerName, ownerPhone);
    	return objectCopy;

    }
	/**The toString() method returns information about the owner name and phone
	 *@returns str a String data type containing owner name and phone info */
    public String toString()
    {

    	String str = "Owner Name: " + ownerName +
    		         "\nOwner Phone: " + ownerPhone;

    	return str;



    }
	/**The equals method allows a comparison of owner name's to be made to deter
	 *mine whether they are equal or not
	 *@param Owner type object2 is passed in for comparison
	 *@returns status a Boolean type true or false value */
    public boolean equals(Owner object2)
	{
		boolean status;

		if(ownerName.equals(object2.ownerName) &&
		   ownerPhone.equals(object2.ownerPhone))
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