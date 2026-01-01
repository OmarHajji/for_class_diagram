//package ast;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * If Statement Node
// * Represents: if condition:
// *                 body
// *             elif condition:
// *                 body
// *             else:
// *                 body
// */
//public class IfNode extends StatementNode {
//
//    /** Condition expression */
//    private ExpressionNode condition;
//
//    /** Then body (if block) */
//    private List<StatementNode> thenBody;
//
//    /** Elif clauses */
//    private List<ElifClause> elifClauses;
//
//    /** Else body */
//    private List<StatementNode> elseBody;
//
//    /**
//     * Inner class for elif clause
//     */
//    public static class ElifClause {
//        public ExpressionNode condition;
//        public List<StatementNode> body;
//        public int lineNumber;
//
//        public ElifClause(ExpressionNode condition, int lineNumber) {
//            this.condition = condition;
//            this.lineNumber = lineNumber;
//            this.body = new ArrayList<>();
//        }
//    }
//
//    /**
//     * Constructor
//     * @param lineNumber line number
//     */
//    public IfNode(int lineNumber) {
//        super("IfStatement", lineNumber);
//        this.thenBody = new ArrayList<>();
//        this.elifClauses = new ArrayList<>();
//        this.elseBody = new ArrayList<>();
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
//    public List<StatementNode> getThenBody() {
//        return thenBody;
//    }
//
//    public void addThenStatement(StatementNode stmt) {
//        this.thenBody.add(stmt);
//        addChild(stmt);
//    }
//
//    public List<ElifClause> getElifClauses() {
//        return elifClauses;
//    }
//
//    public void addElifClause(ElifClause clause) {
//        this.elifClauses.add(clause);
//        addChild(clause.condition);
//        for (StatementNode stmt : clause.body) {
//            addChild(stmt);
//        }
//    }
//
//    public List<StatementNode> getElseBody() {
//        return elseBody;
//    }
//
//    public void addElseStatement(StatementNode stmt) {
//        this.elseBody.add(stmt);
//        addChild(stmt);
//    }
//
//    public boolean hasElse() {
//        return !elseBody.isEmpty();
//    }
//
//    @Override
//    public void print(int indent) {
//        String indentStr = getIndent(indent);
//        System.out.println(indentStr + "+-- IfStatement (Line: " + lineNumber + ")");
//
//        // Print condition
//        System.out.println(indentStr + "|   +-- Condition:");
//        if (condition != null) {
//            condition.print(indent + 2);
//        }
//
//        // Print then body
//        System.out.println(indentStr + "|   +-- Then:");
//        for (StatementNode stmt : thenBody) {
//            stmt.print(indent + 2);
//        }
//
//        // Print elif clauses
//        for (ElifClause elif : elifClauses) {
//            System.out.println(indentStr + "|   +-- Elif (Line: " + elif.lineNumber + "):");
//            System.out.println(indentStr + "|       +-- Condition:");
//            elif.condition.print(indent + 3);
//            System.out.println(indentStr + "|       +-- Body:");
//            for (StatementNode stmt : elif.body) {
//                stmt.print(indent + 3);
//            }
//        }
//
//        // Print else body
//        if (!elseBody.isEmpty()) {
//            System.out.println(indentStr + "|   +-- Else:");
//            for (StatementNode stmt : elseBody) {
//                stmt.print(indent + 2);
//            }
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        return "if " + (condition != null ? condition.getDescription() : "?") + ":";
//    }
//}
