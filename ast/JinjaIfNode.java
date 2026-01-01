package ast.html;

import ast.ASTNode;

/**
 * Jinja If Block Node
 * Represents: {% if condition %}...{% endif %}
 */
public class JinjaIfNode extends ASTNode {
    
    /** Condition */
    private String condition;
    
    /**
     * Constructor
     * @param condition the condition
     * @param lineNumber line number
     */
    public JinjaIfNode(String condition, int lineNumber) {
        super("JinjaIfBlock", lineNumber);
        this.condition = condition;
    }
    
    // ==================== Getters & Setters ====================
    
    public String getCondition() {
        return condition;
    }
    
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "+-- JinjaIfBlock (Line: " + lineNumber + ")");
        System.out.println(indentStr + "|   +-- Condition: " + condition);
        System.out.println(indentStr + "|   +-- Body:");
        for (ASTNode child : children) {
            child.print(indent + 2);
        }
    }
    
    @Override
    public String getDescription() {
        return "{% if " + condition + " %}";
    }
}
