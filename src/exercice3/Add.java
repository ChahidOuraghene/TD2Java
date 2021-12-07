package exercice3;

public class Add implements Expr {
		private Expr expr1;
		private Expr expr2;
		
		public Add(Expr val1, Expr val2) {
			this.expr1 = val1;
			this.expr2 = val2;
		}

		@Override
		public String toString() {
			return "Add [expr1=" + expr1 + ", expr2=" + expr2 + "]";
		}

		@Override
		public double eval() {
			return this.expr1.eval()+this.expr2.eval();
		}
		
}
