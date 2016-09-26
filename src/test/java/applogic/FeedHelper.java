package applogic;

import model.SearchFeedModel;
import model.WhistleModel;

/**
 * Created by timrusso on 9/26/16.
 */
public interface FeedHelper {

    boolean ifNoFeeds(String text);

    void createArticle();
    void createImage();
    void createWhistle(WhistleModel whistleModel);
    boolean ifWhistleCreated(String text);

    void editFeed(WhistleModel whistleModel);

    void publishFeed();
    void unPublishFeed();

    void deleteFeed();

    void openArticle();
    void openImage();

    void showFullWhistle();

    void searchFeed(SearchFeedModel searchFeedModel);

}
