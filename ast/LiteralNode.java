//package ast;
//
//public class LiteralNode extends ASTNode {
//    private String value;
//    private String literalType;
//
//    public LiteralNode(String value, String literalType, int lineNumber) {
//        super("Literal", lineNumber);
//        this.value = value;
//        this.literalType = literalType;
//    }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- " + literalType + ": " + value + " (Line: " + lineNumber + ")");
//    }
//
//    @Override
//    public String getDescription() {
//        return literalType + ": " + value;
//    }
//}