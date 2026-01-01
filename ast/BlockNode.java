package ast;

public class BlockNode extends ASTNode {
    public BlockNode(int lineNumber) {
        super("Block", lineNumber);
    }

    @Override
    public void print(int indent) {
        printChildren(indent);
    }

    @Override
    public String getDescription() {
        return "Block";
    }
}