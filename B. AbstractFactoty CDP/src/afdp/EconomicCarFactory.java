package afdp;

public class EconomicCarFactory implements IAbstractFactory {

	@Override
	public ICar getInstance(int price) {
		// TODO Auto-generated method stub
		
		if(price  <= 300000)
			return new EconomicCar1();
		else if(price > 300000)
			return new EconomicCar2();
		return null;
	}

}
