public class Calcu implements Calculadora{
    private String linea;
    private int Resultado;
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
            else { operandos.push(Integer.parseInt(b)); }
        }
    }
    public boolean calcularVector(){
        for (int a=0;a<operadores.size();a++){
           if(operadores.peek().equals("+")){ operandos.push(operandos.pop()+operandos.pop()); operadores.pop(); }
           else if(operadores.peek().equals("-")){ Resultado =operandos.pop()-operandos.pop(); operadores.pop(); }
           else if(operadores.peek().equals("/")){ Resultado =operandos.pop()/operandos.pop(); operadores.pop(); }
           else if(operadores.peek().equals("*")){ operandos.push(operandos.pop()*operandos.pop()); operadores.pop(); }
        }
        Resultado = operandos.pop();

        System.out.println(operandos);
        return true;
    }
    /*
    los pusimos boolean porque si hay un error en como se manda la linea del archivo 
    por ejemplo (1 2 + *) no hay que hacer nada y devolver algo para indicar que hay
    un error en lo que se quiere operar
    */
    public int getResultado(){
        return Resultado;
    }
}
