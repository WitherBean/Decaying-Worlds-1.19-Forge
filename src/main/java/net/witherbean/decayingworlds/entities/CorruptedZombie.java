// package net.witherbean.decayingworlds.entities;

// import net.minecraft.world.entity.EntityType;
// import net.minecraft.world.entity.Mob;
// import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
// import net.minecraft.world.entity.ai.attributes.Attributes;
// import net.minecraft.world.entity.ai.goal.*;
// import net.minecraft.world.entity.monster.Monster;
// import net.minecraft.world.entity.monster.Zombie;
// import net.minecraft.world.entity.player.Player;
// import net.minecraft.world.level.Level;

// public class CorruptedZombie extends Monster {
//     public CorruptedZombie(EntityType<? extends Monster> type, Level level) {
//         super(type, level);
//     }

//     @Override
//     protected void registerGoals() {
//         this.goalSelector.addGoal(0, new FloatGoal(this));
//         this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
//         this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
//         this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
//         this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
//     }

//     public static AttributeSupplier.Builder getExampleAttributes() {
//         return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 25.0D).add(Attributes.MOVEMENT_SPEED, 0.7246D);
//     }
// }