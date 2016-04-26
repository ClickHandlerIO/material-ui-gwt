package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class MoreHorizSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MoreHorizSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.MoreHoriz;
    }-*/;
}
