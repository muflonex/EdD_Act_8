package principal;
import invoicing.*;

/**
 *
 * @author Mikolaj
 */

public class Principal {

    public static void main(String[] args) {
    
        
        
    //  crea dos instancias de invoiceItem
    InvoiceItem facturaLuz = new InvoiceItem("factura de la luz", 1000, 0.3); 
    InvoiceItem facturaAgua = new InvoiceItem("factura del agua", 30, 0.08);
    
    //  muestra los contenidos de ambas instancias
    System.out.println(facturaLuz.toString());
    System.out.println(facturaAgua.toString());
    
    //  utiliza el método toString()
    //  utiliza los métodos setter de cantidad y precioUnidad
    //  utiliza el método toString otra vez para comprobar los cambios
    //  utiliza el método getTotal
    }
    
}
