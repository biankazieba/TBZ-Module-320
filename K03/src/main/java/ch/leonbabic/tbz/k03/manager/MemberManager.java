package ch.leonbabic.tbz.k03.manager;

import ch.leonbabic.tbz.k03.model.Member;

/**
 * Manager class for members
 */
public class MemberManager {

    private Member[] members;

    /**
     * Initialize teams
     */
    public MemberManager() {
        this.members = new Member[]{
                new Member("Leon", 17),
                new Member("Bianka", 16),
        };
    }

    /**
     * @return members
     */
    public Member[] getMembers() {
        return members;
    }
}
