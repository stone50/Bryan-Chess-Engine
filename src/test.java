public class test {
    // starting position: rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1

    public static void main(String[] args) {
	Position test = new Position("rnb1k1nr/1ppp1ppp/p2q4/3Np3/1b2P3/3B1NP1/PPPP1P1P/R1BQK2R w KQkq - 5 8");
	test.printLayout();
	System.out.println("Evaluation: " + test.think(0.3, 4));
	System.out.println("Best Move: " + test.getBestMove());
    }
}
