

import java.util.Scanner;

public class Chocolateproblem {

  
    public static void main(String[] args)	{
   		Scanner scan=new Scanner( System.in);
		int p=scan.nextInt();//minimum width
      int q=scan.nextInt();// maximum width 
                int r=scan.nextInt();// minimum height
		int s= scan.nextInt();// maximum height
                    int total=0;
                  for(int i=p;i<=q;i++)
                  {
                  for(int j=r;j<=s;j++)
                  {
                      
                  total=total+ devide(i,j);
                     
                      
                
                  }
                  }
        System.out.print(total);
		    
		
		
	}
    
   static int devide(int width,int length)
    {int count;
        if(width==1)
        {
            count=length;
            return count;
        }
        else if(length==1)
        {
            count= width;
            return count;
        }
        else if(length==width)
        { return 1;
        }
        else if(width>length)
    {
        count=1;
        width=width-length;
        count=count+devide(width,length);
        return count;
        
    }
        else if(length>width)
    {
        count=1;
        length=length-width;
        count=count+devide(width,length);
        return count;
    }
        else
            return 1;
       
    }
}
    
