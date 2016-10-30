import java.util.*; 
import ou.*; 
/**
 * Write a description of class Payroll here.
 * 
 * @author (Ross Barden) 
 * @version (03/05/2016)
 */
public class Payroll
{
   private Set <Employee> employeeSet; 

   /**
    * Constructor for objects of class Payroll
    */
   public Payroll()
   {
      employeeSet = new HashSet<>();
   }

   /**
    * 2.A.ii
    * This method creates a new instance of Employee. 
    * The string argument is used as the employeeNumber for the new instance. 
    * It takes a String as an argument, and does not return anything. 
    */
   public void enrollEmployee(String aString) 
   {
     Employee aEmp = new Employee(aString); 
     employeeSet.add(aEmp); 
   }
   
   /** 
    * 2.A.iii
    * This method prints out each employee's record on is own individual line. 
    * It uses the format First Name, Second Name, Employee Name, "Sales", Sales figure. 
    * It does not take an argument, and does not return anything. 
    */
   public void printEmployees() 
   {
      for (Employee eachElement: employeeSet)
      {
      System.out.println(eachElement.getFirstName()+" " + eachElement.getSecondName() + " " + eachElement.getEmployeeNumber() + " Sales " + eachElement.getSales() + " "); 
      }

   }
   
   /**
    * 2.B
    * This method iterated though the set of employees against the employees in the Map. 
    * If the employee appears in both, it will update their sales figures to be the total of the two figures, from the set of employees and the map. 
    * It takes a map whose keys are strings and values are Integers as an argument, and does not return anythng. 
    */
   public void updateSalesFigures(Map <String, Integer> m) // (Sales.getSales());
   {
      for (Employee eachElement: employeeSet)
      {         
         if (m.containsKey(eachElement.getEmployeeNumber()))
         {
           eachElement.setSales(eachElement.getSales()+ m.get(eachElement.getEmployeeNumber()));  
         }
      }
   }
   
   /**
    * 2.C.ii
    * This method iterates through the set of employees and determines if both their First and Second names are assigned to the value null. 
    * If they are, it prompts the user to enter a new first and second name of the employee. 
    * The string the user entered is then split at the space and the first half is assigned to the employees first name. 
    * The second half is assigned to the employees second name. 
    * If the user clicked cancel as opposed to entering a string, the loop continues to the next relevant value. 
    * It does not take an argument, and does not return anything. 
    */
   public void nameEmployees()
   {
      for (Employee eachElement: employeeSet)
      {
      boolean test = (eachElement.getFirstName()== null && eachElement.getSecondName()== null);
      if (test == true)
      {
         String newName = OUDialog.request("Enter first and last name of employee with number: " + eachElement.getEmployeeNumber()); 
         if (newName != null) 
         {
            String[] parts = newName.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            eachElement.setFirstName(part1);
            eachElement.setSecondName(part2);
         }
         else 
         {
            continue ; 
         }
      }
      }
   }

}
