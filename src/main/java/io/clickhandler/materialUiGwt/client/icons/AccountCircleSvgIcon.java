package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class AccountCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AccountCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.AccountCircle;
    }-*/;
}
