import java.io.*;

	public class ejercicio6ifelse{
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/* Desenvolupa un programa que demani un mes i un any, i escrigui el mes anterior i el mes següent.Nota: no facis servir el tipus de dades data.
	Ex. Si l’usuari introdueix mes:10 i any 2003, el resultat serà anterior:9/2003 i posterior 11/2003.  
	Però amb  mes:12 i any 2003, el resultat serà anterior:11/2003 i posterior 1/2004 (passa el mateix amb el mes anterior a gener).*/
	
	 System.out.println ("Introduzca un mes en numeros");
	 String mesRaw = reader.readLine();
	 int mes = Integer.parseInt(mesRaw);
	 
	 System.out.println ("Introduzca un anyo en numeros");
	 String anyoRaw = reader.readLine();
	 int anyo = Integer.parseInt(anyoRaw);
	 
	 int result = mes+1;
	 int result2 = mes-1;
	 int result3 = anyo+1;
	 int result4 = anyo-1;
	 
	if (mes == 12) {
  System.out.println("El resultado anterior:" + (result2) + "/" + (anyo) + " El posterior es 1" + "/" + (result3));
} else if (mes == 1) {
  System.out.println("El resultado anterior:" + " 12/" + (result4) + " El posterior es: " +  (result) + "/" + (anyo));
} else {
  System.out.println("El resultado anterior:" + (result2) + "/" + (anyo) + " El posterior:" + (result) + "/" + (anyo));
}
} 
}
 


