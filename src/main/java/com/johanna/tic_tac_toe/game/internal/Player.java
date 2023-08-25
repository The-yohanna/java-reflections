package com.johanna.tic_tac_toe.game.internal;

interface Player {

    void play(Board board, Sign sign);

    String getPlayerName();
}
