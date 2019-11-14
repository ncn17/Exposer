package cg.ncn.pipesandfilter.Model.emun;

public enum Processeurs {
    I7( "Intel I7" ), I5( "Intel I5" ), I3( "Intel I3" ), AMD( "AMD Vision 5" ), Core2Duo( "Intel Core Dual 2" );

    private String name = "";

    Processeurs( String n ) {
        name = n;
    }

    public String toString() {
        return name;
    }
}
