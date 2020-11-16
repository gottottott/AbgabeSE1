package org.hbrs.se.ws20.uebung2.Exception;

public class ContainerException extends Exception {
    private Integer id;
    public void printStrackTrace() {
        System.out.println("Das Member-Objekt mit der ID " + this.id + "ist bereits vorhanden!");
    }
    public void addID(Integer id) {
        this.id = id;
    }
}



