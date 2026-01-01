package ast;

public class StatementNode extends ASTNode {
    private String statementType;

    public StatementNode(String statementType, int lineNumber) {
        super("Statement", lineNumber);
        this.statementType = statementType;
    }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- " + statementType + " (Line: " + lineNumber + ")");
    }

    @Override
    public String getDescription() {
        return statementType;
    }
}