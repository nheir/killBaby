package io.github.nheir.killbaby;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;
 
public final class KillBaby extends JavaPlugin implements Listener {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
 
    @EventHandler
    public void onSpawn(CreatureSpawnEvent event) {
    	if(event.isCancelled())
    		return;
    	LivingEntity c = event.getEntity();
    	if(c instanceof Zombie)
    	{
    		Zombie a = (Zombie) c;
    		
    		if(a.isBaby())
    		{
    			a.setBaby(false);
    			//a.remove();
    		}
    			
    	}
    	
        // Some code here
    }
}