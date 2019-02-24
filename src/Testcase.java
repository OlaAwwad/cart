import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Testcase {


	
	private ArrayList<String>listt(String books){

		ArrayList <String>list=new ArrayList<String>();
		list.add(books);
		return list;
		}
	int y,xx=0;
//private int listcoun(int count,int price){
//
//	 if(count>=1) 
//	 {
//		 xx=count;
//	 }
//	
//
//	y=price*xx;
//		return xx;
//	
//		
//		}
//	
	@Test
	public void test1() {
		carts cc=new carts();
		 assertEquals(listt(""),cc.addbook(""));
	      
			
	        System.out.println("Test case number 1");
	    }
		
		
	
	@Test
	public void test2() {
		carts c2=new carts();
		 assertEquals(listt("Book"),c2.addbook("Book"));
	      
		  assertEquals(170,c2.addcount(1,170));
	        System.out.println("Test case number 2");
	    }
		

	@Test
	public void test3() {
		carts c3=new carts();
		 assertEquals(listt("Book"),carts.addbook("Book"));
	      
		  assertEquals(510,carts.addcount(2,170));
	        
	        
	   	 assertEquals(listt("Book"),carts.addbook("Book"));
	      
		  assertEquals(850,carts.addcount(2,170));
	        System.out.println("Test case number 3");
	       
	}

}
