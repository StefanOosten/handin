import java.util.*;
import java.io.*;
/**
 * Write a description of class generateStarWarsName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class generateStarWarsName
{
    // instance variables - replace the example below with your own
    private String fname;
    private String lname;
    private String mname;
    private String town;

    /**
     * Constructor for objects of class generateStarWarsName
     */
    public generateStarWarsName(String firstname, String lastname, String mothername, String city)
    {
        // initialise instance variables
        
       
        fname = firstname.trim().substring(0,2).toLowerCase();
        lname = lastname.trim().substring(0,3).toLowerCase();
        mname = mothername.trim().substring(0,2).toLowerCase();
        town = city.trim().substring(0,3).toLowerCase();
        
        System.out.println("You Star Wars name is: \n" );
        System.out.println("Firstname: \n" + lname + fname);
        System.out.println("Lastname: \n" + mname + town);
    }
    
    
    
}
