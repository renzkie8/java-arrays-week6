import java.util.Scanner;

public class ActivityP{
  public  static void main(String[] args){
    Scanner number = new Scanner (System.in);
    
    System.out.println("Enter the size of the array: ");
    int arrSize = number.nextInt();

    int [] array = new int[arrSize];
    for(int i = 0; i<arrSize; i++){
      System.out.println("\nInput a number(s):");
      array[i] = number.nextInt();
    }
    System.out.println("Unique Number(s):");
    boolean isUnique;

    for(int i = 0; i<arrSize; i++ ){
      isUnique = true;
      for(int j = 0 ; j<arrSize; j++){
        if(i != j && array[i]== array[j]){
          isUnique = false;
          break;
        }
      }
      if(isUnique){
        System.out.print(array[i]+ ", ");
      }
    }
  number.close();
 }
  }
