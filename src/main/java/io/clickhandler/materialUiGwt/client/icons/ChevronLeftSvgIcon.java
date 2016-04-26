package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class ChevronLeftSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ChevronLeftSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.ChevronLeft;
    }-*/;
}
