package applogic;

import model.SearchFeedModel;
import model.WhistleModel;

/**
 * Created by timrusso on 9/26/16.
 */
public interface FeedHelper {

    void createArticle();
    void createImage();
    void createWhistle(WhistleModel whistleModel);

    void editArticle();
    void editImage();
    void editWhistle(WhistleModel whistleModel);

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

    void searchFeed(SearchFeedModel searchFeedModel);

}
