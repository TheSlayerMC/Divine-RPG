package net.divinerpg.helper;

import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.block.IceikaBlockHelper;
import net.divinerpg.helper.block.OverworldBlockHelper;
import net.divinerpg.helper.block.TwilightBlockHelper;
import net.divinerpg.helper.item.ArcanaItemHelper;
import net.divinerpg.helper.item.IceikaItemHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class AchievementPageDivineRPG 
{
    public static final Achievement divineInervention = (new Achievement(50, "divineintervention", 0, 3, OverworldItemHelper.watchingEye, null)).registerAchievement();
    public static final Achievement	divinePlan = (new Achievement(51, "divineplan", 1, 4, OverworldItemHelper.divineSword, divineInervention)).registerAchievement();
    public static final Achievement liesWithin = (new Achievement(52, "lieswithin", 0, 5, ArcanaBlockHelper.arcanaPortalFrame, null)).registerAchievement();
    public static final Achievement perfectlyCorrupted = (new Achievement(53, "perfectlycorrupted", 5, 0, OverworldBlockHelper.SuperEnchantmentTable, null)).registerAchievement();
    public static final Achievement	totalDemonization = (new Achievement(54, "totaldemonization", 3, 11, ArcanaBlockHelper.demonFurnace, liesWithin)).registerAchievement();
    public static final Achievement greatBirdFire = (new Achievement(55, "evildisease", 3, 9, ArcanaItemHelper.dungeonToken, liesWithin)).registerAchievement();
    public static final Achievement dungeonMaster = (new Achievement(56, "dungeonMaster", 3, 4, ArcanaItemHelper.dungeonToken, liesWithin)).registerAchievement();
    public static final Achievement eyeOfEvil = (new Achievement(57, "eyeOfEvil", 0, 0, OverworldItemHelper.rupeeIngot, null)).registerAchievement();
    public static final Achievement tripleDanger = (new Achievement(58, "tripleDanger", 2, 0, OverworldItemHelper.enderShard, null)).registerAchievement();
    public static final Achievement	possibilities = (new Achievement(59, "possibilities", 2, 3, OverworldBlockHelper.divineRock, divineInervention)).registerAchievement();
    public static final Achievement friendOrFoe = (new Achievement(60, "friendorfoe", 4, 3, TwilightItemHelper.draviteSoul, possibilities)).registerAchievement();
    public static final Achievement darkAnotherDay = (new Achievement(61, "darkanotherday", 6, 3, TwilightBlockHelper.augiteBlock, possibilities)).registerAchievement();
    //public static final Achievement tenHeadsIsBetterThanOne = (new Achievement(62, "Spawn Densos and Reyvor", 6, 2, TwilightItemHelper.spawnDensos, darkAnotherDay)).registerAchievement();
    public static final Achievement whenPigsFly = (new Achievement(63, "whenpigsfly", 3, 2, OverworldItemHelper.angelicHelmet, divineInervention)).registerAchievement();
    public static final Achievement offKey = (new Achievement(64, "offKey", 6, 0, OverworldItemHelper.soundOfMusic, null)).registerAchievement();
   // public static final Achievement skyHigh = (new Achievement(65, "65", 3, 5, OverworldBlockHelper.elevantium, liesWithin)).registerAchievement();
    //public static final Achievement	allHellLoose = (new Achievement(66, "allhellloose", 3, 10, OverworldItemHelper.stormSword, liesWithin)).registerAchievement();
    //public static final Achievement enrichment = (new Achievement(67, "enrichment", 3, 7, ArcanaItemHelper.staffOfEnrichment, liesWithin)).registerAchievement();
    public static final Achievement hoterthanHell = (new Achievement(68, "hotterthanHell", 3, 9, ArcanaBlockHelper.heatTrapsOn, liesWithin)).registerAchievement();
   // public static final Achievement	mealToRemember = (new Achievement(69, "mealToRemember", 1, 0, OverworldItemHelper.dinner, null)).registerAchievement();
    //public static final Achievement yuk = (new Achievement(70, "yuk", 3, 8, ArcanaItemHelper.weakArcanaPotion, liesWithin)).registerAchievement();
    //public static final Achievement littleCreature = (new Achievement(71, "littlecreature", 3, 6, ArcanaItemHelper.seimerSpawner, liesWithin)).registerAchievement();
    public static final Achievement	halloweenSpirit = (new Achievement(72, "halloweenspirit", 4, 0, OverworldItemHelper.scythe, null)).registerAchievement();
    public static final Achievement oneLamp = (new Achievement(73, "onelamp", 2, 4, OverworldBlockHelper.DraviteLamp, possibilities)).registerAchievement();
    public static final Achievement feedingOnTheFish = (new Achievement(74, "feedingonthefish", 3, 0, OverworldItemHelper.sharkFin, null)).registerAchievement();
    public static final Achievement arrowToTheKnee = (new Achievement(75, "arrototheknee", 6, 4, TwilightItemHelper.AzuriteArrow, darkAnotherDay)).registerAchievement();
    public static final Achievement frozenLand= (new Achievement(76, "frozenland", 0, 1, IceikaBlockHelper.IceikaPortal, null)).registerAchievement();
    public static final Achievement frozenGoods = (new Achievement(77, "frozengoods", 7, 1, IceikaBlockHelper.frostedChest, frozenLand)).registerAchievement();
    //public static final Achievement lilGift = (new Achievement(78, "lilgift", 7, 0, IceikaBlockHelper.giftBox, frozenGoods)).registerAchievement();
    public static final Achievement lilTinkerin = (new Achievement(79, "liltinkerin", 7, 2, IceikaItemHelper.frozenMaul, frozenGoods)).registerAchievement();

    public static AchievementPage divinerpgpage = new AchievementPage("Divine RPG", divinePlan,
			divineInervention, liesWithin, friendOrFoe,
			/*tenHeadsIsBetterThanOne,*/ perfectlyCorrupted,
			totalDemonization, greatBirdFire, dungeonMaster,
			eyeOfEvil, tripleDanger, possibilities, /*enrichment,*/ hoterthanHell, /*mealToRemember, yuk,
			littleCreature,*/ halloweenSpirit,
			oneLamp, feedingOnTheFish, arrowToTheKnee, frozenLand, frozenGoods, /*lilGift,*/
			lilTinkerin, 
			/*skyHigh,*/ whenPigsFly, offKey, /*allHellLoose,*/ darkAnotherDay);
    
    public static void Init(){
    	AchievementPage.registerAchievementPage(divinerpgpage);
    	//addAchievementName("Default name", "The actual name");
    	//addAchievementDesc("Default name", "The description");
    }
    
    /** 
     * How the name works: 
     * By default, achievements name will just be "achievement.NAME"
     * and I made it easy to add an achievement name, Its basically the 
     * default name then the actual name!
     * @Params Default name, the actual you want name
     * */
    public static void addAchievementName(String achievement, String name){
		LanguageRegistry.instance().addStringLocalization("achievement." + achievement, "en_US", name);
	}

	public static void addAchievementDesc(String achievement, String description){
		LanguageRegistry.instance().addStringLocalization("achievement." + achievement + ".desc", "en_US", description);
	}
}
