/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LDP;

/**
 *
 * @author roger
 */
public class PortaContentores extends Navios{
      private int noContentores;
    public PortaContentores(String matricula) {
          super(matricula);
    }
    public int getNoContentores() {
         return noContentores;
    }
 public void setNoContentores(int noContentores) { 
     this.noContentores = noContentores;
 }
}
