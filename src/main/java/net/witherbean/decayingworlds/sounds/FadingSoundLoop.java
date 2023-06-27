package net.witherbean.decayingworlds.sounds;

import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;

public abstract class FadingSoundLoop extends AbstractTickableSoundInstance {
    protected float fade;
    protected boolean stopping;
    protected boolean starting;
    protected float dampen;
    private float f_119573_;
    private boolean f_119578_;
    private int f_119579_;

    protected abstract int getFadeTime();

    /* JADX INFO: Access modifiers changed from: protected */
    public FadingSoundLoop(SoundEvent event, SoundSource category) {
        super(event, category, SoundInstance.createUnseededRandom());
        this.starting = true;
        this.f_119573_ = 0.0f;
        this.f_119579_ = 0;
        this.f_119578_ = true;
    }

    public void m_7788_() {
        if (this.stopping) {
            if (this.fade > 0.0f) {
                this.fade -= 1.0f;
            } else {
                m_119609_();
            }
        } else if (this.starting) {
            if (this.fade < getFadeTime()) {
                this.fade += 1.0f;
            } else {
                this.starting = false;
            }
        }
        float volume = Math.max(0.0f, Math.min(this.fade / getFadeTime(), 1.0f)) * maximumVolume();
        this.f_119573_ = volume - Math.max(0.0f, this.dampen * 0.02f);
    }

    protected void m_119609_() {
    }

    protected boolean shouldFadeOut() {
        return this.stopping;
    }

    public boolean isStopping() {
        return this.stopping;
    }

    public void stopSound() {
        if (!this.stopping) {
            this.stopping = true;
            this.fade = getFadeTime();
        }
    }

    protected float maximumVolume() {
        return 1.0f;
    }

    public boolean m_7784_() {
        return true;
    }
}