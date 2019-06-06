// Clase de cliente que define la interfaz a las aplicaciones.
// Proporciona la misma API que RandomAccessFile.
package afs;

import java.rmi.*; 

import java.io.*; 


public class VenusFile {
    public static final String cacheDir = "Cache/";
    public VenusFile(Venus venus, String fileName, String mode) throws RemoteException, IOException, FileNotFoundException {
    	File af = new File("Cache/"+fileName);
    	String h;
    	int tam = venus.getBlockSize();
    	byte [] aux = new byte[tam];
    	
    	if (!af.exists()) {
    		
    		FileOutputStream out = new FileOutputStream("Cache/"+fileName);
    		h = venus.getHost();
    		
    		ViceReaderImpl vr = new ViceReaderImpl(fileName, mode);
    		aux = vr.read(venus.getBlockSize());
    		
    		out.write(aux);
    		
    	}
    	
    }
    public int read(byte[] b) throws RemoteException, IOException {
        return 0;
    }
    public void write(byte[] b) throws RemoteException, IOException {
        return;
    }
    public void seek(long p) throws RemoteException, IOException {
        return;
    }
    public void setLength(long l) throws RemoteException, IOException {
        return;
    }
    public void close() throws RemoteException, IOException {
        return;
    }
}

