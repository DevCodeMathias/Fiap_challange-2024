package Model;

import java.util.*;

public class LeaderBoard {

    private List<User> UsersRank;
     private List<User> Database = Arrays.asList(
            new User("Alice", 150),
            new User("Bob", 120),
            new User("Charlie", 100),
            new User("David", 80),
            new User("Emily", 60),
            new User("Frank", 50),
            new User("Grace", 40),
            new User("Harry", 30),
            new User("Ivy", 20),
            new User("Jack", 10)
    );

    public LeaderBoard(){
        UsersRank = new ArrayList<>(Database); // prototipo de usuários
        rankingorder();
    }

    public List<User> getUsersRank() {
        return UsersRank;
    }

    public void setUsersRank(List<User> usersRank) {
        UsersRank = usersRank;
    }

    private List<User> rankingorder() {

        List<User> orderList = new ArrayList<>(UsersRank);


        Collections.sort(orderList, (u1, u2) -> Integer.compare(u2.getPoints(), u1.getPoints()));

        return orderList;
    }

    public List<User> getFiveFirstPosition() {
        List<User> rankedUsers = rankingorder(); // Get ranked users
        int numTopUsers = 5;

        if (rankedUsers.size() < numTopUsers) {

            return new ArrayList<>(rankedUsers); // Return all available users
        } else {

            return rankedUsers.subList(0, numTopUsers);
        }
    }
}


