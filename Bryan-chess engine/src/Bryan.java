public class Bryan {
    // starting position: rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1

    public static void main(String[] args) {
	// long startTime = System.nanoTime();
	Position currentPos = new Position("8/3B2k1/7R/p6K/7b/8/6PP/8 w - - 10 46");
	currentPos.printLayout();
	currentPos.generateLegalMoves();
//	currentPos.think(0.3, 2, true);
//	System.out.println();
//	System.out.println();
//	System.out.println("Final Evaluation: " + currentPos.bestEval);
//	System.out.println("Best Move: " + currentPos.translateMove(currentPos.bestMove));
//	long endTime = System.nanoTime();
//	System.out.println("Time Elapsed: " + ((endTime - startTime)/1000000000.0) + " seconds");

	currentPos.Continue(0.3, 2, 50);
	currentPos.printContinuation();

    }
}