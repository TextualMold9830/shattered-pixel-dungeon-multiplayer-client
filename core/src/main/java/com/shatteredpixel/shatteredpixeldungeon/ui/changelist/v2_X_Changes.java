/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2022 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.ui.changelist;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.HeroClass;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.abilities.duelist.ElementalStrike;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.HeroSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.ui.HeroIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class v2_X_Changes {

	public static void addAllChanges( ArrayList<ChangeInfo> changeInfos ){
		//add_Coming_Soon(changeInfos);
		add_v2_0_Changes(changeInfos);
	}

	//TODO
	public static void add_Coming_Soon( ArrayList<ChangeInfo> changeInfos ) {

		ChangeInfo changes = new ChangeInfo("Coming Soon", true, "");
		changes.hardlight(0xCCCCCC);
		changeInfos.add(changes);


	}

	//TODO
	public static void add_v2_0_Changes( ArrayList<ChangeInfo> changeInfos ) {

		ChangeInfo changes = new ChangeInfo("v2.0-BETA", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton( new ChangeButton(Icons.get(Icons.SHPX), "To-Do",
				"While v2.0.0 has made it to beta, there's still some work to do! here's roughly what I have planned to finish before release:\n\n" +
				"_-_ Implement the Monk subclass\n" +
				"_-_ Implement the Feint armor ability\n" +
				"_-_ Finish up Duelist visuals and any other small adjustments\n" +
				"_-_ Fix any major bugs or balance issues"));

		changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.DUELIST, 1), HeroClass.DUELIST.title(),
				"_Shattered Pixel Dungeon has a new playable character!!_\n" +
				"\n" +
				"The Duelist is an entire new hero class, _with a unique ability for every weapon in the game!_ She can be unlocked by earning a simple badge for equipping a T2 or higher weapon without a strength penalty. However, for the Beta she is unlocked by default!\n" +
				"\n" +
				"I want the Duelist to provide more interesting gameplay options for melee weapon focused builds, that have previously been fairly plain and simple compared to builds using other items.\n" +
				"\n" +
				"_Note that the duelist's in-game sprite is not final. I plan to improve it before release._"));

		changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.DUELIST, 4), "Duelist Subclasses",
				"_The Duelist has two subclasses, with 3 more talents each!_\n" +
				"\n" +
				"_The Champion_ is a master of melee weapons who can equip a secondary weapon in addition to her primary one!\n" +
				"\n" +
				"_The Monk_ is a master of physical technique. As she defeats enemies, she gains energy which can be used on a variety of defensive and utlity-focused abilities.\n" +
				"_The Monk has not been finished yet._ Look out for this second subclass very soon!"));

		changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.DUELIST, 6), "Duelist Armor Abilities",
				"_The Duelist has three lategame armor abilities, with 3 more talents each!_\n" +
				"\n" +
				"_Challenge_ compels an enemy to fight the Duelist while all other enemies are temporarily frozen in time.\n" +
				"\n" +
				"_Elemental Strike_ produces a special effect that is based on the Duelist's weapon enchantment.\n" +
				"\n" +
				"_Feint_ allows the Duelist to sidestep an enemy's attack while they are focused on her afterimage.\n" +
				"_Feint has not been finished yet,_ look out for it very soon!"));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.STAIRS), "Ascension Challenge",
				"I'm making a few adjustments to the ascension challenge to slightly increase the difficulty of some regions, while also reducing the pressure to kill enemies a little bit:\n" +
				"\n" +
				"_-_ Enemies to kill per floor reduced to 2 from 2.5. Thresholds for all amulet debuff effects adjusted to compensate\n" +
				"\n" +
				"_- Ripper demon_ spawn rate increased if player is ascending\n" +
				"\n" +
				"_- Monk & Warlock_ stat boost up to 1.5x from 1.33x\n" +
				"_- Elemental & Ghoul_ stat boost up to 1.67x from 1.5x\n" +
				"\n" +
				"_- Crab & Slime_ stat boost up to 8x from 6x\n" +
				"_- Swarm_ stat boost up to 8.5x from 6.5x\n" +
				"_- Gnoll & Snake_ stat boost up to 9x from 7x\n" +
				"_- Rat_ stat boost up to 10x from 8x"));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc") + " 1",
				"_Highlights:_\n" +
				"_-_ The game now remembers if the player removes the waterskin from their quickslot right after starting a run\n" +
				"_-_ The damage warning vfx now always interrupts the hero, regardless of any other factors\n" +
				"_-_ The deadly misstep badge can now also be unlocked with disintegration traps\n" +
				"_-_ Added metamorphosis effects to the two remaining talents that previously couldn't be gained by metamorphosis\n" +
				"_-_ Desktop users can now toggle fullscreen with right-alt + enter\n" +
				"_-_ Added a setting to enable/disable playing music in background on desktop\n" +
				"\n" +
				"_Hero, Allies, & Enemies:_\n" +
				"_-_ The hero can now also self-trample plants, in addition to grass\n" +
				"_-_ Ripper demons will now try to leap even if their destination is blocked by terrain\n" +
				"_-_ Knockback effects now round up after being halved vs. bosses\n" +
				"\n" +
				"_Effects:_\n" +
				"_-_ Backup barrier now triggers before wand zaps fully resolve\n" +
				"_-_ The chasm warning screen now also appears when levitation is about to end."));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc") + " 2",
				"_Levelgen:_\n" +
				"_-_ Adjusted the layout of sacrifice rooms to provide some cover from ranged enemies\n" +
				"_-_ Secret rooms now never affect the generation of items in other rooms\n" +
				"_-_ Items and Enemies can no longer spawn on the Wandmaker quest ritual marker.\n" +
				"\n" +
				"_Items:_\n" +
				"_-_ Several artifacts now cancel invisibility when used\n" +
				"_-_ Items no longer spawn on pitfall traps\n" +
				"_-_ Ritual candles now light if they are placed correctly\n" +
				"_-_ Item selectors now always open the main backpack if their preferred bag isn't present\n" +
				"\n" +
				"_Misc:_\n" +
				"_-_ Updated the icons for several talents\n" +
				"_-_ Healing no longer interrupts resting when HP is already full\n" +
				"_-_ Updated various code libraries"));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes") + " 1",
				"Fixed the following bugs:\n" +
				"_Highlights:_\n" +
				"_-_ Softlocks caused by the warden using fadeleaf just as they start a boss fight\n" +
				"_-_ Particle effects failing to appear in a bunch of rare cases\n" +
				"_-_ AOE from gladiator's crush move invalidating Dwarf King's 'no weapons' badge\n" +
				"_-_ Magic resistance being extremely effective against Grim traps at low HP\n" +
				"_-_ Allies spawned by some armor abilities getting boosted stats during ascension\n" +
				"\n" +
				"_Effects:_\n" +
				"_-_ Lethal momentum not triggering on kills made via enchantment\n" +
				"_-_ Teleportation effects not being blocked by magic immunity\n" +
				"_-_ Barkskin not reducing damage from things like bombs or the chalice of blood\n" +
				"_-_ Some armor abilities not checking if targets are out of vision\n" +
				"_-_ Magical fire not clearing regular fire if they are on the same tile\n" +
				"_-_ Gladiator being able to riposte enemies who charmed him\n" +
				"_-_ Iron Stomach talent cancelling fall damage in rare cases\n" +
				"_-_ Time freeze causing various odd behaviour when triggering plants and traps\n" +
				"_-_ Rare cases of earthroot armor and hold fast working after movement"));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes") + " 2",
				"_Items:_\n" +
				"_-_ One upgrade being lost when transferring class armor with a warrior's seal attached\n" +
				"_-_ Leftover darts being lost in rare cases when tipped darts have bonus durability\n" +
				"_-_ Transmuting a dried rose deleting any items held by the ghost\n" +
				"_-_ Alchemist's Toolkit not triggering the enhanced rings talent\n" +
				"_-_ Wand of fireblast rarely shooting great distances\n" +
				"_-_ Wand of Lightning rarely taking credit for hero deaths not caused by it\n" +
				"_-_ Horn of plenty benefiting from artifact recharging much more than intended\n" +
				"_-_ Magic immunity not blocking use of shield battery, cursed artifact effects, or wand recharging\n" +
				"_-_ Cursed items still blocking equipment slots when lost via ankh revive\n" +
				"_-_ Antimagic not reducing damage from enchantments\n" +
				"_-_ Rare cases where cloak of shadows wouldn't spend a charge on activation\n" +
				"_-_ Disarming traps rarely teleporting weapons into chests or graves\n" +
				"_-_ Blacksmith failing to take his pickaxe back in rare cases\n" +
				"_-_ Various rare errors with blacksmith reforging and resin boosted wands"));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes") + " 3",
				"_Allies & Enemies:_\n" +
				"_-_ Rare cases of hero stacking onto enemies when trying to swap positions with an ally\n" +
				"_-_ DM-300 not using abilities in its first phase in specific situations\n" +
				"_-_ DM-201s rarely lobbing grenades when they shouldn't\n" +
				"_-_ DM-300's rockfall attack very rarely having no delay\n" +
				"_-_ Tengu rarely throwing bombs into walls\n" +
				"_-_ Several on-kill effects incorrectly triggering when ghouls get downed, but not killed\n" +
				"_-_ Soiled fist being able to see through shrouding fog\n" +
				"_-_ Rare cases where the Imp's shop could appear without completing his quest\n" +
				"_-_ Gladiator not gaining combo from attacking hiding mimics\n" +
				"_-_ Demon spawners rapidly spawning ripper demons in very specific cases\n" +
				"_-_ Rare cases where enemies couldn't be surprise attacked when in combat with allies\n" +
				"_-_ Various rare errors with shock elemental electricity damage\n" +
				"_-_ Evil eyes only resisting some disintegration effects\n" +
				"_-_ Several rare issues with spinner web shooting\n" +
				"_-_ Very rare cases where surprise attacks on mimics would fail\n" +
				"_-_ Very rare pathfinding bugs with flying enemies"));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes") + " 4",
				"_UI/VFX:_\n" +
				"_-_ Various minor audiovisual errors\n" +
				"_-_ Various minor textual errors\n" +
				"_-_ Items rarely disappearing when hotkeys are used to close the inventory\n" +
				"_-_ 'i' being incorrectly uppercased to 'I' in Turkish\n" +
				"_-_ Auras from champion enemies being visible in the fog of war for one frame\n" +
				"_-_ Very rare cases where Goo attack particles behaved incorrectly\n" +
				"_-_ Damage warn vfx not accounting for hunger ignoring shielding\n" +
				"_-_ Cases where very fast heroes would cause landmarks to not be recorded\n" +
				"_-_ No error message being given when the mage uses elemental blast without a staff"));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_TOPAZ), "Item Buffs",
				"I'm making several buffs to various items that could be performing a little better:\n" +
				"\n" +
				"_- Pickaxe_ can now benefit from upgrades enchantments and augmentation, if you feel like using it for fun.\n" +
				"\n" +
				"_- Ring of Energy_ now also applies a recharging boost to hero armor abilities. All the boosts it gives are now standardized to +15%.\n" +
				"_- Ring of Arcana_ enchantment boost up to +17.5% per level, from +15%\n" +
				"\n" +
				"_- Glyph of Repulsion_ now only knocks back enemies who are adjacent to the hero. This should make it slightly better versus ranged enemies.\n" +
				"_- Glyph of Flow_ now grants +50% movespeed in water per level, up from +25%\n" +
				"\n" +
				"_- Horn of Plenty_ now gains 2 levels from being fed a pasty, up from 1.5\n" +
				"_- Horn of Plenty_ now gains 4 levels from being fed a meat pie, up from 3"));

		changes.addButton( new ChangeButton(HeroSprite.avatar(HeroClass.MAGE, 6), "Hero Buffs",
				"A couple buffs to the two worst performing armor abilities/talents:\n" +
				"\n" +
				"_- Shrug it Off_ now just directly boosts the damage resistance from endure to 60/68/74/80%, instead of reducing max damage taken\n" +
				"\n" +
				"_- Wild Magic_ now spends 0.5 wand charges at base. Conserved magic can reduce this to 0.1\n" +
				"\n" +
				"I expect the next update will include more hero balance changes, after the dust settles from the Duelist."));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.ROUND_SHIELD), "Major Item Nerfs",
				"I'm also making several significant nerfs to items with standout winrates this update:\n" +
				"\n" +
				"_- Round Shield_ blocking per level reduced to 0-1 from 0-2, base damage increased to 3-12 from 3-10\n" +
				"_- Greatshield_ blocking per level reduced to 0-2 from 0-3, base damage increased to 5-18 from 5-15\n" +
				"\n" +
				"_Wand of Corruption:_\n" +
				"_-_ Corrupted enemies now die over 100 turns, down from 200\n" +
				"_-_ Doomed bosses now take +67% damage, down from +100%\n" +
				"_-_ Battlemage corruption on-hit base proc rate reduced to 1/6 from 1/4\n" +
				"\n" +
				"_Wand of Regrowth:_\n" +
				"_-_ Base charge limit increased to 20 from 8\n" +
				"_-_ Charge limit scaling substantially reduced at wand levels 4 to 9.\n" +
				"\n" +
				"_Chalice of Blood:_\n" +
				"_-_ Prick damage increased by 5 at all levels\n" +
				"_-_ Now grants 1.15x-5x healing, down from 0x-10x\n" +
				"\n" +
				"_- Ethereal chains_ charge from gaining exp reduced by 40%"));

		changes.addButton( new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_RUBY), "Smaller Item Nerfs",
				"There are also some more minor nerfs to items that are just doing a bit too well:\n" +
				"\n" +
				"_- Ring of Furor_ attack speed boost per level down to 9.05% from 10.5%\n" +
				"_- Ring of Evasion_ dodge boost per level down to 12.5% from 15%\n" +
				"\n" +
				"_- Blocking_ enchantment now grants 2+item level shielding, down from max HP/10\n" +
				"\n" +
				"_- Timekeeper's Hourglass_ sand bag cost up to 30 from 20\n" +
				"_- Alchemist's Toolkit_ now requires 6 energy per level, up from 5\n" +
				"\n" +
				"_- Wand of Fireblast_ base damage reduced to 1-2 from 1-6 when spending 1 charge, and 2-8 from 2-12 when spending 2 charges. This is to offset the relatively high amount of DOT the wand deals at low levels."));

		changes.addButton( new ChangeButton(HeroSprite.avatar(HeroClass.ROGUE, 6), "Hero Nerfs",
				"T1 Talents:\n" +
				"_-_ Warrior's T1 ID talent renamed from _Armsmaster's Intuition_ to _Veteran's Intuition_. The talent now focuses more on armor, to contrast with the Duelist.\n" +
				"\n" +
				"Armor Abilities:\n" +
				"_- Heroic Energy_ lightly nerfed to 12/23/32/40% charge speed boost, from 13/24/34/43%\n" +
				"\n" +
				"_- Double Jump_ charge cost reduction down to 16/30/41/50%, from 20/36/50/60%\n" +
				"\n" +
				"_- Smoke Bomb_ range down to 6 from 10\n" +
				"_- Shadow Step_ charge cost reduction down to 16/30/41/50%, from 20/36/50/60%"));

	}

}
