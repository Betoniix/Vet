package DAO;

import java.io.File;

/**
 *
 * @author migue
 */
public abstract class GeneralDao<T>{
    private String Pathgeneral;
    private String carpetaPrincicalPath;
    private String usuariosPath;
    private String pacientesPath;
    private File carpetaRaiz;
    private File carpetaUsuario;
    private File carpetaPaciente;
    private File archvioUsuario;
    protected File pacientes;
    
    public GeneralDao(){
        this.Pathgeneral = System.getProperty("user.home");
        generarRepositorio();
    }
    
    public void generarRepositorio(){
        //PATH de las carpetas
        carpetaPrincicalPath = Pathgeneral + "\\Documents\\Veterinaria";
        usuariosPath = carpetaPrincicalPath + "\\Usuarios";
        pacientesPath = carpetaPrincicalPath + "\\Pacientes";
        
        carpetaRaiz = new File(carpetaPrincicalPath);
        carpetaUsuario = new File(usuariosPath);
        carpetaPaciente = new File(pacientesPath);
        
        //Verifica si existe la carpeta raiz: de no ser, la crea junto a las demas
        if(!carpetaRaiz.exists()){
            carpetaRaiz.mkdir();
            carpetaUsuario.mkdir();
            carpetaPaciente.mkdir();
        }
              
    }

    public File getCarpetaPaciente() {
        return carpetaPaciente;
    }

    public String getUsuariosPath() {
        return usuariosPath;
    }

    public String getPacientesPath() {
        return pacientesPath;
    }

    public File getCarpetaUsuario() {
        return carpetaUsuario;
    }

    public File getArchvioUsuario() {
        return archvioUsuario;
    }
    
    
    
}
