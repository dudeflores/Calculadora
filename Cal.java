import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        while (true) {
            System.out.println("Calculadora Simple");
            System.out.println("Resultado actual: " + resultado);
            System.out.println("Opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            String entrada = scanner.next(); // Leer entrada como cadena
            
            if (esNumero(entrada)) {
                int opcion = Integer.parseInt(entrada);

                if (opcion == 5) {
                    System.out.println("Saliendo de la calculadora.");
                    break;
                }

                System.out.print("Ingrese el segundo número: ");
                entrada = scanner.next(); // Leer entrada como cadena

                if (esNumero(entrada)) {
                    double segundoNumero = Double.parseDouble(entrada);

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
                                resultado /= segundoNumero;
                            } else {
                                System.out.println("Error: No se puede dividir por cero.");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                } else {
                    System.out.println("Entrada no válida. Ingrese un número.");
                }
            } else {
                System.out.println("Entrada no válida. Ingrese un número.");
            }
        }
        
        scanner.close();
    }
    
    // Función para verificar si una cadena es un número válido
    private static boolean esNumero(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}