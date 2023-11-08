package dz9;

public abstract class Phone implements Callable<String>, Informable<String>{
     String number;
     String model;
     double weight;


    public Phone() {
        System.out.println("Phone is created");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void info() {
    }

    protected abstract Object getModel();

    protected abstract Object getWeight();

    public String receiveCall(String name){

        return name;
    }

}