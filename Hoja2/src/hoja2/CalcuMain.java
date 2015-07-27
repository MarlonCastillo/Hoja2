import java.util.Scanner;

public class CalcuMain {
    public static void main(String[] args) {

    	String linea;
        Calculadora miCalcu = new Calcu();
        System.out.println("BIENVENIDO A NUESTRA CALCULADORA POSTFIX.\nRecorriendo archivo de texto, por favor espere a que se procesen los datos...");
        Scanner lector= new Scanner(System.in);

        linea=lector.nextLine();

        miCalcu.setString(linea);
        miCalcu.meterVector();
        miCalcu.calcularVector();
        System.out.println("El resultado de la operacion es: "+miCalcu.getResultado());
    }
}


//"1 2 + 4 * 3 +"
