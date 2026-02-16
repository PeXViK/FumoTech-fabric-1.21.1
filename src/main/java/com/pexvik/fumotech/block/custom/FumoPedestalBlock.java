package com.pexvik.fumotech.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.Map;

public class FumoPedestalBlock extends HorizontalFacingBlock {
    public static final MapCodec<FumoPedestalBlock> CODEC = FumoPedestalBlock.createCodec(FumoPedestalBlock::new);

    protected Map<Direction, VoxelShape> SHAPES = Map.ofEntries(
            Map.entry(Direction.NORTH, VoxelShapes.union(
                    VoxelShapes.cuboid(0.1875, 0, 0.1875, 0.8125, 0.0625, 0.8125),
                    VoxelShapes.cuboid(0.28125, 0.0625, 0.28125, 0.71875, 0.125, 0.71875),
                    VoxelShapes.cuboid(0.34375, 0.125, 0.34375, 0.65625, 0.9375, 0.65625),
                    VoxelShapes.cuboid(0.28125, 0.9375, 0.21875, 0.71875, 1, 0.78125)
            )),
            Map.entry(Direction.WEST, VoxelShapes.union(
                    VoxelShapes.cuboid(0.1875, 0, 0.1875, 0.8125, 0.0625, 0.8125),
                    VoxelShapes.cuboid(0.28125, 0.0625, 0.28125, 0.71875, 0.125, 0.71875),
                    VoxelShapes.cuboid(0.34375, 0.125, 0.34375, 0.65625, 0.9375, 0.65625),
                    VoxelShapes.cuboid(0.21875, 0.9375, 0.28125, 0.78125, 1, 0.71875)
            )),
            Map.entry(Direction.SOUTH, VoxelShapes.union(
                    VoxelShapes.cuboid(0.1875, 0, 0.1875, 0.8125, 0.0625, 0.8125),
                    VoxelShapes.cuboid(0.28125, 0.0625, 0.28125, 0.71875, 0.125, 0.71875),
                    VoxelShapes.cuboid(0.34375, 0.125, 0.34375, 0.65625, 0.9375, 0.65625),
                    VoxelShapes.cuboid(0.28125, 0.9375, 0.21875, 0.71875, 1, 0.78125)
            )),
            Map.entry(Direction.EAST, VoxelShapes.union(
                    VoxelShapes.cuboid(0.1875, 0, 0.1875, 0.8125, 0.0625, 0.8125),
                    VoxelShapes.cuboid(0.28125, 0.0625, 0.28125, 0.71875, 0.125, 0.71875),
                    VoxelShapes.cuboid(0.34375, 0.125, 0.34375, 0.65625, 0.9375, 0.65625),
                    VoxelShapes.cuboid(0.21875, 0.9375, 0.28125, 0.78125, 1, 0.71875)
            ))
    );


    public FumoPedestalBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));

    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES.get(state.get(Properties.HORIZONTAL_FACING));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
}
