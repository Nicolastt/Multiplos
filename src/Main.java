// Imprimir en consola todos los números múltiplos de 2.
// El ciclo finalizará cuando el último múltiplo sea menor a 4570
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 4570; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}