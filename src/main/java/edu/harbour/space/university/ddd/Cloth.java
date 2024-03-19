package edu.harbour.space.university.ddd;

public class Cloth {
    private ClothState state;

    public Cloth() {
        this.state = ClothState.DIRTY;
    }

    public void makeItClean() {
        this.state = ClothState.CLEAN;
    }
}
