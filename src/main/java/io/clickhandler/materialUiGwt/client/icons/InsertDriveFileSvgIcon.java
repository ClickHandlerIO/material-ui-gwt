package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class InsertDriveFileSvgIcon extends AbstractMaterialIcon {

    @Inject
    public InsertDriveFileSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.InsertDriveFile;
    }-*/;
}
