package com.xrtb.commands;

import com.xrtb.bidder.Controller;
import com.xrtb.common.Campaign;

/**
 * A class that is used to encapsulate a REDIS command for adding a campaign to the bidder.
 * GSON will be used to create the structure.
 * @author Ben M. Faul
 *
 */
public class DeleteUser extends BasicCommand {
			
	/**
	 * Empty constructor for gson
	 */
	public DeleteUser() {
		super();
		cmd = Controller.DELETE_USER;
		msg = "A new campaign is being added to the system";
	}

	public DeleteUser(String to, String name, String id) {
		super(to);
		cmd = Controller.DELETE_USER;
		status = "ok";
		this.owner = name;
		target = id;
		msg = "A user (and all their camoaigns) is being added to the system: " + name +"/" + target;
	}
}
