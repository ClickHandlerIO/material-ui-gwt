package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class UnarchiveSvgIcon extends AbstractMaterialIcon {

    @Inject
    public UnarchiveSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.Unarchive;
    }-*/;
}
