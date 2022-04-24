/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ta2.practicandonodos;

/**
 *
 * @author Administrador
 */
public class Nodo {
    private Nodo nodoSiguiente;
    private String contenido;

    public Nodo()
    {
        setNodoSiguiente(null);
        setContenido(null);
    }
    public Nodo(String dato)
    {
        setNodoSiguiente(null);
        setContenido(dato);
    }
    public Nodo(String dato, Nodo newNodo)
    {
        setNodoSiguiente(newNodo);
        setContenido(dato);
    }
    
    /**
     * @return the nodoSiguiente
     */
    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    /**
     * @param nodoSiguiente the nodoSiguiente to set
     */
    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}
