package exercice3;

public class Value implements Expr {
		private  double valeur;
		
		public Value (double valeur) {
			this.valeur=valeur;
		}

		@Override
		public double eval() {
			return valeur;
		}
		
}
