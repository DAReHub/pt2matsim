package org.matsim.pt2matsim.run.gis;

import org.junit.Before;
import org.junit.Test;
import org.matsim.api.core.v01.network.Network;
import org.matsim.pt.transitSchedule.api.TransitSchedule;
import org.matsim.pt2matsim.tools.NetworkToolsTest;
import org.matsim.pt2matsim.tools.ScheduleToolsTest;

import java.io.File;

/**
 * @author polettif
 */
public class Schedule2GeojsonTest {

	private TransitSchedule schedule;
	private Network network;

	@Before
	public void prepare() {
		this.schedule = ScheduleToolsTest.initSchedule();
		this.network = NetworkToolsTest.initNetwork();
	}

	@Test
	public void run() {
		Schedule2Geojson.run("Atlantis", "test/schedule.geojson", this.schedule, this.network);
		new File("test/schedule.geojson").delete();
	}
}