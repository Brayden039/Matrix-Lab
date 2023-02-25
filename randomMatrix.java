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
    for(int i = 0; i < matrix.length; i++)
    {
      for(int a = 0; a < matrix[i].length; a++)
      {
        System.out.print(matrix[i][a]);
          
      }
      System.out.println();
    }
      
  }

  int count2 = 0;
  public int getAmount(int num1)
  {
    for(int i = 0; i < matrix.length; i++)
    {
      for(int a = 0; a < matrix[i].length; a++)
      {
        if(num1 == matrix[i][a])
        {
          count2++;
        }
      }
    }
    return(count2);
      
  }

  public int[] getrowTotals()
  {
    int[] rowTotals = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++)
    {
      int count4 = 0;
      for(int j = 0; j < matrix[i].length; j++)
      {
       count4 = count4 + matrix[i][j];
      }
      rowTotals[i] = count4;
      
        
    }
    return(rowTotals);
   
    
  }
  

  public int[] getcolumnTotals()
  {
    int[] colTotals = new int[matrix[0].length];
    for(int a = 0; a < matrix[0].length; a++)
    {
      int count5 = 0;
      for(int i = 0; i < matrix.length; i++)
      {
        count5 = count5 + matrix[i][a];
          
      }
      colTotals[a] = count5;
    }
    return(colTotals);
  
  }
  

  int total2 = 0;
  public int getTotal()
  {
    for(int i = 0; i < matrix.length; i++)
    {
      for(int a = 0; a < matrix[i].length; a++)
      {
        total2 = total2 + matrix[i][a];
          
      }
    }
    return(total2);
  }

  
  
  public boolean allvaluesUnique()
  {
    for(int i = 0; i < matrix.length; i++)
    {
      for(int a = 0; a < matrix[i].length; a++)
      {
        int count3 = 0;
        for(int k = 0; k < matrix.length; k++)
        {
          for(int l = 0; l < matrix[k].length; l++)
          {
            if(matrix[i][a] == matrix[k][l])
            {
              count3++;
            }
          }
          if(count3 > 1)
          {
            return false;
          }
        }
       }
    }
    return true;
  }
  
  
  
    
    
    
}
    

