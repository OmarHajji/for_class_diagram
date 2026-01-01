package ast;

/**
 * Program Node - Root of the AST
 * Represents an entire program/file
 */
public class ProgramNode extends ASTNode {
    
    /** Source file name */
    private String fileName;
    
    /**
     * Constructor
     * @param fileName source file name
     * @param lineNumber line number
     */
    public ProgramNode(String fileName, int lineNumber) {
        super("Program", lineNumber);
        this.fileName = fileName;
    }
    
    // ==================== Getters & Setters ====================
    
    public String getFileName() {
        return fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "================================================");
        System.out.println(indentStr + "| PROGRAM: " + fileName);
        System.out.println(indentStr + "| Line: " + lineNumber);
        System.out.println(indentStr + "================================================");
        
        // Print all children
        for (ASTNode child : children) {
            child.print(indent + 1);
        }
    }
    
    @Override
    public String getDescription() {
        return "Program: " + fileName;
    }
}
