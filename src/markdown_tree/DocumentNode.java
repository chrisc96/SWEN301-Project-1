package markdown_tree;

/**
 * Represents the root node of the markdown tree
 */
public class DocumentNode extends I_BlockNode {

    public DocumentNode(I_BlockNode parent) {
        super(parent);
    }

    @Override
    public StringBuilder outputToHtml() {
        StringBuilder hello = new StringBuilder(
            "<!DOCTYPE html>\n<html>\n<head>\n<title>Markdown2HTML</title>\n</head>\n\n<body>\n");

        for (BlockNode node: children) {
            hello.append(node.outputToHtml());
        }

        hello.append("</body>\n\n</html>");
        return hello;
    }

    @Override
    public StringBuilder outputToLaTeX() {
        return null;
    }

    @Override
    public StringBuilder outputToASCII() {
        return null;
    }
}