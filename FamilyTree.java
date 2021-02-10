import java.util.List;

public class FamilyTree {
    private FamilyMember headOfFamily;

    public FamilyTree() {
        this.headOfFamily = headOfFamily;
    }

    public List<FamilyMember> getAll() {
        List<FamilyMember> all = new ArrayList<FamilyMember>();
        FamilyMember member = headOfFamily;
        all.add(member);
        for (int i = 0; i < children.size(); ++i) {
            parents.addAll(children.get(i).getAll());
        }
    }

    public List<FamilyMember> getParents() {
        List<FamilyMember> parents = new ArrayList<FamilyMember>();

        if (headOfFamily.children.size() > 0) {
            parents.add(headOfFamily);
            for (int i = 0; i < children.size(); ++i) {
                parents.addAll(children.get(i).getParents());
            }
        }
        return parents
    }

    public List

}
