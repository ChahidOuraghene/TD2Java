package exercice3;

public class Square implements Expr {
		private Expr expr;
		
		public Square(Expr val1) {
			this.expr = val1;
		}

		@Override
		public String toString() {
			return "Square [expr=" + expr + "]";
		}

		@Override
		public double eval() {
			return Math.sqrt(expr.eval());
		}
		
}
