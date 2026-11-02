package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s65 {
    public boolean a = false;
    public Object b;
    public Object c;
    public Object d;

    public s65(FrameLayout frameLayout, rt5 rt5Var) {
        this.c = frameLayout;
        this.d = rt5Var;
    }

    public abstract void a(z47 z47Var);

    public String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public abstract View c();

    public abstract Bitmap d();

    public abstract void g(hy7 hy7Var, mf1 mf1Var);

    public void h() {
        FrameLayout frameLayout = (FrameLayout) this.c;
        View viewC = c();
        if (viewC == null || !this.a) {
            return;
        }
        rt5 rt5Var = (rt5) this.d;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        rt5Var.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            hi5.z0("PreviewTransform");
            return;
        }
        if (rt5Var.f()) {
            if (viewC instanceof TextureView) {
                ((TextureView) viewC).setTransform(rt5Var.d());
            } else {
                Display display = viewC.getDisplay();
                boolean z = false;
                boolean z2 = (!rt5Var.g || display == null || display.getRotation() == rt5Var.e) ? false : true;
                boolean z3 = rt5Var.g;
                if (!z3) {
                    if ((!z3 ? rt5Var.c : -w39.m0(rt5Var.e)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    hi5.z0("PreviewTransform");
                }
            }
            RectF rectFE = rt5Var.e(layoutDirection, size);
            viewC.setPivotX(0.0f);
            viewC.setPivotY(0.0f);
            viewC.setScaleX(rectFE.width() / rt5Var.a.getWidth());
            viewC.setScaleY(rectFE.height() / rt5Var.a.getHeight());
            viewC.setTranslationX(rectFE.left - viewC.getLeft());
            viewC.setTranslationY(rectFE.top - viewC.getTop());
        }
    }

    public xb4 i() {
        return u73.Z;
    }

    public s65() {
    }

    public void e() {
    }

    public void f() {
    }
}
