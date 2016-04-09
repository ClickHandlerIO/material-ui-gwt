package io.clickhandler.materialUiGwt.client;

import io.clickhandler.reactGwt.client.dom.CSSProps;
import io.clickhandler.reactGwt.client.react.BaseProps;
import io.clickhandler.reactGwt.client.react.ExternalComponent;
import io.clickhandler.reactGwt.client.react.ReactClass;
import io.clickhandler.reactGwt.client.react.ReactElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * material ui list, many options and list types - http://www.material-ui.com/#/components/list
 */
@Singleton
public class ListComponent extends ExternalComponent<ListComponent.Props> {

    @Inject
    public ListComponent() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.List;
    }-*/;

    /**
     *
     */
    @JsType(isNative = true)
    public interface Props extends BaseProps {
        @JsProperty
        boolean isInsetSubheader();

        @JsProperty
        void setInsetSubheader(boolean insetSubheader);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        ReactElement getSubheader();

        @JsProperty
        void setSubheader(ReactElement subheader);

        @JsProperty
        Object getSubheaderStyle();

        @JsProperty
        void setSubheaderStyle(Object subheaderStyle);

        @JsProperty
        double getZDepth();

        @JsProperty
        void setZDepth(double zDepth);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props insetSubheader(boolean insetSubheader) {
            setInsetSubheader(insetSubheader);
            return this;
        }

        @JsOverlay
        default Props style(CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props subheader(ReactElement subheader) {
            setSubheader(subheader);
            return this;
        }

        @JsOverlay
        default Props subheaderStyle(Object subheaderStyle) {
            setSubheaderStyle(subheaderStyle);
            return this;
        }

        @JsOverlay
        default Props zDepth(double zDepth) {
            setZDepth(zDepth);
            return this;
        }
    }
}
