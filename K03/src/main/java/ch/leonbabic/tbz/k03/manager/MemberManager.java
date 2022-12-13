package ch.leonbabic.tbz.k03.manager;

import ch.leonbabic.tbz.k03.model.Member;

/**
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * Manager class for members
 */
public class MemberManager {

    private Member[] members;

    /**
     * Initialize teams
     *
     * @since K02
     */
    public MemberManager() {
        this.members = new Member[]{
                new Member("Leon", 17),
                new Member("Bianka", 16),
        };
    }

    /**
     * @return members
     * @since K02
     */
    public Member[] getMembers() {
        return members;
    }
}
