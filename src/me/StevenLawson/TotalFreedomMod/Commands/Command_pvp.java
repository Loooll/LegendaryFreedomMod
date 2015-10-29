package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Pvp with these items!.", usage = "/<command>")
public class Command_pvp extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        Player player = Bukkit.getPlayer(sender.getName());
        PlayerInventory inv = player.getInventory();
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemStack arrow = new ItemStack(Material.ARROW, 1);
        for (Enchantment ench : Enchantment.values())
        {
            if (ench.equals(Enchantment.LOOT_BONUS_MOBS) || ench.equals(Enchantment.LOOT_BONUS_BLOCKS))
            {
                continue;
            }
            sword.addUnsafeEnchantment(ench, 32767);
            bow.addUnsafeEnchantment(ench, 32767);
            arrow.addUnsafeEnchantment(ench, 32767);
            axe.addUnsafeEnchantment(ench, 32767);
        }

        if (inv.contains(bow))
        {
        }
        else
        {
            inv.addItem(bow);
        }

        if (inv.contains(arrow))
        {
        }
        else
        {
            inv.addItem(arrow);
        }
        
        if (inv.contains(axe))
        {
        }
        else
        {
            inv.addItem(axe);
        }

        if (inv.contains(sword))
        {
        }
        else
        {
            inv.addItem(sword);
        }
        for (Enchantment ench : Enchantment.values())
        {
            if (ench.equals(Enchantment.LOOT_BONUS_MOBS) || ench.equals(Enchantment.LOOT_BONUS_BLOCKS))
            {
                continue;
            }
            chestplate.addUnsafeEnchantment(ench, 32767);
            leggings.addUnsafeEnchantment(ench, 32767);
            boots.addUnsafeEnchantment(ench, 32767);
            helmet.addUnsafeEnchantment(ench, 32767);
        }
        inv.setHelmet(helmet);
        inv.setBoots(boots);
        inv.setLeggings(leggings);
        inv.setChestplate(chestplate);
        sender.sendMessage(ChatColor.RED + "You have been given OP GOD PVP ITEMS.PVP AWAY!");
        return true;
    }
}

