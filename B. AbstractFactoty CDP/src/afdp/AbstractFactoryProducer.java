package afdp;

public class AbstractFactoryProducer {
	public IAbstractFactory getFactoryInstance(String value) {
		
		if(value == "Economics") {
			return new EconomicCarFactory();
		} else if(value == "Luxury") {
			return new LuxuryCarFactory();
		} else
			return null;
	}
}
