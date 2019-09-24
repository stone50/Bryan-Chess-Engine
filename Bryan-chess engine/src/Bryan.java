public class Bryan {
    // starting position: rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1

    public static double depthThreshold = 0.5;

    public static void main(String[] args) {
	Position currentPos = new Position("8/1pk1Q3/3p3r/3Pbp1p/P7/2P1R3/1K1R4/6q1 b - - 6 35");
	currentPos.printLayout();
	currentPos.generateLegalMoves();
	long startTime = System.nanoTime();
	currentPos.think(depthThreshold, 3, true);
	System.out.println();
	System.out.println();
	System.out.println("Final Evaluation: " + currentPos.bestEval);
	System.out.println("Best Move: " + currentPos.translateMove(currentPos.bestMove));
	long endTime = System.nanoTime();
	System.out.println("Time Elapsed: " + ((endTime - startTime) / 1000000000.0) + " seconds");
    }
}