package defpackage;

import android.animation.ValueAnimator;
import androidx.camera.view.ScreenFlashView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hx6 implements v53 {
    public ValueAnimator a;
    public final /* synthetic */ ScreenFlashView b;

    public hx6(ScreenFlashView screenFlashView) {
        this.b = screenFlashView;
    }

    @Override // defpackage.v53
    public final void clear() {
        hi5.z0("ScreenFlashView");
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a = null;
        }
        ScreenFlashView screenFlashView = this.b;
        screenFlashView.setAlpha(0.0f);
        screenFlashView.setBrightness(0.0f);
    }
}
