package ca.bcit.comp2501.lab4.jordinkaren;

/**
 * This class is a checked exception for handling
 * invalid name parameters.
 *
 * @author Jordin Pirooz and Karen Lim
 * @version 1.0
 */
class IllegalNameException extends Exception
{
    IllegalNameException(final String message)
    {
        super(message);
    }
}
