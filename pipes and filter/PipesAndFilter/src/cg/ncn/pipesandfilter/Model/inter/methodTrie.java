package cg.ncn.pipesandfilter.Model.inter;

import cg.ncn.pipesandfilter.Model.emun.Processeurs;

public interface methodTrie {
    public void trieByRam( int capacite );

    public void trieByProcesseur( Processeurs pro );

    public void trieByMarque( String name );

    public void trieByAndCriteria( Critere firstCritere, Critere secondCritere );

    public void trieByOrCriteria( Critere firstCritere, Critere secondCritere );

}
