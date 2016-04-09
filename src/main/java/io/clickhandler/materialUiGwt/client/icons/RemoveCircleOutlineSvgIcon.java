package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class RemoveCircleOutlineSvgIcon extends AbstractMaterialIcon {

    @Inject
    public RemoveCircleOutlineSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.RemoveCircleOutline;
    }-*/;
}
