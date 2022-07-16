package project.notion.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Database {

    private String object;

    @JsonProperty("results")
    private List<Page> pages;

    @JsonProperty("next_cursor")
    private boolean next_cursor;

    @JsonProperty("has_more")
    private boolean has_more;

    public Database(String object, List<Page> result, boolean next_cursor, boolean has_more) {
        this.object = object;
        this.pages = result;
        this.next_cursor = next_cursor;
        this.has_more = has_more;
    }

    public String getObject() {
        return object;
    }

    public List<Page> getPages() {
        return pages;
    }

    public boolean isNext_cursor() {
        return next_cursor;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void setNotionPages(List<Page> pages) {
        this.pages = pages;
    }

    public void setNext_cursor(boolean next_cursor) {
        this.next_cursor = next_cursor;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }
}

