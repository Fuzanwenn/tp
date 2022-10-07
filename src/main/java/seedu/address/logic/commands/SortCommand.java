package seedu.address.logic.commands;

/**
 * Sorts data in Address Book.
 */
public class SortCommand {
    public static final String COMMAND_WORD = "sort";
    public static final String MESSAGE_USAGE =
            COMMAND_WORD + ": Sorts the list of people according to the specified field."
            + "by alphabetical order.\n"
            + "Existing remark will be overwritten by the input.\n"
            + "Parameters: FIELD (must not be empty) "
            + "Example: " + COMMAND_WORD + "name";

    public static final String MESSAGE_SORT_SUCCESS = "Sorted according to %1$s";
}
