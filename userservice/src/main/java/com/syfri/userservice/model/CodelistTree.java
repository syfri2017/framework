package com.syfri.userservice.model;

import com.syfri.baseapi.model.ValueObject;

import java.io.Serializable;
import java.util.List;

public class CodelistTree extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String codeName;
	private String codeValue;
	private List<CodelistTree> children;

	public String getCodeName() { return codeName; }
	public void setCodeName(String codeName) { this.codeName = codeName; }
	public String getCodeValue() { return codeValue; }
	public void setCodeValue(String codeValue) { this.codeValue = codeValue; }
	public List<CodelistTree> getChildren() {	return children; }
	public void setChildren(List<CodelistTree> children) { this.children = children; }
}