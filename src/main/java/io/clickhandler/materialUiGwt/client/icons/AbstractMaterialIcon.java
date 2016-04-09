package io.clickhandler.materialUiGwt.client.icons;

import io.clickhandler.materialUiGwt.client.SvgIcon;
import io.clickhandler.reactGwt.client.react.ExternalComponent;
import jsinterop.annotations.JsType;

public abstract class AbstractMaterialIcon extends ExternalComponent<AbstractMaterialIcon.Props> {

    @Override
    protected Props defaultProps() {
        final Props props = super.defaultProps();
        props.setViewBox("0 0 24 24");
        return props;
    }

    @JsType(isNative = true)
    public interface Props extends SvgIcon.Props {
    }
}