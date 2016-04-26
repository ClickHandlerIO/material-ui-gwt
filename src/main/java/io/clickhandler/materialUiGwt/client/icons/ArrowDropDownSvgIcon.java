package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class ArrowDropDownSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ArrowDropDownSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.ArrowDropDown;
    }-*/;
}
