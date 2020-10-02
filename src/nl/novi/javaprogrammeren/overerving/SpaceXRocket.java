package nl.novi.javaprogrammeren.overerving;

public class SpaceXRocket extends Rocket {

    // We roepen hier de constructor aan van Rocket
    public SpaceXRocket(int maximumFuel) {
        super(maximumFuel);
    }

    @Override
    public int calculateMetersFlown(int fuel) {

        return super.calculateMetersFlown(fuel) + fuel * 50;
    }
}
