class Main
{
  public static void main(String[] args)
  {
    randomMatrix randMat = new randomMatrix(3, 4, 10);
    randMat.matrixPrint();
    System.out.println("\n" + "Get Amount:");
    System.out.println(randMat.getAmount(0));
    System.out.println("\n" + "Get Total:");
    System.out.println(randMat.getTotal());
    System.out.println("\n" + "Get Rows Total:");
    int[] rowarray = randMat.getrowTotals();
    for(int rows: rowarray)
    {
      System.out.println(rows + " ");
    }
    System.out.println("\n" + "Get Columns Total:");
    int[] colarray = randMat.getcolumnTotals();
    for(int cols: colarray)
    {
      System.out.println(cols + " ");
    }
    System.out.println("\n" + "All values Unique:");
    System.out.println(randMat.allvaluesUnique());
    
  }
}