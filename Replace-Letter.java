import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        // ask user for word
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        
        // ask user for letter to replace
        System.out.println("Enter the letter to be replaced:");
        String letterToReplace = scanner.nextLine();
        
        // ask user for letter to replace with
        System.out.println("Enter the newLetter:");
        String newLetter = scanner.nextLine();
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        replaceLetter(word, letterToReplace, newLetter);
        
        
    }
    
    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace 
    // 
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String newLetter)
    {
        String string = "";
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            // create variable to hold letters.
            char temp = word.charAt(i);
            char letter = letterToReplace.charAt(0);
            
            
            //if letter equals
            if(temp == letter)
            {
                //if count > 1
                if(count>=1)
                {
                    //adds letter to string
                    string = string + newLetter;
                }
                //adds to count every time there is letter. 
                count++;
                if(count<=1)
                {
                    string = string + temp;
                }
            }
            
            else
            {
               //add letter to string
               string = string + temp;
            }
        }
    System.out.println("Result:" + string);
    return string;
    }
}