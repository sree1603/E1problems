[12:29 pm, 8/6/2024] Sandhya Garu: public class Fun {

    public static void print_fun(int n) 
    {
        for (int i = 0; i <= n; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                if (i % 2 == 0) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
            print_fun(5);
    }
}
[12:29 pm, 8/6/2024] Sandhya Garu: public class Fun {
    
    // Method to calculate sum of digits until a single digit is obtained
     int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num>0||sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    // Method to print the pattern
    void print_fun(int n) {
        int sum = calculateSumOfDigits(n);
        System.out.println(sum);
    }

    
  
    
    public static void main(String[] args) {
        Fun fun = new Fun();
        fun.print_fun(12345);
      
    }
}
