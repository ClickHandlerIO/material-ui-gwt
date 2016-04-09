package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class MenuSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MenuSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.Menu;
    }-*/;
}
