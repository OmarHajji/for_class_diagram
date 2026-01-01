package ast.html;

import ast.ASTNode;

/**
 * HTML Attribute Node
 * Represents: name="value" or just name
 */
public class HtmlAttributeNode extends ASTNode {
    
    /** Attribute name */
    private String attributeName;
    
    /** Attribute value (may be null) */
    private String attributeValue;
    
    /**
     * Constructor
     * @param attributeName attribute name
     * @param lineNumber line number
     */
    public HtmlAttributeNode(String attributeName, int lineNumber) {
        super("HtmlAttribute", lineNumber);
        this.attributeName = attributeName;
        this.attributeValue = null;
    }
    
    // ==================== Getters & Setters ====================
    
    public String getAttributeName() {
        return attributeName;
    }
    
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    public String getAttributeValue() {
        return attributeValue;
    }
    
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
    
    public boolean hasValue() {
        return attributeValue != null;
    }
    
    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        if (attributeValue != null) {
            System.out.println(indentStr + "+-- Attribute: " + attributeName + "=" + attributeValue + " (Line: " + lineNumber + ")");
        } else {
            System.out.println(indentStr + "+-- Attribute: " + attributeName + " (Line: " + lineNumber + ")");
        }
    }
    
    @Override
    public String getDescription() {
        if (attributeValue != null) {
            return attributeName + "=" + attributeValue;
        }
        return attributeName;
    }
}
