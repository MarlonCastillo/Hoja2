/*
Carlos Javier Lima Cordón, 14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo, 14102
Maria Jose Lopez, 14056

Clase principal que se encarga de la interfaz al usuario y de leer las operaciones en el archivo de texto.
*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CalcuMain {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A NUESTRA CALCULADORA POSTFIX.\nRecorriendo archivo de texto, por favor espere a que se procesen los datos...");
		try{
            FileReader lector=new FileReader("texto.txt");
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            String linea;
        	Calculadora miCalcu = new Calcu();
            //System.out.println(linea=contenido.readLine());
            while((linea=contenido.readLine())!=null) {
            	System.out.println(linea);
            	miCalcu.setString(linea);
            	miCalcu.meterVector();
            	if(miCalcu.calcularVector()){
                	System.out.println("El resultado de la operacion es: "+miCalcu.getResultado());
            	}
            	else {System.out.println("La operacion es incorrecta y no se puede realizar.");}
           	}
        }
        //Si se causa un error al leer cae aqui
        catch(Exception e) {
            System.out.println("Error al leer el archivo.");
        }
	}
}
