package invoicing;

/**
 *
 * @author Mikolaj
 */
public class InvoiceItem {
    private String id;
    private String desc;
    private int cantidad;
    private double precioUnidad;
    private int clientes;
    
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
}
