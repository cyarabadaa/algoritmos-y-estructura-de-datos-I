public class Sum {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Por favor ingresa exactamente dos números");
        } else {
            int numero1 = Integer.parseInt(args[0]);
            int numero2 = Integer.parseInt(args[1]);

            int suma = numero1 + numero2;

            System.out.println("La suma es: " + suma);
        }
    }
}
