package cg.ncn.pipesandfilter.Model.filters;

import java.util.ArrayList;
import java.util.List;

import cg.ncn.pipesandfilter.Model.beans.Pc;
import cg.ncn.pipesandfilter.Model.inter.Critere;

public class Ram implements Critere {
    private Integer ram;

    public Ram( Integer ram ) {
        this.ram = ram;
    }

    @Override
    public List<Pc> trie( List<Pc> pcList ) {
        List<Pc> lisTrier = new ArrayList<Pc>();

        for ( Pc computer : pcList ) {
            if ( computer.getRam() == ram ) {
                lisTrier.add( computer );
            }
        }
        return lisTrier;
    }

}
