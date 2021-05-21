package net.pandamc.yang;

import net.pandamc.yang.knockback.KnockbackProfiler;
import org.bukkit.plugin.IllegalPluginAccessException;

public class YangAPI {

    public static void setKnockbackProfile(KnockbackProfiler profile) {
        throw new IllegalPluginAccessException("You using the oldest version or dont use Yang");
    }
}
