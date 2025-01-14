package ru.job4j.chess;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.assertj.core.api.Assertions.*;

public class BishopBlackTest {
    @Test
    public void whenPositionBishopBlack() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        bishopBlack.position();
        assertThat(bishopBlack.position()).isEqualTo(Cell.G5);
    }

    @Test
    public void whenMoveBishopBlack() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F4);
        bishopBlack.copy(Cell.H6);
        assertThat(bishopBlack.copy(Cell.H6).position()).isEqualTo(Cell.H6);
    }

    @Test
    public void whenWayBishopBlack() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        Cell[] steps = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5)).isEqualTo(steps);
    }
}

