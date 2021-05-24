
public class P6 {

	   static int count=0;
	    public P6() {
	        count++;
	        System.out.println(count);
	    }
	    public static void main(String[] args) {
	        
	        new P6();

	        new P6();
	        new P6();
	    }
}
