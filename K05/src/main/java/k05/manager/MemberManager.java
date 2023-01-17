package k05.manager;

import k05.model.Member;

/**
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * Manager class for members
 */
public class MemberManager extends AbstractManager<Member> {

    /**
     * Initialize teams
     *
     * @since K02
     */
    public MemberManager() {
        super(new Member[]{
                new Member("Leon", 17),
                new Member("Bianka", 16),
        });
    }

}
