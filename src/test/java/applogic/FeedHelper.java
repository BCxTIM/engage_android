package applogic;

import model.ArticleModel;
import model.ImageModel;
import model.SearchFeedModel;
import model.WhistleModel;

/**
 * Created by timrusso on 9/26/16.
 */
public interface FeedHelper {

    void goBack();

    boolean ifNoFeeds(String text);

    void createArticle(ArticleModel articleModel);

    void createImage(ImageModel imageModel);

    void createWhistle(WhistleModel whistleModel);
    boolean ifFeedCreated(String text);

    void editWhistle(WhistleModel whistleModel);

    void publishUnpublishFeed();
    boolean statusFeed(String text);

    void deleteFeed();

    void openArticle();
    void openImageFeed();
    boolean checkImageTitle(String text);

    boolean checkArticleTitle(String text);
    boolean checkArticleDescription(String text);


}
