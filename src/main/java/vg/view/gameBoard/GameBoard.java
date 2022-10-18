package vg.view.gameBoard;

import javafx.application.Application;
import javafx.stage.Stage;
import vg.controller.GameController;
import vg.controller.mysteryBox.manager.MysteryBoxManager;
import vg.controller.mysteryBox.manager.MysteryBoxManagerImpl;
import vg.view.AdaptableView;
import vg.view.ViewManager;
import vg.view.ViewManagerImpl;
import vg.view.utils.KeyEventHandler;

public class GameBoard extends Application {

    /**
     * View Manager.
     * {@see ViewManager}
     */
    private ViewManager viewManager;

    @Override
    public void start(final Stage stage) {
        AdaptableView gameView = new GameBoardView();

        viewManager = new ViewManagerImpl(stage, new KeyEventHandler());
        //this.controller = load.getController();
        MysteryBoxManager mysteryBoxManager = new MysteryBoxManagerImpl();

        GameController gameController = new GameController(gameView, viewManager);
        gameView.setIoLogicController(gameController);

        //add first view to viewStack then set scene to the stage.
        viewManager.addScene(gameView);
        stage.setTitle("GameBoard");
        stage.setResizable(false);
        stage.show();

        //mysteryBoxManager.initializeRound(this.controller);

        stage.setOnCloseRequest(event -> gameController.closeGame());
        gameController.gameLoop();

    }
}

