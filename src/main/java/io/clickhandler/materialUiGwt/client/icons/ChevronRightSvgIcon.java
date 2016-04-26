package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class ChevronRightSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ChevronRightSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.ChevronRight;
    }-*/;
}
