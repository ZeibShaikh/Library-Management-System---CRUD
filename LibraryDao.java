package Lib_Management;

import java.sql.*;

public class LibraryDao implements LibraryDaoIntr{
    Connection con;
    @Override
    public void insertBook(Library l) {
        try {
            con = DBconnection.createConnection();
            String query="insert into books(id,bname,author) values(?,?,?)";
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,l.getId());
            pstm.setString(2,l.getBname());
            pstm.setString(3,l.getAuth());
            int i= pstm.executeUpdate();
            if(i!=0){
                System.out.println("Book Inserted Successfully");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void showBooks() {
        Connection con;
        try{
            con=DBconnection.createConnection();
            Statement st=con.createStatement();
            String query="select * from books";
            ResultSet s=st.executeQuery(query);
            while(s.next()){
                System.out.println("\nid of book is "+s.getInt(1));
                System.out.println("Name of the book is "+s.getString(2));
                System.out.println("Name of the Author is "+s.getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void issueBook(int id) {
        Connection con;
        try{
            con=DBconnection.createConnection();
            Statement st=con.createStatement();
            String query="delete from books where id="+id;
            boolean bl=st.execute(query);
            if(!bl){
                System.out.println("Books has been successfully issued");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void returnBook(Library l) {
        Library l2=new Library();
        Connection con;
        try{
            con= DBconnection.createConnection();
            String query="insert into books(id,bname,author) values(?,?,?)";
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,l2.getId());
            pstm.setString(2,l2.getBname());
            pstm.setString(3,l2.getAuth());
            int bl=pstm.executeUpdate();
            if(bl!=0){
                System.out.println("Book has been returned succesfully");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void deleteBook(int id) {
        Connection con;
        try{
            con=DBconnection.createConnection();
            Statement st= con.createStatement();
            String query="delete from books where id="+id;
            boolean bl=st.execute(query);
            if(!bl){
                System.out.println("Book has been deleted successfully");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
