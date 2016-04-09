package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class MoreVertSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MoreVertSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.MoreVert;
    }-*/;
}
