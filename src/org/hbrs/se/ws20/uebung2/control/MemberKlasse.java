package org.hbrs.se.ws20.uebung2.control;

public class MemberKlasse implements Member{

    private Integer id = null;

    public MemberKlasse( Integer id ){
        this.id = id;
    }

    public Integer getID() {
        return this.id;
    }

    public void setID ( Integer id ) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Member (ID = " + id + " )";
    }



}
