package ast;

/**
 * Expression Statement Node
 * Represents an expression used as a statement (e.g., function call)
 */

// هون بتخيل عندي print (...)
public class ExpressionStatementNode extends StatementNode {
    
    /** The expression */
    private ExpressionNode expression;

    /**
     * Constructor
     * @param lineNumber line number
     */
    public ExpressionStatementNode(int lineNumber)
    {
        super("ExpressionStatement", lineNumber);
    }
    
    // ==================== Getters & Setters ====================
    
    public ExpressionNode getExpression() {
        return expression;
    }
    
    public void setExpression(ExpressionNode expression) {
        this.expression = expression;
        addChild(expression);
    }
    
    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "+-- ExpressionStatement (Line: " + lineNumber + ")");
        if (expression != null) {
            expression.print(indent + 1);
        }
    }
    
    @Override
    public String getDescription() {
        return expression != null ? expression.getDescription() : "?";
    }
}
