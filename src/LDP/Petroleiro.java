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
 public class Petroleiro extends Navios {
 private float carga;
 public Petroleiro(String matricula) { 
     super(matricula);
 }
public float getCarga() { 
    return carga;
}
 public void setCarga(float carga) {
      this.carga = carga; 
 }
}
