/******************************************************************************

edad=int(input("Cuál es tu edad"))
if edad>= 18:
  print("Usted es mayor de edad")
else:
  print("Usted es menor de edad")

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Cuál es tu edad"); //impresión
		Scanner edad = new Scanner(System.in); //creando un input
		//nextline sirve para leer string
		//nextInt sirve para leer enteros
		//nextFloat sirve para leer flotante (decimales)
		int age = edad.nextInt();
		
		if (age>=18){
		    System.out.println("Eres mayor de edad");
		}else{
		    System.out.println("Eres mayor de edad");
		}
		
		if (age<10){
		    System.out.println("Aun eres un niño");
		}else{
		    if (age>=10 && age<14){
		    System.out.println("Eres un preadolescente");
		    }else{
		    if (age>=14 && age<18){
		        System.out.println("Eres un adolescente");
		    }else{
		        if (age>=18 && age<30){
		            System.out.println("Eres un adulto joven");
		        }else{
		            System.out.println("Eres un adulto");
		        }
		    }
		}
		}
		
		if (age<10){System.out.println("Aún eres un niño");}
		else if (age>=10 && age<14){System.out.println("Eres un preadolescente");}
		else if (age>=14 && age<18){System.out.println("Eres un adolescente");}
		else if (age>=18 && age<30){System.out.println("Eres un adulto joven");}
		else{System.out.println("Eres un adulto");}
	}
}
	