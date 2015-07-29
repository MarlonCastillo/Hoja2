import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class CalcuMain {
    public static void main(String[] args) {

    try{
        FileReader lector=new FileReader("texto.txt");
        //El contenido de lector se guarda en un BufferedReader
        BufferedReader contenido=new BufferedReader(lector);
    	String linea;
        Calculadora miCalcu = new Calcu();
        System.out.println("BIENVENIDO A NUESTRA CALCULADORA POSTFIX.\nRecorriendo archivo de texto, por favor espere a que se procesen los datos...");

        //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
        while((linea=contenido.readLine())!=null)
        {
            miCalcu.setString(linea);
            miCalcu.meterVector();
            miCalcu.calcularVector();
            System.out.println("El resultado de la operacion es: "+miCalcu.getResultado());
            //System.out.println(linea);

        }
        }

        //Si se causa un error al leer cae aqui
        catch(Exception e)
        {
        System.out.println("Error al leer");
        }
        //linea=lector.nextLine();

        
    }
        

        
        

}
