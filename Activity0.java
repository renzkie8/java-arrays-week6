import java.util.Scanner;

public class Activity0{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.print("Input Array Size: ");
    int size = s.nextInt();

    int[] array = new int[size];
    for(int i = 0; i < array.length; i++){
      System.out.print("Input an Element: ");
      array[i] = s.nextInt();
    }

    System.out.print("Unique Number(s): ");
    for(int i = 0; i < array.length; i++){
      boolean unique = true;
      for (int j = 0; j < array.length; j++){
        if(array[i] == array[j] && i != j){
          unique = false;
        }
      }
      if(unique){
        System.out.print(array[i]+", ");
      }

    }
    s.close();
  }
}