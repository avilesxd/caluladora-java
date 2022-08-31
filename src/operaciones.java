import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        // crear un scanner para recibir la opción del usuario
        Scanner cs = new Scanner(System.in);
        // crear un scanner para recibir los números dados por el usuario
        Scanner opciones = new Scanner(System.in);
        // creación de una variable de tipo entero para las opciones y una variable de tipo string para crear un simple menu
        int opcion;
        String menu = """
                ¿Que desea hacer?
                
                1.- Sumar
                2.- Restar
                3.- Multiplicar
                4.- Dividir
                5.- Potencia
                6.- Salir
                """;
        // print para mostrar el menu
        System.out.println(menu);
        // print para pedirle una opción al usuario
        System.out.println("Ingrese una opción");
        // entrada para recibir la opción del menu
        opcion = opciones.nextInt();
        // usamos un switch case para evaluar diferentes opciones, en este caso el numero escogido por el usuario en el menu
        switch (opcion){
            // el primer case hace la operación de la suma de dos números escogido por el usuario
            case 1:
                // creamos tres variables de tipo entero, en las cuales las primeras dos tomaran los números que ponga el usuario y la tercera hará la operación matemática correspondiente
                int num; int num2; int total;
                System.out.println("Ingrese el primer numero");
                num = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = cs.nextInt();
                total = num + num2;
                System.out.println("El resultado es " + total);
                break;

            // el segundo case hace la operación de la resta de dos números escogido por el usuario
            case 2:
                // creamos tres variables de tipo entero, en las cuales las primeras dos tomaran los números que ponga el usuario y la tercera hará la operación matemática correspondiente
                int num3; int num4; int total2;

                System.out.println("Ingrese el primer numero");
                num3 = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num4 = cs.nextInt();
                total2 = num3 - num4;
                System.out.println("El resultado es " + total2);
                break;

            // el tercer case hace la operación de la multiplicación de dos números escogido por el usuario
            case 3:
                // creamos tres variables de tipo entero, en las cuales las primeras dos tomaran los números que ponga el usuario y la tercera hará la operación matemática correspondiente
                int num5; int num6; int total3;

                System.out.println("Ingrese el primer numero");
                num5 = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num6 = cs.nextInt();
                total3 = num5 * num6;
                System.out.println("El resultado es " + total3);
                break;

            // el cuarto case hace la operación de la division de dos números escogido por el usuario
            case 4:
                // creamos tres variables de tipo entero, en las cuales las primeras dos tomaran los números que ponga el usuario y la tercera hará la operación matemática correspondiente
                int num7; int num8; int total4;

                System.out.println("Ingrese el primer numero");
                num7 = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num8 = cs.nextInt();
                total4 = num7 / num8;
                System.out.println("El resultado es " + total4);
                break;

            // el quinto case hace la operación de elevar el numero escogido por el usuario
            case 5:
                // creamos tres variables de tipo entero, en las cuales las primeras dos tomaran los números que ponga el usuario y la tercera hará la operación matemática correspondiente
                double num9; double num10;

                System.out.println("Ingrese el primer numero");
                num9 = cs.nextInt();
                System.out.println("Ingrese el segundo numero");
                num10 = cs.nextInt();
                // función math.pow es para poder elevar el numero dado por el cliente. Ejemplo: 5^2, lo que dará como resultado 25
                double respuestaElevado = Math.pow(num9, num10);
                System.out.println("El resultado es " + respuestaElevado);
                break;

            // el sexto case cierra el programa
            case 6:
                break;
        }
    }
}
