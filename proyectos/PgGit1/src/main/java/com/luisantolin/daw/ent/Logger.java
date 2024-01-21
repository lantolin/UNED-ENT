package com.luisantolin.daw.ent;

import java.sql.Timestamp;

/**
 * Clase para formatear los mensajes de log de una manera uniforme. Para configurar el formato de los mensajes se usa el metodo
 * Logger.configure() <br>
 * Ejemplo de uso: <br>
 * <code>Logger l = new Logger();
 *  l.log("hola logger");</code>
 * 
 * @author lantolin
 *
 */
public class Logger {
    private String  decorationPrefix = "##### ";
    private String  decorationSuffix = " #####";
    private boolean useTimestamp     = true;

    public Logger() {

    }

    /**
     * Configura el formato de mensajes de forma persistente
     * 
     * @param prefix       texto que se pone antes del mensaje, no se le añaden espacios
     * @param suffix       texto que se pone despues del mensaje, no se le añaden espacios
     * @param useTimestamp determina si se imprime un timestamp o no antes del prefijo <br>
     *                     Ejemplo de uso:<br>
     *                     <code> l.configure( "A", "B", false );
     *        l.log("hola");</code><br>
     * 
     *                     Daria lugar a: <br>
     *                     <code>AholaB</code>
     */
    public void configure( String prefix, String suffix, boolean useTimestamp ) {
        this.decorationPrefix = prefix;
        this.decorationSuffix = suffix;
        this.useTimestamp = useTimestamp;
    }

    /**
     * Imprime por consola un mensaje, decorandolo con los elementos que se configuran en la clase, usando el método configure()
     * 
     * @param message el mensaje a imprimir
     */
    public void log( String message ) {
        String temp = decorate( message );
        System.out.println( temp );
    }

    private String decorate( String mess ) {
        String decoratedMessage = this.decorationPrefix + mess + this.decorationSuffix;

        String timestamp = "";
        if ( useTimestamp ) {
            timestamp = calculateTimestamp();
            timestamp += ": ";
        }

        return timestamp + decoratedMessage;
    }

    private String calculateTimestamp() {
        Timestamp timestamp = new Timestamp( System.currentTimeMillis() );
        return timestamp.toString();
    }

}
