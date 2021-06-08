import java.util.*;
import java.io.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.next(); //get the string from user
        int n=str.length();
        int left=0;
        int mid=left+(n-1)/2; //find the mid value
        String s=str.substring(mid,n)+str.substring(0,mid); 
        for(int i=0;i<n;i++)
        {
            for(int j=2*(n-i);j>=0;j--)
            {
               System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println("");
        }
        
    }
}
