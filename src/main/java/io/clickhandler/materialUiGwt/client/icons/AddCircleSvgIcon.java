package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class AddCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.AddCircle;
    }-*/;
}
