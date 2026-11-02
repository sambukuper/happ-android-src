package defpackage;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ev6 implements WindowManager {
    public final WindowManager X;

    public ev6(fv6 fv6Var, WindowManager windowManager) {
        this.X = windowManager;
    }

    @Override // android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            this.X.addView(view, layoutParams);
        } catch (WindowManager.BadTokenException e) {
            e.getMessage();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.WindowManager
    public final Display getDefaultDisplay() {
        return this.X.getDefaultDisplay();
    }

    @Override // android.view.ViewManager
    public final void removeView(View view) {
        this.X.removeView(view);
    }

    @Override // android.view.WindowManager
    public final void removeViewImmediate(View view) {
        this.X.removeViewImmediate(view);
    }

    @Override // android.view.ViewManager
    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        this.X.updateViewLayout(view, layoutParams);
    }
}
