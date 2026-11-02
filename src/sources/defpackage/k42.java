package defpackage;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.b;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.foundation.component.snackbar.HappSnackbarView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k42 implements v06, m82, y23, mu0, h24, gz2, zl8, dr8, k71 {
    public static k42 X;

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:70:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[LOOP:0: B:6:0x0011->B:75:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void g(BaseActivity baseActivity, CoordinatorLayout coordinatorLayout, String str, my2 my2Var, Iterable iterable, int i, int i2) {
        ViewGroup viewGroup;
        int i3;
        Object parent;
        int i4 = zx2.B;
        if ((i2 & 16) != 0) {
            iterable = d02.X;
        }
        baseActivity.getClass();
        coordinatorLayout.getClass();
        View view = coordinatorLayout;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (((FrameLayout) view).getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            bt.q("No suitable parent found from the given view. Please provide a valid view.");
            return;
        }
        boolean z = false;
        View viewInflate = LayoutInflater.from(coordinatorLayout.getContext()).inflate(t46.snackbar, viewGroup, false);
        viewInflate.getClass();
        HappSnackbarView happSnackbarView = (HappSnackbarView) viewInflate;
        Context context = coordinatorLayout.getContext();
        context.getClass();
        boolean zY = ue3.y(context);
        zx2 zx2Var = new zx2(viewGroup, happSnackbarView, happSnackbarView);
        zx2Var.i.setAnimationMode(0);
        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
        byte b = 2;
        baseTransientBottomBar$Behavior.e = (byte) 2;
        zx2Var.t = baseTransientBottomBar$Behavior;
        zx2Var.i.setRotation(180.0f);
        u20 u20Var = zx2Var.i;
        u20Var.setBackgroundColor(u20Var.getContext().getColor(R.color.transparent));
        u20 u20Var2 = zx2Var.i;
        u20Var2.getClass();
        ViewGroup.LayoutParams layoutParams = u20Var2.getLayoutParams();
        if (layoutParams == null) {
            b61.i("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            return;
        }
        b bVar = (b) layoutParams;
        bVar.setMargins(0, 0, 0, i);
        u20Var2.setLayoutParams(bVar);
        int iOrdinal = my2Var.ordinal();
        if (iOrdinal == 0) {
            i3 = 2000;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                b61.c();
                return;
            }
            i3 = 5000;
        }
        zx2Var.k = i3;
        l00 l00Var = new l00(zx2Var, b);
        baseActivity.b().b(l00Var);
        yx2 yx2Var = new yx2(zY, l00Var, baseActivity);
        ArrayList arrayList = zx2Var.s;
        if (arrayList == null) {
            arrayList = new ArrayList();
            zx2Var.s = arrayList;
        }
        arrayList.add(yx2Var);
        happSnackbarView.setSnackbarMessage(str);
        happSnackbarView.setSnackbarStatus(my2Var);
        happSnackbarView.setActions(iterable);
        baseActivity.getWindow().setSoftInputMode(32);
        yr6 yr6VarF = yr6.f();
        int i5 = zx2Var.k;
        s20 s20Var = zx2Var.v;
        synchronized (yr6VarF.Y) {
            try {
                if (yr6VarF.h(s20Var)) {
                    rc7 rc7Var = (rc7) yr6VarF.f0;
                    rc7Var.b = i5;
                    ((Handler) yr6VarF.Z).removeCallbacksAndMessages(rc7Var);
                    yr6VarF.o((rc7) yr6VarF.f0);
                    return;
                }
                rc7 rc7Var2 = (rc7) yr6VarF.g0;
                if (rc7Var2 != null && s20Var != null && rc7Var2.a.get() == s20Var) {
                    z = true;
                }
                if (z) {
                    ((rc7) yr6VarF.g0).b = i5;
                } else {
                    yr6VarF.g0 = new rc7(i5, s20Var);
                }
                rc7 rc7Var3 = (rc7) yr6VarF.f0;
                if (rc7Var3 == null || !yr6VarF.c(rc7Var3, 4)) {
                    yr6VarF.f0 = null;
                    yr6VarF.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mu0
    public te3 a() {
        te3 te3Var = te3.Z;
        return km4.E(System.currentTimeMillis());
    }

    @Override // defpackage.k62
    public k05 b() {
        return k05.j();
    }

    @Override // defpackage.m82
    public boolean c(f57 f57Var) {
        return false;
    }

    @Override // defpackage.dr8
    public er8 d() {
        return new kv4();
    }

    @Override // defpackage.gz2
    public boolean e() {
        boolean z;
        synchronized (e92.a) {
            try {
                int i = e92.c;
                e92.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > e92.d + 30000) {
                    e92.c = 0;
                    e92.d = SystemClock.uptimeMillis();
                    String[] list = e92.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    e92.e = list.length < 800;
                }
                z = e92.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.gz2
    public boolean f(ta7 ta7Var) {
        yo1 yo1Var = ta7Var.a;
        if ((yo1Var instanceof wo1 ? ((wo1) yo1Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        yo1 yo1Var2 = ta7Var.b;
        return (yo1Var2 instanceof wo1 ? ((wo1) yo1Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.v06
    public Object get() {
        return new j03(Executors.newSingleThreadExecutor());
    }

    @Override // defpackage.y23
    public boolean h(byte[] bArr) {
        return bArr[0] == 1;
    }

    @Override // defpackage.k71
    public Object j(j71 j71Var) throws j71 {
        throw j71Var;
    }

    @Override // defpackage.zl8
    public void y(int i) {
    }
}
