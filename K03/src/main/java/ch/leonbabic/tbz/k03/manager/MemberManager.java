package ch.leonbabic.tbz.k03.manager;

import ch.leonbabic.tbz.k03.model.Member;

public class MemberManager {

    private Member[] members;

    public MemberManager() {
        this.members = new Member[]{
                new Member("Leon", 17),
                new Member("Bianka", 16),
        };
    }

    public Member[] getMembers() {
        return members;
    }
}
