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
 * Grid_u consists of:
 * 1. GridList
 * 2. GridTile
 * ... for now they are separate classes
 */
@Singleton
public class GridList extends ExternalComponent<GridList.Props> {

    @Inject
    public GridList() {
    }

    @Override
    protected native ReactClass<Props> getReactClass() /*-{
        return $wnd.MaterialUi.GridList;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        double cellHeight; // default 180
//        double cols; // 2
//        double padding;
//        StyleProps style; // ?


        @JsProperty
        double getCellHeight();

        @JsProperty
        void setCellHeight(double cellHeight);

        @JsProperty
        double getCols();

        @JsProperty
        void setCols(double cols);

        @JsProperty
        double getPadding();

        @JsProperty
        void setPadding(double padding);

        @JsProperty
        StyleProps getStyle();

        @JsProperty
        void setStyle(StyleProps style);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props cellHeight(final double cellHeight) {
            setCellHeight(cellHeight);
            return this;
        }

        @JsOverlay
        default Props cols(final double cols) {
            setCols(cols);
            return this;
        }

        @JsOverlay
        default Props padding(final double padding) {
            setPadding(padding);
            return this;
        }

        @JsOverlay
        default Props style(final StyleProps style) {
            setStyle(style);
            return this;
        }


    }
}
