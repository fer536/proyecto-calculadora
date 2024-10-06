package interfaz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * La clase Archivos proporciona funcionalidades para crear, registrar líneas 
 * y limpiar archivos en el sistema de archivos.
 */
public class Archivos {
    private String nombre;
    private File archivo;

    /**
     * Constructor de la clase Archivos.
     * 
     * @param nombre El nombre del archivo.
     */
    public Archivos(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Crea un nuevo archivo en la ruta especificada.
     * 
     * @param ruta La ruta donde se creará el archivo.
     * @throws IOException Si ocurre un error al crear el archivo.
     */
    public void create(String ruta) throws IOException {
        this.archivo = new File(ruta);
        this.archivo.createNewFile();
    }

    /**
     * Obtiene el nombre del archivo.
     * 
     * @return El nombre del archivo.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Registra una línea de texto en el archivo.
     * Si el archivo no existe, no se realiza ninguna acción.
     * 
     * @param linea La línea de texto que se registrará en el archivo.
     * @return true si el registro fue exitoso, false en caso de error.
     */
    public boolean registrar(String linea) {
        try {
            if (archivo.exists()) {
                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(linea);
                pw.flush();
                pw.close();
                return true;
            }
        } catch (IOException ex) {
            System.out.println("error de archivo: " + ex);
        }
        return false;
    }

    /**
     * Elimina el contenido del archivo y lo reinicia.
     * 
     * @return true si la operación fue exitosa, false en caso contrario.
     */
    public boolean limpiarArchivo() {
        try {
            String directorio = archivo.getParent();
            archivo.delete(); // Elimina el archivo actual
            new FileWriter(directorio + "/datos.txt", true); // Crea un nuevo archivo vacío
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Establece el nombre del archivo.
     * 
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el archivo actual.
     * 
     * @return El archivo actual.
     */
    public File getArchivo() {
        return archivo;
    }

    /**
     * Establece un nuevo archivo.
     * 
     * @param archivo El archivo a establecer.
     */
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
}
