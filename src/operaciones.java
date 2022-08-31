import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Scanner opciones = new Scanner(System.in);
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
        System.out.println(menu);
        System.out.println("Ingrese una opción");
        opcion = opciones.nextInt();
        switch (opcion){
            case 1:
                int num; int num2; int total;
                System.out.println("Ingrese el primer numero");
                num = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = cs.nextInt();
                total = num + num2;
                System.out.println("El resultado es " + total);
                break;
            case 2:
                int num3; int num4; int total2;
                System.out.println("Ingrese el primer numero");
                num3 = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num4 = cs.nextInt();
                total2 = num3 - num4;
                System.out.println("El resultado es " + total2);
                break;
            case 3:
                int num5; int num6; int total3;
                System.out.println("Ingrese el primer numero");
                num5 = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num6 = cs.nextInt();
                total3 = num5 * num6;
                System.out.println("El resultado es " + total3);
                break;
            case 4:
                int num7; int num8; int total4;
                System.out.println("Ingrese el primer numero");
                num7 = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num8 = cs.nextInt();
                total4 = num7 / num8;
                System.out.println("El resultado es " + total4);
                break;
            case 5:
                double num9; double num10;
                System.out.println("Ingrese el primer numero");
                num9 = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num10 = cs.nextInt();
                double respuestaElevado = Math.pow(num9, num10);
                System.out.println("El resultado es " + respuestaElevado);
                break;
            case 6:
                double num11;
                System.out.println("Ingrese el numero al cual desea sacar su raíz cuadrada");
                num11 = cs.nextInt();
                double resultado = Math.sqrt(num11);
                System.out.println("La raíz cuadrada de " + num11 + " es " + resultado);
                break;
            case 7:
                break;
        }
    }
}
