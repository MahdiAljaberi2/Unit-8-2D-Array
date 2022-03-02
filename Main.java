import java.util.*;
class Main {
  public static void main(String[] args) {
    int[][] grid=new int[4][3];
    for (int r = 0; r < grid.length; r++)
      {
      for (int c = 0; c < grid[0].length; c++)
        {
        System.out.print (grid[r][c]=r*c);
        }
      }
    for (int r = 0; r < grid.length; r++)
      {
      for (int c = 0; c < grid[0].length; c++)
        {
        System.out.print (grid[r][c] + "\t");
        }
      System.out.println();
      }
    Scanner it=new Scanner(System.in);
    String[][] grades = new String[6][3];
      for (int r = 0; r < grades.length; r++)
        {
        System.out.println("Enter three grades for hour "+(r+1));
        for (int c = 0; c < grades[0].length; c++)
          {
            grades[r][c]=it.next();
          }
          System.out.println();
        }
    for (String[] array:grades)
      {
        for (String element:array)
          {
            System.out.print(element+" ");
          }
        System.out.println();
      }
    }
}