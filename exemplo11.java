package aula2;

import javax.swing.JOptionPane;

public class exemplo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String a,b;
		
		float x,y;
		
		a = JOptionPane.showInputDialog ("Digite o primeiro numero");
		
		x = Float.parseFloat (a);
		
		b = JOptionPane.showInputDialog ("Digite o segundo numero");
				 
        y = Float.parseFloat (b);
        
        if (x>y) {
			//JOptionPane.showMessageDialog(null,  "O n�mero maior �  " + a);
		//}else {
			//JOptionPane.showMessageDialog(null,  "O n�mero maior � = " + b);
		//}
        //if (media>=7) {
			
			System.out.println("O n�mero maior �  " + a);
			}
			
		else
			System.out.println("O n�mero maior � = " + b);
			} 
	    
	

}
