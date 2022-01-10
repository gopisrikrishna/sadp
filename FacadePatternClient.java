import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  

 interface MobileShop {  
    public void modelNo();  
    public void price();  
}  
 class Iphone implements MobileShop {  
    @Override  
    public void modelNo() {  
        System.out.println(" Iphone 6 ");  
    }  
    @Override  
    public void price() {  
    System.out.println(" Rs 65000.00 ");  
    }  
}  

 class Samsung implements MobileShop {  
    @Override  
    public void modelNo() {  
    System.out.println(" Samsung galaxy tab 3 ");  
    }  
    @Override  
    public void price() {  
        System.out.println(" Rs 45000.00 ");  
    }  
}  
 class ShopKeeper {  
    private MobileShop iphone;  
    private MobileShop samsung;  
    private MobileShop blackberry;  
      
    public ShopKeeper(){  
        iphone= new Iphone();  
        samsung=new Samsung();   
    }  
    public void iphoneSale(){  
        iphone.modelNo();  
        iphone.price();  
    }  
        public void samsungSale(){  
        samsung.modelNo();  
        samsung.price();  
    }    
}  
  
 class FacadePatternClient {  
    private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
            System.out.print("========= Mobile Shop ============ \n");  
            System.out.print("            1. IPHONE.              \n");  
            System.out.print("            2. SAMSUNG.              \n");  
            System.out.print("            3. Exit.                     \n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            ShopKeeper sk=new ShopKeeper();  
              
            switch (choice) {  
            case 1:  
                {   
                  sk.iphoneSale();  
                    }  
                break;  
       case 2:  
                {  
                  sk.samsungSale();        
                    }  
                break;    
       
            default:  
            {    
                System.out.println("Nothing You purchased");  
            }         
                return;  
            }  
              
      }while(choice!=3);  
   }  
} 


/*
OUTPUT:-
D:\41lab\sadp\7_prog_FacadeDesignPattern>javac FacadePatternClient.java

D:\41lab\sadp\7_prog_FacadeDesignPattern>java FacadePatternClient
========= Mobile Shop ============
            1. IPHONE.
            2. SAMSUNG.
            3. Exit.
Enter your choice: 1
 Iphone 6
 Rs 65000.00
========= Mobile Shop ============
            1. IPHONE.
            2. SAMSUNG.
            3. Exit.
Enter your choice: 2
 Samsung galaxy tab 3
 Rs 45000.00
========= Mobile Shop ============
            1. IPHONE.
            2. SAMSUNG.
            3. Exit.
Enter your choice: 3
Nothing You purchased

D:\41lab\sadp\7_prog_FacadeDesignPattern>

*/