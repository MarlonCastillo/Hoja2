public class Calcu implements Calculadora
{
    private String linea, resultado, operando;
    private int Resultado, num1, num2;
    private Stack<Integer> operandos = new StackVector<Integer>();
    private Stack<String> operadores = new StackVector<String>();
    
    public void setString(String linea){
        this.linea=linea;
    }
	
    public void meterVector()
	{
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
				operandos.push(Integer.parseInt(b));
			}
        }
    }
	
    public boolean calcularVector()
	{
		num1 = operandos.pop();
		num2 = operandos.pop();
		for (int a=0;a<operadores.size();a++)
		{
			operando = operadores.pop();
			switch(operando)
			{
				case "+":
					Resultado = num1 + num2;
					break;
				case "-":
					Resultado = num1 - num2;
					break;
				case "/":
					Resultado = num1 / num2;
					break;
				case "*":
					Resultado = num1 * num2;
					break;
				default:
					break;
			}
		}
        return true;
    }

    public int getResultado()
	{
		return Resultado;
    }
}
