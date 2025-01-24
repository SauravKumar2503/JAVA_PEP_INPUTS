//Create an interface Playable with method play().
//Implement it in classes VideoPlayer and AudioPlayer.
//Demonstrate usage by calling play() on objects of these classes.


// interface Playable {
//     void play();
// }

// class VideoPlayer implements Playable {
//     @Override
//     public void play() {
//         System.out.println("Playing Video");
//     }
// }

// class AudioPlayer implements Playable {
//     @Override
//     public void play() {
//         System.out.println("Playing Audio");
//     }
// }

// public class Interface {
//     public static void main(String[] args) {
//         VideoPlayer videoPlayer = new VideoPlayer();
//         AudioPlayer audioPlayer = new AudioPlayer();
//         videoPlayer.play();
//         audioPlayer.play();
//     }
// }


// Design and develop a context for given case study and implement an interface for Vehicles.
// Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
// functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
// these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
// functionalities in their own class in their own way.


interface Vehicles {
    void gearChange();
    void speedUp();
    void applyBreaks();
}

class Bicycle implements Vehicles {
    @Override
    public void gearChange() {
        System.out.println("Gear Changed for Bicycle");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up Bicycle");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Applying Breaks for Bicycle");
    }
}

class Bike implements Vehicles {
    @Override
    public void gearChange() {
        System.out.println("Gear Changed for Bike");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up Bike");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Applying Breaks for Bike");
    }
}

class Car implements Vehicles {
    @Override
    public void gearChange() {
        System.out.println("Gear Changed for Car");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up Car");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Applying Breaks for Car");
    }
}

public class Interface {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Bike bike = new Bike();
        Car car = new Car();
        bicycle.gearChange();
        bicycle.speedUp();
        bicycle.applyBreaks();
        bike.gearChange();
        bike.speedUp();
        bike.applyBreaks();
        car.gearChange();
        car.speedUp();
        car.applyBreaks();
    }
}

