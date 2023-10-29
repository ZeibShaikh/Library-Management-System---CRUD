package Lib_Management;

public interface LibraryDaoIntr {
    public void insertBook(Library l);
    public void showBooks();
    public void issueBook(int id);
    public void returnBook(Library l);
    public void deleteBook(int id);
}
