package ast;

import java.util.ArrayList;
import java.util.List;

public class IfStatementNode extends StatementNode {
    private ASTNode condition;
    private ASTNode thenBranch;
    private List<ASTNode> elifBranches;
    private ASTNode elseBranch;

    public IfStatementNode(int lineNumber) {
        super("IfStatement", lineNumber);
        this.elifBranches = new ArrayList<>();
    }

    public void setCondition(ASTNode condition) { this.condition = condition;}
    public void setThenBranch(ASTNode thenBranch)
    { this.thenBranch = thenBranch;}
    public void addElifBranch(ASTNode elifBranch) { this.elifBranches.add(elifBranch);}
    public void setElseBranch(ASTNode elseBranch) { this.elseBranch = elseBranch;}

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- IfStatement (Line: " + lineNumber + ")");
        System.out.println(ind + "    +-- Condition:");
        if (condition != null) condition.print(indent + 2);
        System.out.println(ind + "    +-- Then:");
        if (thenBranch != null) thenBranch.print(indent + 2);
        for (ASTNode elif : elifBranches) elif.print(indent + 1);
        if (elseBranch != null) elseBranch.print(indent + 1);
    }

    @Override
    public String getDescription() {
        return "IfStatement";
    }
}