package ast;

import java.util.ArrayList;
import java.util.List;

/**
 * For Loop Node
 * Represents: for variable in iterable:
 *                 body
 */
public class ForNode extends StatementNode {

    /** Loop variable name */
    private String variableName;

    /** Iterable expression */
    private ExpressionNode iterable;

    /** Loop body */
    private List<StatementNode> body;

    /**
     * Constructor
     * @param variableName loop variable name
     * @param lineNumber line number
     */
    public ForNode(String variableName, int lineNumber) {
        super("ForLoop", lineNumber);
        this.variableName = variableName;
        this.body = new ArrayList<>();
    }

    // ==================== Getters & Setters ====================

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public ExpressionNode getIterable() {
        return iterable;
    }

    public void setIterable(ExpressionNode iterable) {
        this.iterable = iterable;
        addChild(iterable);
    }

    public List<StatementNode> getBody() {
        return body;
    }

    public void addBodyStatement(StatementNode stmt) {
        this.body.add(stmt);
        addChild(stmt);
    }

    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "+-- ForLoop (Line: " + lineNumber + ")");
        System.out.println(indentStr + "|   +-- Variable: " + variableName);
        System.out.println(indentStr + "|   +-- Iterable:");
        if (iterable != null) {
            iterable.print(indent + 2);
        }
        System.out.println(indentStr + "|   +-- Body:");
        for (StatementNode stmt : body) {
            stmt.print(indent + 2);
        }
    }

    @Override
    public String getDescription() {
        String iterDesc = iterable != null ? iterable.getDescription() : "?";
        return "for " + variableName + " in " + iterDesc + ":";
    }
}
