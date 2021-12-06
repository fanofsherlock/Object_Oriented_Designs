package designs.chess_advanced.chess.moves;

import designs.chess_advanced.chess.conditions.MoveBaseCondition;
import designs.chess_advanced.chess.conditions.PieceCellOccupyBlocker;
import designs.chess_advanced.chess.conditions.PieceMoveFurtherCondition;
import designs.chess_advanced.chess.model.Board;
import designs.chess_advanced.chess.model.Cell;
import designs.chess_advanced.chess.model.Piece;
import designs.chess_advanced.chess.model.Player;

import java.util.List;

public class PossibleMovesProviderDiagonal extends PossibleMovesProvider {


    public PossibleMovesProviderDiagonal(int maxSteps, MoveBaseCondition baseCondition,
                                         PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
        super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
    }

    @Override
    protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        return null;
    }
}
