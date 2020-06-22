class Combinations
{
 public static void main(String[] args)
  {
     int input[] = { 1, 2, 3 };
     for (int x = 0; x < 3; x++)
     {
        for (int y = 0; y < 3; y++)
        {
           for (int z = 0; z < 3; z++)
           {
              if (x != y && y != z && z != x)
             {
                  System.out.println(input[x] + "" + input[y] + ""+ input[z]);
              }
            }
         }
      }
   }
}


Output:
javac combo.java

java Combinations

123
132
213
231
312
321
