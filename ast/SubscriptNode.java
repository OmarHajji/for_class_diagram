//package ast;
//
//public class SubscriptNode extends ASTNode {
//    private ASTNode object;
//    private ASTNode index;
//
//    public SubscriptNode(int lineNumber) {
//        super("Subscript", lineNumber);
//    }
//
//    public void setObject(ASTNode object) { this.object = object; }
//    public void setIndex(ASTNode index) { this.index = index; }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- Subscript (Line: " + lineNumber + ")");
//        if (object != null) {
//            System.out.println(ind + "    +-- Object:");
//            object.print(indent + 2);
//        }
//        if (index != null) {
//            System.out.println(ind + "    +-- Index:");
//            index.print(indent + 2);
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        return "Subscript";
//    }
//}