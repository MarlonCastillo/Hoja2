public class Calcu implements Calculadora{
    private String linea;
    private int Resultado;
    private Stack<String> pila = new StackArrayList<String>();
    
    public void setString(String linea){
        this.linea=linea;
    }
    public void meterVector(){
        for (int a=linea.length()-1;a>=0;a--){
            if (String.valueOf(linea.charAt(a)).equals(" ")){a=a;}
            else {pila.push(String.valueOf(linea.charAt(a)));}
        }
    }
    public boolean calcularVector(){
        Resultado = Integer.parseInt(pila.pop()) + Integer.parseInt(pila.pop());
        return true;
    }
    public int getResultado(){
        return Resultado;
    }
}
