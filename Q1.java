package lambda;

public class Q1 {

    public static void main(String[] args) {
        
    	Darden add=(int n1,int n2)-> (n1+n2);
    	Darden sub=(int n1,int n2)-> (n1-n2);
    	Darden mul=(int n1,int n2)-> (n1*n2);
    	Darden div=(int n1,int n2)-> (n1/n2);
    	
        System.out.println("adding value =" + add.operate(4, 6));
        System.out.println("subtracting value =" + sub.operate(4, 6));
        System.out.println("multiplying value =" + mul.operate(4, 6));
        System.out.println("dividing value =" + div.operate(4, 6));
        
       
       
    }
}
        @FunctionalInterface
        interface Darden{
        	int operate(int n1,int n2);
        }
    
