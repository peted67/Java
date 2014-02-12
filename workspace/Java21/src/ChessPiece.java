
class ChessPiece {
    String color;
    int startingPosition;
}

//This defines a basic description of a chess piece.

class Bishop extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}

//This shows how the chess piece BISHOP has color and starting position, but also adds forward & side movement.

class King extends ChessPiece {
        int forwardMovement;
    int sideMovement;
}