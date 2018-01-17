/*
 * Licence is provided in the jar as license.yml also here:
 * https://github.com/Rsl1122/Plan-PlayerAnalytics/blob/master/Plan/src/main/resources/license.yml
 */
package com.djrapitops.plan.api;

import com.djrapitops.plan.data.plugin.PluginData;
import com.djrapitops.plan.system.database.databases.operation.FetchOperations;

import java.util.Map;
import java.util.UUID;

/**
 * //TODO Class Javadoc Comment
 *
 * @author Rsl1122
 */
public interface PlanAPI {

    static PlanAPI getInstance() {
        throw new IllegalAccessError("Not yet implemented"); // TODO
    }

    void addPluginDataSource(PluginData pluginData);

    String getPlayerInspectPageLink(String playerName);

    String getPlayerName(UUID uuid);

    UUID playerNameToUUID(String playerName);

    Map<UUID, String> getKnownPlayerNames();

    FetchOperations fetchFromPlanDB();
}