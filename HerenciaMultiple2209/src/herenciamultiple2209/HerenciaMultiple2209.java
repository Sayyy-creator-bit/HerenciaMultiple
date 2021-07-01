/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamultiple2209;

import ico.fes.academia.ProfesorDeProgramacion;

/**
 *
 * @author sayun
 */
public class HerenciaMultiple2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfesorDeProgramacion profe =new ProfesorDeProgramacion(20, "Java", "ICO", 17, "Jesús", 44);
        profe.comer();
        profe.dormir();
        profe.asistir();
        profe.dictarClase();
        profe.programar();
        profe.probarCodigo();
        System.out.println( profe );
    }
    
}
