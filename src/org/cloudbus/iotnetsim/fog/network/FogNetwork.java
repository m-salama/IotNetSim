package org.cloudbus.iotnetsim.fog.network;

import org.cloudbus.cloudsim.network.NetworkTopology;
import org.cloudbus.iotnetsim.GeographicRegion;

/**
 * Title:        IoTNetSim Toolkit
 * Description:  Modelling and Simulation for End-to-End IoT Services & Networking 
 * 
 * Author: Maria Salama, Lancaster University
 * Contact: m.salama@lancaster.ac.uk
 *
 * If you are using any algorithms, policies or workload included in the IoTNetSim Toolkit,
 * please cite the following paper:
 * 
 * Maria Salama, Yehia Elkhatib, and Gordon Blair. 2019. 
 * IoTNetSim: A Modelling and Simulation Platform for End-to-End IoT Services and Networking.
 * In Proceedings of the IEEE/ACM 12th International Conference on Utility and Cloud Computing (UCC ’19), December 2–5, 2019, Auckland, New Zealand. 
 * ACM, NewYork,NY, USA, 11 pages. 
 * https://doi.org/10.1145/3344341.3368820
 * 
 */

/**
 * Class
 * 
 * @author Maria Salama
 * 
 */

public class FogNetwork extends NetworkTopology {
	
	private int fogNetworkId;
	private GeographicRegion fogNetworkRegion;
	
	public FogNetwork() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFogNetworkId() {
		return fogNetworkId;
	}
	public void setFogNetworkId(int fogNetworkId) {
		this.fogNetworkId = fogNetworkId;
	}
	public GeographicRegion getFogNetworkRegion() {
		return fogNetworkRegion;
	}
	public void setFogNetworkRegion(GeographicRegion fogNetworkRegion) {
		this.fogNetworkRegion = fogNetworkRegion;
	}

}
