package model;

/**
 * Created by timrusso on 9/26/16.
 */
public class WhistleModel {

    private String text;

    public WhistleModel setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return text;
    }

}
