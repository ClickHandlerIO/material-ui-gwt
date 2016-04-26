package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class FileUploadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FileUploadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.FileUpload;
    }-*/;
}
