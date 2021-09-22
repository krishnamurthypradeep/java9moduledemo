package car;

public class ModularCar {
	
	private final String make;
	
	private final String model;
	
	private final String colour;
	
	private final double engine_size;

	public ModularCar(String make, String model, String colour, double engine_size) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.engine_size = engine_size;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColour() {
		return colour;
	}

	public double getEngine_size() {
		return engine_size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ModularCar [make=");
		builder.append(make);
		builder.append(", model=");
		builder.append(model);
		builder.append(", colour=");
		builder.append(colour);
		builder.append(", engine_size=");
		builder.append(engine_size);
		builder.append("]");
		return builder.toString();
	}
	
	

}
