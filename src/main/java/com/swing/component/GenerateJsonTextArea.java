package com.swing.component;

/***
 * 继承 AssistPopupTextArea<br>
 * 有两个菜单:获取json<br>
 * @author huangweii
 * 2015年10月30日
 */
public class GenerateJsonTextArea extends AssistPopupTextArea {
	private static final long serialVersionUID = 6018621509132896306L;

	public GenerateJsonTextArea() {
		super();
	}


	public GenerateJsonTextArea(String text) {
		super(text);
	}

	@Override
	protected void initlize() {
		super.initlize();
		TextCompUtil2.dropListMenu(this);
		placeHolder(TextCompUtil2.PLACEHOLDER_DOUBLE_SHIFT);
	}
	
}