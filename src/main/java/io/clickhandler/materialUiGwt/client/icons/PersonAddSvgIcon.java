package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class PersonAddSvgIcon extends AbstractMaterialIcon {

    @Inject
    public PersonAddSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.PersonAdd;
    }-*/;
}
