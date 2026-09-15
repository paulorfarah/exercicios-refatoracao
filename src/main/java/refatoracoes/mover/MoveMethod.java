package refatoracoes.mover;



public class MoveMethod {
	// ...


	private Product[] getProducts() {
		// TODO Auto-generated method stub
		return null;
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

		public double applyRegionalDiscounts(double total) {
			double result = total;

			switch (getCountry()) {
				case "US": result *= 0.85; break;
				case "RU": result *= 0.75; break;
				case "CN": result *= 0.9; break;
			}

			return result;
		}
	}
}


