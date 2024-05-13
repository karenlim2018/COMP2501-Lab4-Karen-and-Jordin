package ca.bcit.comp2501.lab4.jordinkaren;

/**
 * This class is an unchecked exception for handling
 * invalid property parameters.
 *
 * @author Jordin Pirooz and Karen Lim
 * @version 1.0
 */
class IllegalNovelPropertyException extends RuntimeException
{
    IllegalNovelPropertyException(final String message)
    {
        super(message);
    }
}
