public class Operacion {
    public int dividir(int num1, int num2){
        if (num2 != 0){
            return num1 / num2;
        } else {
            throw new IlegalDivisionException("No se permite dividir por cero");
        }
    }
}
