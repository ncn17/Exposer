package cg.ncn.pipesandfilter.Model.beans;

import cg.ncn.pipesandfilter.Model.emun.Processeurs;

public class Pc {
    private String      Marque;
    private Processeurs processeur;
    private Integer     ram;

    @Override
    public String toString() {
        return "\nPc : Marque=" + Marque + ", processeur=" + processeur + ", ram=" + ram + " \n";
    }

    public Pc() {
    }

    public Pc( String marque, Processeurs processeur, Integer ram ) {
        Marque = marque;
        this.processeur = processeur;
        this.ram = ram;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque( String marque ) {
        Marque = marque;
    }

    public Processeurs getProcesseur() {
        return processeur;
    }

    public void setProcesseur( Processeurs processeur ) {
        this.processeur = processeur;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam( Integer ram ) {
        this.ram = ram;
    }

}
