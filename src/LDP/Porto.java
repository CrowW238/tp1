/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LDP;

import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class Porto {
   
    ArrayList<Navios> navio;
    Navios[] navios;
    private int ct;
    private int noMaxNavios;

    public Porto(int noMaxNavios) {
        ct = 0;
        this.noMaxNavios = noMaxNavios;
        navios = new Navios[noMaxNavios];
        navio = new ArrayList<Navios>(noMaxNavios);
    }

    public int getNoMaxNavios() {
        return noMaxNavios;
    }

    public Navios[] getNavios() {
        return navios;
    }

    public void addNavio(Navios n) {

        if (ct == noMaxNavios) {
            System.out.println("Número máximo de navios (" + noMaxNavios + ") Atingido!!");
        }
        boolean confirma = false;
        for (Navios nave : navio) {
            if (n.equals(nave.getMatricula())) {
                System.out.println("Navio já existe!!");
                confirma = true;
            }

            if (!confirma) {
                navio.add(nave);
                ct++;
            }

        }

    }
     
   

    public int getCapacidadeTotalContentores() {

        int total = 0;
        for (Navios p : navio) {
            if (p instanceof PortaContentores) {
                total += ((PortaContentores) p).getNoContentores();
            }
            
        }

        return total;
    }

    public int getCapacidadeDeCarga() {
        int total = 0;
        for (Navios p : navio) {
            if (p instanceof PortaContentores) {
                total += ((PortaContentores) p).getNoContentores() * 10;
            }
            if (p instanceof Petroleiro) {
                total += (( Petroleiro) p).getCarga() * 10;
            }
        }
        return total; }
     public static void main(String[] args) {
        Porto porto = new Porto(5);

        Petroleiro petro1 = new Petroleiro("P1"); petro1.setCarga(23);

        PortaContentores pConta1 = new PortaContentores("PC01"); pConta1.setNoContentores(23);

        PortaContentores pConta2 = new PortaContentores("PC02"); pConta2.setNoContentores(54);

        Navios n = new Navios("N01");

        Petroleiro petro2 = new Petroleiro("P2"); petro2.setCarga(240);

        porto.addNavio(petro1);
        porto.addNavio(petro2);
        porto.addNavio(pConta1);
        porto.addNavio(pConta2);
        porto.addNavio(n);
   
        System.out.println("Capacidade total = " + porto.getCapacidadeTotalContentores() + " toneladas.");
        System.out.println("contentores total = " + porto.getCapacidadeDeCarga());
    }
}
    

 