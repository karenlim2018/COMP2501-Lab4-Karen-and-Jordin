package ca.bcit.comp2501.lab4.jordinkaren;

/**
 * This class models a novel.
 *
 * @author Jordin Pirooz and Karen Lim
 * @version 1.0
 */
class Novel
{
    private final String title;
    private final String authorName;
    private final int    yearPublished;


    /**
     * Class constructor.
     *
     * @param title         The novel's title.
     * @param authorName    The name of the novel's author.
     * @param yearPublished The year the novel was published.
     */
    Novel(final String title,
          final String authorName,
          final int    yearPublished)
    {
        this.title         = title;
        this.authorName    = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * @return The novel's title.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @return The name of the novel's author.
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * @return The year the novel was published.
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}
