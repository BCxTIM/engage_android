package applogic;

/**
 * Created by timrusso on 9/26/16.
 */
public interface FeedHelper {

    void createArticle();
    void createImage();
    void createWhistle();

    void editArticle();
    void editImage();
    void editWhistle();

    void createWhistlePublished();
    void editWhistlePublished();

    void publishFeed();
    void unPublishFeed();

    void deleteArticle();
    void deleteImage();
    void deleteWhistle();

    void openArticle();
    void openImage();

    void showFullWhistle();

    void searchArticle();
    void searchImage();
    void searchWhistle();

}
