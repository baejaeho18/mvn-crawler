grammar ServiceDsl;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package org.mod4j.dsl.service.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package org.mod4j.dsl.service.xtext.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import org.mod4j.dsl.service.xtext.MetaModelRegistration;

}
@lexer::members {
	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		return msg;
	}
}

@parser::members {

	private Token getLastToken() {
		return input.LT(-1);
	}
	private Token getNextToken() {
		return input.LT(1);
	}

	private int line() {
		Token t = getNextToken();
		if (t==null)
			return 1;
		return t.getLine();
	}

	private int start() {
		Token t = getNextToken();
		if (t==null)
			return 0;
		if (t instanceof CommonToken) {
			return ((CommonToken)t).getStartIndex();
		}
		return t.getTokenIndex();
	}

	private int end() {
		Token t = getLastToken();
		if (t==null)
			return 1;
		if (t instanceof CommonToken) {
			return ((CommonToken)t).getStopIndex()+1;
		}
		return t.getTokenIndex();
	}

	protected Object convert(Object arg) {
		if (arg instanceof org.antlr.runtime.Token) {
			Token t = (Token) arg;
			String s = t.getText();
			if (t.getType() == ServiceDslLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==ServiceDslLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==ServiceDslLexer.RULE_INT) {
				return Integer.valueOf(s);
			}
			return s;
		}
		return arg;
	}


	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
    private ParseTreeManager ptm = new ParseTreeManager();
	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
	
	{
			factory.addImport("", "http://www.mod4j.org/service");
		
	}

	public ParseTreeManager getResult() {
		return ptm;
	}

	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	@Override
		public void reportError(RecognitionException e) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
			ptm.addError(msg, e);
			ptm.ruleFinished(null, end());
		}

}


parse returns [Node r]:
	 result=ruleServiceModel EOF
{ptm.ruleFinished(result,end());$r = ptm.getCurrent();};

ruleServiceModel returns [EObject result] :
			{
				$result = factory.create("", "ServiceModel");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}'Service'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());}temp_dtoReferences=ruleDtoReference {factory.add($result,"dtoReferences",convert(temp_dtoReferences),false); ptm.ruleFinished(temp_dtoReferences,end()); }
)*

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());}temp_crudServices=ruleCrudService {factory.add($result,"crudServices",convert(temp_crudServices),false); ptm.ruleFinished(temp_crudServices,end()); }
)
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());}temp_methods=ruleServiceMethod {factory.add($result,"methods",convert(temp_methods),false); ptm.ruleFinished(temp_methods,end()); }
)
)*
)
;

ruleAssociationMethod returns [EObject result] :
			{
				$result = factory.create("", "AssociationMethod");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());}'for'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());}temp_main=RULE_ID
 {factory.set($result,"main",convert(temp_main),true); ptm.ruleFinished(temp_main,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)),line(),start());}'reference'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)),line(),start());}temp_rolename=RULE_ID {factory.set($result,"rolename",convert(temp_rolename),false); ptm.ruleFinished(temp_rolename,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)),line(),start());}temp_type=ruleAssociationMethodType {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(6)),line(),start());}temp_part=RULE_ID
 {factory.set($result,"part",convert(temp_part),true); ptm.ruleFinished(temp_part,end()); }
)
)
;

ruleSpecialMethodType returns [Object r] :
			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)),line(),start());}
		 'create'
		 {$r=ptm.ruleFinished(factory.enumLit("", "MethodType","CREATE"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(2)),line(),start());}
		 'read'
		 {$r=ptm.ruleFinished(factory.enumLit("", "MethodType","READ"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(3)),line(),start());}
		 'update'
		 {$r=ptm.ruleFinished(factory.enumLit("", "MethodType","UPDATE"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(4)),line(),start());}
		 'delete'
		 {$r=ptm.ruleFinished(factory.enumLit("", "MethodType","DELETE"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(5)),line(),start());}
		 'listall'
		 {$r=ptm.ruleFinished(factory.enumLit("", "MethodType","LISTALL"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(6)),line(),start());}
		 'find'
		 {$r=ptm.ruleFinished(factory.enumLit("", "MethodType","FIND"),end());}
;

ruleAssociationMethodType returns [Object r] :
			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)),line(),start());}
		 'add'
		 {$r=ptm.ruleFinished(factory.enumLit("", "MethodType","ADDTO"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(2)),line(),start());}
		 'remove'
		 {$r=ptm.ruleFinished(factory.enumLit("", "MethodType","REMOVEFROM"),end());}
;

ruleDtoReference returns [EObject result] :
			{
				$result = factory.create("", "DtoReference");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)),line(),start());}'from'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)),line(),start());}temp_modelname=RULE_ID {factory.set($result,"modelname",convert(temp_modelname),false); ptm.ruleFinished(temp_modelname,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)),line(),start());}'import'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleServiceMethod returns [EObject result] :
			{
				$result = factory.create("", "ServiceMethod");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}
temp_CustomMethod=ruleCustomMethod {$result=temp_CustomMethod;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}
temp_SpecialMethod=ruleSpecialMethod {$result=temp_SpecialMethod;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}
temp_AssociationMethod=ruleAssociationMethod {$result=temp_AssociationMethod;}
{ptm.ruleFinished(getLastToken(),end());})
)
)
;

ruleCustomMethod returns [EObject result] :
			{
				$result = factory.create("", "CustomMethod");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)),line(),start());}'method'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}'in'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());}temp_inParameters=ruleParameter {factory.add($result,"inParameters",convert(temp_inParameters),false); ptm.ruleFinished(temp_inParameters,end()); }
)*
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());}'out'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());}temp_output=RULE_ID
 {factory.set($result,"output",convert(temp_output),true); ptm.ruleFinished(temp_output,end()); }
)
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(5)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleParameter returns [EObject result] :
			{
				$result = factory.create("", "Parameter");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID
 {factory.set($result,"type",convert(temp_type),true); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleSpecialMethod returns [EObject result] :
			{
				$result = factory.create("", "SpecialMethod");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)),line(),start());}temp_type=ruleSpecialMethodType {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)),line(),start());}'for'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(4)),line(),start());}temp_dto=RULE_ID
 {factory.set($result,"dto",convert(temp_dto),true); ptm.ruleFinished(temp_dto,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(5)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleCrudService returns [EObject result] :
			{
				$result = factory.create("", "CrudService");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name='crud' {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)),line(),start());}'for'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)),line(),start());}temp_dto=RULE_ID
 {factory.set($result,"dto",convert(temp_dto),true); ptm.ruleFinished(temp_dto,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

