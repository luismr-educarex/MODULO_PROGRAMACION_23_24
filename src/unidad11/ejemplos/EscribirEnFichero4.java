package unidad11.ejemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class EscribirEnFichero4 {

	public static void main(String[] args) {
		
		File fichero = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
		
		try {
			
			fichero = new File("ficheros//coches.txt");
			fw = new FileWriter(fichero,true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			//pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("ficheros//coches.txt"))));
			
			pw.println("Audi");
			pw.println("Mercedes");
			pw.println("Renault");
			
			System.out.println("Datos añadidos con éxito");
			
			pw.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw!=null) {
					pw.close();
				}
				if(bw!=null) {
					bw.close();
				}
				if(fw!=null) {
					fw.close();
				}

			}catch(IOException e) {
				e.printStackTrace();
			}
		}// fin del finally
		
		
		try(
				FileWriter f = new FileWriter("ficheros//coches.txt",true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);
				
		   ) {
			
			p.println("Seat");
			p.println("BMW");
			p.println("Tesla");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}












