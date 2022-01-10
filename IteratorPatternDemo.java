 interface Iterator {  
    public boolean hasNext();  
    public Object next();  
}  
 interface Container {  
    public Iterator getIterator();  
}// End of the Iterator interface.  
 class CollectionofNames implements Container {  
 String name[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};   
      
@Override  
    public Iterator getIterator() {  
        return new CollectionofNamesIterate() ;  
    }  
    private class CollectionofNamesIterate implements Iterator{  
        int i;  
        @Override  
        public boolean hasNext() {  
            if (i<name.length){  
                return true;  
            }  
            return false;  
        }  
        @Override  
        public Object next() {  
            if(this.hasNext()){  
                return name[i++];  
            }  
            return null;      
        }  
    }  
}  
 class IteratorPatternDemo {  
    public static void main(String[] args) {  
          CollectionofNames cmpnyRepository = new CollectionofNames();  
            
          for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
              String name = (String)iter.next();  
              System.out.println("Name : " + name);  
           }      
    }  
}   

/*

OUTPUT:-

D:\41lab\sadp\12_prog_IterartorDesignPattern>javac IteratorPatternDemo.java

D:\41lab\sadp\12_prog_IterartorDesignPattern>java IteratorPatternDemo
Name : Ashwani Rajput
Name : Soono Jaiswal
Name : Rishi Kumar
Name : Rahul Mehta
Name : Hemant Mishra

D:\41lab\sadp\12_prog_IterartorDesignPattern>
*/