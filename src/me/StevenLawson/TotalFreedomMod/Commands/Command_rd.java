package me.StevenLawson.TotalFreedomMod.Commands;

import java.util.Arrays;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_rd extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (!(senderIsConsole || TFM_Util.isUserSuperadmin(sender)))
        {
        	sender.sendMessage(TotalFreedomMod.MSG_NO_PERMS);
        	return true;
        }
        TFM_Util.adminAction(sender.getName(), "Removing all server entities", false);
        sender.sendMessage(ChatColor.GRAY + String.valueOf(TFM_Util.wipeEntities(true, true)) + " enties removed.");
        
        return true;
    }
}
