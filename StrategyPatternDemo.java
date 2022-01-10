import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
interface Strategy {  
    public float calculation(float a, float b);  
}// End of the Strategy interface.  
class Addition implements Strategy{  
    @Override  
    public float calculation(float a, float b) {  
        return a+b;  
    }  
}// End of the Addition class.  
class Subtraction  implements Strategy{  
    @Override  
    public float calculation(float a, float b) {  
        return a-b;  
    }  
}// End of the Subtraction class.  
class Multiplication implements Strategy{  
    @Override  
    public float calculation(float a, float b){  
        return a*b;  
    }  
}// End of the Multiplication class.  
class Context {    
       private Strategy strategy;  
       public Context(Strategy strategy){  
          this.strategy = strategy;  
       }  
       public float executeStrategy(float num1, float num2){  
          return strategy.calculation(num1, num2);  
       }  
}// End of the Context class.   
class StrategyPatternDemo {        
    public static void main(String[] args) throws NumberFormatException, IOException {  
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
          System.out.print("Enter the first value: ");  
          float value1=Float.parseFloat(br.readLine());  
          System.out.print("Enter the second value: ");  
          float value2=Float.parseFloat(br.readLine());  
          Context context = new Context(new Addition());          
          System.out.println("Addition = " + context.executeStrategy(value1, value2));  
  
          context = new Context(new Subtraction());       
          System.out.println("Subtraction = " + context.executeStrategy(value1, value2));  
  
          context = new Context(new Multiplication());        
          System.out.println("Multiplication = " + context.executeStrategy(value1, value2));  
       }  
}// End of the StrategyPatternDemo class.  


/*
OUTPUT:-

D:\41lab\sadp\14_prog_StrategyDesignPattern>javac StrategyPatternDemo.java

D:\41lab\sadp\14_prog_StrategyDesignPattern>java StrategyPatternDemo
Enter the first value: 5
Enter the second value: 4
Addition = 9.0
Subtraction = 1.0
Multiplication = 20.0


*/