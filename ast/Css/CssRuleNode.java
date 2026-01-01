package ast.Css;
import  ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class CssRuleNode extends CssNode {
    private CssSelectorNode selector;
    private final List<CssDeclarationNode> declarations = new ArrayList<>();

    public CssRuleNode(int lineNumber) {
        super("CssRule", lineNumber);
    }

    public void setSelector(CssSelectorNode selector) {
        this.selector = selector;
        addChild(selector);
    }

    public CssSelectorNode getSelector() {
        return selector;
    }

    public void addDeclaration(CssDeclarationNode declaration) {
        declarations.add(declaration);
        addChild(declaration);
    }

    public List<CssDeclarationNode> getDeclarations() {
        return declarations;
    }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- CssRule (Line: " + lineNumber + ")");
        if (selector != null) {
            selector.print(indent + 2);
        }
        System.out.println(ind + "  +-- Declarations:");
        for (CssDeclarationNode d : declarations) {
            d.print(indent + 4);
        }
    }

    @Override
    public String getDescription() {
        return "CSS Rule";
    }

}
