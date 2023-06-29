
package Dato;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuario {
    
    private String usuario;
    private String password; 
    private String nombre; 
    private String correo; 
    private int estado; 

    public Usuario() {
    }

    public Usuario(String usuario,String password, String nombre, String correo, int estado) {
        this.password = password;
        this.nombre = nombre;
        this.correo = correo;
        this.estado = estado;
        this.usuario= usuario;
    }
     public String getUsuario() {
        return this.usuario;
    }

    public  void setUsuario(String aUsuario) {
        this.usuario = aUsuario;
    }
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    /**
     * Este metodo hace una insercion hacia el documento archivo.txt. 
     * este metodo ingresa un objeto usuario . 
     * 
     * @since Java-8 
     * @return retorna un true si se inserto en el documento txt el usuario y un false si no se inserto nada.
     * @throws si ocurre un error como la creacion la creacion de un archivo 
     */
    public boolean insertarUsuario(File archivo){
        boolean encontrado = false;
        try {
            
            Scanner lectura = new Scanner(archivo); 
            FileWriter writer = new FileWriter(archivo,true);
            BufferedWriter archivoEs = new BufferedWriter(writer); 
           
            if (!archivo.exists()){
                archivo.createNewFile();        
            }
            else if(archivo.exists()){ 
                archivoEs.write(this.toString());  
                archivoEs.newLine(); 
                archivoEs.close();    
                              
                encontrado = true;
            }
        } catch (Exception e) { 
            encontrado = false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return encontrado;
    }
    /**
     * Este metodo es la que mostrara un tipo de tableModel con el contenido del archivo . la idea es hacer que con los metodos
     * como toString() haga algo similar a esto con el metodo .split() usuario (,separador)  password (,separador)... 
     * 
     * se haria con cada interacion del arreglo .
     * y asi sucesivamente. 
     * 
     * @param archivo
     * @return el metodo retornara las lineas del archivo para asi con el metodo split agregarlo en un modeloTabla con cada 
     * interacion
     */
    public DefaultTableModel mostrarUsuarios(File archivo ){
//        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Usuario","Password", "Nombre", "Correo", "Estado"}); 
        String linea;

        try {
            // esto lee el archivo 
            BufferedReader buferedR = new BufferedReader(new FileReader(archivo));
//                   Recorre linea por linea..
            while ((linea = buferedR.readLine()) != null) {
                String[] parts = linea.split(",");
                modelo.addRow(parts); 
                
            }      
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return modelo;
    }
    
    /**
     * Este es el metodo buscar usuario , se utiliza para buscar por ejemplo en esta caso utilice 
     * el parametro como un idUsuario en este caso el string usuario para compararlo con las lineas del documento txt 
     * 
     * Utilice la clase BufferedReader con la instanciacion de FileReader (nameArchivo) 
     * que lo que hace es que lee los archivo linea por linea . y asi mediante un bucle leerlo. 
     * 
     * @param archivo este permite leer el archivo al cual se va leer...
     * @param usuarioEncontrar permite buscar la palabra a Buscar...
     * @return Retorna el modelo que se mostrar en al tabla. 
     */
    
    public DefaultTableModel  buscarUsuario(File archivo ,String usuarioEncontrar){
         DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Usuario","Password", "Nombre", "Correo", "Estado"}); 
        
        String linea ;
        String lineaEncontrada=null;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));  
            while ((linea= lector.readLine())!=null) {                
                if (linea.contains(usuarioEncontrar)) {
                    lineaEncontrada= linea; 
                    modelo.addRow(linea.split(","));
                } 
            }  
            if(lineaEncontrada==null) JOptionPane.showMessageDialog(null, "Usuario no Encontrado !");
            lector.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return modelo;
    }
    /** Metodo que hace un UPDATE modificacion de un usurio Especifico . este metodo
     * hara una busca completa en el archivo y lo ira agregando al arraylist que luego 
     * hara un tipo de copia(del archivo ) segun si la condicion sea verdadera si se encuentra  
     * se agrega el nuevo usuario si no simplemente hara una copia normal del archivo. 
     * 
     * @param archivo parametro del archivo que deseas leer par asi luego hacer la copia con el arraylist 
     * @param usuarioTable hace la busca por (Usuario) 
     * @param usuario objeto usuario que llama al metodo toString() que es la linea insertar
     * @return retorna una copia del archivo en un arraylist .
     */
    public ArrayList<String> modificarUsuario (File archivo ,String usuarioTable,Object usuario){
        ArrayList<String> elementos = new ArrayList<>(); 
        try {
            BufferedReader buferO= new BufferedReader(new FileReader(archivo));                
            String linea ; 
            boolean usuarioEncontrado=false;
           
                while ((linea =buferO.readLine())!= null) {  
                    
                    String [] parteLinea = linea.split(","); 
                    if (parteLinea[0].contentEquals(usuarioTable)==true && (usuarioEncontrado==false)) {
                        elementos.add(usuario.toString());
                        usuarioEncontrado = true;  
                        JOptionPane.showMessageDialog(null, "Se ha modificado Correctamente!");
                        continue;
                    } 
                    else {
                      elementos.add(linea);  
                    }                    
                } 
                buferO.close();
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return elementos;
    }
    /**
     * Metodo de eliminacion de usuario : hace una busqueda en el archivo que si se encuentra 
     * eliminara el usuario del archivo o no sera incluido en la nueva lista de usuario. 
     * 
     * @param archivo archivo a leer donde buscara los usuario.
     * @param usuarioTable nombre del usuario eliminar . 
     * @return retornara una arraylist que sera la nueva lista de usuario que se escribiria en el archivo  
     * este metodo retornara la lista de usuario agregados a la Arraylist.
     */
    public ArrayList<String> eliminarUsuario (File archivo ,String usuarioTable){
        ArrayList<String> elementos = new ArrayList<>(); 
        try {
            BufferedReader buferO= new BufferedReader(new FileReader(archivo));                
            String linea ; 
            boolean usuarioEncontrado=false;
           
                while ((linea =buferO.readLine())!= null) {  
                    
                    String [] parteLinea = linea.split(","); 
                    if (parteLinea[0].contentEquals(usuarioTable)==true && (usuarioEncontrado==false)) {
                        usuarioEncontrado = true;  
                        JOptionPane.showMessageDialog(null, "Se ha Eliminado Correctamente!");
                        continue;
                    } 
                    else {
                      elementos.add(linea);  
                    }                    
                } 
                buferO.close();
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return elementos;
    } 
    
    /**
     * Metodo que hace una busqueda en el archivo y lo agrega a una tabla temporal y lo muestra si 
     * encontro el usuario y password . 
     * 
     * @param archivo pasar como parametro un archivo que es donde buscara si existe tal usuario y password
     * @param usuario nombre de usuario a bucar .
     * @param password password del usuario validar.
     * @return  retorna un modelo de tabla .
     */
    public DefaultTableModel  validarUsuario(File archivo ,String usuario , String password){
         DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Usuario","Password", "Nombre", "Correo", "Estado"}); 
        
        String linea ;
        String lineaEncontrada=null;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));  
            while ((linea= lector.readLine())!=null) {  
               String parts [] = linea.split(",");  
               
                if (linea.contains(usuario) && (parts[1].contains(password))){
                    lineaEncontrada= linea; 
                    modelo.addRow(linea.split(",")); 
                } 
            }  
            if(lineaEncontrada==null) JOptionPane.showMessageDialog(null, "Usuario Y contraseña no validado! !");
            if(lineaEncontrada!=null) JOptionPane.showMessageDialog(null, "Usuario Encontrado y contraseña Validada!");
            lector.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return modelo;
    }
    
    @Override
    public String toString() { 
        return this.usuario+","+this.password+","+this.nombre+","+this.correo+","+this.estado;
    }

  
    
    
    
}
