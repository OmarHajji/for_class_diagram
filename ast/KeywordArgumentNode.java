//package ast;
//
//public class KeywordArgumentNode extends ASTNode {
//    private String name;
//    private ASTNode value;
//
//    public KeywordArgumentNode(String name, int lineNumber) {
//        super("KeywordArgument", lineNumber);
//        this.name = name;
//    }
//
//    public void setValue(ASTNode value) {
//        this.value = value;
//    }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- KeywordArg: " + name + "= (Line: " + lineNumber + ")");
//        if (value != null) value.print(indent + 1);
//    }
//
//    @Override
//    public String getDescription() {
//        return "KeywordArg: " + name;
//    }
//}