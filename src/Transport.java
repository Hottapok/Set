import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Transport {
    private String brand;
    private String model;
    private double engine;
    private final Set<Driver<?>> drivers=new HashSet<>();
    private final Set<Mechanic<?>> mechanics=new HashSet<>(){};
    private final Set<Sponsor> sponsors=new HashSet<>();

    public Transport(String brand, String model, double engine) {
        setBrand(brand);
        setModel(model);
        setEngine(engine);

    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand != null &&  !brand.isBlank()) {
            this.brand = brand;
        }else {
            this.brand="Не верно введено значение";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model!= null && !model.isBlank()){
            this.model = model;
        }else {
            this.model="Не верно введено значение";
        }
    }

    public double getEngine() {
        return engine;
    }
    public void setEngine(double engine){
        if (engine == 0) {
            this.engine = 1.5;
        } else {
            this.engine = engine;
        }
    }
    public void addDriver(Driver<?> driver){
        drivers.add(driver);
    }
    public void addDMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }
    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract boolean passDiagnostic();

    public abstract void repair();
}
