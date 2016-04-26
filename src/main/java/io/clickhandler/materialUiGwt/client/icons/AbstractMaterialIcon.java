package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.materialUiGwt.client.SvgIcon;
import io.clickhandler.reactGwt.client.react.ExternalComponent;
import jsinterop.annotations.JsType;

public abstract class AbstractMaterialIcon extends ExternalComponent<AbstractMaterialIcon.Props> {

    @Override
    protected void applyDefaults(Props props) {
        super.applyDefaults(props);
        props.setViewBox("0 0 24 24");
    }

    @JsType(isNative = true)
    public interface Props extends SvgIcon.Props {
    }
}