package cn.nextop.startup;

import cn.nextop.batch.BatchConfiguration;

public class BatchStartup extends Startup {
	
	@Override protected String[] getConfigs() { return null; }
	
	/**
	 * Main 
	 */
	public static void main(String[] args) {
		new BatchStartup().run(new Class[] {BatchStartup.class, BatchConfiguration.class});
	}
}
