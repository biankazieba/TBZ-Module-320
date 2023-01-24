package k05.manager;

import k05.model.Member;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * Manager class for members
 */
public class MemberManager implements IManager<Member> {

    private ArrayList<Member> members;

    /**
     * Initialize teams
     *
     * @since K02
     */
    public MemberManager() {
        members = new ArrayList<>(Arrays.asList(
                new Member("Leon", 17),
                new Member("Bianka", 16))
        );
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    @Override
    public void add(Member member) {
        this.members.add(member);
    }

    @Override
    public void remove(int index) {
        this.members.remove(index);
    }
}
