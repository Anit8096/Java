public class Java33 {
    public static void main(String[] args) {
        // static = keyword modifier. a single copy of variable/method is created and is shared b/w all instances 
        // of the class. The class "owns" that static method/variable

        /* Comment out the following 3 lines */
        // Friend F1 = new Friend("Jay");
        // Friend F2 = new Friend("Anav");
        // Friend F3 = new Friend("Arpit Bansal");
        System.out.println("Number of friends I have: " + Friend.Number_of_friends);
        Friend.DisplayFriends();
    }
}

/* 
 * Note: static member of a class can be accessed by an object of that class though 
 * it is not recommended to do so.
 */