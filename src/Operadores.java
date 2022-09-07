public class Operadores {
    public int suma(int num, int num2){
        int resultado;
        resultado = num + num2;
        return resultado;
    }
    public int resta(int num, int num2){
        int resultado;
        resultado = num - num2;
        return resultado;
    }
    public int multiplicacion(int num, int num2){
        int resultado;
        resultado = num * num2;
        return resultado;
    }
    public int division(int num, int num2){
        int resultado;
        resultado = num / num2;
        return resultado;
    }
    public int NuemeroElevado(int num, int num2){
        double resultado;
        resultado = Math.sqrt(num);
        return (int) resultado;
    }
    public int RaizCuadrada(int num){
        double resultado;
        resultado = Math.sqrt(num);
        return (int) resultado;
    }
}