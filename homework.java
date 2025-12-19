package jusjava;

public class homework {
    public static void main(String[] args) {
    
        int a = 12;
        int b = 34;
        int c = 56;

        double average = (a + b + c) / 3.0; 
        System.out.println(average);

        
        double decimalPart = average - (int) average;
        System.out.println(decimalPart);

        char ch = '8';
        int k = ch - '0';
        System.out.println(ch + k);

       
        int num1 = 5;
        int num2 = 3;
        int sumCube = (int) Math.pow(num1 + num2, 3);
        System.out.println(sumCube);

    
        int x = 7;
        int y = 2;
        double customAverage = (x + y + a) / 3.0;
        System.out.println(customAverage);
    }
}
