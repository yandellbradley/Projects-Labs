package movielist;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static movielist.MovieDBclass.getMovies;

/**
 *
 * @author Bradley
 * This program fills an array list for movies, then prints out movies by category as selected by user
 */

public class MovieList {
    
    //create our arry list and populate with data
    
    private static ArrayList<MovieClass> allMovies = new ArrayList<>(100);
    
    public static ArrayList<MovieClass> getAllMovies() {
       
        allMovies.add(new MovieClass("Citizen Kane", "drama"));
        allMovies.add(new MovieClass("Casablanca", "drama"));
        allMovies.add(new MovieClass("The Godfather", "drama"));
        allMovies.add(new MovieClass("Gone With The Wind", "drama"));
        allMovies.add(new MovieClass("Lawrence Of Arabia", "drama"));
        allMovies.add(new MovieClass("The Wizard Of Oz", "musical"));
        allMovies.add(new MovieClass("The Graduate", "drama"));
        allMovies.add(new MovieClass("On The Waterfront", "drama"));
        allMovies.add(new MovieClass("Schindler's List", "drama"));
        allMovies.add(new MovieClass("Singin' In The Rain", "musical"));
        allMovies.add(new MovieClass("It's A Wonderful Life", "drama"));
        allMovies.add(new MovieClass("Sunset Boulevard", "drama"));
        allMovies.add(new MovieClass("The Bridge On The River Kwai", "drama"));
        allMovies.add(new MovieClass("Some Like It Hot", "drama"));
        allMovies.add(new MovieClass("Star Wars", "scifi"));
        allMovies.add(new MovieClass("All About Eve", "drama"));
        allMovies.add(new MovieClass("The African Queen", "drama"));
        allMovies.add(new MovieClass("Psycho", "horror"));
        allMovies.add(new MovieClass("Chinatown", "drama"));
        allMovies.add(new MovieClass("One Flew Over The Cuckoo's Nest", "drama"));
        allMovies.add(new MovieClass("The Grapes Of Wrath", "drama"));
        allMovies.add(new MovieClass("2001: A Space Odyssey", "scifi"));
        allMovies.add(new MovieClass("The Maltese Falcon", "drama"));
        allMovies.add(new MovieClass("Raging Bull", "drama"));
        allMovies.add(new MovieClass("E.T. The extra-terrestrial", "scifi"));
        allMovies.add(new MovieClass("Dr. Strangelove", "drama"));
        allMovies.add(new MovieClass("Bonnie And Clyde", "drama"));
        allMovies.add(new MovieClass("Apocalypse Now", "drama"));
        allMovies.add(new MovieClass("Mr. Smith Goes to Washington", "drama"));
        allMovies.add(new MovieClass("The Treasure Of The Sierra Madre", "drama"));
        allMovies.add(new MovieClass("Annie Hall", "comedy"));
        allMovies.add(new MovieClass("The Godfather Part II", "drama"));
        allMovies.add(new MovieClass("High Noon", "drama"));
        allMovies.add(new MovieClass("To Kill A Mockingbird", "drama"));
        allMovies.add(new MovieClass("It Happened One Night", "drama"));
        allMovies.add(new MovieClass("Midnight Cowboy", "drama"));
        allMovies.add(new MovieClass("The Best Years Of Our Lives", "drama"));
        allMovies.add(new MovieClass("Double Indemnity", "drama"));
        allMovies.add(new MovieClass("Doctor Zhivago", "drama"));
        allMovies.add(new MovieClass("North By Northwest", "drama"));
        allMovies.add(new MovieClass("West Side Story", "musical"));
        allMovies.add(new MovieClass("Rear Window", "drama"));
        allMovies.add(new MovieClass("King Kong", "horror"));
        allMovies.add(new MovieClass("The Birth Of A Nation", "drama"));
        allMovies.add(new MovieClass("A Streetcar Named Desire", "drama"));
        allMovies.add(new MovieClass("A Clockwork Orange", "scifi"));
        allMovies.add(new MovieClass("Taxi Driver", "drama"));
        allMovies.add(new MovieClass("Jaws", "horror"));
        allMovies.add(new MovieClass("Snow White And The Seven Dwarfs", "animated"));
        allMovies.add(new MovieClass("Butch Cassidy And The Sundance Kid", "drama"));
        allMovies.add(new MovieClass("The Philadelphia Story", "drama"));
        allMovies.add(new MovieClass("From Here To Eternity", "drama"));
        allMovies.add(new MovieClass("Amadeus", "drama"));
        allMovies.add(new MovieClass("All Quiet On The Western Front", "drama"));
        allMovies.add(new MovieClass("The Sound Of Music", "musical"));
        allMovies.add(new MovieClass("M*A*S*H", "comedy"));
        allMovies.add(new MovieClass("The Third Man", "drama"));
        allMovies.add(new MovieClass("Fantasia", "animated"));
        allMovies.add(new MovieClass("Rebel Without A Cause", "drama"));
        allMovies.add(new MovieClass("Raiders Of The Lost Ark", "drama"));
        allMovies.add(new MovieClass("Vertigo", "drama"));
        allMovies.add(new MovieClass("Tootsie", "comedy"));
        allMovies.add(new MovieClass("Stagecoach", "drama"));
        allMovies.add(new MovieClass("Close Encounters Of The Third Kind", "scifi"));
        allMovies.add(new MovieClass("The Silence Of The Lambs", "horror"));
        allMovies.add(new MovieClass("Network", "drama"));
        allMovies.add(new MovieClass("The Manchurian Candidate", "drama"));
        allMovies.add(new MovieClass("An American In Paris", "drama"));
        allMovies.add(new MovieClass("Shane", "drama"));
        allMovies.add(new MovieClass("The French Connection", "drama"));
        allMovies.add(new MovieClass("Forrest Gump", "drama"));
        allMovies.add(new MovieClass("Ben-Hur", "drama"));
        allMovies.add(new MovieClass("Wuthering Heights", "drama"));
        allMovies.add(new MovieClass("The Gold Rush", "drama"));
        allMovies.add(new MovieClass("Dances With Wolves", "drama"));
        allMovies.add(new MovieClass("City Lights", "drama"));
        allMovies.add(new MovieClass("American Graffiti", "drama"));
        allMovies.add(new MovieClass("Rocky", "drama"));
        allMovies.add(new MovieClass("The Deer Hunter", "drama"));
        allMovies.add(new MovieClass("The Wild Bunch", "drama"));
        allMovies.add(new MovieClass("Modern Times", "drama"));
        allMovies.add(new MovieClass("Giant", "drama"));
        allMovies.add(new MovieClass("Platoon", "drama"));
        allMovies.add(new MovieClass("Fargo", "drama"));
        allMovies.add(new MovieClass("Duck Soup", "comedy"));
        allMovies.add(new MovieClass("Mutiny On The Bounty", "drama"));
        allMovies.add(new MovieClass("Frankenstein", "horror"));
        allMovies.add(new MovieClass("Easy Rider", "drama"));
        allMovies.add(new MovieClass("Patton", "drama"));
        allMovies.add(new MovieClass("The Jazz Singer", "drama"));
        allMovies.add(new MovieClass("My Fair Lady", "musical"));
        allMovies.add(new MovieClass("A Place In The Sun", "drama"));
        allMovies.add(new MovieClass("The Apartment", "drama"));
        allMovies.add(new MovieClass("Goodfellas", "drama"));
        allMovies.add(new MovieClass("Pulp Fiction", "drama"));
        allMovies.add(new MovieClass("The Searchers", "drama"));
        allMovies.add(new MovieClass("Bringing Up Baby", "drama"));
        allMovies.add(new MovieClass("Unforgiven", "drama"));
        allMovies.add(new MovieClass("Guess Who's Coming To Dinner", "drama"));
        allMovies.add(new MovieClass("Yankee Doodle Dandy", "musical"));
        
        
        
        return allMovies;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        //define and initialize variables
        
       // fill movie list array
            getAllMovies();
            
        
        String choice = "y";
        String categoryName = " ";
       
      
        System.out.println("Welcome to the Movie Lister");
        System.out.println();
        System.out.println("There are 100 movies in the list");
        
        // user inputs data
        while (choice.equalsIgnoreCase("y")) {
        System.out.println("What catagory are you interested in? ");
        System.out.println("Please chose from the list below");
        System.out.println("1. Animated");
        System.out.println("2. Drama");
        System.out.println("3. Horror");
        System.out.println("4. Musical");
        System.out.println("5. Scifi");
        
        System.out.print("Enter category number: ");
        String category = userInput.nextLine(); 
        System.out.println(""); 
        
         
        // set category name and call print movie list method
        
        switch (category) {
         case "1":
             categoryName = "animated";
             displayMovies(categoryName);
            break;

         case "2":
            categoryName = "drama";
            displayMovies(categoryName);
            break;

         case "3":
            categoryName = "horror";
             displayMovies(categoryName);
            break;

         case "4":
            categoryName = "musical";
             displayMovies(categoryName);
            break;

         case "5":
            categoryName = "scifi";
             displayMovies(categoryName);
            break;

         default:
            System.out.print("Please enter a valid choice");
            break;
      }
  
        
        // check to see if user wants to continue
            System.out.println();
            System.out.print("Continue? (y/n): ");
            choice = userInput.nextLine();
            System.out.println();
            System.out.println();
       }
        
           System.out.println();
           System.out.println();
           System.out.println("Bye!"); 
           
    }
      
    
      
       public static void displayMovies(String categoryName) {
           
        System.out.println("Our movie list in the " + categoryName +  " category:");
        System.out.println("");
        int count = 0;
        for (int n = 0; n < allMovies.size(); ++n) { 
            
            if (allMovies.get(n).getCategory().equalsIgnoreCase(categoryName)) {
                count = count + 1;
                System.out.println(count + ".  " + allMovies.get(n).getTitle() + " ");
               
              
            }
         
        }
           
    }         
          
}
 
