package cg.ncn.pipesandfilter.Model.filters;

import java.util.ArrayList;
import java.util.List;

import cg.ncn.pipesandfilter.Model.beans.Pc;
import cg.ncn.pipesandfilter.Model.inter.Critere;

public class Mac implements Critere {

    @Override
    public List<Pc> trie( List<Pc> pcList ) {
        List<Pc> lisTrier = new ArrayList<Pc>();

        for ( Pc computer : pcList ) {
            if ( computer.getMarque().equalsIgnoreCase( "MAC" ) ) {
                lisTrier.add( computer );
            }
        }
        return lisTrier;
    }

}
