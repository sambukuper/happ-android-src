package androidx.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import defpackage.hi5;
import defpackage.hx6;
import defpackage.s08;
import defpackage.th0;
import defpackage.v53;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ScreenFlashView extends View {
    public Window f0;
    public hx6 g0;

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }

    private float getBrightness() {
        Window window = this.f0;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        hi5.z0("ScreenFlashView");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.f0 == null) {
            hi5.z0("ScreenFlashView");
            return;
        }
        if (Float.isNaN(f)) {
            hi5.z0("ScreenFlashView");
            return;
        }
        WindowManager.LayoutParams attributes = this.f0.getAttributes();
        attributes.screenBrightness = f;
        this.f0.setAttributes(attributes);
        hi5.z0("ScreenFlashView");
    }

    private void setScreenFlashUiInfo(v53 v53Var) {
        hi5.z0("ScreenFlashView");
    }

    public v53 getScreenFlash() {
        return this.g0;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(th0 th0Var) {
        s08.b();
    }

    public void setScreenFlashWindow(Window window) {
        s08.b();
        hi5.z0("ScreenFlashView");
        if (this.f0 != window) {
            this.g0 = window == null ? null : new hx6(this);
        }
        this.f0 = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
