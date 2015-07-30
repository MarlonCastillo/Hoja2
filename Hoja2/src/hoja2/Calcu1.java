public class Calcu implements Calculadora
{
    private String linea, resultado, operador;
    private int Resultado, num1, num2, rpivote;
    private boolean devolver;
    private Stack<Integer> operandos = new StackVector<Integer>();
    private Stack<String> operadores = new StackVector<String>();
    
    public void setString(String linea)
	{
        this.linea=linea;
    }
	
    public void meterVector()
	{		
		for (int a = operandos.size(); a>0; a--)
		{
			operandos.pop();
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
				if(a != 0)
				{
					operadores.push(b);
				}
			}else
			{
				try{
					operandos.push(Integer.parseInt(b));
				}catch(Exception e)
				{
					devolver = false;
				}
			}
        }
		
		int c = operadores.size() + 1;
		int d = operandos.size();
		
		if (c == d)
		{
			devolver = true;
		}else {
			devolver = false;
		}
    }
	
    public boolean calcularVector()
	{
		if(devolver){
			Resultado = 0;
			int d = operadores.size();
			for(int b = operadores.size(); b>0; b--)
			{
				num1 = operandos.pop();
				if(b == d)
				{
					num2 = operandos.pop();
				}else
				{
					num2 = Resultado;
				}
				
				operador = operadores.pop();
				switch(operador)
				{
					case "+":
						Resultado = num1 + num2;
						break;
					case "-":
						Resultado = num1 - num2;
						break;
					case "/":
						if (num1 == 0)
						{
							System.out.println("Division en 0 es indeterminada.");
							Resultado = 0;
						}else
						{
							Resultado = num2 / num1;
						}
						break;
					case "*":
						Resultado = num1 * num2;
						break;
					default:
						break;
				}
			}
		}
		return devolver;
    }

    public int getResultado()
	{
		return Resultado;
    }
}
