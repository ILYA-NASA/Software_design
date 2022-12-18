package Software_architecture.ModelElements;

abstract public class Model {
    
    protected id;
    protected location;
    protected angle;

    public Model(id, location, angle) {
        this.id = id;
        this.location = location;
        this.angle = angle;
    }

    abstract public void move();
    abstract public void rotate();

}
