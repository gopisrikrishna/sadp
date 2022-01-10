import java.io.BufferedReader;  
import java.io.InputStreamReader;
import java.io.IOException; 
import java.util.ArrayList;  
import java.util.List;  
interface Item   
{  
   public String name();  
    public String size();  
    public float price();  
}// End of the interface Item. 
abstract class Pizza implements Item
{
	public abstract float price();  
}  
abstract class ColdDrink implements Item
{ 
	public abstract float price();  
}
abstract class VegPizza extends Pizza
{       
    public abstract float price();  
    
    public abstract  String name();  
    
    public abstract  String size();  
}// End of the abstract class VegPizza. 
abstract class NonVegPizza extends Pizza
{   
    public abstract float price();  
     
    public abstract String name();  
    public abstract String size();  
}// End of the abstract class NonVegPizza.
class SmallCheezePizza extends VegPizza
{   
    public float price() 
	{  
        return 170.f;  
    }  
    public String name() 
	{  
        return "Cheeze Pizza";  
    }  
    public String size() 
	{  
       return "Small size";  
    }    
}// End of the SmallCheezePizza class. 
class MediumCheezePizza extends VegPizza{ 
    public float price() 
	{  
       return  220.f;  
    }  
    public String name() 
	{  
        return "Cheeze Pizza";  
    }  
    public String size() 
	{  
     return "Medium Size";  
	}  
}// End of the MediumCheezePizza class.  
 
class LargeCheezePizza extends VegPizza{  
    public float price() 
	{  
        return 260.0f;  
    }  
    public String name() 
	{  
        return "Cheeze Pizza";  
    }  
    public String size() 
	{  
        return "Large Size";  
    }  
}// End of the LargeCheezePizza class.  
class ExtraLargeCheezePizza extends VegPizza{  
    public float price() 
	{  
        return 300.f;  
    }  
    public String name() 
	{  
        return  "Cheeze Pizza";  
    }  
    public String size() 
	{  
        return "Extra-Large Size";  
    }  
}// End of the ExtraLargeCheezePizza class.
class SmallOnionPizza extends VegPizza 
{  
    public float price() 
	{  
        return 120.0f;  
    }  
    public String name() 
	{  
        return  "Onion Pizza";  
    }  
    public String size() 
	{  
       return  "Small Size";  
    }    
}// End of the SmallOnionPizza class
class MediumOnionPizza extends VegPizza 
{  
    public float price() 
	{  
        return 150.0f;  
    }  
    public String name() 
	{  
        return  "Onion Pizza";  
    }  
    public String size() 
	{  
       return  "Medium Size";  
    }    
}// End of the MediumOnionPizza class.
class LargeOnionPizza extends  VegPizza
{   
    public float price() 
	{  
        return 180.0f;  
    }  
    public String name() 
	{  
         return "Onion Pizza";  
    }  
    public String size() 
	{  
       return  "Large size";  
    }  
}// End of the LargeOnionPizza class. 
class ExtraLargeOnionPizza extends VegPizza 
{  
    public float price() 
	{  
        return 200.0f;  
    }  
    public String name() 
	{  
         return  "Onion Pizza";  
    }  
    public String size() 
	{  
       return  "Extra-Large Size";  
    }  
}// End of the ExtraLargeOnionPizza class   
class SmallMasalaPizza extends VegPizza
{  
    public float price() 
	{  
        return 100.0f;  
    }  
    public String name() 
	{  
        return  "Masala Pizza";  
    }  
    public String size() 
	{  
       return  "Samll Size";  
    }  
}// End of the SmallMasalaPizza class   
class MediumMasalaPizza extends VegPizza 
{  
    public float price() 
	{  
        return 120.0f;  
    }  
    public String name() 
	{  
        return  "Masala Pizza";  
      
    }  
    public String size() 
	{  
       return  "Medium Size";  
    } 
}
class LargeMasalaPizza extends  VegPizza
{  
    public float price() 
	{  
        return 150.0f;  
    }  
    public String name() 
	{  
        return  "Masala Pizza";    
    }  
    public String size() 
	{  
       return  "Large Size";  
    }  
} //End of the LargeMasalaPizza class 
class ExtraLargeMasalaPizza extends VegPizza 
{  
    public float price() 
	{  
        return 180.0f;  
    }  
    public String name() 
	{ 
        return  "Masala Pizza";  
    }  
    public String size() 
	{  
       return  "Extra-Large Size";  
    }  
}// End of the ExtraLargeMasalaPizza class 
class SmallNonVegPizza extends NonVegPizza 
{ 
    public float price() 
	{  
        return 180.0f;  
    }  
    public String name() 
	{  
       return "Non-Veg Pizza";  
    }  
    public String size() 
	{  
        return "Samll Size";  
    } 
}
class MediumNonVegPizza extends NonVegPizza
{   
    public float price() 
	{  
        return 200.0f;  
    }  
    public String name() 
	{  
       return "Non-Veg Pizza";  
    }  
    public String size() 
	{  
        return "Medium Size";  
    }  
}
class LargeNonVegPizza extends NonVegPizza
{  
    public float price() 
	{  
        return 220.0f;  
    }  
    public String name() 
	{  
       return "Non-Veg Pizza";  
    }  
    public String size() 
	{  
        return "Large Size";  
    }  
}// End of the LargeNonVegPizza class
class ExtraLargeNonVegPizza extends NonVegPizza 
{  
    public float price() 
	{  
        return 250.0f;  
    }  
    public String name() 
	{  
       return "Non-Veg Pizza";  
    }  
    public String size() 
	{  
        return "Extra-Large Size";  
    }  
}  
abstract class Pepsi extends ColdDrink 
{ 
    public abstract  String name();  
    public abstract  String size();  
    public abstract  float price();  
}// End of the Pepsi class  
abstract class Coke  extends ColdDrink 
{  
    public abstract  String name(); 
    public abstract  String size();  
    public abstract  float price();  
}// End of the Coke class  
class SmallPepsi  extends Pepsi
{  
    public String name() 
	{  
       return "300 ml Pepsi";  
    } 
    public float price() 
	{  
        return 25.0f;  
    }  
    public String size() 
	{  
        return "Small Size";  
    }     
}// End of the SmallPepsi class  

class MediumPepsi extends Pepsi 
{  
    public String name() 
	{  
       return "500 ml Pepsi";  
    }  
    public String size() 
	{  
        return "Medium Size";  
    }  
    public float price() 
	{  
        return 35.0f;  
    }      
}// End of the MediumPepsi class  
class LargePepsi extends Pepsi
{  
    public String name() 
	{  
       return "750 ml Pepsi";  
    }  
    public String size() 
	{  
        return "Large Size";  
    }  
    public float price() 
	{  
        return 50.0f;  
    }  
}// End of the LargePepsi class  
class SmallCoke extends Coke
{  
    public String name() 
	{  
         return "300 ml Coke";    
    }  
    public String size() {  
        return "Small Size";  
    }  
    public float price() 
	{  
      
        return  25.0f;  
    }  
 }// End of the SmallCoke class  
class MediumCoke extends Coke
{  
    public String name() 
	{  
         return "500 ml Coke";    
    }  
    public String size() 
	{  
        return "Medium Size";  
    }  
    public float price() 
	{  
        return  35.0f;  
	}  
}// End of the MediumCoke class  

class LargeCoke extends Coke 
{  
    public String name() 
	{  
         return "750 ml Coke";    
    }  
    public String size() 
	{  
        return "Large Size";  
    }  
    public float price() 
	{  
        return  50.0f;  
    }      
}// End of the LargeCoke class  
class OrderedItems 
{  
     
    List<Item> items=new ArrayList<Item>();  
    public void addItems(Item item)
	{  
        items.add(item);  
    }  
    public float getCost()
	{    
        float cost=0.0f;  
		for (Item item : items) 
		{
			cost+=item.price();  
		}  
        return cost;  
    }  
    public void showItems()
	{  
        for (Item item : items) 
		{
            System.out.println("Item is:" +item.name());  
            System.out.println("Size is:" +item.size());  
            System.out.println("Price is: " +item.price());                
        }  
    }  
}// End of the OrderedItems class  
class OrderBuilder 
{  
    public OrderedItems preparePizza() throws IOException
	{    
        OrderedItems itemsOrder=new OrderedItems();  
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.println(" Enter the choice of Pizza ");  
        System.out.println("============================");  
        System.out.println("        1. Veg-Pizza       ");  
        System.out.println("        2. Non-Veg Pizza   ");  
        System.out.println("        3. Exit            ");  
        System.out.println("============================");  
        int pizzaandcolddrinkchoice=Integer.parseInt(br.readLine());  
        switch(pizzaandcolddrinkchoice)  
        {  
           case 1:
		   {  
                     System.out.println("You ordered Veg Pizza");  
                     System.out.println("\n");  
                     System.out.println(" Enter the types of Veg-Pizza ");  
                     System.out.println("------------------------------");  
                     System.out.println("        1.Cheeze Pizza        ");  
                     System.out.println("        2.Onion Pizza        ");  
                     System.out.println("        3.Masala Pizza        ");  
                     System.out.println("        4.Exit            ");  
                     System.out.println("------------------------------");  
                     int vegpizzachoice=Integer.parseInt(br.readLine());  
                     switch(vegpizzachoice)  
                     {  
                          case 1:  
                                {  
                                    System.out.println("You ordered Cheeze Pizza");  
                                    System.out.println("------------------------------------");  
                                    System.out.println("    1. Small Cheeze Pizza ");  
                                    System.out.println("    2. Medium Cheeze Pizza ");  
                                    System.out.println("    3. Large Cheeze Pizza ");  
                                    System.out.println("    4. Extra-Large Cheeze Pizza ");  
                                    System.out.println("------------------------------------");  
                                    int cheezepizzasize=Integer.parseInt(br.readLine());  
                                    switch(cheezepizzasize)  
                                        {  
                                              case 1:  
                                                   itemsOrder.addItems(new SmallCheezePizza());  
                                                   break;  
                                             case 2:  
                                                   itemsOrder.addItems(new MediumCheezePizza());  
                                                   break;    
                                             case 3:  
                                                   itemsOrder.addItems(new LargeCheezePizza());  
                                                   break;    
                                             case 4:  
                                                   itemsOrder.addItems(new ExtraLargeCheezePizza());  
                                                   break; 
										}
								}
								break;					
                          case 2:  
                                {  
                                    System.out.println("You ordered Onion Pizza");  
                                    System.out.println("Enter the Onion pizza size");  
                                    System.out.println("----------------------------------");  
                                    System.out.println("    1. Small Onion Pizza ");  
                                    System.out.println("    2. Medium Onion Pizza ");  
                                    System.out.println("    3. Large Onion Pizza ");  
                                    System.out.println("    4. Extra-Large Onion Pizza ");  
                                    System.out.println("----------------------------------");  
                                    int onionpizzasize=Integer.parseInt(br.readLine());  
                                    switch(onionpizzasize)  
                                              {  
                                                  case 1:  
                                                   itemsOrder.addItems(new SmallOnionPizza());  
                                                   break;  
                                                  case 2:  
                                                   itemsOrder.addItems(new MediumOnionPizza());  
                                                   break;    
                                                  case 3:  
                                                   itemsOrder.addItems(new LargeOnionPizza());  
                                                   break; 
                                                  case 4:  
                                                   itemsOrder.addItems(new ExtraLargeOnionPizza());  
                                                   break;     
                                              }       
                                   }  
                                break;  
                          case 3:  
                                {  
                                    System.out.println("You ordered Masala Pizza");  
                                    System.out.println("Enter the Masala pizza size");  
                                    System.out.println("------------------------------------");  
                                    System.out.println("    1. Small Masala Pizza ");  
                                    System.out.println("    2. Medium Masala Pizza ");   
                                    System.out.println("    3. Large Masala Pizza ");  
                                    System.out.println("    4. Extra-Large Masala Pizza ");  
                                    System.out.println("------------------------------------");  
                                     int masalapizzasize=Integer.parseInt(br.readLine());  
                                        switch(masalapizzasize)  
                                              {  
                                                  case 1:  
                                                   itemsOrder.addItems(new SmallMasalaPizza());  
                                                   break;  
                                                  case 2:  
                                                   itemsOrder.addItems(new MediumMasalaPizza());  
                                                   break;    
                                                  case 3:  
                                                   itemsOrder.addItems(new LargeMasalaPizza());  
                                                   break;   
                                                  case 4:  
                                                   itemsOrder.addItems(new ExtraLargeMasalaPizza());  
                                                   break; 
                                              } 
                                }  
                                break;  
                     }    
                   }  
                   break;// Veg- pizza choice completed.  
            case 2:  
                   {  
                       	System.out.println("You ordered Non-Veg Pizza");  
                      	System.out.println("\n");  
		System.out.println("Enter the Non-Veg pizza size");  
		System.out.println("------------------------------------");  
		System.out.println("    1. Small Non-Veg  Pizza ");  
		System.out.println("    2. Medium Non-Veg  Pizza ");  
		System.out.println("    3. Large Non-Veg  Pizza ");  
		System.out.println("    4. Extra-Large Non-Veg  Pizza ");  
		System.out.println("------------------------------------");  
                       int nonvegpizzasize=Integer.parseInt(br.readLine());   
                        switch(nonvegpizzasize)  
                             {  
                                  case 1:  
                                      itemsOrder.addItems(new SmallNonVegPizza());  
                                      break;  
                                  case 2:  
                                      itemsOrder.addItems(new MediumNonVegPizza());  
                                      break; 
                                  case 3:  
                                      itemsOrder.addItems(new LargeNonVegPizza());  
                                      break;    
                                  case 4:  
                                      itemsOrder.addItems(new ExtraLargeNonVegPizza());  
                                      break;        
                              }  
                       }    
                        break;  
            default:  
            {  
                  break;  
            }  
		} 
        System.out.println(" Enter the choice of ColdDrink ");  
        System.out.println("============================");  
        System.out.println("        1. Pepsi            ");  
        System.out.println("        2. Coke             ");  
        System.out.println("        3. Exit             ");  
        System.out.println("============================");    
                    int coldDrink=Integer.parseInt(br.readLine());  
        switch (coldDrink)   
            {  
               case 1:  
				{  
					System.out.println("You ordered Pepsi ");  
					System.out.println("Enter the  Pepsi Size ");  
					System.out.println("------------------------");  
					System.out.println("    1. Small Pepsi ");  
					System.out.println("    2. Medium Pepsi ");  
					System.out.println("    3. Large Pepsi ");  
					System.out.println("------------------------");  
					int pepsisize=Integer.parseInt(br.readLine());  
					switch(pepsisize)  
					{  
					case 1:  
						itemsOrder.addItems(new SmallPepsi());  
								   break;  
case 2: 
itemsOrder.addItems(new MediumPepsi());  
								   break;    
					case 3:  
						itemsOrder.addItems(new LargePepsi());  
								   break;    
}  
				 }    
				break;  
		 case 2:  
				{  
					System.out.println("You ordered Coke");  
					System.out.println("Enter the Coke Size");  
					System.out.println("------------------------");  
					System.out.println("    1. Small Coke ");  
					System.out.println("    2. Medium Coke  ");  
					System.out.println("    3. Large Coke  ");  
					System.out.println("    4. Extra-Large Coke ");  
					System.out.println("------------------------");  
					int cokesize=Integer.parseInt(br.readLine());  
					switch(cokesize)  
					{  
case 1:
itemsOrder.addItems(new SmallCoke());
break;
case 2:
itemsOrder.addItems(new MediumCoke());
break;
case 3:
itemsOrder.addItems(new LargeCoke());
break;	
							  }   
				}  
				break;  
                default:  
				{  
					break;
				}          
                           
            }//End of the Cold-Drink switch  
                  return itemsOrder;  
          } //End of the preparePizza() method   
} 
public class BuilderDemo 
{ 
    public static void main(String[] args) throws IOException 
	{  
        OrderBuilder builder=new OrderBuilder();  
        OrderedItems orderedItems=builder.preparePizza();  
        orderedItems.showItems();  
        System.out.println("\n");  
        System.out.println("Total Cost : "+ orderedItems.getCost());  
    }  
}


/*
D:\41lab\sadp\3_prog_BuilderDemo>javac BuilderDemo.java

D:\41lab\sadp\3_prog_BuilderDemo>java BuilderDemo
 Enter the choice of Pizza
============================
        1. Veg-Pizza
        2. Non-Veg Pizza
        3. Exit
============================
1
You ordered Veg Pizza


 Enter the types of Veg-Pizza
------------------------------
        1.Cheeze Pizza
        2.Onion Pizza
        3.Masala Pizza
        4.Exit
------------------------------
1
You ordered Cheeze Pizza
------------------------------------
    1. Small Cheeze Pizza
    2. Medium Cheeze Pizza
    3. Large Cheeze Pizza
    4. Extra-Large Cheeze Pizza
------------------------------------
1
 Enter the choice of ColdDrink
============================
        1. Pepsi
        2. Coke
        3. Exit
============================
1
You ordered Pepsi
Enter the  Pepsi Size
------------------------
    1. Small Pepsi
    2. Medium Pepsi
    3. Large Pepsi
------------------------
1
Item is:Cheeze Pizza
Size is:Small size
Price is: 170.0
Item is:300 ml Pepsi
Size is:Small Size
Price is: 25.0


Total Cost : 195.0

D:\41lab\sadp\3_prog_BuilderDemo>

*/