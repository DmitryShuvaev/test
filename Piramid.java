/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid.builder;

import java.util.ArrayList;

/**
 *
 * @author DmShu
 */
public class Piramid {
 public final    int SIZE;    int[][] ar ;
 int counter;
 //const
  public  Piramid( ArrayList<Integer> a){
      counter=0;
           SIZE=a.size();
      
           ar = new int[SIZE/2][];
         for(int i=0;i<SIZE/2;i++){
         ar[i] = new int[SIZE-1]; 
         
         }
         add( a);
         print();
    }
  void add(ArrayList<Integer> a){
      int lc=0;
      int r=0;    int j =0;
     for (int i = 0; i<ar.length; i++) 
     {
            //for (int r = 0; r<ar[i].length; r++) 
           j = ((SIZE-1)/2)-i;  
          System.out.println(j);
          
          while(j>=0&&j<ar[i].length &&j<=((SIZE-1)/2)+i){
              if( lc<a.size()){
                ar[i][j]=a.get(lc++);
              }
            // if(i==2) ar[i][(SIZE-1)/2-i]=a.get(lc++);
              j+=2;  
              
            }

        
         System.out.println();
     }    
  }
  public void print(){
     for (int i = 0; i<ar.length; i++) 
     {
      for (int j = 0; j<ar[i].length; j++) 
        {
        System.out.print(ar[i][j] + "\t");
        }
         System.out.println();
     }
  }//
  
}
