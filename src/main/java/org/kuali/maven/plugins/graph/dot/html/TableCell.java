package org.kuali.maven.plugins.graph.dot.html;

public class TableCell {

    public TableCell() {
        super();
    }

    public TableCell(Label label) {
        super();
        this.label = label;
    }

    public TableCell(Img img) {
        super();
        this.img = img;
    }

    TableCellAlign align;
    TableCellBrAlign balign;
    String bgcolor;
    String border;
    String cellpadding;
    String cellspacing;
    String color;
    Integer colspan;
    FixedSize fixedsize;
    String height;
    String href;
    String id;
    String port;
    Integer rowspan;
    String target;
    String title;
    String tooltip;
    VerticalAlignment valign;
    String width;

    Label label;
    Img img;

    public TableCellAlign getAlign() {
        return align;
    }

    public void setAlign(TableCellAlign align) {
        this.align = align;
    }

    public TableCellBrAlign getBalign() {
        return balign;
    }

    public void setBalign(TableCellBrAlign balign) {
        this.balign = balign;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getCellpadding() {
        return cellpadding;
    }

    public void setCellpadding(String cellpadding) {
        this.cellpadding = cellpadding;
    }

    public String getCellspacing() {
        return cellspacing;
    }

    public void setCellspacing(String cellspacing) {
        this.cellspacing = cellspacing;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getColspan() {
        return colspan;
    }

    public void setColspan(Integer colspan) {
        this.colspan = colspan;
    }

    public FixedSize getFixedsize() {
        return fixedsize;
    }

    public void setFixedsize(FixedSize fixedsize) {
        this.fixedsize = fixedsize;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getRowspan() {
        return rowspan;
    }

    public void setRowspan(Integer rowspan) {
        this.rowspan = rowspan;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public VerticalAlignment getValign() {
        return valign;
    }

    public void setValign(VerticalAlignment valign) {
        this.valign = valign;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Img getImg() {
        return img;
    }

    public void setImg(Img img) {
        this.img = img;
    }

}