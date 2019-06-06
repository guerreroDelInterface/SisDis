// Implementación de la interfaz de servidor que define los métodos remotos
// para completar la descarga de un fichero
package afs;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;

public class ViceReaderImpl extends UnicastRemoteObject implements ViceReader {
    private static final String AFSDir = "AFSDir/";
    private RandomAccessFile fichero;

    public ViceReaderImpl(String fileName, String mode /* añada los parámetros que requiera */)
		    throws RemoteException, FileNotFoundException {
    	fichero = new RandomAccessFile(fileName, mode);
    }
    public byte[] read(int tam) throws RemoteException {
        byte [] arr = new byte[tam];
        
        try {
        	for(int c = 0; fichero.read()!=-1;c++) {
        		arr[c] = fichero.readByte();
        	}
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        return arr;        
    }
    public void close() throws RemoteException {
        return;
    }
}       

