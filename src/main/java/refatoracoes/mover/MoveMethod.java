package refatoracoes.mover;



public class MoveMethod {
	// ...

	  public double calculateTotal() {
	    double total = 0;
	    for (Product product : getProducts()) {
	      total += product.quantity * product.price;
	    }
	    total = applyRegionalDiscounts(total);
	    return total;
	  }

	  private double applyRegionalDiscounts(double total) {
		// TODO Auto-generated method stub
		return 0;
	}

	private Product[] getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public double applyRegionalDiscounts(User user, double total) {
	    double result = total;
	    switch (user.getCountry()) {
	      case "US": result *= 0.85; break;
	      case "RU": result *= 0.75; break;
	      case "CN": result *= 0.9; break;
	      // ...
	    }
	    return result;
	  }
	
	public class Product {

		public int price;
		public int quantity;

	}
	
	public class User {
		private String country;
		
		public String getCountry() {
			return this.country;
		}
	}
}


