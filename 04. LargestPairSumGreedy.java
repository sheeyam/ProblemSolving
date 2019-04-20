import java.util.ArrayList;

//Greedy Approach
public class LargestPairSumGreedy {

	    static int findLargestSumPair(ArrayList<Integer> al) 
	    { 
	        int p1, p2; 
	        if (al.get(0) > al.get(1)) 
	        { 
	            p1 = al.get(0); 
	            p2 = al.get(1); 
	        } 
	        else
	        { 
	            p1 = al.get(1); 
	            p2 = al.get(0); 
	        } 
	       
	        for (int i = 2; i<al.size(); i ++) 
	        { 
	        	int current = al.get(i);
	            if (current > p1) 
	            { 
	                p2 = p1; 
	                p1 = current; 
	            } else if (current > p2 && current != p1) {
	                p2 = current; 
	            }
	            System.out.println("P1--> " + p1);
	            System.out.println("P2--> " + p2);
	        } 
	        return (p1 + p2); 
	    } 
		
	    public static void main(String[] args)  
	    { 
	    	  ArrayList<Integer> ts01 = new ArrayList<Integer>();
			    ts01.add(20);
			    ts01.add(90);
			    ts01.add(80);
			    ts01.add(30);
			    ts01.add(60);
			    ts01.add(110);
			
	    System.out.println("Max Pair Sum is " + findLargestSumPair(ts01)); 
	          
	    } 
}
