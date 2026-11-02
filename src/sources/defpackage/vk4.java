package defpackage;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vk4 extends EdgeEffect {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ MainActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vk4(int i, RecyclerView recyclerView, MainActivity mainActivity, Context context) {
        super(context);
        this.a = i;
        this.b = recyclerView;
        this.c = mainActivity;
    }

    public final void a(float f) {
        float width = this.b.getWidth() * (this.a == 3 ? -1 : 1) * f * 0.3f;
        MainActivity mainActivity = this.c;
        Object value = mainActivity.u1.getValue();
        value.getClass();
        tf7 tf7Var = (tf7) value;
        if (!tf7.c().b()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (tf7Var.f) {
            tf7Var.b(true);
        }
        float f2 = tf7Var.n;
        if (f2 != Float.MAX_VALUE) {
            uf7 uf7Var = tf7Var.m;
            if (uf7Var == null) {
                tf7Var.m = new uf7(f2);
            } else {
                uf7Var.i = f2;
            }
            tf7Var.n = Float.MAX_VALUE;
        }
        b6 b6Var = mainActivity.Q0;
        if (b6Var == null) {
            dh3.T("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) b6Var.A0;
        recyclerView.setTranslationY(recyclerView.getTranslationY() + width);
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        int i2 = this.a == 3 ? -1 : 1;
        Object value = this.c.u1.getValue();
        value.getClass();
        tf7 tf7Var = (tf7) value;
        tf7Var.a = i2 * i * 0.5f;
        tf7Var.g();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        a(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        Object value = this.c.u1.getValue();
        value.getClass();
        ((tf7) value).g();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        a(f);
    }
}
