package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class CloudDownloadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CloudDownloadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.CloudUpload;
    }-*/;
}
