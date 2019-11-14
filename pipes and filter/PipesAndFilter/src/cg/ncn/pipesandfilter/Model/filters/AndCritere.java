package cg.ncn.pipesandfilter.Model.filters;

import java.util.ArrayList;
import java.util.List;

import cg.ncn.pipesandfilter.Model.beans.Pc;
import cg.ncn.pipesandfilter.Model.inter.Critere;

public class AndCritere implements Critere {
    private Critere firstCritere;
    private Critere secondCritere;

    public AndCritere( Critere firstCritere, Critere secondCritere ) {
        this.firstCritere = firstCritere;
        this.secondCritere = secondCritere;
    }

    @Override
    public List<Pc> trie( List<Pc> pcList ) {
        List<Pc> listTrier = new ArrayList<Pc>();

        listTrier = firstCritere.trie( pcList );

        return secondCritere.trie( listTrier );

    }

}
