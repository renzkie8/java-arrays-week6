import java.util.Scanner;

public class DynamicArr{
  public static void main(String[] args){

    Scanner anne = new Scanner(System.in);

    System.out.print("Enter arrays size: ");
    int arrSize = anne.nextInt();

    int [] arr = new int[arrSize];

    for (int i = 0; i < arrSize; i++){
      System.out.print("Input a number: ");
      arr[i] = anne.nextInt();
    }

    System.out.print("Unique number/s: ");

    for (int i = 0; i < arr.length; i++){
      int counter = 0;
      for (int j = 0; j < arr.length; j++){
        if(i != j && arr[i]==arr[j]){
          counter += 1;
        }
      }
      if (counter == 0){
        System.out.print(arr[i] + ", ");
      }
    }
    anne.close();
  }
}