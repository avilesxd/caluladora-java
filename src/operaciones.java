import java.util.InputMismatchException;
import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner opciones = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String menu = """
                ¿Que desea hacer?
                
                1.- Sumar
                2.- Restar
                3.- Multiplicar
                4.- Dividir
                5.- Potencia
                6.- Raiz cuadrada
                7.- Salir
                """;

        while (!salir) {
            System.out.println(menu);
            try {
                System.out.println("Ingrese una opción");
                opcion = opciones.nextInt();
                System.out.println("\n");
                switch (opcion){
                    case 1:
                        int num; int num2; int total;
                        System.out.println("Ingrese el primer número");
                        num = sc.nextInt();
                        System.out.println("Ingrese el segundo número");
                        num2 = sc.nextInt();
                        total = num + num2;
                        System.out.println("El resultado es " + total+"\n");
                        break;
                    case 2:
                        int num3; int num4; int total2;
                        System.out.println("Ingrese el primer número");
                        num3 = sc.nextInt();
                        System.out.println("Ingrese el segundo número");
                        num4 = sc.nextInt();
                        total2 = num3 - num4;
                        System.out.println("El resultado es " + total2+"\n");
                        break;
                    case 3:
                        int num5; int num6; int total3;
                        System.out.println("Ingrese el primer número");
                        num5 = sc.nextInt();
                        System.out.println("Ingrese el segundo número");
                        num6 = sc.nextInt();
                        total3 = num5 * num6;
                        System.out.println("El resultado es " + total3+"\n");
                        break;
                    case 4:
                        int num7; int num8; int total4;
                        System.out.println("Ingrese el primer número");
                        num7 = sc.nextInt();
                        System.out.println("Ingrese el segundo número");
                        num8 = sc.nextInt();
                        total4 = num7 / num8;
                        System.out.println("El resultado es " + total4+"\n");
                        break;
                    case 5:
                        double num9; double num10;
                        System.out.println("Ingrese el primer número");
                        num9 = sc.nextInt();
                        System.out.println("Ingrese el segundo número");
                        num10 = sc.nextInt();
                        double respuestaElevado = Math.pow(num9, num10);
                        System.out.println("El resultado es " + respuestaElevado+"\n");
                        break;
                    case 6:
                        double num11;
                        System.out.println("Ingrese el número al cual desea sacar su raíz cuadrada");
                        num11 = sc.nextInt();
                        double resultado = Math.sqrt(num11);
                        System.out.println("La raíz cuadrada de " + num11 + " es " + resultado+"\n");
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 7");
                }
            }catch (InputMismatchException e){
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }
    }
}
