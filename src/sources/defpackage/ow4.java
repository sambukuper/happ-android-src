package defpackage;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ow4 extends py0 {
    public dn2 g0;
    public ax4 h0;
    public long i0;
    public final View j0;
    public final lw4 k0;

    public ow4(dn2 dn2Var, ax4 ax4Var, long j, View view, z24 z24Var, fi1 fi1Var, UUID uuid, oi oiVar, b71 b71Var) {
        super(new ContextThemeWrapper(view.getContext(), k56.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.g0 = dn2Var;
        this.h0 = ax4Var;
        this.i0 = j;
        this.j0 = view;
        Window window = getWindow();
        if (window == null) {
            bt.i("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        xt7.f(window, false);
        lw4 lw4Var = new lw4(getContext(), window);
        lw4Var.setTag(g46.compose_view_saveable_id_tag, "Dialog:" + uuid);
        lw4Var.setClipChildren(false);
        lw4Var.setElevation(fi1Var.h0(8.0f));
        lw4Var.setOutlineProvider(new nu0((byte) 2));
        this.k0 = lw4Var;
        setContentView(lw4Var);
        lw4Var.setTag(v36.view_tree_lifecycle_owner, us7.b(view));
        lw4Var.setTag(w36.view_tree_view_model_store_owner, gs8.j(view));
        lw4Var.setTag(z36.view_tree_saved_state_registry_owner, ys7.d(view));
        g(this.g0, this.h0, this.i0, z24Var);
        lr5 lr5Var = new lr5(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        eu7 b29Var = i >= 35 ? new b29(window, lr5Var) : i >= 30 ? new z19(window, lr5Var) : i >= 26 ? new y19(window, lr5Var) : new x19(window, lr5Var);
        Boolean bool = this.h0.c;
        b29Var.k(bool != null ? bool.booleanValue() : x97.F(this.i0));
        Boolean bool2 = this.h0.d;
        b29Var.j(bool2 != null ? bool2.booleanValue() : x97.F(this.i0));
        b().a(this, new nw4(this.h0.a, b71Var, oiVar, new tb2(this, (byte) 21)));
    }

    public final void g(dn2 dn2Var, ax4 ax4Var, long j, z24 z24Var) {
        this.g0 = dn2Var;
        this.h0 = ax4Var;
        this.i0 = j;
        ax4Var.getClass();
        ViewGroup.LayoutParams layoutParams = this.j0.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal = z24Var.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal != 1) {
            b61.c();
            return;
        }
        this.k0.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.g0.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
