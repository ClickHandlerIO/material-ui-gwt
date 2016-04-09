package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class AddShoppingCartSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AddShoppingCartSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.AddShoppingCart;
    }-*/;
}
