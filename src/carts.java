import java.util.ArrayList;

public class carts {
	
static	public int x=0;
static public int y=0;
	public static ArrayList addbook(String book) {
		 ArrayList<String> listname = new ArrayList<String>();
			
		 if(book==null) {
			 return listname;
		 }
		 else {
			 listname.add(book);
		return listname;
	}
	}
		
		
	
	
	public static int addcount(int count, int price) {
		
		x=0;
		

		 if(count>=1) 
		 {
			 x=count;
		 }
		
	
		y+=price*x;
			return y;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

