package io.clickhandler.materialUiGwt.client;

import io.clickhandler.reactGwt.client.dom.CSSProps;
import io.clickhandler.reactGwt.client.event.MouseEventHandler;
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
 * Card_u consists of many different parts that share property names:
 * for now they are separate classes
 * 1. Card_u
 * 2. CardActions
 * 3. CardHeader
 * 4. CardMedia
 * 5. CardTitle
 * 6. CardText
 */
@Singleton
public class CardMedia extends ExternalComponent<CardMedia.Props> {

    @Inject
    public CardMedia() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.CardMedia;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {

        @JsProperty
        boolean isActAsExpander();

        @JsProperty
        void setActAsExpander(boolean actAsExpander);

        @JsProperty
        boolean isExpandable();

        @JsProperty
        void setExpandable(boolean expandable);

        @JsProperty
        CSSProps getMediaStyle();

        @JsProperty
        void setMediaStyle(CSSProps mediaStyle);

        @JsProperty
        ReactElement getOverlay();

        @JsProperty
        void setOverlay(ReactElement overlay);

        @JsProperty
        CSSProps getOverlayContainerStyle();

        @JsProperty
        void setOverlayContainerStyle(CSSProps overlayContainerStyle);

        @JsProperty
        CSSProps getOverlayContentStyle();

        @JsProperty
        void setOverlayContentStyle(CSSProps overlayContentStyle);

        @JsProperty
        CSSProps getOverlayStyle();

        @JsProperty
        void setOverlayStyle(CSSProps overlayStyle);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        MouseEventHandler getOnClick();

        @JsProperty
        void setOnClick(MouseEventHandler style);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props actAsExpander(final boolean actAsExpander) {
            setActAsExpander(actAsExpander);
            return this;
        }

        @JsOverlay
        default Props expandable(final boolean expandable) {
            setExpandable(expandable);
            return this;
        }

        @JsOverlay
        default Props mediaStyle(final CSSProps mediaStyle) {
            setMediaStyle(mediaStyle);
            return this;
        }

        @JsOverlay
        default Props overlay(final ReactElement overlay) {
            setOverlay(overlay);
            return this;
        }

        @JsOverlay
        default Props overlayContainerStyle(final CSSProps overlayContainerStyle) {
            setOverlayContainerStyle(overlayContainerStyle);
            return this;
        }

        @JsOverlay
        default Props overlayContentStyle(final CSSProps overlayContentStyle) {
            setOverlayContentStyle(overlayContentStyle);
            return this;
        }

        @JsOverlay
        default Props overlayStyle(final CSSProps overlayStyle) {
            setOverlayStyle(overlayStyle);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
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
