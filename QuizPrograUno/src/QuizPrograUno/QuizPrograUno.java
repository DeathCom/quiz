package QuizPrograUno;
import java.util.Scanner;
public class QuizPrograUno {
/**
 1)	Desarrolle un programa en Java usando Netbeans 8.1 o superior, que lea el nombre y 
las calificaciones de N cantidad de estudiantes de Ingeniería en Sistemas. 
Si digito la opción 2 el sistema va a mostrar la nota promedio y 
el nombre del estudiante con la mejor calificación.
Usted debe de verificar la nota para que el usuario siempre digite una nota entre 0 100
IMPORTANTE: Una vez terminado ese proceso, 
regrese al menú principal por si el usuario desea ingresar más calificaciones.
CUIDADO: no debe de permitir el ingreso de calificaciones menores a 0 o mayores a 100
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String estudiante="", mejorstudent="", peorstudent=""; 
		int calif=0, eleccion, calificaciones, mejorCal=0, peorCal=0;
		do{
			do{
				System.out.println("1-	Ingresar calificaciones\n"
						+ "2-	Mejor calificación\n"
						+ "3-	Peor calificación\n"
						+ "4-	Salir");
				eleccion = scan.nextInt();
			}while(eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4);
			if(eleccion==1){
				System.out.println("Digite la cantidad de calificaciones que desea ingresar:");
				calificaciones = scan.nextInt();
				System.out.println("Digite el nombre del estudiante 1: ");
				estudiante = scan2.nextLine();
				System.out.println("Digite la calificación: ");
				calif = scan.nextInt();
				mejorCal = calif;
				peorCal = calif;
				peorstudent=estudiante;
				mejorstudent=estudiante;
				for(int i=0; i<calificaciones-1; i++){
					do{
						System.out.print("Digite el nombre del estudiante "+(i+2)+": ");
						estudiante = scan2.nextLine();
						System.out.print("Digite la calificación: ");
						calif = scan.nextInt();
						if(calif<0 || calif>100){
							System.out.println("La calificacion no puede ser menor a \"0\"\n"
									+ "oh mayor a \"100\" repita el proceso: ");
						}
						if(mejorCal<calif){
							mejorCal=calif;
							mejorstudent = estudiante;
						}
						if(peorCal>calif){
							peorCal=calif;
							peorstudent=estudiante;
						}
					}while(calif<0 && calif>100);
				}
			}else if(eleccion==2){
				System.out.println("La mejor calificación es de "+mejorstudent+" con un "+mejorCal);
			}else if(eleccion==3){
				System.out.println("La peor calificación es de "+peorstudent+" con un "+peorCal);
			}else if(eleccion==4){
				System.out.print("Chao.....");
				continue;
			}
		}while(eleccion != 4);
		scan.close();
		scan2.close();
	}

}
