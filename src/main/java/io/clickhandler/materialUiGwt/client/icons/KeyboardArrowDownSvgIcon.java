package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class KeyboardArrowDownSvgIcon extends AbstractMaterialIcon {

    @Inject
    public KeyboardArrowDownSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.KeyboardArrowDown;
    }-*/;
}
