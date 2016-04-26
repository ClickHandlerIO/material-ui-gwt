package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class FileDownloadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FileDownloadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.FileDownload;
    }-*/;
}
