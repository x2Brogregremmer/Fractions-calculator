import java.util.Scanner;

public class AdvancedCalculator
{
    public int gcd(int n1,int n2){
         
        while (n1 != n2)
        {
            if (n1>n2){
                n1 = n1 - n2;
            }
            else{
                n2 = n2 - n1;
            }
        }
        return n2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumerator, secondNumerator, firstDenominator, secondDenominator;
        char op = '+';
        int Gcd;
        String result = 0;
        System.out.println("Write the operator: ");
        op = scanner.next().charAt(0);
        
        //operator input
        
        System.out.println("Write the second's fraction numerator: ");
        secondNumerator = scanner.nextInt();
        System.out.println("Write the second's fraction demoninator: ");
        secondDenominator = scanner.nextInt();
        
        //first fraction input
        
        System.out.println("Write the second's fraction numerator: ");
        secondNumerator = scanner.nextInt();
        System.out.println("Write the second's fraction demoninator: ");
        secondDenominator = scanner.nextInt();
        
        //second fraction input
        
        if (firstDenominator == 0 || secondDenominator == 0)
        {
            System.out.println("Error!!!");
        }
        
        switch (op){
            case '+':
                while (true){
                    Gcd = gcd(firstDenominator, secondDenominator);
                    firstDenominator = firstDenominator / Gcd;
                    secondDenominator = secondDenominator / Gcd;
                    if (firstDenominator == secondDenominator){
                    result = firstNumerator + secondNumerator;
                    break;
                    }else{
                        
                    }
                    
                    break;
                }
                
            
                
            case '-': 
                
            case '*':
                
            case '/':
        }
        
        
        
    }
}
