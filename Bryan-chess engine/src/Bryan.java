public class Bryan {
    // starting position: rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1

    public static void main(String[] args) {
	Position test = new Position("r1b1qrk1/p1p3pp/2p2P2/2bp4/3NnP2/2P1B3/P5PP/RN1Q1RK1 b - - 0 14");
	test.printLayout();
	test.generateLegalMoves();
	test.think(test.getLegalMoves().size() / 100.0, 2, true);
	System.out.println("Final Evaluation: " + test.getBestEval());
	System.out.println("Best Move: " + test.translateMove(test.getBestMove()));
    }
}
