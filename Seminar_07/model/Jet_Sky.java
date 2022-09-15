package model;

public class Jet_Sky extends Transport{
    private final String body_type;
    private final String body_material;
    private final String intake_system;

    public Jet_Sky(Engine engine, Chassis chassis, String body_type, String body_material, String intake_system) {
        super(engine, chassis);
        this.body_type = body_type;
        this.body_material = body_material;
        this.intake_system = intake_system;
    }
}
