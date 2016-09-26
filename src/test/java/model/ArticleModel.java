package model;

/**
 * Created by timrusso on 9/26/16.
 */
public class ArticleModel {

    private String title;
    private String description;

    public ArticleModel setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ArticleModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

}
