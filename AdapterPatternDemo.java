import java.io.BufferedReader;  
import java.io.InputStreamReader;  
 interface CreditCard {  
    public void giveBankDetails();  
    public String getCreditCard();  
}
 class BankDetails{
    private String bankName;  
    private String accHolderName;  
    private long accNumber;  

    public String getBankName() {  
        return bankName;  
    }  
    public void setBankName(String bankName) {  
this.bankName = bankName;  
    }  
    public String getAccHolderName() {  
        return accHolderName;  
    }  
    public void setAccHolderName(String accHolderName) {  
this.accHolderName = accHolderName;  
    }  
    public long getAccNumber() {  
        return accNumber;  
    }  
    public void setAccNumber(long accNumber) {  
this.accNumber = accNumber;  
    }  
}
 class BankCustomer extends BankDetails implements CreditCard {  
 public void giveBankDetails(){  
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
System.out.print("Enter the account holder name :");  
   String customername=br.readLine();  
System.out.print("\n");  
System.out.print("Enter the account number:");  
   long accno=Long.parseLong(br.readLine());  
System.out.print("\n");  
System.out.print("Enter the bank name :");  
   String bankname=br.readLine();  
setAccHolderName(customername);  
setAccNumber(accno);  
setBankName(bankname);  
}catch(Exception e){  
e.printStackTrace();  
   }  
  }  
 public String getCreditCard() {  
   long accno=getAccNumber();  
   String accholdername=getAccHolderName();  
   String bname=getBankName();  
   return ("The Account number "+accno+" of "+accholdername+" in "+bname+ "bank is valid and authenticated for issuing the credit card. ");  
  }  
}
public class AdapterPatternDemo {  
 public static void main(String args[]){  
CreditCard targetInterface=new BankCustomer();  
targetInterface.giveBankDetails();  
System.out.print(targetInterface.getCreditCard());  
 }   
}

/*
OUTPUT:-
D:\41lab\sadp\4_prog_AdapterDesignPattern>javac AdapterPatternDemo.java

D:\41lab\sadp\4_prog_AdapterDesignPattern>java AdapterPatternDemo
Enter the account holder name :A

Enter the account number:1234567890

Enter the bank name :Dhan
The Account number 1234567890 of A in Dhanbank is valid and authenticated for issuing the credit card.
D:\41lab\sadp\4_prog_AdapterDesignPattern>

*/