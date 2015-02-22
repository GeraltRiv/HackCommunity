package com.hackcommunity.hackcommunity.model;

/**
 * Created by taras on 22.02.2015.
 */
public class IdeaModel {
    String title;
    String shortText;
    String fullText;

    public IdeaModel(String title, String shortText, String fullText) {
        this.title = title;
        this.shortText = shortText;
        this.fullText = fullText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }
}
