import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double resultado = 0;

        while (true) {
            System.out.println("Calculadora Simple");
            System.out.println("Resultado actual: " +resultado);
            System.out.println("Opciones");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.println("Seleccione una opcion: ");
            if (sc.hasNextDouble()) {
                int opcion = sc.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo de la calculardora");
                break;
            }

            System.out.println("Ingrese el sengundo numero");
            if (sc.hasNextDouble()) {
                double segundoNumero = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado += segundoNumero;
                        break;
                    case 2:
                        resultado -= segundoNumero;
                        break;
                    case 3:
                        resultado *= segundoNumero;
                        break;
                    case 4:
                        if (segundoNumero != 0) {
                            resultado /= segundoNumero;}
                        else {
                            System.out.println("Error: No se puede dividir por cero");
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

            } else {
                System.out.println("Entrada no valida. Ingrese un numero ");
                sc.next();
            }
        } else {
           System.out.println("Entrada no valida. Ingrese un numero ");
            sc.next(); 
        } 

    }
    sc.close();
    }
}