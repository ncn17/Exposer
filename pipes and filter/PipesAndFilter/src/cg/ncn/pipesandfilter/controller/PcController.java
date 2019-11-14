package cg.ncn.pipesandfilter.controller;

import java.util.List;

import cg.ncn.pipesandfilter.Model.beans.Pc;
import cg.ncn.pipesandfilter.Model.emun.Processeurs;
import cg.ncn.pipesandfilter.Model.filters.AndCritere;
import cg.ncn.pipesandfilter.Model.filters.Hp;
import cg.ncn.pipesandfilter.Model.filters.Mac;
import cg.ncn.pipesandfilter.Model.filters.OrCritere;
import cg.ncn.pipesandfilter.Model.filters.Processeur;
import cg.ncn.pipesandfilter.Model.filters.Ram;
import cg.ncn.pipesandfilter.Model.inter.Critere;
import cg.ncn.pipesandfilter.Model.inter.methodTrie;
import cg.ncn.pipesandfilter.view.PcView;

public class PcController implements methodTrie {
    public static final String MAC  = "MAC";
    public static final String HP   = "HP";

    PcView                     view = new PcView();
    List<Pc>                   listPc;

    public PcController( List<Pc> listPc ) {
        this.listPc = listPc;
    }

    public PcView getView() {
        return view;
    }

    public void setView( PcView view ) {
        this.view = view;
    }

    public List<Pc> getListPc() {
        return listPc;
    }

    public void setListPc( List<Pc> listPc ) {
        this.listPc = listPc;
    }

    @Override
    public void trieByRam( int capacite ) {
        Ram ram = new Ram( capacite );
        this.listPc = ram.trie( listPc );
    }

    @Override
    public void trieByProcesseur( Processeurs pro ) {
        Processeur proc = new Processeur( pro );
        this.listPc = proc.trie( listPc );
    }

    @Override
    public void trieByMarque( String name ) {
        if ( name.equalsIgnoreCase( "MAC" ) ) {
            Mac mac = new Mac();
            this.listPc = mac.trie( listPc );
        } else {
            this.listPc = ( new Hp() ).trie( listPc );
        }
    }

    @Override
    public void trieByAndCriteria( Critere firstCritere, Critere secondCritere ) {
        AndCritere andCriteria = new AndCritere( firstCritere, secondCritere );
        this.listPc = andCriteria.trie( listPc );
    }

    @Override
    public void trieByOrCriteria( Critere firstCritere, Critere secondCritere ) {
        OrCritere orCritere = new OrCritere( firstCritere, secondCritere );
        this.listPc = orCritere.trie( listPc );
    }

    // view zone

    public void updateView() {
        view.showList( listPc );
    }

}
