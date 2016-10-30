
/**
 * An interface which can be implemented by all classes. 
 * 
 * @author (Ross Barden) 
 * @version (17.01.2016)
 */
public interface Exercisable
{
   /**
    * Takes two arguments an integer and a boolean value. 
    * 
    * The interger dictates how many times the exercises should be performed.
    * 
    * If the boolean value is true the exercise should begin in a rightwards direction (right, right, left).
    * If the boolean value is false the exercise should begin in leftwards direction, (left, left, right).
    */    
   void exercise(int duration, boolean isStartingLeft); 
}
