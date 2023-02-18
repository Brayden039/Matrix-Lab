import java.util.*;
public class randomMatrix
{
  private int[][] matrix;

  public randomMatrix(int row, int column, int input)
  {
    matrix = new int[row][column];

    for(int i = 0; i < matrix.length; i++)
    {
      for(int a = 0; a < matrix[i].length; a++)
      {
        int count = (int)(Math.random() * input);
        matrix[i][a] = count;
          
      }
    }
  }

  public void matrixPrint()
  {
    for(int i2 = 0; i2 < matrix.length; i2++)
    {
      for(int a2 = 0; a2 < matrix[i2].length; a2++)
      {
        System.out.println(matrix[i2][a2]);
          
      }
    }
      
  }
    
    
}
