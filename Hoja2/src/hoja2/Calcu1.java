public class Calcu implements Calculadora
{
    private String linea, resultado, operador;
    private int Resultado, num1, num2, rpivote;
    private Stack<Integer> operandos = new StackVector<Integer>();
    private Stack<String> operadores = new StackVector<String>();
	private Stack<Integer> operandos2 = new StackVector<Integer>();
    
    public void setString(String linea)
	{
        this.linea=linea;
    }
	
    public void meterVector()
	{
		Resultado = 0;
		int d = operadores.size();
		for(int b = operadores.size(); b>0; b--)
		{
			num1 = operandos2.pop();
			if(b == d)
			{
				num2 = operandos2.pop();
			}else
			{
				num2 = Resultado;
			}
			
			operador = operadores.pop();
			switch(operador)
			{
				case "+":
					Resultado = num2 + num1;
					break;
				case "-":
					Resultado = num2 - num1;
					break;
				case "/":
					if (num1 == 0)
					{
						System.out.println("Division en 0 es indeterminado.");
					}else
					{
						Resultado = num2 / num1;
					}
					break;
				case "*":
					Resultado = num2 * num1;
					break;
				default:
					break;
			}
		}
    }
	
    public boolean calcularVector()
	{
		boolean devolver = false;
		int c = 0;
		int d = 0;
		for (int a = operandos2.size(); a>0; a--)
		{
			operandos2.pop();
		}
		for (int a = operadores.size(); a>0; a--)
		{
			operadores.pop();
		}
		for (int a=linea.length()-1;a>=0;a--)
		{
            String b=String.valueOf(linea.charAt(a));
			
            if (b.equals(" "))
			{
				a=a;
			}else if(b.equals("+") || b.equals("-") || b.equals("*") || b.equals("/"))
			{
				operadores.push(b);
			}else
			{
				try{
					operandos.push(Integer.parseInt(b));
				}catch(Exception e)
				{
					devolver = true;
				}
			}
        }
		for (int a=operandos.size();a>0;a--)
		{
			operandos2.push(operandos.pop());
		}
		c = operadores.size() + 1;
		d = operandos2.size();
		
		if (c == d)
		{
			devolver = false;
		}else{
			devolver = true;
		}
		if(devolver)
		{
			System.out.println("Ha ingresado mal el formato POSTFIX, pruebe otra vez:");
		}
		return devolver;
    }

    public int getResultado()
	{
		return Resultado;
    }
}
