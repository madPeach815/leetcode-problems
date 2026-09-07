//1603

/* Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size */
class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    // int big, int dedium, int small shows the number of space are given. 
    //so if I call this ParkingSystem parkingLot = new ParkingSystem(10, 10, 10);
    //That means in this parking lot it has 10 spots for big cars, 10 spots for medium cars, 10 spots for small cars.  
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    /* Checks whether there is a parking space of carType for the car that wants to get into the parking lot. carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively. A car can only park in a parking space of its carType. If there is no space available, return false, else park the the car in that size space and return true */
    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        }else if (carType == 2 && medium > 0) {
            medium--;
            return true;
        }else if (carType == 3 && small > 0) {
            small--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
