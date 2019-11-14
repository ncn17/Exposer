package cg.ncn.pipesandfilter.view;

import java.util.List;

import cg.ncn.pipesandfilter.Model.beans.Pc;

public class PcView {

    public void showList( List<Pc> listPc ) {
        System.out.println( "Print list Pc : \n" + listPc );
    }
}
