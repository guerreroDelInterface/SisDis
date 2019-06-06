// Clase de cliente que inicia la interacción con el servicio de
// ficheros remotos
package afs;

import java.rmi.*; 

public class Venus {
    public Venus() {}
    
    private static String host;
    private static int port;
    private static int blocksize;
    
    public String getHost() {
    	return host;
    }
    
    public int getPort() {
    	return port;
    }
    
    public int getBlockSize() {
    	return blocksize;
    }
    
    
    
    static public void main (String args[]) {
        if (args.length<2) {
            System.err.println("Uso: ClienteEco hostregistro numPuertoRegistro ...");
            return;
        }

        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());

        try {

            
            host = System.getenv("REGISTRY_HOST");
            port = Integer.parseInt(System.getenv("REGISTRY_PORT"));
            blocksize = Integer.parseInt(System.getenv("BLOCKSIZE"));
            
        }
        catch (Exception e) {
            System.err.println("Excepcion en ClienteEco:");
            e.printStackTrace();
        }
    }


    
    
    
    
    
    	  
}

