package ro.atlas.commands;

public enum AtlasCommandType {
	
	ATLAS_CMD_CLIENT_INFO_UPDATE("ATLAS_CMD_CLIENT_INFO_UPDATE");
	
	public static final String ATLAS_CMD_TYPE_FIELDNAME = "commandType";
	public static final String ATLAS_CMD_PAYLOAD_FIELDNAME = "commandPayload";
	
	private String commandType;

	AtlasCommandType(String commandType) {
		this.commandType = commandType;
	}

	public String getCommandType() {
		return commandType;
	}
}
