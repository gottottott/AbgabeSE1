package org.hbrs.se.ws20.uebung2.control;

import org.hbrs.se.ws20.uebung2.Exception.ContainerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestContainerStore {

    public static void main(String args[]) throws ContainerException {
        Container container = new Container();
        Member m1 = new MemberKlasse(1);
        Member m2 = new MemberKlasse(2);
        Member m3 = new MemberKlasse(3);
        Member m4 = new MemberKlasse(4);
        Member m5 = new MemberKlasse(5);

        // Test: Container zum Start leer?
        assertEquals(0,container.size());
        // Test: Container nach dem Füllen größer
        container.addMember(m1);

        assertEquals(1,container.size());
        // Test: Container nach dem Füllen größer
        container.addMember(m2);

        assertEquals(2,container.size());
        // Test: Container nach dem Füllen größer
        container.addMember(m3);

        // Test: Container nach dem Füllen größer
        assertEquals(3,container.size());
}

}