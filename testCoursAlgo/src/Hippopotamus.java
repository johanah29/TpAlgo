public class Hippopotamus {
    private String name;
    private float weight;
    private float tusksSize;

    public Hippopotamus(String name, float weight, float tusksSize) {
        this.name = name;
        this.weight = weight;
        this.tusksSize = tusksSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getTusksSize() {
        return tusksSize;
    }

    public void setTusksSize(float tusksSize) {
        this.tusksSize = tusksSize;
    }

    public void swim(){
        this.weight = this.weight-300;
    }

    public void eat(){
        this.weight = this.weight+1000;
    }

    public String hippopotamusFight(Hippopotamus hippo){
        if(hippo.getTusksSize() > this.getTusksSize()){
            return hippo.getName() + " is the winner";
        } else {
            return this.getName() + " is the winner";
        }
    }

    @Override
    public String toString() {
        return "Hippo{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", tusksSize=" + tusksSize +
                '}';
    }
}
