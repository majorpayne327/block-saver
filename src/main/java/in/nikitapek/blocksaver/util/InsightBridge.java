package in.nikitapek.blocksaver.util;

import com.amshulman.insight.action.BlockAction;
import com.amshulman.mbapi.MbapiPlugin;
import in.nikitapek.blocksaver.listeners.insight.InsightBlockDeinforceListener;
import in.nikitapek.blocksaver.listeners.insight.InsightBlockReinforceListener;
import in.nikitapek.blocksaver.listeners.insight.InsightReinforcedBlockDamageListener;
import in.nikitapek.blocksaver.listeners.insight.InsightReinforcedBlockExplodeListener;
import org.bukkit.plugin.Plugin;

public final class InsightBridge {
    public static final String ENFORCE_EVENT_NAME = "bs-block-enforce";
    public static final String DAMAGE_EVENT_NAME = "bs-block-damage";
    public static final BlockAction ENFORCE_EVENT = new BlockAction() {
        @Override
        public String name() {
            return ENFORCE_EVENT_NAME;
        }
    };
    public static final BlockAction DAMAGE_EVENT = new BlockAction() {
        @Override
        public String name() {
            return DAMAGE_EVENT_NAME;
        }
    };

    public InsightBridge(BlockSaverConfigurationContext configurationContext) {
        MbapiPlugin plugin = configurationContext.plugin;

        Plugin insightPlugin = plugin.getServer().getPluginManager().getPlugin("Insight");

        if (insightPlugin == null || !insightPlugin.isEnabled()) {
            return;
        }

        plugin.registerEventHandler(new InsightBlockDeinforceListener());
        plugin.registerEventHandler(new InsightBlockReinforceListener());
        plugin.registerEventHandler(new InsightReinforcedBlockDamageListener());
        plugin.registerEventHandler(new InsightReinforcedBlockExplodeListener());
    }
}
