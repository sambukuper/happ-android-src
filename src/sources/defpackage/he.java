package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class he implements vt2 {
    public static boolean g = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public ww8 c;
    public boolean d;
    public dq e;
    public final fe f;

    public he(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        fe feVar = new fe(this, (byte) 0);
        this.f = feVar;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(feVar);
                this.d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new ge(this, (byte) 0));
    }

    @Override // defpackage.vt2
    public final void a(xt2 xt2Var) {
        synchronized (this.b) {
            if (!xt2Var.s) {
                xt2Var.s = true;
                xt2Var.b();
            }
        }
    }

    @Override // defpackage.vt2
    public final dq b() {
        dq dqVar = this.e;
        if (dqVar != null) {
            return dqVar;
        }
        dq dqVar2 = new dq((byte) 10, false);
        this.e = dqVar2;
        return dqVar2;
    }

    @Override // defpackage.vt2
    public final xt2 c() {
        zt2 fu2Var;
        zt2 du2Var;
        xt2 xt2Var;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    wa.s(androidComposeView);
                }
                if (i >= 29) {
                    du2Var = new du2();
                } else {
                    if (g) {
                        try {
                            fu2Var = new cu2(this.a, new vm0(), new um0());
                        } catch (Throwable unused) {
                            g = false;
                            fu2Var = new fu2(d(this.a));
                        }
                    } else {
                        fu2Var = new fu2(d(this.a));
                    }
                    du2Var = fu2Var;
                }
                xt2Var = new xt2(du2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return xt2Var;
    }

    public final pv1 d(AndroidComposeView androidComposeView) {
        ww8 ww8Var = this.c;
        if (ww8Var != null) {
            return ww8Var;
        }
        ww8 ww8Var2 = new ww8(androidComposeView.getContext());
        ww8Var2.setClipChildren(false);
        ww8Var2.setClipToPadding(false);
        ww8Var2.setTag(h46.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(ww8Var2, -1);
        this.c = ww8Var2;
        return ww8Var2;
    }
}
