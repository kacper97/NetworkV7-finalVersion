import java.util.ArrayList;
import java.util.List;

/**
 * The NewsFeed class stores news posts for the news feed in a
 * social network application (like FaceBook or Google+).
 * 
 * This version does not save the data to disk, and it does not
 * provide any search or ordering functions.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.2
 */
public class NewsFeed implements INewsFeed
{
    private List<Post> posts;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        posts = new ArrayList<Post>();
    }

    /**
     * Add a post to the news feed.
     * 
     * @param post  The post to be added.
     */
    public void addPost(Post post)
    {
        posts.add(post);
    }

    /**
     *Delete a post from the news feed.
     * 
     * @param post  The post to be deleted.
     */
    public void deletePost(int index)
    {
        posts.remove(index);
    }
    /**
     * Return the news feed as a String. 
     */
    public String show()
    {
        String str = "";
        // display all posts with an index number
        int i = 0; 
        for(Post post : posts) {
            str += i + ": " + post.display() + "\n";
            i++;
        }     
        return str;
    }
}
