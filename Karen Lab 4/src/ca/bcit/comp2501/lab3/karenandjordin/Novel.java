package ca.bcit.comp2501.lab3.karenandjordin;

/**
 * Class models a novel
 *
 * @author Any Liang and Karen Lim (re-using this script from Lab 3)
 * @version 1.0
 */
public class Novel
{
    private final String title;
    private final String authorName;
    private final int    yearPublished;

    /**
     * Class constructor
     * @param title title of book
     * @param authorName author of book
     * @param yearPublished year book was published
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished)
    {
        this.title          = title;
        this.authorName     = authorName;
        this.yearPublished  = yearPublished;
    }

    /**@return title of book*/
    public String getTitle()
    {
        return title;
    }

    /**@return author's name*/
    public String getAuthorName()
    {
        return authorName;
    }

    /**@return year that book was published*/
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**@return title, author's name, and year book was published*/
    public String getAllInfo()
    {
        return title + authorName + yearPublished;
    }

}
