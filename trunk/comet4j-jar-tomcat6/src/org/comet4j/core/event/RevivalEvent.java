/*
 * Comet4J Copyright(c) 2011, http://code.google.com/p/comet4j/ This code is
 * licensed under BSD license. Use it as you wish, but keep this copyright
 * intact.
 */
package org.comet4j.core.event;

import org.comet4j.core.CometConnection;
import org.comet4j.core.CometEngine;
import org.comet4j.event.Event;


public class RevivalEvent extends Event<CometEngine> {
	private CometConnection conn ;
	public RevivalEvent(CometEngine target,CometConnection anConn) {
		super(target);
		conn = anConn;
	}
	public CometConnection getConn() {
		return conn;
	}
	public void setConn(CometConnection conn) {
		this.conn = conn;
	}
	
	public void destroy() {
		super.destroy();
		conn = null;
	}
}
