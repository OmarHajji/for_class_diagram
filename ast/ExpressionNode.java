package ast;

/**
 * Abstract class for expression nodes.
 * An expression is a code fragment that evaluates to a value (e.g., a + b, func()).
 */
public abstract class ExpressionNode extends ASTNode {
    
    /**
     * Constructor
     * @param nodeName name of the node
     * @param lineNumber line number in source
     */
    public ExpressionNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber);
    }
}
