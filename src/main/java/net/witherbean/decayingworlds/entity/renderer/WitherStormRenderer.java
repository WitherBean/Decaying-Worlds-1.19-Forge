package net.witherbean.decayingworlds.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.WitherBossModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WitherStormRenderer extends MobRenderer<WitherBoss, WitherBossModel<WitherBoss>> {
   private static final ResourceLocation WITHER_INVULNERABLE_LOCATION = new ResourceLocation("textures/entity/wither/wither_invulnerable.png");
   private static final ResourceLocation WITHER_LOCATION = new ResourceLocation("textures/entity/wither/wither.png");

   public WitherStormRenderer(Context manager) {
      super(manager, new WitherBossModel<>((ModelPart) manager.bakeLayer(ModelLayers.WITHER)), 1.0F);
   }

   protected int getBlockLightLevel(WitherBoss p_116443_, BlockPos p_116444_) {
      return 15;
   }

   public ResourceLocation getTextureLocation(WitherBoss p_116437_) {
      int i = p_116437_.getInvulnerableTicks();
      return i > 0 && (i > 80 || i / 5 % 2 != 1) ? WITHER_INVULNERABLE_LOCATION : WITHER_LOCATION;
   }

   protected void scale(WitherBoss p_116439_, PoseStack p_116440_, float p_116441_) {
      float f = 2.0F;
      int i = p_116439_.getInvulnerableTicks();
      if (i > 0) {
         f -= ((float)i - p_116441_) / 220.0F * 0.5F;
      }

      p_116440_.scale(f, f, f);
   }
}