package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	public Dolphin (int nrOfLegs, String name, int avgSwimDepth,WaterType waterType, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Dolphin(){
		super(3.5, 0.1);
		setNrOfLegs(0);
		setName("Dolphin");
		setAvgSwimDepth(200);
		setWaterType(WaterType.SALTWATER);
	}


}
