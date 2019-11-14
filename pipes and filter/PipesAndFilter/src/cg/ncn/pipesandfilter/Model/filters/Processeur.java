package cg.ncn.pipesandfilter.Model.filters;

import java.util.ArrayList;
import java.util.List;

import cg.ncn.pipesandfilter.Model.beans.Pc;
import cg.ncn.pipesandfilter.Model.emun.Processeurs;
import cg.ncn.pipesandfilter.Model.inter.Critere;

public class Processeur implements Critere {
    private Processeurs type;

    public Processeur( Processeurs type ) {
        this.type = type;
    }

    public Processeurs getType() {
        return type;
    }

    public void setType( Processeurs type ) {
        this.type = type;
    }

    @Override
    public List<Pc> trie( List<Pc> pcList ) {
        List<Pc> lisTrier = new ArrayList<Pc>();

        for ( Pc computer : pcList ) {
            if ( computer.getProcesseur() == type ) {
                lisTrier.add( computer );
            }
        }
        return lisTrier;
    }

}
