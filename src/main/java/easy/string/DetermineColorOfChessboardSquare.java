package easy.string;

import static java.lang.Character.digit;

public class DetermineColorOfChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        int i = coordinates.charAt(0) - 'a';
        if (i % 2 == 0)
            return digit(coordinates.charAt(1), 10) % 2 == 0;
        else
            return digit(coordinates.charAt(1), 10) % 2 != 0;
    }
}
