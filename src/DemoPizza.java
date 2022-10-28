
public class DemoPizza {

	public static void main(String[] args) 
	{
		Pizza p1 = new Pizza("Sausage and onion", 14.99);
		Pizza p2 = new Pizza("Green pepper", 12.99);
		
		DeliveryPizza p3 = new DeliveryPizza("cheese", 11.99, "22 Acorn");
		DeliveryPizza p4 = new DeliveryPizza("pepperoni, sausage, and pineapple", 19.50, "47 oak");
		p1.display();
		p2.display();
		p3.display();
		p4.display();
	}

}
