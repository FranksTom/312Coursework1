import java.io.IOException;

public class SyntaxAnalyser extends AbstractSyntaxAnalyser
{
    public SyntaxAnalyser(String file)
    {
        try
        {
            lex = new LexicalAnalyser(file);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }


    public void _statementPart_() throws IOException, CompilationException
    {
        acceptTerminal(Token.beginSymbol);
        statementList();
        acceptTerminal(Token.endSymbol);
    }
    public void acceptTerminal(int symbol) throws IOException, CompilationException
    {
        if(nextToken.symbol == symbol)
        {
			nextToken = lex.getNextToken();
        }
        else
        {
            myGenerate.reportError(nextToken, "Unexpected token: " + nextToken.text);
        }
    }
    public void statementList() throws IOException
    {
        switch(nextToken.symbol)
        {
            case(Token.identifier):
            {
            nextToken = lex.getNextToken();

            if(nextToken.symbol == Token.identifier)
                {
                }
                
            }
            case(Token.ifSymbol):
            {
                // If Statement
            }
            case(Token.whileSymbol):
            {
                // While Statement
            }
            case(Token.callSymbol):
            {
                // Procedure Statement
            }
            case(Token.untilSymbol):
            {
                // Until Statement
            }
            case(Token.forSymbol):
            {
                // For Statement
            }
        }
    }
}