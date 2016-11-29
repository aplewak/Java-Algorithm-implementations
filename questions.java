package interviewPractice;

import java.awt.Robot;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class questions  {
	public questions(){
		
	}
	

	 public static int retSumbetween(int sum, int [] arr){
		int rp = arr[arr.length -1 ];
		int lp = arr[0];
		int dec = 0,inc = 0;
		while( lp != rp){
			// move lp right
			if(lp + rp != sum){
				if(lp +  rp < sum ){
					inc++;
					lp = arr[0 + inc];
				}
				//move rp left
				if(lp + rp > sum ){
					dec++;
					rp = arr[arr.length - dec];
				}

		}
		System.out.println("found " + lp + " " +rp);
		//if the pointers end up on the same index then we got a no go.
		 return lp + rp;		
		}
		System.out.println("did not find");
		return -1;
	 }
	 
	public static void retMaxMult(int [] arr){
		//TODO: return a function that determines the product from three numbers in an array. This representation is based off a sorted list with pos/meg values;
		if(arr.length == 0 | arr.length == 1 | arr.length == 2 ){
			System.out.println(arr.length +  " array size not acceptable" );
			return;
		}
		if(arr.length ==3 ){
			int maxProd = arr[0]* arr[1] * arr[2];
			System.out.println(maxProd);
		}
		//sort the array to find out the other values
		//should be sorted regardless of negatives
		int currMax = 0;
		int maxProd = arr[arr.length-1]* arr[arr.length-2] * arr[arr.length - 3];
		for(int j= 0; j<= arr.length-1; j ++){
			//if the first value of the array is zero check if the next value is negative. 
			if(arr[0] < 0 ){
				if(arr[0] < 0 && arr[1] < 0){
					currMax = arr[0] * arr[1] * arr[arr.length-1];
					if(currMax < maxProd){
						System.out.println(maxProd);
					}
					if(currMax > maxProd)
						System.out.println(currMax);
					}
					
				}
				
			}
			System.out.println(currMax);
			System.out.println(maxProd);
			
		}
		
	public static int howManyCapitals(String x){
		//TODO: return a function that calculates the number of capitals in a string
		//Using the utf-16 CodePoint functio because charAt only handles utf-16 characters
		//handles multiple languages
		//String example = "ℤℤℤℤℤℤℤℤℤℤ";
	
		int count = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isUpperCase(x.codePointAt((i)))){
				count++;             
			}
		}
		System.out.println(count);
		return count;
	}
	
	public static int fib(int x){
		//TODO : return a function that calculates the fib. sequence that  
		if(x == 0 | x == 1){
			return x == 0 ? 0 : 1;
		}
		return fib(x-2) + fib(x-1);
	}
	
	public static boolean palcheck(String n){
		String revString = "";
		for(int i =n.length()-1; i >=0; i--){
			revString += n.charAt(i);
		}
		if(revString.equals(n)){
			System.out.println("good pal");
			return true;
		}
		else{
			System.out.println("bad pal");
			return false;
		}
	}
	
	public static String findNonRep(String n){
		//TODO :  Write code to find the First non repeated character in the String 
		HashMap map = new HashMap();
		
		//put the keys in the map, stores values sequentially
		Stack<Character> curr = new Stack<Character>();
		Stack<Character> tmp = new Stack<Character>();
		Stack<Character> other = new Stack<Character>();
		for(int i =0 ;i <= n.length() -1; i++){
			curr.push( (char) n.codePointAt(i));
			other.push((char) n.codePointAt(i));
		}
		int count = 0;
		
	
			while(!other.isEmpty() && !tmp.isEmpty()){
				//finds a match and pops off other stack
				//if no match store it in the tmp array
				if(curr.peek().equals(other.peek())){
					count++;
					other.pop();
					if(other.isEmpty()){
						if(count != 1){
							//obtain value because first instance
							
							break;
						}else{
							curr.pop();
							while(!tmp.isEmpty()){
								count = 0;
								if(other.peek().equals(tmp.peek())){
									count++;
									tmp.pop();
									
								}else{
									other.push(tmp.peek());
									
								}
							}
						}
					}
				}
				else{
					tmp.push(other.peek());
				}
				
			}

		
			
		return n;
	}

	public void fact(long num) {
		// TODO Auto-generated method stub
		for (long i = num -1; i >= 1; i--) {
			num = num  * i;
		}
		System.out.println(num);
	
	}
	
	public void PointOrder(int [] x){
		//TODO: DEFINE A POINTER LIKE METHOD FOR ORDER OF ARRAY
		if(x.length == 0) System.out.println("no array given");
		if(x.length == 1) System.out.println(x[0]);
		// depth 2
		if(x.length == 2){
			int max = x[0];
			int min = x[1];
			if(max > min){
				max = x[1];
				min = x[0];
				x[0] = min;
				x[1] = max;
				
				System.out.println(max + " " + min);
			}
		}
	}
public static void no(){
	System.out.println("no");
}
public static int sumOfEnds(int [] x){
	int addNum = 0;
	int i =0;
	int lp = x[i];
	int rp = x[x.length -1 - i]; 
	while(lp != rp){
		System.out.println();
		addNum += lp + rp;
		System.out.println(lp);
		System.out.println(rp);
		lp++;
		rp++;
		break;
	}
	return addNum;
}
public static String derivative(String func){
	//right now this will only use variable x
	double   leadNum,exp;

	String var = "x";
	
	String [] funcParts = func.split(var);
	
	leadNum = Integer.parseInt(funcParts[0]); 
	exp = Integer.parseInt(funcParts[1]);
	
	
	
	System.out.println("leading number value "  + leadNum);
	System.out.println("exponent " + exp);
	
	double newLead = leadNum*exp;
	double newExp = exp-1;
	
	String funcPartLead = Double.toString(newLead);
	String funcPartExp = Double.toString(newExp);
	
	String derivative = funcPartLead + var + funcPartExp;
	
	String onesExp = " ";
	
	if(funcPartExp.equals("1")){
		String derivative2 = funcPartLead + var + onesExp;
		System.out.println("derivative is  : "  + derivative2 );
		return derivative2;
	}
	
	System.out.println("derivative is  : "  + derivative );
	return derivative;
	

}
public static void perms(String pre, String b){
    
    if(b.length() == 0){
    System.out.println(pre);
    return;       
    }
    
    
    for(int i = 0; i < b.length(); i++){
           //System.out.println(b.substring(i, i + 1) + "  " + b.substring(0, i) + b.substring(i + 1));
           //System.out.println(i);
           perms( pre + b.substring(i, i + 1), b.substring(0, i) + b.substring(i + 1));
    }
    

    while(1 > 0){
    	System.out.println("lol");
    }
    

}

}
	
	
	
	
