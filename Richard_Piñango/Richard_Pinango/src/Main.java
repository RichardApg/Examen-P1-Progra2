//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animales tienda = new Animales();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ APPSTORE ---");
            System.out.println("1. Mostrar información de todos los animales");
            System.out.println("2. Comprar aniamles");
            System.out.println("3. Vender animales");
            System.out.println("4. Mostrar animal más vendido");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    mostrarInfoAnimal(tienda.Animal1());
                    mostrarInfoAnimal(tienda.darAnimal2());
                    mostrarInfoAnimal(tienda.darAnimal3());
                    mostrarInfoAnimal(tienda.darAnimal4());

                    break;
                case 2:
                    System.out.print("Ingrese el nombre del Animal: ");
                    String AnimalCompra = sc.nextLine();
                    System.out.print("¿Cuántas Mascotas desea comprar?: ");
                    int cantCompra = sc.nextInt();
                    tienda.comprarMascotas(AnimalCompra, cantCompra);
                    System.out.println("Mascotas compradas.");
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del Animal: ");
                    String juegoVenta = sc.nextLine();
                    System.out.print("¿Cuántas mascotas desea vender?: ");
                    int cantVenta = sc.nextInt();
                    boolean vendido = tienda.mascotas(AnimalVenta, cantVenta);
                    System.out.println(vendido ? "Venta realizada con éxito." : "No hay suficientes mascotas.");
                    break;
                case 4:
                    System.out.println("Animal más vendido: " + tienda.darAnimalMasVendido());
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    public static void mostrarInfoAnimal(Animal animal) {
        System.out.println("\nNombre: " + Animal.darNombre());
        System.out.println("Categoría: " + Animal.darCategoria());
        System.out.println("Precio: $" + Animal.darPrecio());
        System.out.println("Edad: " + Animal.darEdad() + " anios");
        System.out.println("Mascotas vendidas: " + Animal.darCantidadVendidas());
    }
}