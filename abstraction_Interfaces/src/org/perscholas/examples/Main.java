package org.perscholas.examples;

import org.perscholas.examples.service.IceCreamServiceImpl;


//class example for abstraction and interfaces
public class Main {
    public static void main(String[] args) {
        IceCreamServiceImpl iceCreamService = new IceCreamServiceImpl();
        System.out.println( iceCreamService.getAllIceCreams() );
    }
}
