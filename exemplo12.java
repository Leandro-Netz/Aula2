package aula2;

import javax.swing.JOptionPane;

public class exemplo12 {

	public static void main(String[] args) {
		// Calculadora
		
	
String a,b,c,som,sub,mul,div;
		
		float x,y,z;
		
		a = JOptionPane.showInputDialog ("Digite o primeiro numero");
		
		x = Float.parseFloat (a);
		
		b = JOptionPane.showInputDialog ("Digite o segundo numero");
				 
        y = Float.parseFloat (b);
        
                 
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("*           Calculadora                     *");
		System.out.println("* 1 = Soma                                  *");
		System.out.println("* 2 = Subtrair                              *");
		System.out.println("* 3 = Multiplicar                           *");
		System.out.println("* 4 = Dividir                               *");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        
		//operacoes
		som=x+y;
		sub=x-y;
		mul=x*y;
		div=x/y;
				
		
        c = JOptionPane.showInputDialog ("Digite o número da operação a realizar");
		
		z = Float.parseFloat (c);
		
		if (c=1) {
			JOptionPane.showMessageDialog(null,  "O resultado da soma é  " + som);
		}else {
			if (c=2) {
				JOptionPane.showMessageDialog(null,  "O resultado da subtração é  " + sub);
			}else {
				if (c=3) {
					JOptionPane.showMessageDialog(null,  "O resultado da Multiplicação é  " + mul);
				}else {
					if (c=4) {
						JOptionPane.showMessageDialog(null,  "O resultado da Divisão é  " + div);
									}else {
										if (c<>1,2,3,4) {
											JOptionPane.showMessageDialog(null,  "operação não existe");
									}
			}
		
		
		
		
		
		
        if (x>y) {
			//JOptionPane.showMessageDialog(null,  "O número maior é  " + a);
		//}else {
			//JOptionPane.showMessageDialog(null,  "O número maior é = " + b);
		//}
        //if (media>=7) {
			
			System.out.println("O número maior é  " + a);
			}
			
		else
			System.out.println("O número maior é = " + b);
			} 
		
		
	}

}
