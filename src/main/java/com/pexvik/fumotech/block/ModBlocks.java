package com.pexvik.fumotech.block;

import com.pexvik.fumotech.FumoTech;
import com.pexvik.fumotech.block.custom.FumoBlock;
import com.pexvik.fumotech.block.custom.FumoPedestalBlock;
import com.pexvik.fumotech.block.custom.RubberClubGeneratorBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block SATORIUM_ORE = registerBlock("satorium_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create()
                            .strength(3.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            )
    );

    public static final Block DEEPSLATE_SATORIUM_ORE = registerBlock("deepslate_satorium_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 3),
                    AbstractBlock.Settings.create()
                            .strength(4.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );

    public static final Block CIRNIUM_ORE = registerBlock("cirnium_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create()
                            .strength(3.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            )
    );

    public static final Block DEEPSLATE_CIRNIUM_ORE = registerBlock("deepslate_cirnium_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 3),
                    AbstractBlock.Settings.create()
                            .strength(4.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create()
                            .strength(3.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            )
    );

    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 3),
                    AbstractBlock.Settings.create()
                            .strength(4.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );

    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE))
    );

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE))
    );

    // === Compressed blocks ===

    public static final Block SATORIUM_BLOCK = registerBlock("satorium_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK))
    );

    public static final Block CIRNIUM_BLOCK = registerBlock("cirnium_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK))
    );

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL))
    );

    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL))
    );

    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL))
    );

    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL))
    );

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL))
    );

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL))
    );

    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL))
    );

    public static final Block RUBBER_BLOCK = registerBlock("rubber_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.HONEY))
    );

    // === Wood blocks ===

    public static final Block HEVEA_LOG = registerBlock("hevea_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable())
    );
    public static final Block HEVEA_PLANKS = registerBlock("hevea_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.0f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));
    public static final Block HEVEA_STAIRS = registerBlock("hevea_stairs",
            new StairsBlock(HEVEA_PLANKS.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.0f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));
    public static final Block HEVEA_SLAB = registerBlock("hevea_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                .strength(2.0f, 3.0f)
                .sounds(BlockSoundGroup.WOOD)
                .burnable()
            ));
    public static final Block HEVEA_PRESSURE_PLATE = registerBlock("hevea_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                    .strength(0.5f, 3.0f)
                    .noCollision()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));
    public static final Block HEVEA_BUTTON = registerBlock("hevea_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.create()
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));
    public static final Block HEVEA_FENCE = registerBlock("hevea_fence", new FenceBlock(
                    AbstractBlock.Settings.create()
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            ));
    public static final Block HEVEA_FENCE_GATE = registerBlock("hevea_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create()
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));
    public static final Block HEVEA_DOOR = registerBlock("hevea_door", new DoorBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(3.0F)
                            .nonOpaque()
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));
    public static final Block HEVEA_TRAPDOOR = registerBlock("hevea_trapdoor", new TrapdoorBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(3.0F)
                            .nonOpaque()
                            .burnable()
                            .allowsSpawning(Blocks::never)
            ));

    // === FUNCTIONAL BLOCKS ===

    public static final Block RUBBER_CLUB_GENERATOR = registerBlock("rubber_club_generator",
            new RubberClubGeneratorBlock(AbstractBlock.Settings.create()
                    .strength(3.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.ANVIL)
            ));

    public static final Block CIRNO = registerBlock("cirno",
            new FumoBlock(AbstractBlock.Settings.create()
                    .strength(1.0f)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.WOOL)
            ));

    public static final Block SATORI = registerBlock("satori",
            new FumoBlock(AbstractBlock.Settings.copy(CIRNO)
            ));

    public static final Block FUMO_PEDESTAL = registerBlock("fumo_pedestal",
            new FumoPedestalBlock(AbstractBlock.Settings.create()
                    .strength(3.0f)
                    .requiresTool()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.STONE)
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FumoTech.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FumoTech.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FumoTech.LOGGER.info(FumoTech.MOD_ID + ": Registering Mod Blocks");

    }
}
