// package net.witherbean.decayingworlds.entity.ai.goal;

// import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
// import net.minecraft.world.entity.monster.Zombie;
// import net.witherbean.entities.CorruptedZombie;

// public class CorruptedZombieAttackGoal extends MeleeAttackGoal {
//    private final CorruptedZombie zombie;
//    private int raiseArmTicks;

//    public CorruptedZombieAttackGoal(CorruptedZombie corruptedZombie, double p_26020_, boolean p_26021_) {
//       super(corruptedZombie, p_26020_, p_26021_);
//       this.zombie = corruptedZombie;
//    }

//    public void start() {
//       super.start();
//       this.raiseArmTicks = 0;
//    }

//    public void stop() {
//       super.stop();
//       this.zombie.setAggressive(false);
//    }

//    public void tick() {
//       super.tick();
//       ++this.raiseArmTicks;
//       if (this.raiseArmTicks >= 5 && this.getTicksUntilNextAttack() < this.getAttackInterval() / 2) {
//          this.zombie.setAggressive(true);
//       } else {
//          this.zombie.setAggressive(false);
//       }

//    }
// }
