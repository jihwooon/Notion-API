package project.notion.domain;

public abstract class Database {

    private String object;
    private boolean next_cursor;
    private boolean hasMore;


    public boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public boolean isNext_cursor() {
        return next_cursor;
    }

    public void setNext_cursor(boolean next_cursor) {
        this.next_cursor = next_cursor;
    }
}
