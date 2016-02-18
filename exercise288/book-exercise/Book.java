/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        borrowed = 0;
        courseText = bookCourseText;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public int getPages()
    {
        return pages;
    }

    public void printAuthor()
    {
        System.out.println(author);
    }

    public void printTitle()
    {
        System.out.println(title);
    }

    /**
     * Print all the book details to the screen
     */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Times borrowed: " + borrowed);

        if (refNumber != null) {
            System.out.println("RefNumber: " + refNumber);   
        } else {
            System.out.println("ZZZ");
        }
    }

    /**
     * Set a refnumber, must be higher or equal to 3 characters
     */
    public void setRefNumber(String number)
    {
        if (number != null && number.length() >= 3) {
            refNumber = number;
        } else {
            System.out.println("The refnumber should be higher than 3 characters");
        }
    }

    public String getRefNumber()
    {
        return refNumber;
    }

    public void borrow()
    {
        borrowed++;
    }

    public int getBorrowed()
    {
        return borrowed;
    }

    public boolean isCourseText()
    {
        return courseText;
    }

}

