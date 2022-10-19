package vg.view.player;

import com.sun.javafx.geom.Vec2d;
import javafx.geometry.Dimension2D;
import javafx.scene.Node;
import vg.utils.path.PathImagePlayer;
import vg.view.entity.EntityBlock;
import vg.view.entity.EntityBlockImpl;
import vg.view.entity.StaticFactoryEntityBlock;


public class PlayerViewControllerImpl extends EntityBlockImpl implements PlayerViewController {

    public PlayerViewControllerImpl() {
        super(40, 40);
        this.setImage(PathImagePlayer.PLAYER);
    }

    @Override
    public void showShield() {
        //this.setImage();
    }

    @Override
    public void hideShield() {
        this.setImage(PathImagePlayer.PLAYER);
    }
}