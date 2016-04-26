package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class GpsFixedSvgIcon extends AbstractMaterialIcon {

    @Inject
    public GpsFixedSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.GpsFixed;
    }-*/;
}
