/*
* generated by Xtext
*/
package org.eclipse.fx.code.compensator.hsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.fx.code.compensator.hsl.services.HSLGrammarAccess;

public class HSLParser extends AbstractContentAssistParser {
	
	@Inject
	private HSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.fx.code.compensator.hsl.ui.contentassist.antlr.internal.InternalHSLParser createParser() {
		org.eclipse.fx.code.compensator.hsl.ui.contentassist.antlr.internal.InternalHSLParser result = new org.eclipse.fx.code.compensator.hsl.ui.contentassist.antlr.internal.InternalHSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPartitionerAccess().getAlternatives(), "rule__Partitioner__Alternatives");
					put(grammarAccess.getScannerRuleAccess().getAlternatives(), "rule__ScannerRule__Alternatives");
					put(grammarAccess.getParitionRuleAccess().getAlternatives(), "rule__ParitionRule__Alternatives");
					put(grammarAccess.getScannerWhitespaceRuleAccess().getAlternatives(), "rule__ScannerWhitespaceRule__Alternatives");
					put(grammarAccess.getFontTypeAccess().getAlternatives(), "rule__FontType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getPartitionAccess().getGroup(), "rule__Partition__Group__0");
					put(grammarAccess.getRulePartitionerAccess().getGroup(), "rule__RulePartitioner__Group__0");
					put(grammarAccess.getJSParitionerAccess().getGroup(), "rule__JSParitioner__Group__0");
					put(grammarAccess.getScannerAccess().getGroup(), "rule__Scanner__Group__0");
					put(grammarAccess.getScannerTokenAccess().getGroup(), "rule__ScannerToken__Group__0");
					put(grammarAccess.getScannerTokenAccess().getGroup_3(), "rule__ScannerToken__Group_3__0");
					put(grammarAccess.getScannerTokenAccess().getGroup_3_1(), "rule__ScannerToken__Group_3_1__0");
					put(grammarAccess.getScannerTokenAccess().getGroup_3_2(), "rule__ScannerToken__Group_3_2__0");
					put(grammarAccess.getScannerTokenAccess().getGroup_3_3(), "rule__ScannerToken__Group_3_3__0");
					put(grammarAccess.getKeywordGroupAccess().getGroup(), "rule__KeywordGroup__Group__0");
					put(grammarAccess.getKeywordGroupAccess().getGroup_4(), "rule__KeywordGroup__Group_4__0");
					put(grammarAccess.getKeywordAccess().getGroup(), "rule__Keyword__Group__0");
					put(grammarAccess.getKeywordAccess().getGroup_1(), "rule__Keyword__Group_1__0");
					put(grammarAccess.getScannerSingleLineRuleAccess().getGroup(), "rule__ScannerSingleLineRule__Group__0");
					put(grammarAccess.getScannerSingleLineRuleAccess().getGroup_5(), "rule__ScannerSingleLineRule__Group_5__0");
					put(grammarAccess.getPartitionSingleLineRuleAccess().getGroup(), "rule__PartitionSingleLineRule__Group__0");
					put(grammarAccess.getPartitionSingleLineRuleAccess().getGroup_5(), "rule__PartitionSingleLineRule__Group_5__0");
					put(grammarAccess.getScannerMultiLineRuleAccess().getGroup(), "rule__ScannerMultiLineRule__Group__0");
					put(grammarAccess.getScannerMultiLineRuleAccess().getGroup_5(), "rule__ScannerMultiLineRule__Group_5__0");
					put(grammarAccess.getPartitionMultiLineRuleAccess().getGroup(), "rule__PartitionMultiLineRule__Group__0");
					put(grammarAccess.getPartitionMultiLineRuleAccess().getGroup_5(), "rule__PartitionMultiLineRule__Group_5__0");
					put(grammarAccess.getScannerCharacterRuleAccess().getGroup(), "rule__ScannerCharacterRule__Group__0");
					put(grammarAccess.getScannerJSRuleAccess().getGroup(), "rule__ScannerJSRule__Group__0");
					put(grammarAccess.getPartitionJSRuleAccess().getGroup(), "rule__PartitionJSRule__Group__0");
					put(grammarAccess.getScannerWhitespaceRuleAccess().getGroup_0(), "rule__ScannerWhitespaceRule__Group_0__0");
					put(grammarAccess.getScannerWhitespaceRuleAccess().getGroup_0_2(), "rule__ScannerWhitespaceRule__Group_0_2__0");
					put(grammarAccess.getScannerWhitespaceRuleAccess().getGroup_0_2_2(), "rule__ScannerWhitespaceRule__Group_0_2_2__0");
					put(grammarAccess.getScannerWhitespaceRuleAccess().getGroup_1(), "rule__ScannerWhitespaceRule__Group_1__0");
					put(grammarAccess.getRGBColorAccess().getGroup(), "rule__RGBColor__Group__0");
					put(grammarAccess.getFontAccess().getGroup(), "rule__Font__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_0(), "rule__Model__NameAssignment_0");
					put(grammarAccess.getModelAccess().getPartitionsAssignment_2(), "rule__Model__PartitionsAssignment_2");
					put(grammarAccess.getModelAccess().getScannerAssignment_3(), "rule__Model__ScannerAssignment_3");
					put(grammarAccess.getModelAccess().getPartitionerAssignment_4(), "rule__Model__PartitionerAssignment_4");
					put(grammarAccess.getPartitionAccess().getNameAssignment_1(), "rule__Partition__NameAssignment_1");
					put(grammarAccess.getRulePartitionerAccess().getRulesAssignment_2(), "rule__RulePartitioner__RulesAssignment_2");
					put(grammarAccess.getJSParitionerAccess().getFileURIAssignment_1(), "rule__JSParitioner__FileURIAssignment_1");
					put(grammarAccess.getScannerAccess().getPartitionAssignment_1(), "rule__Scanner__PartitionAssignment_1");
					put(grammarAccess.getScannerAccess().getTokensAssignment_3(), "rule__Scanner__TokensAssignment_3");
					put(grammarAccess.getScannerAccess().getKeywordGroupsAssignment_4(), "rule__Scanner__KeywordGroupsAssignment_4");
					put(grammarAccess.getScannerAccess().getRulesAssignment_5(), "rule__Scanner__RulesAssignment_5");
					put(grammarAccess.getScannerTokenAccess().getDefaultAssignment_0(), "rule__ScannerToken__DefaultAssignment_0");
					put(grammarAccess.getScannerTokenAccess().getNameAssignment_2(), "rule__ScannerToken__NameAssignment_2");
					put(grammarAccess.getScannerTokenAccess().getFgColorAssignment_3_1_2(), "rule__ScannerToken__FgColorAssignment_3_1_2");
					put(grammarAccess.getScannerTokenAccess().getBgColorAssignment_3_2_2(), "rule__ScannerToken__BgColorAssignment_3_2_2");
					put(grammarAccess.getScannerTokenAccess().getFontAssignment_3_3_2(), "rule__ScannerToken__FontAssignment_3_3_2");
					put(grammarAccess.getKeywordGroupAccess().getTokenAssignment_1(), "rule__KeywordGroup__TokenAssignment_1");
					put(grammarAccess.getKeywordGroupAccess().getKeywordsAssignment_3(), "rule__KeywordGroup__KeywordsAssignment_3");
					put(grammarAccess.getKeywordGroupAccess().getKeywordsAssignment_4_1(), "rule__KeywordGroup__KeywordsAssignment_4_1");
					put(grammarAccess.getKeywordAccess().getNameAssignment_0(), "rule__Keyword__NameAssignment_0");
					put(grammarAccess.getKeywordAccess().getVersionAssignment_1_1(), "rule__Keyword__VersionAssignment_1_1");
					put(grammarAccess.getScannerSingleLineRuleAccess().getTokenAssignment_1(), "rule__ScannerSingleLineRule__TokenAssignment_1");
					put(grammarAccess.getScannerSingleLineRuleAccess().getStartSeqAssignment_2(), "rule__ScannerSingleLineRule__StartSeqAssignment_2");
					put(grammarAccess.getScannerSingleLineRuleAccess().getEndSeqAssignment_4(), "rule__ScannerSingleLineRule__EndSeqAssignment_4");
					put(grammarAccess.getScannerSingleLineRuleAccess().getEscapeSeqAssignment_5_2(), "rule__ScannerSingleLineRule__EscapeSeqAssignment_5_2");
					put(grammarAccess.getPartitionSingleLineRuleAccess().getParitionAssignment_1(), "rule__PartitionSingleLineRule__ParitionAssignment_1");
					put(grammarAccess.getPartitionSingleLineRuleAccess().getStartSeqAssignment_2(), "rule__PartitionSingleLineRule__StartSeqAssignment_2");
					put(grammarAccess.getPartitionSingleLineRuleAccess().getEndSeqAssignment_4(), "rule__PartitionSingleLineRule__EndSeqAssignment_4");
					put(grammarAccess.getPartitionSingleLineRuleAccess().getEscapeSeqAssignment_5_2(), "rule__PartitionSingleLineRule__EscapeSeqAssignment_5_2");
					put(grammarAccess.getScannerMultiLineRuleAccess().getTokenAssignment_1(), "rule__ScannerMultiLineRule__TokenAssignment_1");
					put(grammarAccess.getScannerMultiLineRuleAccess().getStartSeqAssignment_2(), "rule__ScannerMultiLineRule__StartSeqAssignment_2");
					put(grammarAccess.getScannerMultiLineRuleAccess().getEndSeqAssignment_4(), "rule__ScannerMultiLineRule__EndSeqAssignment_4");
					put(grammarAccess.getScannerMultiLineRuleAccess().getEscapeSeqAssignment_5_2(), "rule__ScannerMultiLineRule__EscapeSeqAssignment_5_2");
					put(grammarAccess.getPartitionMultiLineRuleAccess().getTokenAssignment_1(), "rule__PartitionMultiLineRule__TokenAssignment_1");
					put(grammarAccess.getPartitionMultiLineRuleAccess().getStartSeqAssignment_2(), "rule__PartitionMultiLineRule__StartSeqAssignment_2");
					put(grammarAccess.getPartitionMultiLineRuleAccess().getEndSeqAssignment_4(), "rule__PartitionMultiLineRule__EndSeqAssignment_4");
					put(grammarAccess.getPartitionMultiLineRuleAccess().getEscapeSeqAssignment_5_2(), "rule__PartitionMultiLineRule__EscapeSeqAssignment_5_2");
					put(grammarAccess.getScannerCharacterRuleAccess().getTokenAssignment_1(), "rule__ScannerCharacterRule__TokenAssignment_1");
					put(grammarAccess.getScannerCharacterRuleAccess().getCharactersAssignment_3(), "rule__ScannerCharacterRule__CharactersAssignment_3");
					put(grammarAccess.getScannerCharacterRuleAccess().getCharactersAssignment_5(), "rule__ScannerCharacterRule__CharactersAssignment_5");
					put(grammarAccess.getScannerJSRuleAccess().getTokenAssignment_1(), "rule__ScannerJSRule__TokenAssignment_1");
					put(grammarAccess.getScannerJSRuleAccess().getFileURIAssignment_2(), "rule__ScannerJSRule__FileURIAssignment_2");
					put(grammarAccess.getPartitionJSRuleAccess().getTokenAssignment_1(), "rule__PartitionJSRule__TokenAssignment_1");
					put(grammarAccess.getPartitionJSRuleAccess().getFileURIAssignment_2(), "rule__PartitionJSRule__FileURIAssignment_2");
					put(grammarAccess.getScannerWhitespaceRuleAccess().getTokenAssignment_0_1(), "rule__ScannerWhitespaceRule__TokenAssignment_0_1");
					put(grammarAccess.getScannerWhitespaceRuleAccess().getCharactersAssignment_0_2_1(), "rule__ScannerWhitespaceRule__CharactersAssignment_0_2_1");
					put(grammarAccess.getScannerWhitespaceRuleAccess().getCharactersAssignment_0_2_2_1(), "rule__ScannerWhitespaceRule__CharactersAssignment_0_2_2_1");
					put(grammarAccess.getScannerWhitespaceRuleAccess().getJsMethodAssignment_1_1(), "rule__ScannerWhitespaceRule__JsMethodAssignment_1_1");
					put(grammarAccess.getRGBColorAccess().getRAssignment_2(), "rule__RGBColor__RAssignment_2");
					put(grammarAccess.getRGBColorAccess().getGAssignment_4(), "rule__RGBColor__GAssignment_4");
					put(grammarAccess.getRGBColorAccess().getBAssignment_6(), "rule__RGBColor__BAssignment_6");
					put(grammarAccess.getFontAccess().getNameAssignment_0(), "rule__Font__NameAssignment_0");
					put(grammarAccess.getFontAccess().getSizeAssignment_1(), "rule__Font__SizeAssignment_1");
					put(grammarAccess.getFontAccess().getAttributesAssignment_2(), "rule__Font__AttributesAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.fx.code.compensator.hsl.ui.contentassist.antlr.internal.InternalHSLParser typedParser = (org.eclipse.fx.code.compensator.hsl.ui.contentassist.antlr.internal.InternalHSLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public HSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}