package KotlinParser;

// Generated from C:\ANTLR1\kotlin\KotlinParser.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;


public interface KotlinParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KotlinParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(@NotNull KotlinParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(@NotNull KotlinParser.GetterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMultiAnnotation(@NotNull KotlinParser.MultiAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMultiAnnotation(@NotNull KotlinParser.MultiAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperator(@NotNull KotlinParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperator(@NotNull KotlinParser.PostfixUnaryOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(@NotNull KotlinParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(@NotNull KotlinParser.SimpleIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(@NotNull KotlinParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(@NotNull KotlinParser.WhenConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultiVariableDeclaration(@NotNull KotlinParser.MultiVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultiVariableDeclaration(@NotNull KotlinParser.MultiVariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull KotlinParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull KotlinParser.StringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryExpression(@NotNull KotlinParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryExpression(@NotNull KotlinParser.PrefixUnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(@NotNull KotlinParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(@NotNull KotlinParser.EqualityOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void enterValueArgument(@NotNull KotlinParser.ValueArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void exitValueArgument(@NotNull KotlinParser.ValueArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull KotlinParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull KotlinParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(@NotNull KotlinParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(@NotNull KotlinParser.LambdaParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(@NotNull KotlinParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(@NotNull KotlinParser.ClassMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(@NotNull KotlinParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(@NotNull KotlinParser.TypeAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessOperator(@NotNull KotlinParser.MemberAccessOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessOperator(@NotNull KotlinParser.MemberAccessOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#genericCallLikeComparison}.
	 * @param ctx the parse tree
	 */
	void enterGenericCallLikeComparison(@NotNull KotlinParser.GenericCallLikeComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#genericCallLikeComparison}.
	 * @param ctx the parse tree
	 */
	void exitGenericCallLikeComparison(@NotNull KotlinParser.GenericCallLikeComparisonContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpression(@NotNull KotlinParser.WhenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpression(@NotNull KotlinParser.WhenExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parameterModifiers}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifiers(@NotNull KotlinParser.ParameterModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parameterModifiers}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifiers(@NotNull KotlinParser.ParameterModifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionModifier(@NotNull KotlinParser.FunctionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionModifier(@NotNull KotlinParser.FunctionModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarianceModifier(@NotNull KotlinParser.VarianceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarianceModifier(@NotNull KotlinParser.VarianceModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(@NotNull KotlinParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(@NotNull KotlinParser.ReceiverTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull KotlinParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull KotlinParser.FinallyBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelObject(@NotNull KotlinParser.TopLevelObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelObject(@NotNull KotlinParser.TopLevelObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraints(@NotNull KotlinParser.TypeConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraints(@NotNull KotlinParser.TypeConstraintsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterCallSuffix(@NotNull KotlinParser.CallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitCallSuffix(@NotNull KotlinParser.CallSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(@NotNull KotlinParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(@NotNull KotlinParser.TypeReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#whenSubject}.
	 * @param ctx the parse tree
	 */
	void enterWhenSubject(@NotNull KotlinParser.WhenSubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whenSubject}.
	 * @param ctx the parse tree
	 */
	void exitWhenSubject(@NotNull KotlinParser.WhenSubjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(@NotNull KotlinParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(@NotNull KotlinParser.ImportHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(@NotNull KotlinParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(@NotNull KotlinParser.ClassModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#shebangLine}.
	 * @param ctx the parse tree
	 */
	void enterShebangLine(@NotNull KotlinParser.ShebangLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#shebangLine}.
	 * @param ctx the parse tree
	 */
	void exitShebangLine(@NotNull KotlinParser.ShebangLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjection(@NotNull KotlinParser.TypeProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjection(@NotNull KotlinParser.TypeProjectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(@NotNull KotlinParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(@NotNull KotlinParser.FunctionLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefix(@NotNull KotlinParser.UnaryPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefix(@NotNull KotlinParser.UnaryPrefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(@NotNull KotlinParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(@NotNull KotlinParser.ImportListContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#elvis}.
	 * @param ctx the parse tree
	 */
	void enterElvis(@NotNull KotlinParser.ElvisContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#elvis}.
	 * @param ctx the parse tree
	 */
	void exitElvis(@NotNull KotlinParser.ElvisContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterLineStringExpression(@NotNull KotlinParser.LineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitLineStringExpression(@NotNull KotlinParser.LineStringExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void enterReificationModifier(@NotNull KotlinParser.ReificationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void exitReificationModifier(@NotNull KotlinParser.ReificationModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraint(@NotNull KotlinParser.TypeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraint(@NotNull KotlinParser.TypeConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(@NotNull KotlinParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(@NotNull KotlinParser.ObjectLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull KotlinParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull KotlinParser.TypeParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousInitializer(@NotNull KotlinParser.AnonymousInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousInitializer(@NotNull KotlinParser.AnonymousInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifiers(@NotNull KotlinParser.TypeProjectionModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifiers(@NotNull KotlinParser.TypeProjectionModifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull KotlinParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull KotlinParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLiteral(@NotNull KotlinParser.LambdaLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLiteral(@NotNull KotlinParser.LambdaLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(@NotNull KotlinParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(@NotNull KotlinParser.NullableTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull KotlinParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull KotlinParser.DoWhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(@NotNull KotlinParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(@NotNull KotlinParser.DisjunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#propertyDelegate}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDelegate(@NotNull KotlinParser.PropertyDelegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#propertyDelegate}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDelegate(@NotNull KotlinParser.PropertyDelegateContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull KotlinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull KotlinParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterDirectlyAssignableExpression(@NotNull KotlinParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitDirectlyAssignableExpression(@NotNull KotlinParser.DirectlyAssignableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void enterAssignableSuffix(@NotNull KotlinParser.AssignableSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void exitAssignableSuffix(@NotNull KotlinParser.AssignableSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTryExpression(@NotNull KotlinParser.TryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTryExpression(@NotNull KotlinParser.TryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void enterRangeTest(@NotNull KotlinParser.RangeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void exitRangeTest(@NotNull KotlinParser.RangeTestContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(@NotNull KotlinParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(@NotNull KotlinParser.SuperExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifiers(@NotNull KotlinParser.DelegationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifiers(@NotNull KotlinParser.DelegationSpecifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(@NotNull KotlinParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(@NotNull KotlinParser.FunctionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void enterCallableReference(@NotNull KotlinParser.CallableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void exitCallableReference(@NotNull KotlinParser.CallableReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifier(@NotNull KotlinParser.MemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifier(@NotNull KotlinParser.MemberModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(@NotNull KotlinParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(@NotNull KotlinParser.SetterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConstant(@NotNull KotlinParser.LiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConstant(@NotNull KotlinParser.LiteralConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(@NotNull KotlinParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(@NotNull KotlinParser.ComparisonOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(@NotNull KotlinParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(@NotNull KotlinParser.ModifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void enterValueArguments(@NotNull KotlinParser.ValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void exitValueArguments(@NotNull KotlinParser.ValueArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(@NotNull KotlinParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(@NotNull KotlinParser.CatchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(@NotNull KotlinParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(@NotNull KotlinParser.InOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUserType(@NotNull KotlinParser.SimpleUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUserType(@NotNull KotlinParser.SimpleUserTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(@NotNull KotlinParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(@NotNull KotlinParser.TypeParameterModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull KotlinParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull KotlinParser.TypeParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(@NotNull KotlinParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(@NotNull KotlinParser.LoopStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperator(@NotNull KotlinParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperator(@NotNull KotlinParser.PrefixUnaryOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModifier(@NotNull KotlinParser.PropertyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModifier(@NotNull KotlinParser.PropertyModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull KotlinParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull KotlinParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parenthesizedDirectlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedDirectlyAssignableExpression(@NotNull KotlinParser.ParenthesizedDirectlyAssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parenthesizedDirectlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedDirectlyAssignableExpression(@NotNull KotlinParser.ParenthesizedDirectlyAssignableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(@NotNull KotlinParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(@NotNull KotlinParser.SemiContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifiers(@NotNull KotlinParser.TypeParameterModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifiers(@NotNull KotlinParser.TypeParameterModifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#quest}.
	 * @param ctx the parse tree
	 */
	void enterQuest(@NotNull KotlinParser.QuestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#quest}.
	 * @param ctx the parse tree
	 */
	void exitQuest(@NotNull KotlinParser.QuestContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(@NotNull KotlinParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(@NotNull KotlinParser.ParenthesizedExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#semis}.
	 * @param ctx the parse tree
	 */
	void enterSemis(@NotNull KotlinParser.SemisContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#semis}.
	 * @param ctx the parse tree
	 */
	void exitSemis(@NotNull KotlinParser.SemisContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunctionCall(@NotNull KotlinParser.InfixFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunctionCall(@NotNull KotlinParser.InfixFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterFileAnnotation(@NotNull KotlinParser.FileAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitFileAnnotation(@NotNull KotlinParser.FileAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull KotlinParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull KotlinParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpression(@NotNull KotlinParser.AssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpression(@NotNull KotlinParser.AssignableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDelegationCall(@NotNull KotlinParser.ConstructorDelegationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDelegationCall(@NotNull KotlinParser.ConstructorDelegationCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#excl}.
	 * @param ctx the parse tree
	 */
	void enterExcl(@NotNull KotlinParser.ExclContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#excl}.
	 * @param ctx the parse tree
	 */
	void exitExcl(@NotNull KotlinParser.ExclContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInvocation(@NotNull KotlinParser.ConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInvocation(@NotNull KotlinParser.ConstructorInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull KotlinParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull KotlinParser.FunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryConstructor(@NotNull KotlinParser.PrimaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryConstructor(@NotNull KotlinParser.PrimaryConstructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedDelegationSpecifier(@NotNull KotlinParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedDelegationSpecifier(@NotNull KotlinParser.AnnotatedDelegationSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceModifier(@NotNull KotlinParser.InheritanceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceModifier(@NotNull KotlinParser.InheritanceModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIndexingSuffix(@NotNull KotlinParser.IndexingSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIndexingSuffix(@NotNull KotlinParser.IndexingSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull KotlinParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull KotlinParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void enterClassParameter(@NotNull KotlinParser.ClassParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void exitClassParameter(@NotNull KotlinParser.ClassParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#platformModifier}.
	 * @param ctx the parse tree
	 */
	void enterPlatformModifier(@NotNull KotlinParser.PlatformModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#platformModifier}.
	 * @param ctx the parse tree
	 */
	void exitPlatformModifier(@NotNull KotlinParser.PlatformModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parametersWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterParametersWithOptionalType(@NotNull KotlinParser.ParametersWithOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parametersWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitParametersWithOptionalType(@NotNull KotlinParser.ParametersWithOptionalTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull KotlinParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull KotlinParser.ThisExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void enterTypeTest(@NotNull KotlinParser.TypeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void exitTypeTest(@NotNull KotlinParser.TypeTestContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(@NotNull KotlinParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(@NotNull KotlinParser.PropertyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifier(@NotNull KotlinParser.DelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifier(@NotNull KotlinParser.DelegationSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedUserType(@NotNull KotlinParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedUserType(@NotNull KotlinParser.ParenthesizedUserTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void enterPackageHeader(@NotNull KotlinParser.PackageHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void exitPackageHeader(@NotNull KotlinParser.PackageHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull KotlinParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull KotlinParser.PrimaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull KotlinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull KotlinParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#userType}.
	 * @param ctx the parse tree
	 */
	void enterUserType(@NotNull KotlinParser.UserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#userType}.
	 * @param ctx the parse tree
	 */
	void exitUserType(@NotNull KotlinParser.UserTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameters(@NotNull KotlinParser.FunctionTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameters(@NotNull KotlinParser.FunctionTypeParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull KotlinParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull KotlinParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(@NotNull KotlinParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(@NotNull KotlinParser.RangeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifier(@NotNull KotlinParser.ParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifier(@NotNull KotlinParser.ParameterModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(@NotNull KotlinParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(@NotNull KotlinParser.CollectionLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryConstructor(@NotNull KotlinParser.SecondaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryConstructor(@NotNull KotlinParser.SecondaryConstructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedLambda(@NotNull KotlinParser.AnnotatedLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedLambda(@NotNull KotlinParser.AnnotatedLambdaContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringExpression(@NotNull KotlinParser.MultiLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringExpression(@NotNull KotlinParser.MultiLineStringExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameter(@NotNull KotlinParser.LambdaParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameter(@NotNull KotlinParser.LambdaParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull KotlinParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull KotlinParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(@NotNull KotlinParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(@NotNull KotlinParser.MultiplicativeOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull KotlinParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull KotlinParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void enterIsOperator(@NotNull KotlinParser.IsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void exitIsOperator(@NotNull KotlinParser.IsOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(@NotNull KotlinParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(@NotNull KotlinParser.IfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(@NotNull KotlinParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(@NotNull KotlinParser.MultiLineStringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull KotlinParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull KotlinParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull KotlinParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull KotlinParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull KotlinParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull KotlinParser.TypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull KotlinParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull KotlinParser.ScriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull KotlinParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull KotlinParser.ComparisonContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperation(@NotNull KotlinParser.InfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperation(@NotNull KotlinParser.InfixOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void enterKotlinFile(@NotNull KotlinParser.KotlinFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void exitKotlinFile(@NotNull KotlinParser.KotlinFileContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull KotlinParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull KotlinParser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull KotlinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull KotlinParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionValueParameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameterWithOptionalType(@NotNull KotlinParser.FunctionValueParameterWithOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionValueParameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameterWithOptionalType(@NotNull KotlinParser.FunctionValueParameterWithOptionalTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#safeNav}.
	 * @param ctx the parse tree
	 */
	void enterSafeNav(@NotNull KotlinParser.SafeNavContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#safeNav}.
	 * @param ctx the parse tree
	 */
	void exitSafeNav(@NotNull KotlinParser.SafeNavContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(@NotNull KotlinParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(@NotNull KotlinParser.LineStringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void enterElvisExpression(@NotNull KotlinParser.ElvisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void exitElvisExpression(@NotNull KotlinParser.ElvisExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#singleAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleAnnotation(@NotNull KotlinParser.SingleAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#singleAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleAnnotation(@NotNull KotlinParser.SingleAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentAndOperator(@NotNull KotlinParser.AssignmentAndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentAndOperator(@NotNull KotlinParser.AssignmentAndOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumClassBody(@NotNull KotlinParser.EnumClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumClassBody(@NotNull KotlinParser.EnumClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(@NotNull KotlinParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(@NotNull KotlinParser.EnumEntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(@NotNull KotlinParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(@NotNull KotlinParser.ParenthesizedTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull KotlinParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull KotlinParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(@NotNull KotlinParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(@NotNull KotlinParser.AdditiveOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameters(@NotNull KotlinParser.FunctionValueParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameters(@NotNull KotlinParser.FunctionValueParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull KotlinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull KotlinParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias(@NotNull KotlinParser.ImportAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias(@NotNull KotlinParser.ImportAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityModifier(@NotNull KotlinParser.VisibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityModifier(@NotNull KotlinParser.VisibilityModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(@NotNull KotlinParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(@NotNull KotlinParser.ConjunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterParameterWithOptionalType(@NotNull KotlinParser.ParameterWithOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitParameterWithOptionalType(@NotNull KotlinParser.ParameterWithOptionalTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void enterWhenEntry(@NotNull KotlinParser.WhenEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void exitWhenEntry(@NotNull KotlinParser.WhenEntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull KotlinParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull KotlinParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(@NotNull KotlinParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(@NotNull KotlinParser.EqualityContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull KotlinParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull KotlinParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnarySuffix(@NotNull KotlinParser.PostfixUnarySuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnarySuffix(@NotNull KotlinParser.PostfixUnarySuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(@NotNull KotlinParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(@NotNull KotlinParser.AnonymousFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterNavigationSuffix(@NotNull KotlinParser.NavigationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitNavigationSuffix(@NotNull KotlinParser.NavigationSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void enterCompanionObject(@NotNull KotlinParser.CompanionObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void exitCompanionObject(@NotNull KotlinParser.CompanionObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryExpression(@NotNull KotlinParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryExpression(@NotNull KotlinParser.PostfixUnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parenthesizedAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedAssignableExpression(@NotNull KotlinParser.ParenthesizedAssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parenthesizedAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedAssignableExpression(@NotNull KotlinParser.ParenthesizedAssignableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void enterJumpExpression(@NotNull KotlinParser.JumpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void exitJumpExpression(@NotNull KotlinParser.JumpExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclarations(@NotNull KotlinParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclarations(@NotNull KotlinParser.ClassMemberDeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(@NotNull KotlinParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(@NotNull KotlinParser.LineStringContentContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull KotlinParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull KotlinParser.FunctionBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void enterClassParameters(@NotNull KotlinParser.ClassParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void exitClassParameters(@NotNull KotlinParser.ClassParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(@NotNull KotlinParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(@NotNull KotlinParser.MultiLineStringContentContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitDelegation(@NotNull KotlinParser.ExplicitDelegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitDelegation(@NotNull KotlinParser.ExplicitDelegationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationUseSiteTarget(@NotNull KotlinParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationUseSiteTarget(@NotNull KotlinParser.AnnotationUseSiteTargetContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void enterAsOperator(@NotNull KotlinParser.AsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void exitAsOperator(@NotNull KotlinParser.AsOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(@NotNull KotlinParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(@NotNull KotlinParser.ObjectDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifier(@NotNull KotlinParser.TypeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifier(@NotNull KotlinParser.TypeModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameter(@NotNull KotlinParser.FunctionValueParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameter(@NotNull KotlinParser.FunctionValueParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull KotlinParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull KotlinParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifiers(@NotNull KotlinParser.TypeModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifiers(@NotNull KotlinParser.TypeModifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntries(@NotNull KotlinParser.EnumEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntries(@NotNull KotlinParser.EnumEntriesContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void enterControlStructureBody(@NotNull KotlinParser.ControlStructureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void exitControlStructureBody(@NotNull KotlinParser.ControlStructureBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterUnescapedAnnotation(@NotNull KotlinParser.UnescapedAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitUnescapedAnnotation(@NotNull KotlinParser.UnescapedAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsExpression(@NotNull KotlinParser.AsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsExpression(@NotNull KotlinParser.AsExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifier(@NotNull KotlinParser.TypeProjectionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifier(@NotNull KotlinParser.TypeProjectionModifierContext ctx);
}