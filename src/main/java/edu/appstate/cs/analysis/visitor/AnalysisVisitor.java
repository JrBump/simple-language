package edu.appstate.cs.analysis.visitor;

import edu.appstate.cs.analysis.ast.*;

public interface AnalysisVisitor<R> {
    // TODO: Add additional visit methods as we add AST classes
    R visitStmtList(StmtList stmtList);
    R visitAssignStmt(AssignStmt assignStmt);
    R visitIntLiteral(IntLiteral intLiteral);
    R visitPlusExpr(PlusExpr plusExpr);
    R visitSubExpr(SubExpr subExpr);
    R visitMultExpr(MultExpr multExpr);
    R visitIdentExpr(IdentExpr identExpr);
    R visitForStmt(ForStmt forStmt);
    R visitWhileStmt(WhileStmt whileStmt);
    R visitExprStmt(ExprStmt exprStmt);
    R visitNotEqlExpr(NotEqlExpr notEqlExpr);
    R visitDeclStmt(DeclStmt declStmt);
}
