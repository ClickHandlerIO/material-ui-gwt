package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class AttachFileSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AttachFileSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.AttachFile;
    }-*/;
}
