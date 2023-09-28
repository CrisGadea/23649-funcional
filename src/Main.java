import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Integer> numeros = List.of(1,2,3,4,5,6);
        /*int contador = 0;
        // Calcular cantidad de valores mayores a 4 en lista
        for(int numero : numeros){
            if(numero > 4){
                contador++;
            }
        }*/

        // Programacion Funcional
        long resultado = numeros.stream().
                filter(numero -> numero > 4)
                .count();


        System.out.println("La cantidad de valores mayores a 4 es: " + resultado);


        Operacion op = new Operacion();


        try{
            int resul = op.dividir(2,0);
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Listo");
        }
    }
}
