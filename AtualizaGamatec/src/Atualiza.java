import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import net.jimmc.jshortcut.JShellLink;
import javax.swing.*;  

public class Atualiza {
    public static void main(String[] args) {
    	
    	boolean error = false;
    	JFrame f; 
    	f=new JFrame(); 
    	
        String server = "ftp.embrast.com.br";
        int port = 21;
        String user = "gamatec";
        String pass = "Gamatec@1324";
        String remoteFile = "/atualizacao/gamatec.exe"; 
        String localFile = "C:\\GamatecMobile\\GamatecMobile.exe";

        FTPClient ftpClient = new FTPClient();
        
        JOptionPane.showMessageDialog(f,"Gamatec atualizando, aguarde!!!"); 
        
        try {
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            OutputStream outputStream = new FileOutputStream(localFile);
            ftpClient.retrieveFile(remoteFile, outputStream);
            outputStream.close();
                  
            ftpClient.logout();
            ftpClient.disconnect();
            
            criarAtalho();
        } catch (IOException ioex) {
        	error = true;
            ioex.printStackTrace();
        } 
        
        if (error == true) {
        	JOptionPane.showMessageDialog(f,"Erro ao atualizar o gamatec!");      
        } else {
        	JOptionPane.showMessageDialog(f,"Gamatec Atualizado!");         
        }                        
    }
    
    public static void criarAtalho() {
    	String origem = "C:\\GamatecMobile\\GamatecMobile.exe";
	    String desktop = JShellLink.getDirectory("desktop");
	 
	    JShellLink shortcut = new JShellLink();
	     
	    shortcut.setPath(origem);
	    shortcut.setFolder(desktop);
	    shortcut.setName("Gamatec");
	    //shortcut.setIconLocation("C:\\icone.ico");
	    shortcut.setIconIndex(0);
	    shortcut.save();
    }
}
