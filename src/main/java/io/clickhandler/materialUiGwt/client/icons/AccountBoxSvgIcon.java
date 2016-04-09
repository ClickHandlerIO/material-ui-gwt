package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class AccountBoxSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AccountBoxSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.AccountBox;
    }-*/;
}
