import java.util.*; 
import ou.*; 

/**
 * A library is keeping a record of movies using a map, there the keys of the map are 
 * Strings representing the title of the movie. Each key represents a set of Strings representing 
 * the actors who star in the movie. A library is keeping a record of movies using a map, 
 * there the keys of the map are Strings representing the title of the movie. 
 * Each key represents a set of Strings representing the actors who star in the movie. 
 * 
 * @author (Ross Bardeh) 
 * @version (04/05/2016)
 */
public class MovieLibary
{
   // instance variables - replace the example below with your own
   private Map<String, Set<String>> listOfMovies; 

   /**
    * Constructor for objects of class MovieLibary
    */
   public MovieLibary()
   {
      listOfMovies = new HashMap<>(); 
      this.populateLibary(); 
   }

   /**
    * This method populates the map, with a series of movie titles representing the lead actors in the movie. 
    * @param void
    * @return void
    */
   public void populateLibary()
   {
      Set<String> actorSet = new HashSet<>(); 
      actorSet.add("Gwenth Paltro"); 
      actorSet.add("Robert Downie Jr"); 
      listOfMovies.put("Iron Man", actorSet); 
      
      actorSet = new HashSet<>(); 
      actorSet.add("Russel Crowe"); 
      actorSet.add("Max von Sydow"); 
      listOfMovies.put("Robin Hood", actorSet);
      
      actorSet = new HashSet<>(); 
      actorSet.add("Colin Firth"); 
      actorSet.add("Mark Strong"); 
      listOfMovies.put("Kingsman", actorSet); 
      
      actorSet = new HashSet<>(); 
      actorSet.add("Robert Downie Jr"); 
      actorSet.add("Jude Law"); 
      listOfMovies.put("Sherlock Holmes", actorSet); 
      
      actorSet = new HashSet<>(); 
      actorSet.add("Brendan Fraser"); 
      actorSet.add("Rachel Weisz"); 
      listOfMovies.put("The Mummy", actorSet); 
      
      actorSet = new HashSet<>(); 
      actorSet.add("Rowan Atkinson"); 
      actorSet.add("Ben Miller"); 
      listOfMovies.put("Johnnie English", actorSet); 
      
      actorSet = new HashSet<>(); 
      actorSet.add("Hugh Jackman"); 
      actorSet.add("Tao Okamoto"); 
      listOfMovies.put("The Wolverine", actorSet);	
      
   }
   
   /**
    * 3.C.i
    * This method iterates over a map's keys, and prints out a representation of the map's contence. 
    * @param void 
    * @return void 
    */
   public void printMap()
   {
      for (String aMovie : listOfMovies.keySet())
      {
         System.out.println(aMovie + " stars " + listOfMovies.get(aMovie));
      }
   }
   
   /**
    * 3.C. ii 
    * This method takes an argument of a string representing the key to the map. 
    * If the movie searched for is in the map it will return a list of the actors in the movie. 
    * If the movie searched for is not in the map it will return a message saying the movie is not in the libary. 
    * @param String 
    * @return void
    */
   public void printMapValue(String aString) 
   {
      boolean movieTest = listOfMovies.containsKey(aString);
      if (movieTest == true)
      {
         System.out.println("The movie you searched for stars " + listOfMovies.get(aString)); 
      }
      else 
      {
         System.out.println("The movie you searched for is not in our libary"); 
      }
 
   }
   
   /**
    * 3.C.iii
    * This method takes a string and a set of strings as an argument. 
    * The string used as an argument is used as the movie name, and the set of strings is used as the actors names. 
    * The new entry is then added to the map. 
    * @param String, Set<String>
    * @return void
    */
   public void addMapEntry(String aMovieName, Set<String> actorsNames)
   {
      listOfMovies.put(aMovieName, actorsNames); 
   }
   
   /**
    * Deletes the key and value from the map, if the string taken as an argument is in the map. 
    * If the map entry is deleted the method returns true. 
    * If the movie is not in the map, the method returns false. 
    * @param String
    * @return boolean
    */
   public boolean deleteEntry(String movieToBeDeleted) 
   {
      if (listOfMovies.containsKey(movieToBeDeleted))
      {
         listOfMovies.remove(movieToBeDeleted); 
         return true ; 
      }
      else
      {
         return false; 
      }
   }
   
   /**
    * This method returns a collection of keys that contain the actor used as the argument. 
    * @param String 
    * @return Set<String>
    */
   public Set<String> selectKeys(String actorsName)
   {
      Set<String> sortedMovieList = new HashSet<>();
      for (String aMovie: listOfMovies.keySet())
      {
         if (listOfMovies.get(aMovie).contains(actorsName)) 
         {
            sortedMovieList.add(aMovie); 
         }
      }
      return sortedMovieList; 
   }
   
   /** 
    * This method adds a new actor to a movie that is already in the map. 
    * @param String, String 
    * @return void 
    */
   public void addValue(String movieName, String newActorsName)
   {
      listOfMovies.get(movieName).add(newActorsName); 
   }
   
   /**
    * This method removes an actor from a movie that is already in the map. 
    * @param String, String 
    * @return void
    */
   public void deleteValue(String movieName, String actorToBeRemoved)
   {
      listOfMovies.get(movieName).remove(actorToBeRemoved); 
   }
}


