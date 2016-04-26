package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class SearchSvgIcon extends AbstractMaterialIcon {

    @Inject
    public SearchSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Icons.Search;
    }-*/;
}
