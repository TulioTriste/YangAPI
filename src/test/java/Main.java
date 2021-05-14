import net.pandamc.yang.YangAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        YangAPI.setKnockbackProfile(new YourSpigotKnockback());
    }

    @Override
    public void onDisable() { }
}
