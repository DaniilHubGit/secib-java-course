package upper.lesson02;

import java.util.ArrayList;
import java.util.Iterator;

public class UserAccountRepository {
    protected ArrayList<UserAccount> userAccountList;

    /**
     * 
     */
    public UserAccountRepository () {
        this.userAccountList = new ArrayList<UserAccount>();
    }

    /**
     * Adding a UserAccount instance to the repository
     * @param userAccount
     */
    public void addUserAccount(UserAccount userAccount) {
        this.userAccountList.add(userAccount);
    }

    /**
     * Please refer to 4.2.2 for standard operations of collections
     * @param username
     * @return
     */
    public UserAccount findByUsername(String username) {
        Iterator<UserAccount> it = userAccountList.iterator();
        while (it.hasNext()) {
            UserAccount compare = it.next();
            if (compare.username == username) {
                return compare;
            }
        }
        return null;
    }
}
