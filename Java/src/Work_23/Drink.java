package Work_23;

public final class Drink implements Item {
    private float cost;
    private String name;
    private String discription;

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    private static final float DEFAULT_COST = 0.0f;
    public Drink(String name, String discription){
        this.name = name;
        this.discription = discription;
        this.cost = DEFAULT_COST;
    }
    public Drink(String name, String discription, float cost){
        this.name = name;
        this.discription = discription;
        this.cost = cost;
    }
    public float getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return discription;
    }
}

