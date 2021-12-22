package TrafficLights;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public void changeColor(){
        switch (this.color){
            case RED -> this.color = Color.GREEN;
            case GREEN -> this.color = Color.YELLOW;
            case YELLOW -> this.color = Color.RED;
        }
    }

    @Override
    public String toString() {
        return this.color.toString();
    }
}
