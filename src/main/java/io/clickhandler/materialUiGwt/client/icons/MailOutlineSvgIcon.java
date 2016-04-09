package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class MailOutlineSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MailOutlineSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.MailOutline;
    }-*/;
}
