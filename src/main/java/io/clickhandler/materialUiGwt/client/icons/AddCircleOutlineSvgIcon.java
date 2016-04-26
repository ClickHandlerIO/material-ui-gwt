package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class AddCircleOutlineSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddCircleOutlineSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.AddCircleOutline;
    }-*/;
}
