package ontologies;

import jade.content.*;

@SuppressWarnings("serial")

public class Exchange implements AgentAction {
	private int type;
	private int price;
	private int units;
	
	// Type getter & setter
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	// Price getter & setter
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// Units getter & setter
	public int getUnits() {
		return units;
	}
	
	public void setUnits(int units) {
		this.units = units;
	}
	
	@Override
	public String toString() {
		return "Exchange {type:" + type + ", price:" + price + 
				", units: " + units + "}";
	}
}
