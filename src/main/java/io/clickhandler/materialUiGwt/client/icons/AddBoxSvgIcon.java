package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class AddBoxSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddBoxSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.AddBox;
    }-*/;
}
