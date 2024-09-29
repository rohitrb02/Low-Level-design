package afdp;

public class LuxuryCarFactory implements IAbstractFactory {

	@Override
	public ICar getInstance(int price) {
		// TODO Auto-generated method stub
		if(price  >= 1000000  && price <= 2000000)
			return new LuxuryCar1();
		else if(price > 2000000)
			return new LuxuryCar2();
		return null;
	}

}
