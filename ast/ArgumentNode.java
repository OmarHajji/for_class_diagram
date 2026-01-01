//package ast;
//
///**
// * Argument Node
// * Represents a function call argument: value or name=value
// */
//public class ArgumentNode extends ASTNode {
//
//    /** Argument name (for keyword arguments) */
//    private String name;
//
//    /** Argument value */
//    private ExpressionNode value;
//
//    /**
//     * Constructor
//     * @param lineNumber line number
//     */
//    public ArgumentNode(int lineNumber) {
//        super("Argument", lineNumber);
//    }
//
//    // ==================== Getters & Setters ====================
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public boolean isKeywordArgument() {
//        return name != null;
//    }
//
//    public ExpressionNode getValue() {
//        return value;
//    }
//
//    public void setValue(ExpressionNode value) {
//        this.value = value;
//        addChild(value);
//    }
//
//    @Override
//    public void print(int indent) {
//        String indentStr = getIndent(indent);
//        if (name != null) {
//            System.out.println(indentStr + "+-- Argument: " + name + "= (Line: " + lineNumber + ")");
//        } else {
//            System.out.println(indentStr + "+-- Argument (Line: " + lineNumber + ")");
//        }
//        if (value != null) {
//            value.print(indent + 1);
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        String valueDesc = value != null ? value.getDescription() : "?";
//        if (name != null) {
//            return name + "=" + valueDesc;
//        }
//        return valueDesc;
//    }
//}
