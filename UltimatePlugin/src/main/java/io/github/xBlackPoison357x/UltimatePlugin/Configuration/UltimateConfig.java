package io.github.xBlackPoison357x.UltimatePlugin.Configuration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import io.github.xBlackPoison357x.UltimatePlugin.UltimatePlugin;

public class UltimateConfig {
    private UltimatePlugin plugin;

    public UltimateConfig(UltimatePlugin instance) {
        this.plugin = instance;
    }

    public void setDefaultConfig(File configf) {
        this.plugin.getDefaultConfig().set("UltimatePlugin", (Object)this.plugin.pdfFile.getVersion());
        this.plugin.getDefaultConfig().set("autoupdate", (Object)true);
        this.plugin.getDefaultConfig().set("Check Bukkit Compatibility", (Object)false);
        this.plugin.getDefaultConfig().set("Enabled Plugin Components.Information", (Object)true);
        this.plugin.getDefaultConfig().set("Enabled Plugin Components.RecipeChanger", (Object)true);
        this.plugin.getDefaultConfig().set("Enabled Plugin Components.DisableEXP", (Object)true);
        this.plugin.getDefaultConfig().set("Enabled Plugin Components.FrameProtector", (Object)true);
        this.plugin.getDefaultConfig().set("Enabled Plugin Components.DisableCommands", (Object)true);
        try {
            this.plugin.getDefaultConfig().save(configf);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setDisableEXPConfig(File disableexpf) {
        this.plugin.getDisableEXPConfig().set("EXP.Ore", (Object)false);
        this.plugin.getDisableEXPConfig().set("EXP.Smelt", (Object)false);
        this.plugin.getDisableEXPConfig().set("EXP.Mob", (Object)false);
        this.plugin.getDisableEXPConfig().set("EXP.Fish", (Object)false);
        this.plugin.getDisableEXPConfig().set("EXP.Exp Bottle", (Object)false);
        this.plugin.getDisableEXPConfig().set("EXP.Breeding", (Object)false);
        this.plugin.getDisableEXPConfig().set("EXP.ALL", (Object)false);
        try {
            this.plugin.getDisableEXPConfig().save(disableexpf);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setInformationConfig(File informationf) {
        ArrayList<String> website = new ArrayList<String>();
        website.add("&1 Website");
        ArrayList<String> donate = new ArrayList<String>();
        donate.add("&2 Donate");
        ArrayList<String> rules = new ArrayList<String>();
        rules.add("&3 Rules");
        ArrayList<String> staff = new ArrayList<String>();
        staff.add("&4 Staff");
        ArrayList<String> twitter = new ArrayList<String>();
        twitter.add("&6 Twitter");
        ArrayList<String> facebook = new ArrayList<String>();
        facebook.add("&7 Facebook");
        ArrayList<String> youtube = new ArrayList<String>();
        youtube.add("&8 Youtube");
        ArrayList<String> extra = new ArrayList<String>();
        extra.add("&9 Extra");
        ArrayList<String> vote = new ArrayList<String>();
        vote.add("&a Vote");
        this.plugin.getInformationConfig().set("Website", website);
        this.plugin.getInformationConfig().set("Donate", donate);
        this.plugin.getInformationConfig().set("Rules", rules);
        this.plugin.getInformationConfig().set("Staff", staff);
        this.plugin.getInformationConfig().set("Twitter", twitter);
        this.plugin.getInformationConfig().set("Facebook", facebook);
        this.plugin.getInformationConfig().set("Youtube", youtube);
        this.plugin.getInformationConfig().set("Extra", extra);
        this.plugin.getInformationConfig().set("Vote", vote);
        this.plugin.getInformationConfig().set("Disabled Flight Worlds.world", (Object)false);
        this.plugin.getInformationConfig().set("Disabled Flight Worlds.world_nether", (Object)false);
        this.plugin.getInformationConfig().set("Disabled Flight Worlds.world_the_end", (Object)false);
        this.plugin.getInformationConfig().set("Disabled Creative Worlds.world", (Object)false);
        this.plugin.getInformationConfig().set("Disabled Creative Worlds.world_nether", (Object)false);
        this.plugin.getInformationConfig().set("Disabled Creative Worlds.world_the_end", (Object)false);
        this.plugin.getInformationConfig().set("Disabled Join Worlds.world", (Object)false);
        this.plugin.getInformationConfig().set("Disabled Join Worlds.world_nether", (Object)false);
        this.plugin.getInformationConfig().set("Disabled Join Worlds.world_the_end", (Object)false);
        this.plugin.getInformationConfig().set("Factions.Safezone Flight", (Object)false);
        this.plugin.getInformationConfig().set("Factions.Enemy Flight", (Object)false);
        this.plugin.getInformationConfig().set("Factions.Neutral Flight", (Object)false);
        this.plugin.getInformationConfig().set("Factions.Truce Flight", (Object)false);
        this.plugin.getInformationConfig().set("Factions.Ally Flight", (Object)false);
        this.plugin.getInformationConfig().set("Factions.Wilderness Flight", (Object)false);
        this.plugin.getInformationConfig().set("Factions.Warzone Flight", (Object)false);
        this.plugin.getInformationConfig().set("Factions.No Safezone Damage", (Object)false);
        this.plugin.getInformationConfig().set("Boss Message.Color", (Object)"RED");
        this.plugin.getInformationConfig().set("Boss Message.Text", (Object)"Welcome to the Server!");
        this.plugin.getInformationConfig().set("Boss Message.Style", (Object)"SOLID");
        this.plugin.getInformationConfig().set("Boss Message.Flag", (Object)"DARKEN_SKY");
        this.plugin.getInformationConfig().set("Blocktopofnetherbuilding", (Object)false);
        this.plugin.getInformationConfig().set("Starter Kit", (Object)false);
        try {
            this.plugin.getInformationConfig().save(informationf);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setRecipeChangerConfig(File recipechangerf) {
        this.plugin.getRecipeChangerConfig().set("Horse Armor.Iron", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Horse Armor.Gold", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Horse Armor.Diamond", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Chain Armor.Helmet", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Chain Armor.ChestPiece", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Chain Armor.Leggings", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Chain Armor.Boots", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Bat", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Chicken", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Cow", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Horse", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Mooshroom", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Ocelot", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Pig", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Sheep", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Squid", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Spawn Eggs.Wolf", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.stal", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.11", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.far", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.ward", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.13", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.cat", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.blocks", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.mellohi", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.chirp", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.strad", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Music Discs.mall", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Name Tag", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Saddle", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Grass Block", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Obsidian", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Grass", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Ice", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Fire", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Bottle o Enchanting", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Sponge", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Bedrock", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Dragon Egg", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Gunpowder", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Monster Spawner", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Command Block", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Podzol", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Double Tallgrass", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Packed Ice", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Leather", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Cocoa Beans", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Misc.Shulker Shell", (Object)false);
        this.plugin.getRecipeChangerConfig().set("Messages.Permission Granted", (Object)"You have permission to craft this item!");
        this.plugin.getRecipeChangerConfig().set("Messages.Permission Denied", (Object)"I'm sorry, but you do not have permission to craft this item. Please contact the server administrators if you believe that this is in error.");
        try {
            this.plugin.getRecipeChangerConfig().save(recipechangerf);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setDisableCommandMessagesConfig(File disablecommandmessagesf) {
        this.plugin.getDisableCommandMessagesConfig().set("Messages.Command Deny Message", (Object)"That Command is not allowed");
        this.plugin.getDisableCommandMessagesConfig().set("Messages.Permission Deny Message", (Object)"I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
        this.plugin.getDisableCommandMessagesConfig().set("Messages.Already Forbidden Message", (Object)"That command is already forbidden!");
        this.plugin.getDisableCommandMessagesConfig().set("Messages.Not Forbiddien Message", (Object)"That command is not forbidden!");
        try {
            this.plugin.getDisableCommandMessagesConfig().save(disablecommandmessagesf);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setFrameProtectorConfig(File frameprotectorf) {
        this.plugin.getFrameProtectorConfig().set("Messages.Enable", (Object)true);
        this.plugin.getFrameProtectorConfig().set("Messages.Remove Frame Deny Message", (Object)"You are not allowed to remove this ItemFrame!");
        this.plugin.getFrameProtectorConfig().set("Messages.Place Deny Message", (Object)"You are not allowed to place this ItemFrame!");
        this.plugin.getFrameProtectorConfig().set("Messages.Rotate Deny Message", (Object)"You are not allowed to rotate this ItemFrame!");
        this.plugin.getFrameProtectorConfig().set("Messages.Remove Item Deny Message", (Object)"You are not allowed to remove items from this ItemFrame!");
        this.plugin.getFrameProtectorConfig().set("Messages.Command Deny Message", (Object)"I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
        try {
            this.plugin.getFrameProtectorConfig().save(frameprotectorf);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

