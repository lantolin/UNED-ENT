package com.luisantolin.daw.ent;

public class App 
{
    public static void main( String[] args )
    {
        Logger unLogger = new Logger();
        unLogger.log( "Hello World!" );
        
        unLogger.configure( "[", "]", false );
        unLogger.log( "Hello World!" );
    }
}
