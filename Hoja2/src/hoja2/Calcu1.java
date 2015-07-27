public class Calcu implements Calculadora{
    private String linea, resultado;
    private int Resultado, num1, num2;
    private Stack<Integer> operandos = new StackVector<Integer>();
    private Stack<String> operadores = new StackVector<String>();
    
    public void setString(String linea){
        this.linea=linea;
    }
    public void meterVector(){
        for (int a=linea.length()-1;a>=0;a--){
            String b=String.valueOf(linea.charAt(a));
            if (b.equals(" ")){ a=a; }
            else if(b.equals("+") || b.equals("-") || b.equals("*") || b.equals("/")){ operadores.push(b); }
            else {operandos.push(Integer.parseInt(b)); }
        }
    }
    public boolean calcularVector(){


           for (int a=0;a<=operadores.size();a++){
           if(operadores.peek().equals("+")){ 
              operadores.pop();
              num1= operandos.pop();
              num2=operandos.pop(); 
              Resultado= num1 + num2;
              System.out.println(Resultado);
              operandos.push(Resultado);
            }

           else if(operadores.peek().equals("-")){
              operadores.pop();
              int num1= operandos.pop();
              int num2=operandos.pop(); 
              Resultado= num1 - num2;
              System.out.println(Resultado);
              operandos.push(Resultado);
            }
           else if(operadores.peek().equals("/")){
              operadores.pop();
              int num1= operandos.pop();
              int num2=operandos.pop(); 
              Resultado= num1 / num2;
              System.out.println(Resultado);
              operandos.push(Resultado);
            }
           else if(operadores.peek().equals("*")){
              operadores.pop();
              int num1= operandos.pop();
              int num2=operandos.pop(); 
              Resultado= num1 * num2;
              System.out.println(Resultado);
              operandos.push(Resultado);
             }
        
        }

        
        Resultado = operandos.pop();

        
        return true;
    }

    public int getResultado(){
        return Resultado;
    }
}
