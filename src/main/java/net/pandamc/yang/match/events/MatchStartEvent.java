package net.pandamc.yang.match.events;

import lombok.Getter;
import net.pandamc.yang.match.Match;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MatchStartEvent extends Event {

    @Getter private static final HandlerList handlerList = new HandlerList();

    @Getter private Match match;

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
