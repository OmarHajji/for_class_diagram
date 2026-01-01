package ast.html;

import ast.ASTNode;

/**
 * Jinja For Loop Node
 * Represents: {% for item in items %}...{% endfor %}
 */
public class JinjaForNode extends ASTNode {
    
    /** Loop variable name */
    private String variableName;
    
    /** Iterable name */
    private String iterableName;
    
    /**
     * Constructor
     * @param variableName variable name
     * @param iterableName iterable name
     * @param lineNumber line number
     */
    public JinjaForNode(String variableName, String iterableName, int lineNumber) {
        super("JinjaForLoop", lineNumber);
        this.variableName = variableName;
        this.iterableName = iterableName;
    }
    
    // ==================== Getters & Setters ====================
    
    public String getVariableName() {
        return variableName;
    }
    
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }
    
    public String getIterableName() {
        return iterableName;
    }
    
    public void setIterableName(String iterableName) {
        this.iterableName = iterableName;
    }
    
    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "+-- JinjaForLoop (Line: " + lineNumber + ")");
        System.out.println(indentStr + "|   +-- Variable: " + variableName);
        System.out.println(indentStr + "|   +-- Iterable: " + iterableName);
        System.out.println(indentStr + "|   +-- Body:");
        for (ASTNode child : children) {
            child.print(indent + 2);
        }
    }
    
    @Override
    public String getDescription() {
        return "{% for " + variableName + " in " + iterableName + " %}";
    }
}
