package com.example.nytimes;

public class Multimedia {
    private final String url;
    private final String format;
    private final int height;
    private final int width;
    private final String type;
    private final String subtype;
    private final String caption;
    private final String copyright;

    public Multimedia(String url, String format, int height, int width, String type, String subtype, String caption, String copyright) {
        this.url = url;
        this.format = format;
        this.height = height;
        this.width = width;
        this.type = type;
        this.subtype = subtype;
        this.caption = caption;
        this.copyright = copyright;
    }

    public String getUrl() {
        return url;
    }

    public String getFormat() {
        return format;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getCaption() {
        return caption;
    }

    public String getCopyright() {
        return copyright;
    }
}
