//Its Factory of Factory
package afdp;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactoryProducer abstractFactoryProducerOb = new AbstractFactoryProducer();
		IAbstractFactory IabstractFactoryOb = abstractFactoryProducerOb.getFactoryInstance("Luxury");
		ICar IcarOb = IabstractFactoryOb.getInstance(5000000);
		System.out.println(IcarOb.getTopSpeed());
	}

}
