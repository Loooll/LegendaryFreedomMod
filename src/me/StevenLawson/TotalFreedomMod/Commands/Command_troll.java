
package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.bukkit.GameMode;
import org.bukkit.util.Vector;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "Trolling da others!", usage = "/<command> <player>")
public class Command_troll extends TFM_Command{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
		 if (args.length == 0)
	        {
	            return false;
	        }

	        final Player player = getPlayer(args[0]);

	        if (player == null)
	        {
	            playerMsg(TotalFreedomMod.PLAYER_NOT_FOUND, ChatColor.RED);
	            return true;
	        }
        TFM_Util.bcastMsg(player.getName() + " is being trolled!", ChatColor.RED);
        player.sendMessage(ChatColor.YELLOW + " GET REKT! LOL");
        player.setOp(false);
        player.setFireTicks(10000);
        player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
        player.setGameMode(GameMode.SURVIVAL);
		return true;
	}

}