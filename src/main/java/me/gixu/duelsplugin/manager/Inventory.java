package me.gixu.duelsplugin.manager;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Inventory{
    public static void giveKits(Player player){
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack bow = new ItemStack(Material.BOW);
        ItemStack arrow = new ItemStack(Material.ARROW,12);
        ItemStack gapple = new ItemStack(Material.GOLDEN_APPLE,8);
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setUnbreakable(true);
        helmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,5,true);
        helmet.setItemMeta(helmetMeta);
        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta chestplateMeta = chestplate.getItemMeta();
        chestplateMeta.setUnbreakable(true);
        chestplateMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,5,true);
        chestplate.setItemMeta(chestplateMeta);
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta leggingsMeta = leggings.getItemMeta();
        leggingsMeta.setUnbreakable(true);
        leggingsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,5,true);
        leggings.setItemMeta(leggingsMeta);
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta bootsMeta = boots.getItemMeta();
        bootsMeta.setUnbreakable(true);
        bootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,5,true);
        boots.setItemMeta(bootsMeta);
        ItemStack armor [] = {helmet,chestplate,leggings,boots};
        player.getInventory().setArmorContents(armor);
        player.getInventory().addItem(sword,bow,arrow,gapple);
    }
    public void clearInventory(Player player){
        player.getInventory().clear();
    }

}
