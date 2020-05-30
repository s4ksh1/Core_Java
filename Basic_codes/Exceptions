class Test
{
    public static void main(String[] args)
    {
        try
        {
            int arr[] = new int[5];
            arr[4]=10/0;                            // exception
            System.out.println(arr[10]);            // will not run
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception occurred");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound exception has occurred");
        }
        
    }
}

Output:
Arithmetic exception occurred
