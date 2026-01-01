package ast.html;

import ast.ASTNode;

/**
 * Jinja Expression Node
 * Represents: {{ variable }} or {{ object.property }}
 */
public class JinjaExpressionNode extends ASTNode {
    
    /** Expression (e.g., product.name) */
    private String expression;
    
    /**
     * Constructor
     * @param expression the expression
     * @param lineNumber line number
     */
    public JinjaExpressionNode(String expression, int lineNumber) {
        super("JinjaExpression", lineNumber);
        this.expression = expression;
    }
    
    // ==================== Getters & Setters ====================
    
    public String getExpression() {
        return expression;
    }
    
    public void setExpression(String expression) {
        this.expression = expression;
    }
    
    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "+-- JinjaExpression: {{ " + expression + " }} (Line: " + lineNumber + ")");
    }
    
    @Override
    public String getDescription() {
        return "{{ " + expression + " }}";
    }
}
