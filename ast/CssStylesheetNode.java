package ast.Css;
import ast.ASTNode;

public class CssStylesheetNode extends ASTNode {

    // حذفنا rawCss لأننا نريد تخزين القواعد كعقد AST حقيقية
    public CssStylesheetNode(int lineNumber) {
        super("CssStylesheet", lineNumber);
    }

    // ميثود لإضافة القواعد (التي يستدعيها الـ Visitor)
    public void addRule(CssRuleNode rule) {
        addChild(rule); // هذه الميثود موجودة في ASTNode الأب
    }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- CssStylesheet (Line: " + lineNumber + ")");

        // أهم جزء: المرور على كل القواعد المضافة وطباعتها
        for (ASTNode child : children) {
            child.print(indent + 2);
        }
    }

    @Override
    public String getDescription() {
        return "CSS Stylesheet";
    }
}
