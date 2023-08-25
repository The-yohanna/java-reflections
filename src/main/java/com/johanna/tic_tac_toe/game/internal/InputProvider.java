package com.johanna.tic_tac_toe.game.internal;

interface InputProvider {
    BoardLocation provideNextMove(Board board);
}
