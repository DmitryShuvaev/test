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
public class Subsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<String> x = new ArrayList<String>();
         ArrayList<String> y = new ArrayList<String>();
         x.add("A");  x.add("B");    x.add("C");  x.add("D"); 
         //
         y.add("BD");  y.add("A");    y.add("ABC");  y.add("B"); 
         y.add("M");  y.add("D");    y.add("M");  y.add("C"); 
         y.add("DC");  y.add("D");
        //
        SubsequenceImpl sb=new SubsequenceImpl(x,y);
           System.out.println( sb.find());
    }
    
}
