grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleServiceModel EOF
;

ruleServiceModel  :
((temp_description=RULE_STRING )?

('Service')

(temp_name=RULE_ID )

(temp_dtoReferences=ruleDtoReference )*

((temp_crudServices=ruleCrudService )
	|
(temp_methods=ruleServiceMethod )
)*
)
;

ruleAssociationMethod  :
((temp_description=RULE_STRING )?

('for')

(temp_main=RULE_ID
)

('reference')

(temp_rolename=RULE_ID )

(temp_type=ruleAssociationMethodType )

(temp_part=RULE_ID
)
)
;

ruleSpecialMethodType  :
			
		 'create'
		 
	 |			
		 'read'
		 
	 |			
		 'update'
		 
	 |			
		 'delete'
		 
	 |			
		 'listall'
		 
	 |			
		 'find'
		 
;

ruleAssociationMethodType  :
			
		 'add'
		 
	 |			
		 'remove'
		 
;

ruleDtoReference  :
((temp_description=RULE_STRING )?

('from')

(temp_modelname=RULE_ID )

('import')

(temp_name=RULE_ID )
)
;

ruleServiceMethod  :
((temp_description=RULE_STRING )?

((
temp_CustomMethod=ruleCustomMethod {$result=temp_CustomMethod;}
)
	|
(
temp_SpecialMethod=ruleSpecialMethod {$result=temp_SpecialMethod;}
)
	|
(
temp_AssociationMethod=ruleAssociationMethod {$result=temp_AssociationMethod;}
)
)
)
;

ruleCustomMethod  :
((temp_description=RULE_STRING )?

('method')

(temp_name=RULE_ID )

(('in')

(temp_inParameters=ruleParameter )*
)?

(('out')

(temp_output=RULE_ID
)
)?

(';')
)
;

ruleParameter  :
((temp_type=RULE_ID
)

(temp_name=RULE_ID )
)
;

ruleSpecialMethod  :
((temp_description=RULE_STRING )?

(temp_type=ruleSpecialMethodType )

(temp_name=RULE_ID )

('for')

(temp_dto=RULE_ID
)

(';')
)
;

ruleCrudService  :
((temp_description=RULE_STRING )?

(temp_name='crud' )

('for')

(temp_dto=RULE_ID
)

(';')
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

