import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int findMaxOnes(ArrayList<Integer> input){
        //Handling Error
        if(input.size()==0){
            return 0;
        }
        
        int cExistingOnes = 0;
        int cMaxZeros = Integer.MIN_VALUE;
        int cZeros=0;
        int prev = 1;
        
        for(int i : input){
            if(i==0 && prev==1){
                //first occurance of zero 
                prev = 0;
                cZeros++;
            }else if(i==0 && prev==0){
                //continuous occurance of zero
                cZeros++;
            }else if(i==1 && prev==0){
                //zeros are done here and complete count.
                if(cZeros>cMaxZeros){
                    cMaxZeros=cZeros;
                }
                cZeros=0;
                prev=1;
                cExistingOnes++;
            }else if(i==1 && prev==1){
                cExistingOnes++;
            }
        }
        
        if(cZeros>0){
            cMaxZeros = Math.max(cMaxZeros,cZeros);
        }
        
        cMaxZeros = Math.max(cMaxZeros,0);
        
        return cMaxZeros+cExistingOnes;
        
    }
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    //Length
	    int l=0;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i=0; i<testCases; i++){
	        l = sc.nextInt();
	        list.clear();
	        for(int j=0;j<l;j++){
	            list.add(sc.nextInt());
	        }
	        System.out.println(GFG.findMaxOnes(list));
	    }
		//code
	}
}