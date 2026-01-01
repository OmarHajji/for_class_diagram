//package ast;
//
///**
// * Member Access Node
// * Represents: object.member
// */
//public class MemberAccessNode extends ExpressionNode {
//
//    /** Object being accessed */
//    private ExpressionNode object;
//
//    /** Member name */
//    private String memberName;
//
//    /**
//     * Constructor
//     * @param memberName member name
//     * @param lineNumber line number
//     */
//    public MemberAccessNode(String memberName, int lineNumber) {
//        super("MemberAccess", lineNumber);
//        this.memberName = memberName;
//    }
//
//    // ==================== Getters & Setters ====================
//
//    public ExpressionNode getObject() {
//        return object;
//    }
//
//    public void setObject(ExpressionNode object) {
//        this.object = object;
//        addChild(object);
//    }
//
//    public String getMemberName() {
//        return memberName;
//    }
//
//    public void setMemberName(String memberName) {
//        this.memberName = memberName;
//    }
//
//    @Override
//    public void print(int indent) {
//        String indentStr = getIndent(indent);
//        System.out.println(indentStr + "+-- MemberAccess: ." + memberName + " (Line: " + lineNumber + ")");
//        System.out.println(indentStr + "|   +-- Object:");
//        if (object != null) {
//            object.print(indent + 2);
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        String objectDesc = object != null ? object.getDescription() : "?";
//        return objectDesc + "." + memberName;
//    }
//}
