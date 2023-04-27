/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytestream2;

import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;


/**
 *
 * @author Student
 */
public class LAB3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            
            try {                
                FileOutputStream file = new FileOutputStream("data.dat");                        
                DataOutputStream output = new DataOutputStream(file);
                output.writeUTF("Jim Henry");
                output.writeInt(30);
                output.writeDouble(65.5);
                output.writeChar('A');
            } catch (FileNotFoundException ex) {
                java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
           
                 try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
               
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}

