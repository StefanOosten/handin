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
        
       if(firstname.length()<= 2){
           
           System.out.println("The firstname of " + "  \"" + firstname + "\" " + " should be at least 3 characters");
           
       }else if(lastname.length()<= 3){
           
           System.out.println("The lastname of " + "  \"" + lastname + "\" " + " should be at least 4 characters");
           
       }else if(mothername.length()<= 2){
           
           System.out.println("The mothername of " + "  \"" + mothername + "\" " + " should be at least 3 characters");
           
       }else if(city.length()<=3 ){
           
           System.out.println("The city of " + "  \"" + city + "\" " + " should be at least 4 characters");
           
       }else{
           
        
        fname = firstname.trim().substring(0,2).toLowerCase();
        lname = lastname.trim().substring(0,3).toLowerCase();
        mname = mothername.trim().substring(0,2).toLowerCase();
        town = city.trim().substring(0,3).toLowerCase();
        
        System.out.println("You Star Wars name is: \n" );
        System.out.println("Firstname: \n" + lname + fname);
        System.out.println("Lastname: \n" + mname + town);}
    }
    
    
    
    
}
