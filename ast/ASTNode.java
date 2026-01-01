package ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for all AST (Abstract Syntax Tree) nodes.
 * Implements OOP concepts: Abstraction and Inheritance.
 * 
 * Every node in the tree must inherit from this class.
 */
public abstract class ASTNode {
    
    // ==================== Core Properties ====================
    
    /** Node name - describes the type of node */
    protected String nodeName;


    /** Line number in source code */
    protected int lineNumber;
    
    /** List of child nodes */
    protected List<ASTNode> children;
    
    /** Parent node (optional - for tree navigation) */
    protected ASTNode parent;
    
    // ==================== Constructors ====================
    
    /**
     * Primary constructor
     * @param nodeName name of the node
     * @param lineNumber line number in source
     */
    public ASTNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();
        this.parent = null;
    }
    
    // ==================== Getters & Setters ====================
    
    public String getNodeName() {
        return nodeName;
    }
    
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    
    public int getLineNumber() {
        return lineNumber;
    }
    
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    
    public List<ASTNode> getChildren() {
        return children;
    }
    
    public ASTNode getParent() {
        return parent;
    }
    
    public void setParent(ASTNode parent) {
        this.parent = parent;
    }
    
    // ==================== Child Management ====================
    
    /**
     * Add a child node
     * @param child the child node to add
     */
    public void addChild(ASTNode child) {
        if (child != null) {
            child.setParent(this);
            this.children.add(child);
        }
    }
    
    /**
     * Add a list of child nodes
     * @param children list of nodes
     */
    public void addChildren(List<? extends ASTNode> children) {
        for (ASTNode child : children) {
            addChild(child);
        }
    }
    
    /**
     * Get the number of children
     * @return child count
     */
    public int getChildCount() {
        return children.size();
    }
    
    /**
     * Get child at specific index
     * @param index the index
     * @return the child node
     */
    public ASTNode getChild(int index) {
        if (index >= 0 && index < children.size()) {
            return children.get(index);
        }
        return null;
    }
    
    // ==================== Abstract Methods (must be implemented by subclasses) ====================
    
    /**
     * Print node information - abstract method implementing Polymorphism
     * Each subclass will implement this method in its own way
     * @param indent indentation level for hierarchical printing
     */
    public abstract void print(int indent);
    
    /**
     * Get detailed description of the node
     * @return node description
     */
    public abstract String getDescription();
    
    // ==================== Helper Methods for Printing ====================
    
    /**
     * Create indentation string for hierarchical printing
     * @param indent indentation level
     * @return indentation string
     */
    protected String getIndent(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }
    
    /**
     * Print the entire tree starting from this node
     */
    public void printTree() {
        print(0);
    }
    
    /**
     * Print basic node information
     * @param indent indentation level
     */
    protected void printNodeInfo(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "+-- " + nodeName + " (Line: " + lineNumber + ")");
    }
    
    /**
     * Print all children
     * @param indent indentation level
     */
    protected void printChildren(int indent) {
        for (ASTNode child : children) {
            child.print(indent + 1);
        }
    }
    
    // ==================== toString ====================
    
    @Override
    public String toString() {
        return nodeName + " [Line: " + lineNumber + "]";
    }

}
