package vg.controller;

import javafx.scene.input.KeyCode;
import vg.view.AdaptableView;

public class StateControllerImpl implements StateController<AdaptableView> {
    /**
     * The view bound to this controller.
     */
    private AdaptableView view;
    /**
     * The settings bound to keys.
     */
    private KeyEventImpl keyEventSettings;
    /**
     * {@inheritDoc}
     */
    @Override
    public AdaptableView getView() {
        return this.view;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setView(final AdaptableView view) {
        this.view = view;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyAction captureKeyEvent(final KeyCode key) {
        return getKeyEventSettings().keyPressed(key);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void activatesEvent(final KeyAction e) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void activatesEvent(final StateType e) {

    }
    public KeyEventImpl getKeyEventSettings() {
        return keyEventSettings;
    }

    public void setKeyEventSettings(final KeyEventImpl keyEventSettings) {
        this.keyEventSettings = keyEventSettings;
    }

}
