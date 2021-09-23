import java.io.*;

public class ejercicio3Examen1B {
	
	public static void main (String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/*Dissenyeu un programa en Python que mostri per una banda el sumatori dels números negatius introduïts per l’usuari, i per l’altre el sumatori dels positius.
	 * El programa anirà demanant números; quan l’usuari introdueixi un 0, el programa mostrarà el nombre de números de cada tipus (positiu o negatiu), i els dos sumatoris,  terminant la execució.
	 * Un exemple d'execució seria:
	*/
	 
	int contador1 = 0;
	int contador2 =0;
	int suma1 = 0;
	int suma2 = 0;
	int infinite = 100000;
	String rawNote = reader.readLine();
	int note = Integer.parseInt(rawNote);
	
		do{
		for (int i = 0; i <infinite; i++){
			System.out.println("Introduzca un numero que al final se sumara por grupos segun si es positivo o negativo. Cuando escriba 0 el programa terminara");
			rawNote = reader.readLine();
			note = Integer.parseInt(rawNote);
			
			if(note < 0){ 
				suma2 = suma2 + note;
				contador2 = contador2 +1;
				
			}else if (note > 0){
				suma1 = suma1 +note;
				contador1 = contador1 +1;
				
			}else if (note ==0){
				break;
				System.out.println("Has introducido " + contador1 + " y la suma de ellos es " + suma1);
				System.out.println("Has introducido " + contador2 + " y la suma de ellos es " + suma2);
			}
		}
		}while (note!=0);		
				
		}
	}


				
	


	



