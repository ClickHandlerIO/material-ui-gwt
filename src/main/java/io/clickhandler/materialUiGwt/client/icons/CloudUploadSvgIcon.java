package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class CloudUploadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CloudUploadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.CloudUpload;
    }-*/;
}
