package cg.ncn.pipesandfilter.Main;

import java.util.ArrayList;
import java.util.List;

import cg.ncn.pipesandfilter.Model.beans.Pc;
import cg.ncn.pipesandfilter.Model.emun.Processeurs;
import cg.ncn.pipesandfilter.Model.filters.Ram;
import cg.ncn.pipesandfilter.controller.PcController;

/**
 * 
 * @author atir17 nkounkou clerc nicephore
 */
public class Main {

    public static void main( String[] args ) {

        PcController controller = new PcController( getList() );

        controller.updateView();

        controller.trieByMarque( PcController.MAC );

        controller.updateView();

        controller.trieByProcesseur( Processeurs.I5 );

        controller.updateView();

        controller.trieByOrCriteria( new Ram( 6 ), new Ram( 4 ) );

        controller.updateView();

    }

    public static List<Pc> getList() {
        List<Pc> listPc = new ArrayList<Pc>();
        listPc.add( new Pc( "MAC", Processeurs.I7, 8 ) );
        listPc.add( new Pc( "HP", Processeurs.I5, 4 ) );
        listPc.add( new Pc( "HP", Processeurs.I5, 6 ) );
        listPc.add( new Pc( "MAC", Processeurs.I7, 16 ) );
        listPc.add( new Pc( "MAC", Processeurs.AMD, 8 ) );
        listPc.add( new Pc( "HP", Processeurs.I5, 4 ) );
        listPc.add( new Pc( "HP", Processeurs.I7, 16 ) );
        listPc.add( new Pc( "HP", Processeurs.AMD, 8 ) );

        return listPc;
    }

}
