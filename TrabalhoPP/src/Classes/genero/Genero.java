/*  
 * Nome: Ivo Lopes Ribeiro  
 * Número: 8130258  
 * Turma: 3 
 *  
 * Nome: Daniel Filipe da Costa Teixeira  
 * Número: 8140360 
 * Turma: 2  
 */
package Classes.genero;

/**
 *
 * @author aluno
 */
public class Genero {
    private String genero;

    /**
     *
     * @param genero
     */
    public Genero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return this.genero;
    }
    
    
}
