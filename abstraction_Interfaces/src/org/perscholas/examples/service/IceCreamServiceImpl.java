package org.perscholas.examples.service;

import org.perscholas.examples.model.IceCream;
import java.util.ArrayList;
import java.util.List;

public class IceCreamServiceImpl implements IceCreamService {
    @Override
    public IceCream getIceCream() {
        // return new IceCream(/* fill info here *?)
        IceCream iceCream = new IceCream("Cookies and Cream", "Haagen Dasz", true, 6.99, true);
        return iceCream;
    }
    @Override
    public List<IceCream> getAllIceCreams() {
        IceCream benAndJerries = new IceCream("Chunky Caramel", "Ben and Jerries", true, 10.00, true);
        IceCream butterPecan = new IceCream("Butter Pecan", "Haagen Dasz", true, 6.99, true);
        ArrayList<IceCream> listOfIceCreams = new ArrayList<IceCream>();
        listOfIceCreams.add(benAndJerries);
        listOfIceCreams.add(butterPecan);
        return listOfIceCreams;
    }
}
