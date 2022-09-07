import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Operadores data = new Operadores();
        Scanner sc = new Scanner(System.in);
        Scanner opciones = new Scanner(System.in);
        int num, num2, resultado, opcion;
        boolean salir = false;
        String menu = """
                ¿Que desea hacer?
                
                1.- Sumar
                2.- Restar
                3.- Multiplicar
                4.- Dividir
                5.- Potencia (construccion)
                6.- Raiz cuadrada (construccion)
                7.- Salir
                """;

        while (!salir){
            System.out.println("\n");
            System.out.print(menu);
            try {
                System.out.println("Ingrese una opción");
                opcion = opciones.nextInt();
                System.out.println("\n");
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese el 1er numero");
                        num = sc.nextInt();
                        System.out.println("Ingrese el 2do numero");
                        num2 = sc.nextInt();
                        resultado = data.suma(num, num2);
                        System.out.println("\n");
                        System.out.println("El resultado es " + resultado);
                    }
                    case 2 -> {
                        System.out.println("Ingrese el 1er numero");
                        num = sc.nextInt();
                        System.out.println("Ingrese el 2do numero");
                        num2 = sc.nextInt();
                        resultado = data.resta(num, num2);
                        System.out.println("\n");
                        System.out.println("El resultado es " + resultado);
                    }
                    case 3 -> {
                        System.out.println("Ingrese el 1er numero");
                        num = sc.nextInt();
                        System.out.println("Ingrese el 2do numero");
                        num2 = sc.nextInt();
                        resultado = data.multiplicacion(num, num2);
                        System.out.println("\n");
                        System.out.println("El resultado es " + resultado);
                    }
                    case 4 -> {
                        System.out.println("Ingrese el 1er numero");
                        num = sc.nextInt();
                        System.out.println("Ingrese el 2do numero");
                        num2 = sc.nextInt();
                        resultado = data.division(num, num2);
                        System.out.println("\n");
                        System.out.println("El resultado es " + resultado);
                    }
                    case 5 -> {
                        System.out.println("Ingrese el numero base");
                        num = sc.nextInt();
                        System.out.println("Ingrese el numero exponente");
                        num2 = sc.nextInt();
                        resultado = data.NuemeroElevado(num, num2);
                        System.out.println("El resultado es " + resultado);
                    }
                    case 6 -> {
                        System.out.println("Ingrese el número al cual desea sacar su raíz cuadrada");
                        num = sc.nextInt();
                        resultado = data.RaizCuadrada(num);
                        System.out.println("La raíz cuadrada de " + num + " es " + resultado + "\n");
                    }
                    case 7 -> salir = true;
                    default -> System.out.println("Solo números entre 1 y 7");
                }
            }catch (Exception e){
                System.out.println("Debe insertar un número");
                sc.next();
            }
        }
    }
}
