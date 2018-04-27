/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AUTOPILOT_VERSION_REQUEST PACKING
package com.MAVLink.ardupilotmega;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Request the autopilot version from the system/component.
 */
public class msg_autopilot_version_request extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_AUTOPILOT_VERSION_REQUEST = 183;
    public static final int MAVLINK_MSG_LENGTH = 2;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AUTOPILOT_VERSION_REQUEST;


    /**
     * System ID
     */
    public short target_system;

    /**
     * Component ID
     */
    public short target_component;


    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_autopilot_version_request() {
        msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION_REQUEST;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_autopilot_version_request(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION_REQUEST;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AUTOPILOT_VERSION_REQUEST;

        packet.payload.putUnsignedByte(target_system);

        packet.payload.putUnsignedByte(target_component);

        return packet;
    }

    /**
     * Decode a autopilot_version_request message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.target_system = payload.getUnsignedByte();

        this.target_component = payload.getUnsignedByte();

    }

    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_AUTOPILOT_VERSION_REQUEST - sysid:" + sysid + " compid:" + compid + " target_system:" + target_system + " target_component:" + target_component + "";
    }
}
        