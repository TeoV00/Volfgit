package vg.model.mysteryBox.concrete;

import vg.model.mysteryBox.AbstractAbilityDurable;
import vg.model.mysteryBox.EAbility;
import vg.model.mysteryBox.ability.AbilitySpeed;

public class AbilitySpeedImpl extends AbstractAbilityDurable implements AbilitySpeed {

    public AbilitySpeedImpl(EAbility idAbility, double duration) {
        super(idAbility, duration);
    }


    @Override
    public void startSpeed() {
       // super.onStart(this);
    }


}
