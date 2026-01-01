package ast.html;

import ast.ASTNode;

/**
 * HTML Document Node
 * Represents an entire HTML document
 */
public class HtmlDocumentNode extends ASTNode {
    
    /** Has DOCTYPE declaration */
    private boolean hasDoctype;
    
    /**
     * Constructor
     * @param lineNumber line number
     */
    public HtmlDocumentNode(int lineNumber) {
        super("HtmlDocument", lineNumber);
        this.hasDoctype = false;
    }
    
    // ==================== Getters & Setters ====================
    
    public boolean hasDoctype() {
        return hasDoctype;
    }
    
    public void setHasDoctype(boolean hasDoctype) {
        this.hasDoctype = hasDoctype;
    }
    
    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "================================================");
        System.out.println(indentStr + "| HTML DOCUMENT");
        System.out.println(indentStr + "| Line: " + lineNumber);
        System.out.println(indentStr + "| DOCTYPE: " + (hasDoctype ? "yes" : "no"));
        System.out.println(indentStr + "================================================");
        
        // Print all children
        for (ASTNode child : children) {
            child.print(indent + 1);
        }
    }
    
    @Override
    public String getDescription() {
        return "HTML Document with " + getChildCount() + " elements";
    }
}
