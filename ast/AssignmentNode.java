package ast;


// هون  بس متغير مع تصريح عنو
public class AssignmentNode extends StatementNode {
    private String targetName;// المتغير
    private ASTNode value; // قيمتو

    public AssignmentNode(String targetName, int lineNumber) {
        super("Assignment", lineNumber);
        this.targetName = targetName;
    }

    public void setValue(ASTNode value) {
        this.value = value;
        if (value != null)
            addChild(value);
    }

    public String getTargetName() {
        return targetName;
    }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- Assignment: " + targetName + " (Line: " + lineNumber + ")");
        if (value != null) {
            System.out.println(ind + "    +-- Value:");
            value.print(indent + 2);
        }
    }

    @Override
    public String getDescription() {
        return "Assignment to: " + targetName;
    }
}
