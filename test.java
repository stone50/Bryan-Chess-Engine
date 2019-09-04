public class test {
    // starting position: rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1

    public static void main(String[] args) {
	Position test = new Position("rn1q1r2/p4p1k/1p3R2/2ppP1Q1/3P4/2P4P/P1P3P1/1R4K1 w - - 3 3");
	test.printLayout();
	System.out.println("Evaluation: " + test.think(0.3, 4));
	System.out.println("Best Move: " + test.getBestMove());
    }
}
