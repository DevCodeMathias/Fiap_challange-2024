package Model;

import java.util.*;

public class LeaderBoard {

    private List<Student> UsersRank;

    //populando (não faz parte dos atributos )
     List<Student> Database = Arrays.asList(
            new Student("Alice","Student" ,150),
            new Student("Bob","Student" ,120),
            new Student("Charlie","Student" ,100),
            new Student("David","Student" ,80),
            new Student("Emily","Student" ,60),
            new Student("Frank","Student" ,50),
            new Student("Grace","Student" ,40),
            new Student("Harry","Student" ,30),
            new Student("Ivy","Student" ,20),
            new Student("Jack","Student" ,10)
    );

    public LeaderBoard(){
        UsersRank = new ArrayList<>(Database);
        rankingorder();
    }

    public List<Student> getUsersRank() {
        return UsersRank;
    }

    public void setUsersRank(List<Student> usersRank) {
        UsersRank = usersRank;
    }

    private List<Student> rankingorder() {

        List<Student> orderList = new ArrayList<>(UsersRank);

        Collections.sort(orderList, (u1, u2) -> Integer.compare(u2.getPoints(), u1.getPoints()));

        return orderList;
    }

    public List<Student> getFiveFirstPosition() {
        List<Student> rankedUsers = rankingorder();
        int numTopUsers = 5;

        if (rankedUsers.size() < numTopUsers) {

            return new ArrayList<>(rankedUsers);
        } else {

            return rankedUsers.subList(0, numTopUsers);
        }
    }
}


