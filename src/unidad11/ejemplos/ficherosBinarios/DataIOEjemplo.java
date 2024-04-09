package unidad11.ejemplos.ficherosBinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOEjemplo {

	public static void main(String[] args) {
		
		try(DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream("ficheros/datos.dat"))){
				
				dos.writeInt(42);
				dos.writeDouble(3.14);
				dos.writeUTF("Mañana no vengo");
				
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try(DataInputStream dis = 
				new DataInputStream(new FileInputStream("ficheros/datos.dat"))){
				
			int entero = dis.readInt();
			double doble = dis.readDouble();
			String cadena = dis.readUTF();
				
			System.out.println("Entero:"+entero);
			System.out.println("Double:"+doble);
			System.out.println("Cadena:"+cadena);
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
