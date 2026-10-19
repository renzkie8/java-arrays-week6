import java.util.Scanner;

public class mamamo{
  public void main(String[] args){
    Scanner input = new Scanner (System.in);

    System.out.print("Enter Array size: ");
    int size = input.nextInt();
    
    int[] intArray = new int [size];

     for (int i= 0; i < intArray.length; i++) {
      System.out.print("Enter a number: ");
      intArray[i] = input.nextInt();
     }
     System.out.print(" Unique size: ");
     boolean isUnique = true;
     for (int j = 0; j < intArray.length; j++) {
      if (i != j && intArray[i] ==
      intArray[i]) {
        isUnique = false;
        break i
      }
     }
     if(isUnique){
      System.out.print(array[i]+ "");
     }
   }
   input.close;
  }
}