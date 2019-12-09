/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SRI RAM VIJAY SHARMA
 */
import java.util.Scanner;
public class matrix {   
    public static void main(String[]ar){
        Scanner yu=new Scanner(System.in);
        System.out.println("enter the n value : ");
        int n=yu.nextInt();
        float a[][]=new float[n][n];
        float b[][]=new float[n][n];
        for(int h=0;h<n;h++){
            for(int g=0;g<n;g++){
                System.out.print("enter a["+h+"]"+"["+g+"]: ");
                a[h][g]=yu.nextInt();
                b[h][g]=0;
            System.out.println();
            }
            b[h][h]=1;
        }
        for(int j=0;j<n;j++){
            if(a[j][j]==0){
                int y,c=0;
                for(y=0;y<n;y++){
                    if(a[y][j]!=0){
                        c++;
                         float tem,tem1;
                         for(int z=0;z<n;z++){
                                tem=a[j][z];
                                a[j][z]=a[y][z];
                                a[y][z]=tem;
                                tem1=b[j][z];
                                b[j][z]=b[y][z];
                                b[y][z]=tem1;
                }   
                    }
                }
                if(c==0)
                {
                    throw new ArithmeticException("matrix inverse doesnot exist because given matrix is singular...");
        }
            }
            for(int k=0;k<n;k++){
                if(k!=j){  
                    float t=a[k][j],t1=a[j][j];
                for(int i=0;i<n;i++){
                    
                    a[k][i]=(t*a[j][i])-(t1*a[k][i]);
                    
                    b[k][i]=t*b[j][i]-t1*b[k][i];
                    
                                    }
                
                }               
                                   }
            
        }
            for(int i=0;i<n;i++){
                float t=a[i][i];
                for(int j=0;j<n;j++){
                        a[i][j]=a[i][j]/t;
                        b[i][j]=b[i][j]/t;
                }
            }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
                }
    

}