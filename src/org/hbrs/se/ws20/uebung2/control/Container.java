package org.hbrs.se.ws20.uebung2.control;

import org.hbrs.se.ws20.uebung2.Exception.ContainerException;
import org.hbrs.se.ws20.uebung2.control.Member;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container {
    // Zum Verwalten der Member (löschen, hinzufügen, ausgeben) verwenden wir eine ArrayList
    private List<Member> memberListe = new ArrayList<Member>();

    public void addMember(Member member) throws ContainerException {
        if ( checkID( member ) == true ) {
            ContainerException ex = new ContainerException();
            ex.addID(member.getID());
            throw ex;
        }
        memberListe.add(member);
    }
    private boolean checkID(Member m) {
        int id =  m.getID();
        for(Member rec : memberListe) {
            if(rec.getID().intValue() == id) {
                return true;
            }
        }
        return false;

    }
    public String deleteMember(int id) {
        Member memberID = getMemberID(id);
        if (memberID == null) {
            return "Kein Member mit dieser ID vorhanden";
        } else {
            memberListe.remove(memberID);
            return "Member " + memberID + " erfolgreich gelöscht.";
        }
    }

    private Member getMemberID(int id) {
        for ( Member rec : memberListe) {
            if (id == rec.getID().intValue()) {
                return rec;
            }
        }return null;
    }

    public void dump() {
        Iterator<Member> i = memberListe.iterator();
        while (  i.hasNext() ) {
            Member m = i.next();
            i.toString();
        }
    }

    public int size(){
        return memberListe.size();
    }


}
