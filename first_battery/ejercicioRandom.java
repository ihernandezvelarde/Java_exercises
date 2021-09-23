import java.io.*;
public class ejercicioRandom {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/*Dado un grupo de cinco amigos vamos a hacer un programa que sume sus edades
	 *  y una vez trengamos sus edades les pediremos una altura y un peso
	 *  y mostraremos en una linea la edad de cada uno, la altura y el peso
	 * ej: Anonimo tiene 25 años, 180cm de altura y 78kg*/
		
		
		
	//Pedir las edades a las 5 personas. Mostrarlas
	System.out.println ("Introduzca su edad usuario 1");
	String edadUsuario1Raw = reader.readLine();
	int edadUsuario1 = Integer.parseInt(edadUsuario1Raw);
	
	System.out.println ("Introduzca su edad usuario 2");
	String edadUsuario2Raw = reader.readLine();
	int edadUsuario2 = Integer.parseInt(edadUsuario2Raw);
	
	System.out.println ("Introduzca su edad usuario 3");
	String edadUsuario3Raw = reader.readLine();
	int edadUsuario3 = Integer.parseInt(edadUsuario3Raw);
	
	System.out.println ("Introduzca su edad usuario 4");
	String edadUsuario4Raw = reader.readLine();
	int edadUsuario4 = Integer.parseInt(edadUsuario4Raw);
	
	System.out.println ("Introduzca su edad usuario 5");
	String edadUsuario5Raw = reader.readLine();
	int edadUsuario5 = Integer.parseInt(edadUsuario5Raw);
	
	//Sumarlas
		
	int sumAge = edadUsuario1 + edadUsuario2 + edadUsuario3 + edadUsuario4 + edadUsuario5;

	//Mostrar la suma de las edades por pantalla
	
	System.out.println ("La suma de las cinco edades son " + (sumAge));
	
	System.out.println ("");
	//Pedimos altura de cada uno de ellos
	
	System.out.println ("Introduzca su altura en cm usuario 1");
	String alturaUsuario1Raw = reader.readLine();
	int alturaUsuario1 = Integer.parseInt(alturaUsuario1Raw);
	
	System.out.println ("Introduzca su altura en cm usuario 2");
	String alturaUsuario2Raw = reader.readLine();
	int alturaUsuario2 = Integer.parseInt(alturaUsuario2Raw);
	
	System.out.println ("Introduzca su altura en cm usuario 3");
	String alturaUsuario3Raw = reader.readLine();
	int alturaUsuario3 = Integer.parseInt(alturaUsuario3Raw);
	
	System.out.println ("Introduzca su altura en cm usuario 4");
	String alturaUsuario4Raw = reader.readLine();
	int alturaUsuario4 = Integer.parseInt(alturaUsuario4Raw);
	
	System.out.println ("Introduzca su altura en cm usuario 5");
	String alturaUsuario5Raw = reader.readLine();
	int alturaUsuario5 = Integer.parseInt(alturaUsuario5Raw);
	
	
	//Pedimos peso de cada uno de ellos
	System.out.println ("Introduzca su peso redondeado en kg usuario 1");
	String pesoUsuario1Raw = reader.readLine();
	int pesoUsuario1 = Integer.parseInt(pesoUsuario1Raw);
	
	System.out.println ("Introduzca su peso redondeado en kg usuario 2");
	String pesoUsuario2Raw = reader.readLine();
	int pesoUsuario2 = Integer.parseInt(pesoUsuario2Raw);
	
	System.out.println ("Introduzca su peso redondeado en kg usuario 3");
	String pesoUsuario3Raw = reader.readLine();
	int pesoUsuario3 = Integer.parseInt(pesoUsuario3Raw);
	
	System.out.println ("Introduzca su peso redondeado en kg usuario 4");
	String pesoUsuario4Raw = reader.readLine();
	int pesoUsuario4 = Integer.parseInt(pesoUsuario4Raw);
	
	System.out.println ("Introduzca su peso redondeado en kg usuario 5");
	String pesoUsuario5Raw = reader.readLine();
	int pesoUsuario5 = Integer.parseInt(pesoUsuario5Raw);
	
	//Montrar en una linea la edad, la altura y el peso de cada uno	
	System.out.println ("La edad del usuario 1 es " + (edadUsuario1)  + (" su altura es ")+ ( alturaUsuario1) + ("  y su peso es ") + ( pesoUsuario1)); 
	System.out.println ("La edad del usuario 2 es " + (edadUsuario2)  + (" su altura es ")+ ( alturaUsuario2) + ("  y su peso es ") + ( pesoUsuario2)); 
	System.out.println ("La edad del usuario 3 es " + (edadUsuario3)  + (" su altura es ")+ ( alturaUsuario3) + ("  y su peso es ") + ( pesoUsuario3)); 
	System.out.println ("La edad del usuario 4 es " + (edadUsuario4)  + (" su altura es ")+ ( alturaUsuario4) + ("  y su peso es ") + ( pesoUsuario4)); 
	System.out.println ("La edad del usuario 5 es " + (edadUsuario5)  + (" su altura es ")+ ( alturaUsuario5) + ("  y su peso es ") + ( pesoUsuario5)); 	
		
		
	}
}

