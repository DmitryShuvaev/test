import java.util.ArrayList;

public class CalcFp {
	public ArrayList<String> expressionToParse = new ArrayList<String>();
	int counter;
	public CalcFp(String words) {
		counter=0;
	   
	    	   expressionToParse=Convert(words);
	    	   removes();
	}//
	
	String peek()
	{
	return  expressionToParse.get(counter);
	}
	String get()
	{String v=expressionToParse.get(counter);
	//System.out.println("v="+expressionToParse.get(counter));
		if(counter<expressionToParse.size()-1)counter++;
	
	return v;
	}//
	
	double factor()
	{
	if (isNumeric(peek())) {
	return Double.parseDouble(get());
	
	}
	else if (compareStrings(peek(),"("))
	{
	get(); // '('
	double result = expression();
	get(); // ')'
	return result;
	}
	else if (compareStrings(peek(),"-"))
	{
	get();
	return -factor();
	}
    throw new
    UnsupportedOperationException("Error");
	}//
	
	double term()
	{
	double result = factor();
	while (compareStrings(peek(),"*") ||compareStrings(peek(),"/"))
	if (compareStrings(get(),"*"))
	result *= factor();
	else {
		double exv=factor();
        if (exv == 0)
            throw new
            UnsupportedOperationException("Cannot divide by zero");
	result /=exv; 
	
	}
	return result;
	}//
	
	double expression()
	{
	double result = term();
	//System.out.println(counter);
	while (compareStrings(peek(),"+") || compareStrings(peek(),"-"))
	if (compareStrings(get(),"+"))
	result += term();
	else
	result -= term();
	return result;
	}//
	
	void print() {
		for(int i=0;i<expressionToParse.size();i++) {System.out.print("ex="+expressionToParse.get(i));
		System.out.println("cunter="+i);
		}
	}//
	
	
	public  ArrayList<String> Convert(String s){
        int j=0;
    	ArrayList<String> l=new ArrayList<String>();
        StringBuffer sbuf = new StringBuffer();
        while(j < s.length()) {
         while(j < s.length() && s.charAt(j) >= '0' && s.charAt(j)<= '9'&&s.charAt(j)!=' '  || (j < s.length() &&s.charAt(j)!=' '&& s.charAt(j)=='.')){
        	 if(s.charAt(j)!=' ')
                 sbuf.append(s.charAt(j));
    
          j++;
         }//
         
         l.add(sbuf.toString().replaceAll(" ", ""));
         sbuf.setLength(0); 
     if(j>=s.length())break;
    
         switch(s.charAt(j))
         {
             case '+':

                sbuf.append('+'); 
                l.add(sbuf.toString());
                break;
             case '-':
       
                sbuf.append('-'); 
                l.add(sbuf.toString());
                break;
              case '*':
         
                sbuf.append('*'); 
                l.add(sbuf.toString());
                break;
             case '/':
      
                sbuf.append('/'); 
                l.add(sbuf.toString());
                break;
              case '(':
          
                sbuf.append('('); 
                l.add(sbuf.toString());
                break;
              case ')':
              
                sbuf.append(')'); 
                l.add(sbuf.toString());
                break;
         }
j++;
sbuf.setLength(0); 
         }

      return l;
    }//
	public  boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}//
	public boolean compareStrings(String a,String b) {
	return	a.equals(b);
	}
	public void removes() {
		for (int j = 0; j < expressionToParse.size(); j++) {
			expressionToParse.remove("");
		}
	}
}
