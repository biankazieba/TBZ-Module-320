package k07.manager;

import k07.model.Address;
import k07.model.Member;

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
                new Member("Leon", 17, new Address(8106)),
                new Member("Bianka", 16, new Address("Street 81", 8005)))
        );
        ListSorter<Member> sorter = new ListSorter<>(members);
        sorter.sort();
        members = sorter.getItems();
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
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
