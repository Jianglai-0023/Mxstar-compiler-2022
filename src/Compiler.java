import AST.ASTBuilder;
import AST.ASTNode.RootNode;
import Checker.SemanticsCheck;
import Checker.SymbolCollector;
import Parser.MxstarGrammarLexer;
import Parser.MxstarGrammarParser;
import Util.*;

import java.io.FileInputStream;
import java.io.InputStream;

import Util.error.MxErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Compiler {
    public static void main(String[] args) throws Exception{
//        String name = "testcases/sema/basic-package/basic-1.mx";
//        InputStream input_stream = new FileInputStream(name);

        InputStream input_stream = System.in;
        CharStream charstream = CharStreams.fromStream(input_stream);
        try
        {
            RootNode ASTRoot;
            globalScope gScope = new globalScope(null);
            MxstarGrammarLexer lexer = new MxstarGrammarLexer(charstream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new MxErrorListener());
            MxstarGrammarParser parser = new MxstarGrammarParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(new MxErrorListener());
            ParseTree parseTreeRoot = parser.program();
            ASTBuilder astBuilder = new ASTBuilder(gScope);
            ASTRoot = (RootNode) astBuilder.visit(parseTreeRoot);
            new SymbolCollector(gScope).visit(ASTRoot);
            new SemanticsCheck(gScope).visit(ASTRoot);
        }
        catch (Error err)
        {
            System.err.println(err.toString());
            throw new RuntimeException();
        }
    }
}

