package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class al2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public al2(bl2 bl2Var, wl2 wl2Var) {
        this.X = (byte) 0;
        this.Z = bl2Var;
        this.Y = wl2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                wl2 wl2Var = (wl2) obj2;
                qk2 qk2Var = wl2Var.c;
                wl2Var.k();
                fg1.i((ViewGroup) qk2Var.J0.getParent(), ((bl2) obj).X).h();
                break;
            case 1:
                ((ViewGroup) obj2).addView((b08) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                break;
            case 1:
                ((ViewGroup) obj2).addView((b08) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((p86) obj).x();
                break;
        }
    }

    public /* synthetic */ al2(View view, Object obj, byte b) {
        this.X = b;
        this.Y = view;
        this.Z = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
