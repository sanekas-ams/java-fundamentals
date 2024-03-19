package edu.harbour.space.university.ddd;

import java.util.List;

public class WashingMachine {

    public void washClothes(List<Cloth> clothes) {
        for (Cloth cloth : clothes) {
            cloth.makeItClean();
        }
    }
}
