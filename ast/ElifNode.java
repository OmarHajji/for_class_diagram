//package ast;
//
//public class ElifNode extends StatementNode {
//    private ASTNode condition;
//    private ASTNode body;
//
//    public ElifNode(int lineNumber) {
//        super("Elif", lineNumber);
//    }
//
//    public void setCondition(ASTNode condition) {
//        this.condition = condition;
//    }
//
//    public void setBody(ASTNode body) {
//        this.body = body;
//    }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- Elif (Line: " + lineNumber + ")");
//        System.out.println(ind + "    +-- Condition:");
//        if (condition != null) condition.print(indent + 2);
//        System.out.println(ind + "    +-- Body:");
//        if (body != null) body.print(indent + 2);
//    }
//
//    @Override
//    public String getDescription() {
//        return "Elif";
//    }
//}