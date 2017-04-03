package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws YourCustomExceptionName if fullName is null or empty or has
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        
        if(fullName == null)
        {
            throw new IllegalArgumentException("Do not leave input blank.");
        }
        String lastName = null;
        
        String[] nameParts = fullName.split(" ");
        if(nameParts.length < 2)
        {
            throw new ArrayIndexOutOfBoundsException("Please enter a first name and a last name.");
        }
        lastName = nameParts[1];
        

        return nameParts[1];
    }
}
    

