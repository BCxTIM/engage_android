package model;

/**
 * Created by timrusso on 9/26/16.
 */
public class SearchFeedModel {

    private String text;

    public SearchFeedModel setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return text;
    }

}
