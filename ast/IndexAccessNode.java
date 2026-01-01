//package ast;
//
///**
// * Index Access Node
// * Represents: array[index]
// */
//public class IndexAccessNode extends ExpressionNode {
//
//    /** Object being indexed */
//    private ExpressionNode object;
//
//    /** Index expression */
//    private ExpressionNode index;
//
//    /**
//     * Constructor
//     * @param lineNumber line number
//     */
//    public IndexAccessNode(int lineNumber) {
//        super("IndexAccess", lineNumber);
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
//    public ExpressionNode getIndex() {
//        return index;
//    }
//
//    public void setIndex(ExpressionNode index) {
//        this.index = index;
//        addChild(index);
//    }
//
//    @Override
//    public void print(int indent) {
//        String indentStr = getIndent(indent);
//        System.out.println(indentStr + "+-- IndexAccess (Line: " + lineNumber + ")");
//        System.out.println(indentStr + "|   +-- Object:");
//        if (object != null) {
//            object.print(indent + 2);
//        }
//        System.out.println(indentStr + "|   +-- Index:");
//        if (index != null) {
//            index.print(indent + 2);
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        String objectDesc = object != null ? object.getDescription() : "?";
//        String indexDesc = index != null ? index.getDescription() : "?";
//        return objectDesc + "[" + indexDesc + "]";
//    }
//}
