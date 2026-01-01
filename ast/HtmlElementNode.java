package ast.html;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

/**
 * HTML Element Node
 * Represents: <tag attr="value">content</tag>
 */
public class HtmlElementNode extends ASTNode {
    
    /** Element types */
    public enum ElementType {
        REGULAR,      // <div>...</div>
        SELF_CLOSING, // <img />
        VOID          // <input>
    }
    
    /** Tag name */
    private String tagName;
    
    /** Element type */
    private ElementType elementType;
    
    /** Attributes list */
    private List<HtmlAttributeNode> attributes;
    
    /**
     * Constructor
     * @param tagName tag name
     * @param elementType element type
     * @param lineNumber line number
     */
    public HtmlElementNode(String tagName, ElementType elementType, int lineNumber) {
        super("HtmlElement", lineNumber);
        this.tagName = tagName;
        this.elementType = elementType;
        this.attributes = new ArrayList<>();
    }
    
    // ==================== Getters & Setters ====================
    
    public String getTagName() {
        return tagName;
    }
    
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    
    public ElementType getElementType() {
        return elementType;
    }
    
    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }
    
    public List<HtmlAttributeNode> getAttributes() {
        return attributes;
    }
    
    public void addAttribute(HtmlAttributeNode attr) {
        this.attributes.add(attr);
    }
    
    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "+-- HtmlElement <" + tagName + ">  (Line: " + lineNumber + ")");
        
        // Print attributes
        if (!attributes.isEmpty()) {
            System.out.println(indentStr + "|   +-- Attributes:");
            for (HtmlAttributeNode attr : attributes) {
                attr.print(indent + 2);
            }
        }
        
        // Print content (children)
        if (!children.isEmpty()) {
            System.out.println(indentStr + "|   +-- Content:");
            for (ASTNode child : children) {
                child.print(indent + 2);
            }
        }
    }
    
    @Override
    public String getDescription() {
        return "<" + tagName + ">";
    }
}
