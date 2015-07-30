
/*
Carlos Javier Lima Cordón, 14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo, 14102
Maria Jose Lopez, 14056
*/


public class Calcu implements Calculadora //Clase Calcu (hija), que se implementa de la clase Calculadora (padre)
{
    private String linea, resultado, operador;
    private int Resultado, num1, num2, rpivote;
    private boolean devolver;
    private Stack<Integer> operandos = new StackVector<Integer>();
    private Stack<String> operadores = new StackVector<String>();
    
    public void setString(String linea) //se ingresa lo que se lee del archivo de texto al objeto de tipo calcu.
	{
        this.linea=linea;
    }
	
    public void meterVector() //Metodo que sirve para meter los operandos y operadores a sus respectivos vectores.
	{
		int f = 0;
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
				if(a > 1)
				{
					operadores.push(b);
				}else{ f = 1; }
			}else
			{
				if(a == linea.length())
				{
					f = 1;
				}
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
		
		if (c == d && f == 0)
		{
			devolver = true;
		}else {
			devolver = false;
		}
    }
	
    public boolean calcularVector() //Metodo que sirve para calcular la operacion que se pide en el archivo, y devuelve un true si lo que se lee está bien, y false si es lo contrario
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
						devolver = false;
						break;
				}
			}
		}
		return devolver;
    }

    public int getResultado() //Metodo que devuelve el resultado de la operación
	{
		return Resultado;
    }
}
