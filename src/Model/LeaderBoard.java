package Model;

import java.util.List;

public class LeaderBoard {
    private List<User> UsersRank;

    public LeaderBoard(){
        rankingorder(); //toda vez que é chamado ele ordena o ranking
    }

    public List<User> getUsersRank() {
        return UsersRank;
    }

    public void setUsersRank(List<User> usersRank) {
        UsersRank = usersRank;
    }

    private void rankingorder(){
        //ordenação de ranking
    }

}
