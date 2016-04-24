package io.clickhandler.materialUiGwt.client;

import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.Reflection;
import io.clickhandler.reactGwt.client.dom.CSSProps;
import io.clickhandler.reactGwt.client.event.SyntheticEvent;
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
public class RadioButton extends ExternalComponent<RadioButton.Props> {

    @Inject
    public RadioButton() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.RadioButton;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean checked;
//        boolean disabled;
//        CSSProps iconStyle;
//        String labelPosition; // enum 'left' 'right'
//        CSSProps labelStyle;
//        CSSProps style;
//        String value;
//        Func.Run onCheck; // func


        @JsProperty
        boolean isChecked();

        @JsProperty
        void setChecked(boolean checked);

        @JsProperty
        boolean isDisabled();

        @JsProperty
        void setDisabled(boolean disabled);

        @JsProperty
        CSSProps getIconStyle();

        @JsProperty
        void setIconStyle(CSSProps iconStyle);

        @JsProperty
        String getLabelPosition();

        @JsProperty
        void setLabelPosition(String labelPosition);

        @JsProperty
        CSSProps getLabelStyle();

        @JsProperty
        void setLabelStyle(CSSProps labelStyle);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        String getValue();

        @JsProperty
        void setValue(String value);

        @JsProperty
        Func.Run getOnCheck();

        @JsProperty
        void setOnCheck(Func.Run onCheck);


        ///////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props checked(final boolean checked) {
            setChecked(checked);
            return this;
        }

        @JsOverlay
        default Props disabled(final boolean disabled) {
            setDisabled(disabled);
            return this;
        }

        @JsOverlay
        default Props iconStyle(final CSSProps iconStyle) {
            setIconStyle(iconStyle);
            return this;
        }

        @JsOverlay
        default Props labelPosition(final String labelPosition) {
            setLabelPosition(labelPosition);
            return this;
        }

        @JsOverlay
        default Props labelStyle(final CSSProps labelStyle) {
            setLabelStyle(labelStyle);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props value(final String value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props onCheck(final Func.Run onCheck) {
            setOnCheck(onCheck);
            return this;
        }

        @JsOverlay
        default Props onCheck(final Func.Run2<SyntheticEvent, Boolean> onChange) {
            Reflection.set(this, "onCheck", onChange);
            return this;
        }
    }
}
