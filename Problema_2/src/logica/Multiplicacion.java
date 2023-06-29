
package logica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Multiplicacion {
    private String resultado ="\tTabla de Multiplicacion de ("+calcularMultiplicacion()+")\n"
            +"=================================================\n"; 
    
    public String calcularMultiplicacion(){
        String tablaMultiplicacion=""; 
        try {
            File archivoOrigen = new File("origen.txt"); 
             Scanner lectura = new Scanner(archivoOrigen); 
             // para obtener el valor
            File archivoMulti = new File("multiplicacion.txt"); 
            FileWriter archivoes = new FileWriter(archivoMulti, false);  
            BufferedWriter escribirArchivo = new BufferedWriter(archivoes); 
            
           
            
            if (!archivoMulti.exists()) {
                archivoMulti.createNewFile();
                JOptionPane.showMessageDialog(null, "Se ha creado el Archivo");
             }
                
             while (lectura.hasNextLine()) {                
                tablaMultiplicacion = lectura.nextLine();
            } 
            if (archivoOrigen.exists() && archivoOrigen.length()>0 && !archivoMulti.equals(null)) {
                for (int i = 0; i <= 12; i++) {
                this.resultado +=tablaMultiplicacion +" X "+i+" = "+(Integer.parseInt(tablaMultiplicacion)*i+"\n");
                   }  
                this.resultado+="=============================================\n";
                escribirArchivo.newLine();
                escribirArchivo.write(this.resultado);   
                escribirArchivo.newLine();
                escribirArchivo.close();
                
                JOptionPane.showMessageDialog(null, "Se ha generado la tabla de Multiplicacion"); 
                
            }
   
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return tablaMultiplicacion;
    }

    public String getResultado() {
        return resultado;
    }
    
    
}
