package net.witherbean.decayingworlds.entities;

import org.apache.commons.lang3.ObjectUtils.Null;

import net.minecraft.client.sounds.SoundEventListener;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MoveThroughVillageGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.ZombieAttackGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;
import net.witherbean.decayingworlds.sounds.SoundEventInit;

public class CorruptedSkeleton extends Monster {

    protected CorruptedSkeleton(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }

    @Override
protected void registerGoals() {
    this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
    this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    addBehaviourGoals();
}

    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(ZombifiedPiglin.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));

}
    public static AttributeSupplier.Builder getAttribues() {
        
        return Mob.createMobAttributes().add(ForgeMod.ATTACK_RANGE.get(), 2.5).add(Attributes.MAX_HEALTH, 60).add(Attributes.ATTACK_DAMAGE, 6).add(Attributes.ATTACK_KNOCKBACK, 0.5).add(Attributes.MOVEMENT_SPEED, 0.3);
        
    }
    protected SoundEvent getAmbientSound() {
		return this.random.nextBoolean() ? SoundEventInit.CORRUPTED_SKELETON_IDLE.get() : SoundEventInit.CORRUPTED_SKELETON_IDLE.get();
	}

	protected SoundEvent getHurtSound(DamageSource p_35072_) {
		return SoundEventInit.CORRUPTED_SKELETON_HURT.get();
	}

	protected SoundEvent getDeathSound() {
		return SoundEventInit.CORRUPTED_SKELETON_DEATH.get();
	}
}