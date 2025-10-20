/*
4. Library Book Availability 
Scenario: A library wants to keep track of available copies without letting external code change it 
directly. 
Problem Statement: 
Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies. 
Fields: 
● private int copiesAvailable 
Methods: 
● addCopies(int n) → add copies 
● removeCopies(int n) → subtract if enough copies 
● getCopiesAvailable() → return current copies 
Sample Input: 
add 3 copies, remove 1 copy 
Sample Output: 
Copies available = 2


*/

class Book {
    private int copiesAvailable;

    public void addCopies(int n) {
        if (n > 0) {
            copiesAvailable += n;
            System.out.println(n + " copies added");
        }
    }

    public void removeCopies(int n) {
        if (n > 0 && n <= copiesAvailable) {
            copiesAvailable -= n;
            System.out.println(n + " copies removed");
        } else {
            System.out.println("Not enough copies to remove");
        }
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.addCopies(3);
        b1.removeCopies(1);
        System.out.println("Copies available = " + b1.getCopiesAvailable());
    }
}


/*


C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac Book.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java Book
3 copies added
1 copies removed
Copies available = 2


*/
