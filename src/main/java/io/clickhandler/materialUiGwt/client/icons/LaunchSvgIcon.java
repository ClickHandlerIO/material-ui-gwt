package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class LaunchSvgIcon extends AbstractMaterialIcon {

    @Inject
    public LaunchSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Launch;
    }-*/;
}
