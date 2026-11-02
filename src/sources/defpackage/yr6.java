package defpackage;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yr6 implements mu8, ov8, v06 {
    public static yr6 h0;
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;
    public Object f0;
    public Object g0;

    public yr6(byte b) {
        this.X = b;
        switch (b) {
            case 3:
                this.Y = new Object();
                this.Z = new Handler(Looper.getMainLooper(), new qc7(this, (byte) 0));
                break;
            case 7:
                this.Y = new vt(0);
                this.Z = new SparseArray();
                this.f0 = new qi4((Object) null);
                this.g0 = new vt(0);
                break;
            case 13:
                m09 m09Var = new m09();
                this.Y = m09Var;
                m09 m09Var2 = new m09();
                this.Z = m09Var2;
                this.f0 = m09Var2;
                this.g0 = m09Var;
                break;
        }
    }

    public static yr6 f() {
        yr6 yr6Var = h0;
        if (yr6Var != null) {
            return yr6Var;
        }
        yr6 yr6Var2 = new yr6((byte) 3);
        h0 = yr6Var2;
        return yr6Var2;
    }

    @Override // defpackage.ju8
    public wk A(wk wkVar, wk wkVar2, wk wkVar3) {
        wk wkVarC = (wk) this.g0;
        if (wkVarC == null) {
            wkVarC = wkVar3.c();
            this.g0 = wkVarC;
        }
        int iB = wkVarC.b();
        int i = 0;
        while (true) {
            wk wkVar4 = (wk) this.g0;
            if (i >= iB) {
                if (wkVar4 != null) {
                    return wkVar4;
                }
                dh3.T("endVelocityVector");
                throw null;
            }
            if (wkVar4 == null) {
                dh3.T("endVelocityVector");
                throw null;
            }
            wkVar4.e(i, ((xk) this.Y).get(i).d(wkVar.a(i), wkVar2.a(i), wkVar3.a(i)));
            i++;
        }
    }

    public void b(bh7 bh7Var) {
        Runnable runnable;
        bh7Var.getClass();
        synchronized (this.f0) {
            runnable = (Runnable) ((LinkedHashMap) this.g0).remove(bh7Var);
        }
        if (runnable != null) {
            ((Handler) ((yr2) this.Y).Y).removeCallbacks(runnable);
        }
    }

    public boolean c(rc7 rc7Var, int i) {
        s20 s20Var = (s20) rc7Var.a.get();
        if (s20Var == null) {
            return false;
        }
        ((Handler) this.Z).removeCallbacksAndMessages(rc7Var);
        Handler handler = v20.z;
        handler.sendMessage(handler.obtainMessage(1, i, 0, s20Var.a));
        return true;
    }

    @Override // defpackage.ju8
    public long d(wk wkVar, wk wkVar2, wk wkVar3) {
        int iB = wkVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((xk) this.Y).get(i).c(wkVar.a(i), wkVar2.a(i), wkVar3.a(i)));
        }
        return jMax;
    }

    public qw7 e(l5 l5Var) {
        ArrayList arrayList = (ArrayList) this.f0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qw7 qw7Var = (qw7) arrayList.get(i);
            if (qw7Var != null && qw7Var.b == l5Var) {
                return qw7Var;
            }
        }
        qw7 qw7Var2 = new qw7((Context) this.Z, l5Var);
        arrayList.add(qw7Var2);
        return qw7Var2;
    }

    public xw8 g(zu3 zu3Var, String str) {
        xw8 xw8Var;
        xw8 xw8VarA;
        zu3Var.getClass();
        synchronized (((g55) this.g0)) {
            try {
                xw8Var = (xw8) ((ex8) this.Y).a.get(str);
                if (zu3Var.O(xw8Var)) {
                    bx8 bx8Var = (bx8) this.Z;
                    if (bx8Var instanceof zv6) {
                        zv6 zv6Var = (zv6) bx8Var;
                        xw8Var.getClass();
                        g94 g94Var = zv6Var.d;
                        if (g94Var != null) {
                            xd6 xd6Var = zv6Var.e;
                            xd6Var.getClass();
                            pu.h(xw8Var, xd6Var, g94Var);
                        }
                    }
                    xw8Var.getClass();
                } else {
                    sz4 sz4Var = new sz4((o71) this.f0);
                    sz4Var.a.put(dx8.a, str);
                    bx8 bx8Var2 = (bx8) this.Z;
                    bx8Var2.getClass();
                    try {
                        try {
                            xw8VarA = bx8Var2.c(zu3Var, sz4Var);
                        } catch (AbstractMethodError unused) {
                            xw8VarA = bx8Var2.b(zc1.M(zu3Var), sz4Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        xw8VarA = bx8Var2.a(zc1.M(zu3Var));
                    }
                    xw8Var = xw8VarA;
                    ex8 ex8Var = (ex8) this.Y;
                    ex8Var.getClass();
                    xw8Var.getClass();
                    xw8 xw8Var2 = (xw8) ex8Var.a.put(str, xw8Var);
                    if (xw8Var2 != null) {
                        xw8Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xw8Var;
    }

    @Override // defpackage.v06
    public Object get() {
        return new yr6((Executor) ((v06) this.Y).get(), (wr6) ((v06) this.Z).get(), (f63) ((f63) this.f0).get(), (wr6) ((v06) this.g0).get(), (byte) 14);
    }

    @Override // defpackage.ov8
    public View getRoot() {
        return (ConstraintLayout) this.Y;
    }

    public boolean h(s20 s20Var) {
        rc7 rc7Var = (rc7) this.f0;
        return (rc7Var == null || s20Var == null || rc7Var.a.get() != s20Var) ? false : true;
    }

    public boolean i(km1 km1Var) {
        if (((km1) this.Z).equals(km1Var)) {
            return true;
        }
        yr6 yr6Var = (yr6) this.Y;
        return yr6Var != null ? yr6Var.i(km1Var) : false;
    }

    public boolean j(l5 l5Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.Y).onActionItemClicked(e(l5Var), new wt4((Context) this.Z, (vw7) menuItem));
    }

    public boolean k(l5 l5Var, nt4 nt4Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.Y;
        qw7 qw7VarE = e(l5Var);
        l97 l97Var = (l97) this.g0;
        Menu lu4Var = (Menu) l97Var.get(nt4Var);
        if (lu4Var == null) {
            lu4Var = new lu4((Context) this.Z, nt4Var);
            l97Var.put(nt4Var, lu4Var);
        }
        return callback.onCreateActionMode(qw7VarE, lu4Var);
    }

    public void l(s20 s20Var) {
        synchronized (this.Y) {
            try {
                if (h(s20Var)) {
                    rc7 rc7Var = (rc7) this.f0;
                    if (!rc7Var.c) {
                        rc7Var.c = true;
                        ((Handler) this.Z).removeCallbacksAndMessages(rc7Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ju8
    public wk m(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        wk wkVarC = (wk) this.f0;
        if (wkVarC == null) {
            wkVarC = wkVar3.c();
            this.f0 = wkVarC;
        }
        int iB = wkVarC.b();
        int i = 0;
        while (true) {
            wk wkVar4 = (wk) this.f0;
            if (i >= iB) {
                if (wkVar4 != null) {
                    return wkVar4;
                }
                dh3.T("velocityVector");
                throw null;
            }
            if (wkVar4 == null) {
                dh3.T("velocityVector");
                throw null;
            }
            long j2 = j;
            wkVar4.e(i, ((xk) this.Y).get(i).b(j2, wkVar.a(i), wkVar2.a(i), wkVar3.a(i)));
            i++;
            j = j2;
        }
    }

    public void n(s20 s20Var) {
        synchronized (this.Y) {
            try {
                if (h(s20Var)) {
                    rc7 rc7Var = (rc7) this.f0;
                    if (rc7Var.c) {
                        rc7Var.c = false;
                        o(rc7Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(rc7 rc7Var) {
        Handler handler = (Handler) this.Z;
        int i = rc7Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(rc7Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, rc7Var), i);
    }

    public void p() {
        rc7 rc7Var = (rc7) this.g0;
        if (rc7Var != null) {
            this.f0 = rc7Var;
            this.g0 = null;
            s20 s20Var = (s20) rc7Var.a.get();
            if (s20Var == null) {
                this.f0 = null;
            } else {
                Handler handler = v20.z;
                handler.sendMessage(handler.obtainMessage(0, s20Var.a));
            }
        }
    }

    public void q(bh7 bh7Var) {
        bh7Var.getClass();
        sc4 sc4Var = new sc4((Object) this, (Object) bh7Var, (byte) 17);
        synchronized (this.f0) {
        }
        ((Handler) ((yr2) this.Y).Y).postDelayed(sc4Var, 5400000L);
    }

    public void r() {
        int iA;
        rb8 rb8Var = (rb8) this.Z;
        lr5 lr5Var = (lr5) this.Y;
        ViewPager2 viewPager2 = (ViewPager2) this.g0;
        int i = R.id.accessibilityActionPageLeft;
        cw8.k(viewPager2, R.id.accessibilityActionPageLeft);
        cw8.i(viewPager2, 0);
        cw8.k(viewPager2, R.id.accessibilityActionPageRight);
        cw8.i(viewPager2, 0);
        cw8.k(viewPager2, R.id.accessibilityActionPageUp);
        cw8.i(viewPager2, 0);
        cw8.k(viewPager2, R.id.accessibilityActionPageDown);
        cw8.i(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iA = viewPager2.getAdapter().a()) == 0 || !viewPager2.w0) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.i0 < iA - 1) {
                cw8.l(viewPager2, new a4(R.id.accessibilityActionPageDown, (String) null), null, lr5Var);
            }
            if (viewPager2.i0 > 0) {
                cw8.l(viewPager2, new a4(R.id.accessibilityActionPageUp, (String) null), null, rb8Var);
                return;
            }
            return;
        }
        boolean z = viewPager2.l0.Y.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.i0 < iA - 1) {
            cw8.l(viewPager2, new a4(i2, (String) null), null, lr5Var);
        }
        if (viewPager2.i0 > 0) {
            cw8.l(viewPager2, new a4(i, (String) null), null, rb8Var);
        }
    }

    public String toString() {
        switch (this.X) {
            case 13:
                return "horizontal=" + ((m09) this.Z) + "; vertical=" + ((m09) this.Y);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ju8
    public wk z(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        wk wkVarC = (wk) this.Z;
        if (wkVarC == null) {
            wkVarC = wkVar.c();
            this.Z = wkVarC;
        }
        int iB = wkVarC.b();
        int i = 0;
        while (true) {
            wk wkVar4 = (wk) this.Z;
            if (i >= iB) {
                if (wkVar4 != null) {
                    return wkVar4;
                }
                dh3.T("valueVector");
                throw null;
            }
            if (wkVar4 == null) {
                dh3.T("valueVector");
                throw null;
            }
            long j2 = j;
            wkVar4.e(i, ((xk) this.Y).get(i).e(j2, wkVar.a(i), wkVar2.a(i), wkVar3.a(i)));
            i++;
            j = j2;
        }
    }

    public yr6(hg hgVar, wi wiVar) {
        this.X = (byte) 4;
        this.Y = hgVar;
        this.Z = wiVar;
        this.f0 = new Handler(Looper.getMainLooper());
        this.g0 = Executors.newSingleThreadExecutor();
    }

    public yr6(yr2 yr2Var, xd6 xd6Var) {
        this.X = (byte) 6;
        this.Y = yr2Var;
        this.Z = xd6Var;
        this.f0 = new Object();
        this.g0 = new LinkedHashMap();
    }

    public /* synthetic */ yr6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    public yr6(b71 b71Var, y0 y0Var, dx0 dx0Var, q0 q0Var) {
        this.X = (byte) 2;
        this.Y = b71Var;
        this.Z = q0Var;
        this.f0 = gv3.b(Integer.MAX_VALUE, null, null, 6);
        this.g0 = new yr2((byte) 7);
        bm3 bm3Var = (bm3) b71Var.getCoroutineContext().H0(oy1.E0);
        if (bm3Var != null) {
            bm3Var.D(new sn((Object) y0Var, (Object) this, (Object) dx0Var, (byte) 26));
        }
    }

    public yr6(ex8 ex8Var, bx8 bx8Var, o71 o71Var) {
        this.X = (byte) 10;
        ex8Var.getClass();
        bx8Var.getClass();
        o71Var.getClass();
        this.Y = ex8Var;
        this.Z = bx8Var;
        this.f0 = o71Var;
        this.g0 = new g55((byte) 28);
    }

    public yr6(Context context, ActionMode.Callback callback) {
        this.X = (byte) 5;
        this.Z = context;
        this.Y = callback;
        this.f0 = new ArrayList();
        this.g0 = new l97(0);
    }

    public yr6(xk xkVar) {
        this.X = (byte) 9;
        this.Y = xkVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yr6(ne2 ne2Var) {
        this(new rb8((Object) ne2Var, (byte) 5));
        this.X = (byte) 9;
    }

    public yr6(ViewPager2 viewPager2) {
        this.X = (byte) 11;
        this.g0 = viewPager2;
        this.Y = new lr5((Object) this, (byte) 28);
        this.Z = new rb8((Object) this, (byte) 7);
    }
}
