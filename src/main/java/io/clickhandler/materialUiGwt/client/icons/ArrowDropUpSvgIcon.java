package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class ArrowDropUpSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ArrowDropUpSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.ArrowDropUp;
    }-*/;
}
