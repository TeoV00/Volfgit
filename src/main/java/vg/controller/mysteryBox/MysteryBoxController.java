package vg.controller.mysteryBox;

import com.sun.javafx.geom.Vec2d;
import javafx.scene.Node;
import vg.model.mysteryBox.AbilityInTheBox;

public interface MysteryBoxController<T extends AbilityInTheBox> {
    public Node getNode();

    public Vec2d GetPosition();

    public void SetPosition(Vec2d position);
}
