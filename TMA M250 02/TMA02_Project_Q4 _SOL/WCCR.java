import java.util.*; 
import java.io.*; 
import ou.*; 

/**
 * Class WCCR 
 * Manages the entrants of a car race. 
 * 
 * @author (Ross Barden) 
 * @version (04/05/2016)
 */
public class WCCR
{
   // instance variables - replace the example below with your own
   private List <Entrant> entrants; 
   private Map <String, Double> e1Results; 
   private Map <String, Double> e2Results; 
   private Map <String, Double> e3Results; 
   
   /**
    * Constructor for objects of class WCCR
    */
   public WCCR()
   {
      entrants = new ArrayList<>(); 
      e1Results = new HashMap<>(); 
      e2Results = new HashMap<>(); 
      e3Results = new HashMap<>(); 
   }

   /**
    * This method prompts the user to select a text file. 
    * It then scans the contens of the file, and adds the information to the map of entrants. 
    * @param void 
    * @return void
    */
   public void readInEntrants()
   {
      String pathName = OUFileChooser.getFilename();
      File entrantsList = new File(pathName);
      BufferedReader bufferedFileReader = null;
      try
      {
         Scanner scanner = new Scanner(new BufferedReader(new FileReader(entrantsList)));
         scanner.useDelimiter(","); 
      while (scanner.hasNext())
      {
         String name = scanner.next(); 
         String category = scanner.nextLine().substring(1);
         Entrant entrant = new Entrant();
         entrant.setName(name); 
         entrant.setCategory(category);
         entrants.add(entrant); 
      }       
      }
      catch (Exception anException)
      {
         System.out.println("Error: " + anException);
      }
   }
   
   /**
    * Generates a random result between the start(30.00) and end times (60.00)
    * @param void
    * @return double
    */
   private double generateTime()
   {      
      double start = 30.00;
      double end = 60.00;
      double random = new Random().nextDouble();
      double result = start + (random * (end - start));
      return result; 
   }
   
   /**
    * This method loops over the entrants assigning each one a randomly generated time. 
    * @param void
    * @return void
    */
   public void runRally()
   {
      for (Entrant eachEntrant: entrants)
      {
         eachEntrant.setTime(generateTime()); 
      }
   }
   
   /**
    * This method sorts the entrants by their times 
    * @param void 
    * @return void 
    */
   public void sortEntranceList()
   {
      Collections.sort(entrants);  
   }
   
   /**
    * This method sorts the entrance by their catagory and added them to the appropriate map. 
    * @param void 
    * @return void
    */
   public void categorise()
   {
      for (Entrant eachEntrant: entrants) 
      {
         if (eachEntrant.getCategory().equals("E1"))
         {
            e1Results.put(eachEntrant.getName(), eachEntrant.getTime()); 
         }
         if (eachEntrant.getCategory().equals("E2"))
         {
            e2Results.put(eachEntrant.getName(), eachEntrant.getTime()); 
         }
         if (eachEntrant.getCategory().equals("E3"))
         {
            e3Results.put(eachEntrant.getName(), eachEntrant.getTime()); 
         }
      }
   }
}
