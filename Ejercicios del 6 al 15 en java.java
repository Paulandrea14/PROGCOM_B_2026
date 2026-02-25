/******************************************************************************

6. Desarrolla un programa que determine si un número es par o impar.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	  System.out.println("Ingrese el numero:");
        float num = entrada.nextFloat();

        if (num % 2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }

/******************************************************************************

7. Crea un programa que determine si un año es bisiesto 
(divisible por 4 y no por 100, o divisible por 400).

*******************************************************************************/

        System.out.println("Ingrese el año:");
        int year = entrada.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año es bisiesto");
        }
        else {
            System.out.println("El año no es bisiesto");
        }
        
/******************************************************************************

8. Escribe un programa que solicite el nombre del usuario y 
determine si una persona pertenece a la tercera edad (70 años o más) 
y si se cumple la condición, imprima que se le da prioridad en la fila.

*******************************************************************************/

        System.out.println("Escriba su nombre:");
        String nombre = entrada.next();

        System.out.println("Escriba su edad:");
        int edad = entrada.nextInt();

        if (edad > 70) {
            System.out.println("Tiene prioridad en la fila");
        }
        else {
            System.out.println("No tiene prioridad en la fila");
        }
        
/******************************************************************************

9. Desarrolla un programa que compare tres números y muestre el mayor.

*******************************************************************************/
        System.out.println("Ingrese el primer numero:");
        float num1 = entrada.nextFloat();

        System.out.println("Ingrese el segundo numero:");
        float num2 = entrada.nextFloat();

        System.out.println("Ingrese el tercer numero:");
        float num3 = entrada.nextFloat();

        float mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        }
        else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        }
        else {
            mayor = num3;
        }

        System.out.println("El numero mayor es: " + mayor);
    
/******************************************************************************

10. Crea un programa que determine si un triángulo 
es equilátero, isósceles o escaleno según sus lados.

*******************************************************************************/
        System.out.println("Ingrese el lado 1:");
        float lado1 = entrada.nextFloat();

        System.out.println("Ingrese el lado 2:");
        float lado2 = entrada.nextFloat();

        System.out.println("Ingrese el lado 3:");
        float lado3 = entrada.nextFloat();

        String tipo;

        if (lado1 == lado2 && lado2 == lado3) {
            tipo = "Equilatero";
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipo = "Isosceles";
        }
        else {
            tipo = "Escaleno";
        }

        System.out.println("El tipo de triangulo que se forma es: " + tipo);

/******************************************************************************

11. Escribe un programa que calcule el índice de masa corporal (IMC) y 
determine la categoría (bajo peso, normal, sobrepeso, obesidad). 
Al final, el programa debe imprimir: el nombre del usuario, su categoría y 
una breve descripción de lo que debe hacer de acuerdo a su categoría.

*******************************************************************************/

	    
	    System.out.println("¿Cuál es su nombre?: ");
	    String nombres = entrada.nextLine();
	    
	    System.out.println("¿Cuánto pesas?: ");
	    float peso = entrada.nextFloat();
	    
	    System.out.println("¿Cuánto mides?: ");
	    float estatura = entrada.nextFloat();
	    
	    float imc = peso / (estatura * estatura);
	    
	    String categoria;
	    String descripcion;
	    
	    if (imc < 18.5){
	        categoria = "Bajo peso";
	        descripcion = "Debes comer más";
	    }
	    else if (imc >= 18.5 && imc <= 24.9){
	        categoria = "Normal";
	        descripcion = "No necesitas hacer nada";
	    }
	    else if (imc >= 25 && imc <= 29.9){
	        categoria = "Sobrepeso";
	        descripcion = "Estás un poco pasad@ de peso, debes alimentarte mejor";
	    }
	    else{
	        categoria = "Obesidad";
	        descripcion = "Tu peso es peligroso para tu salud, ve al médico";
	    }
	    
	    System.out.println("Su nombre es: " + nombres);
	    System.out.println("Su categoría es: " + categoria);
	    System.out.println("Descripción: " + descripcion);
	

/******************************************************************************

12. Desarrolla un programa que simule una calculadora simple 
(+, -, *, /) con dos números.

*******************************************************************************/


	    System.out.println("Ingrese el primer numero:");
	    float num111 = entrada.nextFloat();
	    
	    System.out.println("Ingrese el segundo numero:");
	    float num222 = entrada.nextFloat();
	    
	    System.out.println("¿Que operacion quiere realizar? (+, -, *, /)");
	    String op = entrada.next();
	    
	    float resultado;
	    
	    if (op.equals("+")){
	        resultado = num111 + num222;
	    }
	    else if (op.equals("-")){
	        resultado = num111 - num222;
	    }
	    else if (op.equals("*")){
	        resultado = num111 * num222;
	    }
	    else{
	        resultado = num111 / num222;
	    }
	    
	    System.out.println("El resultado de la operacion es: " + resultado);
	
/******************************************************************************

13. Crea un programa que determine la calificación en letras 
(A, B, C, D, F) según una nota numérica (0-100).

*******************************************************************************/

	    
	    System.out.println("Ingrese la nota (0-100):");
	    float nota = entrada.nextFloat();
	    
	    String calificacion;
	    
	    if (nota > 90){
	        calificacion = "A";
	    }
	    else if (nota > 80){
	        calificacion = "B";
	    }
	    else if (nota > 60){
	        calificacion = "C";
	    }
	    else if (nota > 40){
	        calificacion = "D";
	    }
	    else{
	        calificacion = "F";
	    }
	    
	    System.out.println("La calificacion en letra es: " + calificacion);
	
/******************************************************************************

14. Escribe un programa que determine el día de la semana según un número (1-7).

*******************************************************************************/

        System.out.println("Escriba un numero del 1 al 7 para descubrir que dia de la semana es:");
        int dia = entrada.nextInt();

        String d;

        if (dia == 1) {
            d = "Domingo";
        }
        else if (dia == 2) {
            d = "Lunes";
        }
        else if (dia == 3) {
            d = "Martes";
        }
        else if (dia == 4) {
            d = "Miercoles";
        }
        else if (dia == 5) {
            d = "Jueves";
        }
        else if (dia == 6) {
            d = "Viernes";
        }
        else {
            d = "Sabado";
        }

        System.out.println("El dia de la semana que corresponde a ese numero es: " + d);


/******************************************************************************

15. Desarrolla un programa que valide si tres números 
pueden formar un triángulo y de qué tipo es.

*******************************************************************************/

        System.out.println("Ingrese el lado 1:");
        float lado111 = entrada.nextFloat();

        System.out.println("Ingrese el lado 2:");
        float lado222 = entrada.nextFloat();

        System.out.println("Ingrese el lado 3:");
        float lado333 = entrada.nextFloat();

        if (lado111 + lado222 > lado333 && lado111 + lado333 > lado222 && lado222 + lado333 > lado111) {

            String tipos;

            if (lado111 == lado222 && lado222 == lado333) {
                tipos = "Equilatero";
            }
            else if (lado111 == lado222 || lado111 == lado333 || lado222 == lado333) {
                tipos = "Isosceles";
            }
            else {
                tipos = "Escaleno";
            }

            System.out.println("Si pueden formar un triangulo");
            System.out.println("El tipo de triangulo que se forma es: " + tipos);
        }
        else {
            System.out.println("No se puede formar un triangulo");
        }
	}
}