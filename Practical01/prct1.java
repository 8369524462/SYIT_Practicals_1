import java.util.Scanner; 

  

public class Member { 

  

    String memberName; 

    int memberId; 

  

    void getMemberDetails(String name, int id) { 

        memberName = name; 

        memberId = id; 

    } 

  

    void displayMemberDetails() { 

        System.out.println("\nMember Name: " + memberName); 

        System.out.println("Member ID: " + memberId); 

    } 

  

    // MAIN METHOD 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

  

        Borrow b = new Borrow(); 

  

        System.out.print("Enter Member Name: "); 

        String name = sc.nextLine(); 

  

        System.out.print("Enter Member ID: "); 

        int id = sc.nextInt(); 

  

        b.getMemberDetails(name, id); 

  

        System.out.print("Enter Fiction Books Borrowed: "); 

        b.fictionBooks = sc.nextInt(); 

  

        System.out.print("Enter Non-Fiction Books Borrowed: "); 

        b.nonFictionBooks = sc.nextInt(); 

  

        System.out.print("Enter Reference Books Borrowed: "); 

        b.referenceBooks = sc.nextInt(); 

  

        b.displayMemberDetails(); 

        b.displayBorrowDetails(); 

  

        sc.close(); 

    } 

} 

  

// Derived Class 

class Borrow extends Member { 

    int fictionBooks; 

    int nonFictionBooks; 

    int referenceBooks; 

  

    int calculateTotalBooks() { 

        return fictionBooks + nonFictionBooks + referenceBooks; 

    } 

  

    void displayBorrowDetails() { 

        System.out.println("Fiction Books Borrowed: " + fictionBooks); 

        System.out.println("Non-Fiction Books Borrowed: " + nonFictionBooks); 

        System.out.println("Reference Books Borrowed: " + referenceBooks); 

        System.out.println("Total Books Borrowed: " + calculateTotalBooks()); 

    } 

} 
