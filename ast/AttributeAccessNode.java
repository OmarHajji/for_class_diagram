//package ast;
//
///**
// * Node for attribute access (obj.attr)
// */public class AttributeAccessNode extends ASTNode {
//    private String attributeName;
//    private ASTNode object;
//
//    public AttributeAccessNode(String attributeName, int lineNumber) {
//        super("AttributeAccess", lineNumber);
//        this.attributeName = attributeName;
//    }
//
//    public void setObject(ASTNode object) {
//        this.object = object;
//    }
//
//    @Override
//    public void print(int indent) {
//        String indentStr = getIndent(indent);
//        System.out.println(indentStr + "+-- AttributeAccess: ." + attributeName + " (Line: " + lineNumber + ")");
//        if (object != null) {
//            System.out.println(indentStr + "   +-- Object:");
//            object.print(indent + 2);
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        return "AttributeAccess: " + attributeName;
//    }
//}