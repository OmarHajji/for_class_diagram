//package ast;
//
//public class IdentifierNode extends ASTNode {
//    private String name;
//
//    public IdentifierNode(String name, int lineNumber) {
//        super("Identifier", lineNumber);
//        this.name = name;
//    }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- Identifier: " + name + " (Line: " + lineNumber + ")");
//    }
//
//    @Override
//    public String getDescription() {
//        return "Identifier: " + name;
//    }
//}