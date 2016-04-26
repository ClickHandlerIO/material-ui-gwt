package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class DragHandleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public DragHandleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.DragHandle;
    }-*/;
}
