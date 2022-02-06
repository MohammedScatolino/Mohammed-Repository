public class App {
    public static void main(String[] args) throws Exception {
        /*int contador = 1;
        while (contador <= 4) {
            System.out.println(contador);
            contador++;
        }*/


        /*int contador = 1;
        while (contador <= 4) {
            if (contador == 3) {
                contador++;
                continue;
            }
            System.out.println(contador);
            contador++;           
        }*/


        int contador = 1;
        while (contador <= 7) {
            if (contador == 3) {
                contador++;
                continue;
            }
            if (contador == 6) {
                break;
            }
            System.out.println(contador);
            contador++;
        } 









    
    }
}
