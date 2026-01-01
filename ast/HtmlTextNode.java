package ast.html;

import ast.ASTNode;

/**
 * HTML Text Node
 * Represents text content between tags
 */
public class HtmlTextNode extends ASTNode {
    
    /** Text content */
    private String text;
    
    /**
     * Constructor
     * @param text the text
     * @param lineNumber line number
     */
    public HtmlTextNode(String text, int lineNumber) {
        super("HtmlText", lineNumber);
        this.text = text;
    }
    
    // ==================== Getters & Setters ====================
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        // Truncate long text
        String displayText = text.length() > 50 ? text.substring(0, 47) + "..." : text;
        displayText = displayText.replace("\n", "\\n").replace("\r", "\\r");
        System.out.println(indentStr + "+-- HtmlText: \"" + displayText + "\" (Line: " + lineNumber + ")");
    }
    
    @Override
    public String getDescription() {
        return "\"" + (text.length() > 20 ? text.substring(0, 17) + "..." : text) + "\"";
    }
}
