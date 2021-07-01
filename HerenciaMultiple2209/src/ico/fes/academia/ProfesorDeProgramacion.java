/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.academia;

/**
 *
 * @author sayun
 */
public class ProfesorDeProgramacion extends Profesor implements Programador{
    private int aniosExperencia;
    private String lenguajeDeProgramacion;

    public ProfesorDeProgramacion() {
    }

    public ProfesorDeProgramacion(int aniosExperencia, String lenguajeDeProgramacion) {
        this.aniosExperencia = aniosExperencia;
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public ProfesorDeProgramacion(int aniosExperencia, String lenguajeDeProgramacion, String carrera, int antiguedad) {
        super(carrera, antiguedad);
        this.aniosExperencia = aniosExperencia;
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public ProfesorDeProgramacion(int aniosExperencia, String lenguajeDeProgramacion, String carrera, int antiguedad, String nombre, int edad) {
        super(carrera, antiguedad, nombre, edad);
        this.aniosExperencia = aniosExperencia;
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public String getLenguajeDeProgramacion() {
        return lenguajeDeProgramacion;
    }

    public void setLenguajeDeProgramacion(String lenguajeDeProgramacion) {
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public int getAniosExperencia() {
        return aniosExperencia;
    }

    public void setAniosExperencia(int aniosExperencia) {
        this.aniosExperencia = aniosExperencia;
    }

    @Override
    public String toString() {
        return super.toString() +  " ProfesorDeProgramacion{" + "aniosExperencia=" + aniosExperencia + ", lenguajeDeProgramacion=" + lenguajeDeProgramacion + '}';
    }

    @Override
    public int programar() {
        System.out.println("Programando en el lenguaje: " + this.lenguajeDeProgramacion);
        return 1;
    }

    @Override
    public void probarCodigo() {
        System.out.println("Probando el código recien escrito...");
    }
    
    
}
