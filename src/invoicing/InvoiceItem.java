package invoicing;

/**
 *
 * @author Mikolaj
 */
public class InvoiceItem {
    private static int idCounter = 0;
    private final int id;
    private String desc;
    private int cantidad;
    private double precioUnidad;
    private int clientes;
    
    public InvoiceItem (String desc, int cantidad, double precioUnidad){
        this.desc = desc;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        
        InvoiceItem.idCounter++;
        this.id = InvoiceItem.idCounter;
    }
    //  crea getters para: id, desc, cantidad, precioUnidad;
    
    //  crea setters para: cantidad, precioUnidad, clientes;
    
    //  crea el método getTotal que devuelve el valor cantidad * precioUnidad
    
    /*  
        sobreescribe el método nativo toString() para que devuelva texto
        formateado de la siguiente manera:
        "InvoiceItem[
            id=..., 
            desc=..., 
            cantidad=..., 
            precioUnidad=...,
            clientes=...,
        ]"
        para crear nuevas líneas utiliza \n,
        para crear tabulaciones utiliza \t
    */
    @Override
    public String toString(){
        return "InvoiceItem["
                + "\n\tid= " + this.id + ","
                + "\n\tdesc= " + this.desc + ","
                + "\n\tprecioUnidad= " + this.precioUnidad + ","
                + "\n]";
    }
}
