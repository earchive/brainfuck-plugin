package org.eulir.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class Action extends AnAction {
	@Override
	public void actionPerformed(AnActionEvent e) {
		System.out.println("Hello World");
	}
}
