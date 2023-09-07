package Builder.setters;
import Builder.car_components.*;

import java.util.List;

public class CarWithSetters {

    // Required properties
    private Engine engine;
    private Fuel fuel;
    private List<Seat> seats;
    private Steering steering;

    // Optional properties
    private AirBags airBags;
    private CentralLock centralLock;
    private MusicSystem musicSystem;
    private SunRoof sunRoof;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public void setSteering(Steering steering) {
        this.steering = steering;
    }

    public void setAirBags(AirBags airBags) {
        this.airBags = airBags;
    }

    public void setCentralLock(CentralLock centralLock) {
        this.centralLock = centralLock;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    public void setSunRoof(SunRoof sunRoof) {
        this.sunRoof = sunRoof;
    }
}

/*
 CarWithSetters carWithSetters = new CarWithSetters();
        carWithSetters.setEngine(engine);
        carWithSetters.setSteering(steering);
        // We forgot to set required properties seats and fuel.
        carWithSetters.setAirBags(airBags);
        carWithSetters.setMusicSystem(musicSystem);
        // Construction completes here.

        // We can just replace the engine with new one.
        carWithSetters.setEngine(new Engine());

we can create objects in tthis way also but lot of problems will occur  which builder pattern will fix

1. Object become mutable itself - after creation of car we are still mutating it like setEngine() changing property of class even after constuction
   In Builder Car Object is immutable we are giving properties to builder and it is building objects for us
2. we are not sure whether we are completely build the object i.e whether we assign mandatory properties or not
   Using Builder will ensure this as we added chech in build method
*/