import java.util.*;
class Demo{
    public static void main(String args[]){
        
        int [] [] a = new int[3] [];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];
        int count = 1;
        for(int i=0; i<a.length; i++){
            for(int j =0; j<a[i].length; j++){
                a[i][j] = count++;
                
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
