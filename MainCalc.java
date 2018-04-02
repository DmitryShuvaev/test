import java.util.ArrayList;

public class MainCalc {
	
	
	public static void main(String[] args) {

	     CalcFp cfp=new CalcFp(" (5+2)*6+4.5");
try {
      System.out.println("resul="+cfp.expression());
    }     catch (Exception e){  System.out.println(e); }
	    }
	//
}
