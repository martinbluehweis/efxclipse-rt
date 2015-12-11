package org.eclipse.fx.code.editor.langs.codegen.fx.rust;

public class Rust__rust_multi_line_comment extends org.eclipse.jface.text.rules.RuleBasedScanner {
	public Rust__rust_multi_line_comment() {
		org.eclipse.jface.text.rules.Token rust_doc_defaultToken = new org.eclipse.jface.text.rules.Token(new org.eclipse.fx.text.ui.TextAttribute("rust.rust_doc_default"));
		setDefaultReturnToken(rust_doc_defaultToken);
		org.eclipse.jface.text.rules.IRule[] rules = new org.eclipse.jface.text.rules.IRule[0];

		setRules(rules);
	}
}