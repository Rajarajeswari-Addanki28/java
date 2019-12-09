/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SRI RAM
 */
public class matrix1 {
    public static void main(String[]ar){
       float a[][]={{4,7,8},{2,-1,1},{0,2,1}};
        float [][]b={{1,0,0},{0,1,0},{0,0,1}};
        int n=3;
        for(int j=0;j<n;j++){
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