package recursion.assignment;

public class ModFib {
    
    //method to find the kth term in a modified fibonacci sequence where k>=0
    public static int modFibonacci(int k){
        //if k is 0
        if (k ==0){
            //return 3
            return 3;
        }
        //else if k is 1
        else if (k == 1){
            //return 5
            return 5;
        }
        //else if k is 
        else if (k==2){
            //return 8
            return 8;
        }
        //else
        else{
            //return the sum of the previous 3 terms of the modified fibonacci sequence
            return modFibonacci(k-1)+modFibonacci(k-2)+modFibonacci(k-3);
        }
}
}
