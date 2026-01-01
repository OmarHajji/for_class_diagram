//package ast;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * While Loop Node
// * Represents: while condition:
// *                 body
// */
//public class WhileNode extends StatementNode {
//
//    /** Loop condition */
//    private ExpressionNode condition;
//
//    /** Loop body */
//    private List<StatementNode> body;
//
//    /**
//     * Constructor
//     * @param lineNumber line number
//     */
//    public WhileNode(int lineNumber) {
//        super("WhileLoop", lineNumber);
//        this.body = new ArrayList<>();
//    }
//
//    // ==================== Getters & Setters ====================
//
//    public ExpressionNode getCondition() {
//        return condition;
//    }
//
//    public void setCondition(ExpressionNode condition) {
//        this.condition = condition;
//        addChild(condition);
//    }
//
//    public List<StatementNode> getBody() {
//        return body;
//    }
//
//    public void addBodyStatement(StatementNode stmt) {
//        this.body.add(stmt);
//        addChild(stmt);
//    }
//
//    @Override
//    public void print(int indent) {
//        String indentStr = getIndent(indent);
//        System.out.println(indentStr + "+-- WhileLoop (Line: " + lineNumber + ")");
//        System.out.println(indentStr + "|   +-- Condition:");
//        if (condition != null) {
//            condition.print(indent + 2);
//        }
//        System.out.println(indentStr + "|   +-- Body:");
//        for (StatementNode stmt : body) {
//            stmt.print(indent + 2);
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        String condDesc = condition != null ? condition.getDescription() : "?";
//        return "while " + condDesc + ":";
//    }
//}
