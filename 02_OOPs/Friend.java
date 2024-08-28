public class Friend {
    // Used in file Named Java33.java
    String name; // static variable
    static int Number_of_friends;

    Friend(String NME) {
        this.name = NME;
        Number_of_friends++;
    }

    static void DisplayFriends() {  // static Method
        System.out.println("Number of friends I have: " + Number_of_friends);
    }
}
