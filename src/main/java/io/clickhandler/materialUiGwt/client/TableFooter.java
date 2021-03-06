package io.clickhandler.materialUiGwt.client;

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
public class TableFooter extends ExternalComponent<TableFooter.Props> {

    @Inject
    public TableFooter() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.TableFooter;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        boolean adjustForCheckbox;
//        String className;
//        StyleProps style;
//        MouseEventHandler onClick;

        @JsProperty
        boolean isAdjustForCheckbox();

        @JsProperty
        void setAdjustForCheckbox(boolean adjustForCheckbox);

        @JsProperty
        String getClassName();

        @JsProperty
        void setClassName(String className);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler onClick);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props adjustForCheckbox(final boolean adjustForCheckbox) {
            setAdjustForCheckbox(adjustForCheckbox);
            return this;
        }

        @JsOverlay
        default Props className(final String className) {
            setClassName(className);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props onClick(final MouseEventHandler onClick) {
            setOnClick(onClick);
            return this;
        }


    }
}
