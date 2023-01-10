package com.daniel.chess.engine.player;

import com.daniel.chess.engine.board.Board;
import com.daniel.chess.engine.board.Move;
import com.daniel.chess.engine.pieces.Piece;

import java.util.Collection;

public class BlackPlayer extends Player{

    public BlackPlayer(Board board,
                       Collection<Move> whiteStandardLegalMoves,
                       Collection<Move> blackStandardLegalMoves) {
        super();

    }

    @Override
    public Collection<Piece> getActivePieces() {
        return this.board.getBlackPieces();
    }
}
