package ca.bcit.comp2501.lab3.karenandjordin;

/**
 * Represents a Bookstore that manages a collection of novels.
 * @author Karen Lim and Jordin Pirooz
 * @version 1.0
 */

import java.util.ArrayList;

/**
 * Checked exception for handling invalid name input.
 */
class IllegalNameException extends Exception
{
    public IllegalNameException(String message)
    {
        super(message);
    }
}

/**
 * Unchecked exception for handling invalid properties.
 */
class IllegalNovelPropertyException extends RuntimeException
{
    public IllegalNovelPropertyException(String message)
    {
        super(message);
    }
}

/**
 * Represents a bookstore that manages 109 novels.
 */
public class BookStore
{
    private final String name;
    private final ArrayList<Novel> novels;

    /**
     * Constructs a new BookStore.
     * @param name The name of the bookstore. If the name is "Amazon", it defaults to "Chapters".
     */
    public BookStore(String name)
    {
        this.name = name.equalsIgnoreCase("Amazon") ? "Chapters" : name;
        this.novels = new ArrayList<>(109);
        // Initialization of 109 novels
        novels.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novels.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        novels.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novels.add(new Novel("Animal Farm", "George Orwell", 1946));
        novels.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novels.add(new Novel(null, null, 0));
        novels.add(new Novel(null, "author name 1", 0));
        novels.add(new Novel("", null, 0));
        novels.add(new Novel(null, "", 0));
        novels.add(new Novel("title 1", null, 0));
        novels.add(new Novel("", "", 0));
        novels.add(new Novel("", "author name 2", 0));
        novels.add(new Novel("title 2", null, 0));
        novels.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novels.add(new Novel("Atonement", "Ian McEwan", 2002));
        novels.add(new Novel("Beloved", "Toni Morrison", 1987));
        novels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novels.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novels.add(new Novel("COMP2501 Lab 3 Due before next class", null, 0));
        novels.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novels.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novels.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novels.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novels.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novels.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novels.add(new Novel("A Death in the Family", "James Agee", 1958));
        novels.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novels.add(new Novel("Deliverance", "James Dickey", 1970));
        novels.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novels.add(new Novel("Falconer", "John Cheever", 1977));
        novels.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novels.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novels.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novels.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novels.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novels.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novels.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novels.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novels.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novels.add(new Novel("Herzog", "Saul Bellow", 1964));
        novels.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novels.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novels.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novels.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novels.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novels.add(new Novel("Light in August", "William Faulkner", 1932));
        novels.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novels.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novels.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novels.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novels.add(new Novel("Loving", "Henry Green", 1945));
        novels.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novels.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novels.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novels.add(new Novel("Money", "Martin Amis", 1984));
        novels.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novels.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novels.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novels.add(new Novel("Native Son", "Richard Wright", 1940));
        novels.add(new Novel("Neuromancer", "William Gibson", 1984));
        novels.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novels.add(new Novel("1984", "George Orwell", 1948));
        novels.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novels.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novels.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novels.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novels.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novels.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novels.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novels.add(new Novel("Possession", "A.S. Byatt", 1990));
        novels.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novels.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novels.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novels.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novels.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novels.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novels.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novels.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novels.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novels.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novels.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novels.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        novels.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novels.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        novels.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novels.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novels.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novels.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novels.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        novels.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novels.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novels.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novels.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novels.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novels.add(new Novel("White Noise", "Don DeLillo", 1985));
        novels.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novels.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));

    }

    /**
     * Prints titles of novels that are exactly the specified length.
     * @param length The length of titles to print.
     * @throws IllegalArgumentException If length is zero or negative.
     */
    public void printTitlesOfLength(final int length) throws IllegalArgumentException
    {
        if (length <= 0)
        {
            throw new IllegalArgumentException("bad length");
        }
        for (Novel novel : novels)
        {
            if (novel != null &&
                novel.getTitle() != null &&
                novel.getTitle().length() == length)
            {
                System.out.println(novel.getTitle());
            }
        }
    }

    /**
     * Prints authors' names that start or end with a given substring.
     * @param substring Substring to check against the start or end of author names.
     * @throws IllegalNameException If substring is null or blank.
     */
    public void printNameStartsEndsWith(final String substring)
                                        throws IllegalNameException
    {
        if (substring == null || substring.trim().isEmpty())
        {
            throw new IllegalNameException("bad name");
        }
        for (Novel novel : novels)
        {
            if (novel != null &&
                novel.getAuthorName() != null &&
                (novel.getAuthorName().toLowerCase().startsWith(substring.toLowerCase()) ||
                 novel.getAuthorName().toLowerCase().endsWith(substring.toLowerCase())))
            {
                System.out.println(novel.getAuthorName().toLowerCase());
            }
        }
    }

    /**
     * Prints titles containing a specified substring.
     * @param substring Searching a specified substring within titles.
     * @param caseSensitive Searching for case-sensitive titles.
     * @throws IllegalArgumentException If the substring is null or blank.
     */
    public void printTitlesContaining(final String substring,
                                      final boolean caseSensitive)
                                      throws IllegalArgumentException
    {
        if (substring == null || substring.trim().isEmpty())
        {
            throw new IllegalArgumentException("bad string");
        }
        for (Novel novel : novels)
        {
            if (novel != null &&
                novel.getTitle() != null)
            {
                if (!caseSensitive &&
                    novel.getTitle().toLowerCase().contains(substring.toLowerCase()) ||
                    caseSensitive &&
                    novel.getTitle().contains(substring))
                {
                    System.out.println(novel.getTitle());
                }
            }
        }
    }

    /**
     * Retrieves the longest author name or book title.
     * @param property The property to compare ("author" or "title").
     * @return The longest name or title found.
     * @throws IllegalNovelPropertyException If the property is neither "author" nor "title".
     */
    public String getLongest(final String property)
                             throws IllegalNovelPropertyException
    {
        if (!property.equalsIgnoreCase("author") &&
            !property.equalsIgnoreCase("title"))
        {
            throw new IllegalNovelPropertyException("bad property");
        }
        String longest = "";
        for (Novel novel : novels)
        {
            if (novel != null &&
                ((property.equalsIgnoreCase("author") &&
                novel.getAuthorName() != null) ||
                (property.equalsIgnoreCase("title") &&
                novel.getTitle() != null)))
            {
                String current = property.equalsIgnoreCase("author") ?
                    novel.getAuthorName() : novel.getTitle();
                if (current.length() > longest.length())
                {
                    longest = current;
                }
            }
        }
        return longest;
    }

    /**
     * Main method for the BookStore class.
     * @param args Command line arguments.
     */
    public static void main(final String[] args)
    {
        try
        {
            final BookStore bookstore = new BookStore(args.length > 0 ? args[0] : "Generic Bookstore");
            bookstore.printTitlesOfLength(13);
            bookstore.printNameStartsEndsWith("aN");
            bookstore.printTitlesContaining("the", false);
            bookstore.printTitlesContaining("the", true);
            System.out.println(bookstore.getLongest("author"));
            System.out.println(bookstore.getLongest("title"));
        } catch (IllegalNameException | IllegalArgumentException | IllegalNovelPropertyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
