/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsequence;

import java.util.ArrayList;

/**
 *
 * @author DmShu
 */
public class SubsequenceImpl {
    ArrayList<String> x; ArrayList<String> y;
    int SIZE;
    public SubsequenceImpl( ArrayList<String> x, ArrayList<String> y){
     this.x=x;this.y=y;
        if(x.size()>=y.size())SIZE=x.size();
        else SIZE=y.size();
    }
    public boolean find(){
        int counter=0;
         ArrayList<String> res=new  ArrayList<String>() ;
 
         for (int i = 0; i < y.size(); i++) 
           {
            if(counter<x.size()&&x.get(counter)==y.get(i))
             res.add(x.get(counter++));
           }
   
             print(res);
    return equalLists(res,x);
    }
    public  boolean equalLists(ArrayList<String> a, ArrayList<String> b){     
    // Check for sizes and nulls

    if (a == null && b == null) return true;

    if ((a == null && b!= null) || (a != null && b== null) || (a.size() != b.size()))
    {
        return false;
    }

    return a.equals(b);
}
    //
    void print(ArrayList<String> ar)
    {
               for(int j=0;j<ar.size();j++){
                    System.out.println(ar.get(j));
               }
    }//
    

}
