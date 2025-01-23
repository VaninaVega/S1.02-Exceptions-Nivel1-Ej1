import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crear una lista de productos
        List<Product> productCollection = new ArrayList<>();

        // Crear una venta con esos productos (esta vacía no agregué productos)
        Sale sale1 = new Sale(productCollection);

        try {
            sale1.calculateTotal();  //calculo total de una lista sin productos
        } catch (EmptySaleException ce) { //capturo excepcion y largo mensaje
            System.out.println("Error when calculateTotal for sale: " + ce.getMessage());
        }

        //añado productos a la venta
        sale1.getProductCollection().add(new Product("Table", 10.0));
        sale1.getProductCollection().add(new Product("Chair", 20.0));
        sale1.getProductCollection().add(new Product("TV", 15.0));

        try {
            // Calcular el precio total de la venta, me olbliga a usar el try catch pq el codigo no sabe si ocurre o no la exc
            sale1.calculateTotal();
        } catch (EmptySaleException ce) {
            System.out.println("Error when calculateTotal for sale: " + ce.getMessage());
        }

        // Mostrar el precio total
        System.out.println("The total price of the sale is: " + sale1.getTotalPrice());


        try {
            // Intentar acceder a un índice fuera de los límites
            System.out.println( productCollection.get(5)); //el Array es de tres productos
        } catch (IndexOutOfBoundsException e) {
            // Capturar la excepción y mostrar un mensaje
            System.out.println("Error: You attempted to access an out-of-bounds index.");
            System.out.println("Details: " + e.getMessage());
        }

        System.out.println("The program continues after handling the exception.");
    }
}
