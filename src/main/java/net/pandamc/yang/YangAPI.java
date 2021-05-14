package net.pandamc.yang;

import net.pandamc.yang.knockback.Knockback;
import net.pandamc.yang.knockback.KnockbackProfiler;

public class YangAPI {

    public static void setKnockbackProfile(KnockbackProfiler profile) {
        Knockback.setKnockbackProfiler(profile);
    }
}
