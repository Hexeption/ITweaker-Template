package uk.co.hexeption.client;

import org.apache.commons.lang3.StringUtils;
import uk.co.hexeption.client.utils.LogHelper;

public enum Client {
    INSTANCE;

    public final String clientName = "NAME";

    public final String clientVersion = "1.0";

    public final String[] clientCreators = {"Hexeption", "Your Name"};

    public void start() {

        LogHelper.section("Loading Client");
        LogHelper.info(String.format("%s rev-%s, ", clientName, clientVersion));
        LogHelper.info("Created By " + StringUtils.join(clientCreators, ','));

        Runtime.getRuntime().addShutdownHook(new Thread(this::end));
    }

    public void end() {

    }
}
