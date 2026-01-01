package ast;

import java.util.ArrayList;
import java.util.List;
// function
public class FunctionDefinitionNode extends ASTNode {

    private String name;
    private List<DecoratorNode> decorators = new ArrayList<>();
    private List<ParameterNode> parameters = new ArrayList<>();
    private List<StatementNode> bodyStatements = new ArrayList<>();

    public FunctionDefinitionNode(String name, int lineNumber) {
        super("FunctionDefinition", lineNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // ================= Decorators =================
    public void addDecorator(ASTNode decorator) {
        if (decorator != null) {
            decorators.add((DecoratorNode) decorator);
            addChild(decorator);
        }
    }

    // ================= Parameters =================
    public void addParameter(ASTNode parameter) {
        if (parameter != null) {
            parameters.add((ParameterNode) parameter);
            addChild(parameter);
        }
    }

    // ================= Body =================
    public void addBodyStatement(ASTNode statement) {
        if (statement != null) {
            bodyStatements.add((StatementNode) statement);
            addChild(statement);
        }
    }

    // ================= Printing =================
    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- FunctionDef: " + name + " (Line: " + lineNumber + ")");

        if (!decorators.isEmpty()) {
            System.out.println(ind + "|   +-- Decorators:");
            for (DecoratorNode d : decorators) {
                d.print(indent + 2);
            }
        }

        if (!parameters.isEmpty()) {
            System.out.println(ind + "|   +-- Parameters:");
            for (ParameterNode p : parameters) {
                p.print(indent + 2);
            }
        }

        if (!bodyStatements.isEmpty()) {
            System.out.println(ind + "|   +-- Body:");
            for (StatementNode s : bodyStatements) {
                s.print(indent + 2);
            }
        }
    }

    @Override
    public String getDescription() {
        return "FunctionDef: " + name;
    }
}
