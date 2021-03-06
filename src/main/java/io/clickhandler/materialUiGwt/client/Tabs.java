package io.clickhandler.materialUiGwt.client;

import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.dom.StyleProps;
import io.clickhandler.reactGwt.client.event.MouseEventHandler;
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
public class Tabs extends ExternalComponent<Tabs.Props> {

    @Inject
    public Tabs() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.Tabs;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        String getContentContainerClassName();

        @JsProperty
        void setContentContainerClassName(String contentContainerClassName);

        @JsProperty
        String getContentContainerStyle();

        @JsProperty
        void setContentContainerStyle(String contentContainerStyle);

        @JsProperty
        double getInitialSelectedIndex();

        @JsProperty
        void setInitialSelectedIndex(double initialSelectedIndex);

        @JsProperty
        StyleProps getInkBarStyle();

        @JsProperty
        void setInkBarStyle(StyleProps inkBarStyle);

        @JsProperty
        Func.Run getOnChange();

        @JsProperty
        void setOnChange(Func.Run onChange);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        StyleProps getTabItemContainerStyle();

        @JsProperty
        void setTabItemContainerStyle(StyleProps tabItemContainerStyle);

        @JsProperty
        Object getTabTemplate();

        @JsProperty
        void setTabTemplate(Object tabTemplate);

        @JsProperty
        Object getValue();

        @JsProperty
        void setValue(Object value);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props className(String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props contentContainerClassName(String contentContainerClassName) {
            setContentContainerClassName(contentContainerClassName);
            return this;
        }

        @JsOverlay
        default Props contentContainerStyle(String contentContainerStyle) {
            setContentContainerStyle(contentContainerStyle);
            return this;
        }

        @JsOverlay
        default Props initialSelectedIndex(double initialSelectedIndex) {
            setInitialSelectedIndex(initialSelectedIndex);
            return this;
        }

        @JsOverlay
        default Props inkBarStyle(StyleProps inkBarStyle) {
            setInkBarStyle(inkBarStyle);
            return this;
        }

        @JsOverlay
        default Props onChange(Func.Run onChange) {
            setOnChange(onChange);
            return this;
        }

        @JsOverlay
        default Props style(StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props tabItemContainerStyle(StyleProps tabItemContainerStyle) {
            setTabItemContainerStyle(tabItemContainerStyle);
            return this;
        }

        @JsOverlay
        default Props tabTemplate(Object tabTemplate) {
            setTabTemplate(tabTemplate);
            return this;
        }

        @JsOverlay
        default Props value(Object value) {
            setValue(value);
            return this;
        }

        @JsOverlay
        default Props onClick(MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }

    }
}
