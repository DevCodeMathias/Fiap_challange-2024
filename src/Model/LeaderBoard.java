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

    //retornar uma lista ordenada dos usuários
    private void rankingorder(){
        int aux = 0;
        for(int i = 0;  i <= UsersRank.size(); i++){
           User indexUser = UsersRank.get(i);
           int points = indexUser.getPoints();
        }
    }

}
