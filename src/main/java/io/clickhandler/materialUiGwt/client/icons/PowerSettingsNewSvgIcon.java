package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class PowerSettingsNewSvgIcon extends AbstractMaterialIcon {

    @Inject
    public PowerSettingsNewSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.PowerSettingsNew;
    }-*/;
}
