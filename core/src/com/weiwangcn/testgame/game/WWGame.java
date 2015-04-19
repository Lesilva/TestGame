package com.weiwangcn.testgame.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.weiwangcn.testgame.screens.GameScreen;

public class WWGame extends Game {

    @Override
    public void create() {
        Gdx.app.log("WWGame", "created");
        setScreen(new GameScreen());
    }
}
