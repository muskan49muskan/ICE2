package midtermreviewcodeforpartc;
 

/**
 *
 * @author Muskan Muskan 18 october 2023
 * 991707407
 */

import java.util.Scanner;
public class Passwordvalidator {
    
    public static String getpassword()
    {
    Scanner sc = new Scanner(System.in);
        boolean validPassword=false;
        String password="";
        while(!validPassword)
        {
            System.out.println("Passwords have 8 characters");
            System.out.println("Passwords must have one special character");
            System.out.println("Please enter your password:"); 
            
            password = sc.nextLine();
            int specialCharCount=0;
            //iterate
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                 
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&password.length()>7)
            {
                validPassword=true;
            }
        }
        return password;    
}
}