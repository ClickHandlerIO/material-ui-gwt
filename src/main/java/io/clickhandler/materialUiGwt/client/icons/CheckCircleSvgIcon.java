package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class CheckCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CheckCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.CheckCircle;
    }-*/;
}
