package io.clickhandler.materialUiGwt.client;

import io.clickhandler.reactGwt.client.dom.StyleProps;
import io.clickhandler.reactGwt.client.react.BaseProps;
import io.clickhandler.reactGwt.client.react.ExternalComponent;
import io.clickhandler.reactGwt.client.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class LinearProgress extends ExternalComponent<LinearProgress.Props> {

    @Inject
    public LinearProgress() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.LinearProgress;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String color;
//        StyleProps innerStyle;
//        double max = 100; // only works in determinate mode
//        double min = 0; // only works in determinate mode
//        String mode = "indeterminate"; // enum 'determinate' 'indeterminate'(default)
//        StyleProps style;
//        double value = 0; // only works in determinate mode

        @JsProperty
        String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        StyleProps getInnerStyle();

        @JsProperty
        void setInnerStyle(StyleProps innerStyle);

        @JsProperty
        double getMax();

        @JsProperty
        void setMax(double max);

        @JsProperty
        double getMin();

        @JsProperty
        void setMin(double min);

        @JsProperty
        String getMode();

        @JsProperty
        void setMode(String mode);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        double getValue();

        @JsProperty
        void setValue(double value);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props color(final String color) {
            setColor(color);
            return this;
        }

        @JsOverlay
        default Props innerStyle(final StyleProps innerStyle) {
            setInnerStyle(innerStyle);
            return this;
        }

        @JsOverlay
        default Props max(final double max) {
            setMax(max);
            return this;
        }

        @JsOverlay
        default Props min(final double min) {
            setMin(min);
            return this;
        }

        @JsOverlay
        default Props mode(final String mode) {
            setMode(mode);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props value(final double value) {
            setValue(value);
            return this;
        }


    }
}
