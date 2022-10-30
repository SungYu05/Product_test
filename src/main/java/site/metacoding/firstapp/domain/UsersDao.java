package site.metacoding.firstapp.domain;

import java.util.List;

public interface UsersDao {
    public Users findById(Integer usersId);
    public List<Users> findAll();
    public int insert(Users users);
    public int update(Users users);
    public int deleteById(Integer usersId);
    public Users findByUsersName(String usersName);
}
