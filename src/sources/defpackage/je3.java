package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class je3 extends jv0 implements Runnable, p95, View.OnAttachStateChangeListener {
    public boolean Z;
    public int f0;
    public w19 g0;
    public final s05 h0;
    public final oh5 i0;
    public final j05 j0;
    public final vd7 k0;

    public je3() {
        super(1);
        s05 s05Var = new s05(9);
        e29.a.getClass();
        s05Var.l(d29.b, new r29("caption bar"));
        s05Var.l(d29.c, new r29("display cutout"));
        s05Var.l(d29.d, new r29("ime"));
        s05Var.l(d29.e, new r29("mandatory system gestures"));
        s05Var.l(d29.f, new r29("navigation bars"));
        s05Var.l(d29.g, new r29("status bars"));
        s05Var.l(d29.h, new r29("system gestures"));
        s05Var.l(d29.i, new r29("tappable element"));
        s05Var.l(d29.j, new r29("waterfall"));
        this.h0 = s05Var;
        this.i0 = new oh5(0);
        this.j0 = new j05(4);
        this.k0 = new vd7();
    }

    @Override // defpackage.p95
    public final w19 C(View view, w19 w19Var) {
        if (this.Z) {
            this.g0 = w19Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return w19Var;
            }
        } else if (this.f0 == 0) {
            E(w19Var);
        }
        return w19Var;
    }

    public final void E(w19 w19Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        vz4 vz4Var = g29.a;
        int[] iArr2 = vz4Var.b;
        Object[] objArr3 = vz4Var.c;
        long[] jArr2 = vz4Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            e29 e29Var = (e29) objArr3[i6];
                            fe3 fe3VarH = w19Var.a.h(i7);
                            long j3 = (((long) fe3VarH.a) << 48) | (((long) fe3VarH.b) << 32) | (((long) fe3VarH.c) << 16) | ((long) fe3VarH.d);
                            Object objG = this.h0.g(e29Var);
                            objG.getClass();
                            r29 r29Var = (r29) objG;
                            if (!d28.b(j3, r29Var.h)) {
                                r29Var.h = j3;
                                z2 = true;
                                if (!d28.b(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                fe3 fe3VarI = w19Var.a.i(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) fe3VarI.b) << 32) | (((long) fe3VarI.a) << 48) | (((long) fe3VarI.c) << 16) | ((long) fe3VarI.d);
                                if (!d28.b(r29Var.i, j4)) {
                                    r29Var.i = j4;
                                    z2 = true;
                                    if (!d28.b(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            r29Var.a.setValue(Boolean.valueOf(w19Var.a.t(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        up1 up1VarG = w19Var.a.g();
        if (up1VarG == null) {
            j = 0;
        } else {
            fe3 fe3VarA = up1VarG.a();
            j = (((long) fe3VarA.a) << c3) | (((long) fe3VarA.b) << c2) | (((long) fe3VarA.c) << c) | ((long) fe3VarA.d);
        }
        s05 s05Var = this.h0;
        e29.a.getClass();
        Object objG2 = s05Var.g(d29.j);
        objG2.getClass();
        r29 r29Var2 = (r29) objG2;
        r29Var2.a.setValue(Boolean.valueOf(!d28.b(j, 0L)));
        if (!d28.b(r29Var2.h, j)) {
            r29Var2.h = j;
            r29Var2.i = j;
            z2 = z;
            if (!d28.b(j, 0L)) {
                z3 = z2;
            }
        }
        if (up1VarG == null) {
            j05 j05Var = this.j0;
            if (j05Var.b > 0) {
                j05Var.d();
                this.k0.clear();
                z2 = z;
            }
        } else {
            List listN = Build.VERSION.SDK_INT >= 28 ? en.n(up1VarG.a) : Collections.EMPTY_LIST;
            int size = listN.size();
            j05 j05Var2 = this.j0;
            if (size < j05Var2.b) {
                j05Var2.m(listN.size(), this.j0.b);
                this.k0.B(listN.size(), this.k0.size());
                z2 = z;
            } else {
                int size2 = listN.size() - this.j0.b;
                int i8 = 0;
                while (i8 < size2) {
                    j05 j05Var3 = this.j0;
                    j05Var3.a(z51.H(listN.get(j05Var3.b)));
                    this.k0.add(new gd3(pc6.j(this.j0.b, "display cutout rect ")));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listN.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listN.get(i9);
                y05 y05Var = (y05) this.j0.g(i9);
                if (!dh3.f(y05Var.getValue(), rect)) {
                    y05Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listN.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.i0.l() != 0) && z2) {
            oh5 oh5Var = this.i0;
            oh5Var.m(oh5Var.l() + 1);
            synchronized (kd7.c) {
                t05 t05Var = kd7.j.h;
                z4 = (t05Var == null || t05Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                kd7.c();
            }
        }
    }

    @Override // defpackage.jv0
    public final void d(c19 c19Var) {
        boolean z = false;
        this.Z = false;
        int iD = c19Var.a.d();
        this.f0 &= ~iD;
        this.g0 = null;
        e29 e29Var = (e29) g29.a.b(iD);
        if (e29Var != null) {
            Object objG = this.h0.g(e29Var);
            objG.getClass();
            r29 r29Var = (r29) objG;
            r29Var.c.m(0.0f);
            r29Var.e.m(1.0f);
            r29Var.d.m(0L);
            r29Var.c.m(0.0f);
            r29Var.b.setValue(Boolean.FALSE);
            r29Var.j = -1L;
            r29Var.k = -1L;
            oh5 oh5Var = this.i0;
            oh5Var.m(oh5Var.l() + 1);
            synchronized (kd7.c) {
                t05 t05Var = kd7.j.h;
                if (t05Var != null && t05Var.h()) {
                    z = true;
                }
            }
            if (z) {
                kd7.c();
            }
        }
    }

    @Override // defpackage.jv0
    public final void e(c19 c19Var) {
        this.Z = true;
    }

    @Override // defpackage.jv0
    public final w19 f(w19 w19Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c19 c19Var = (c19) list.get(i);
            e29 e29Var = (e29) g29.a.b(c19Var.a.d());
            if (e29Var != null) {
                Object objG = this.h0.g(e29Var);
                objG.getClass();
                r29 r29Var = (r29) objG;
                if (((Boolean) r29Var.b.getValue()).booleanValue()) {
                    b19 b19Var = c19Var.a;
                    r29Var.c.m(b19Var.c());
                    r29Var.e.m(b19Var.a());
                    r29Var.d.m(b19Var.b());
                }
            }
        }
        E(w19Var);
        return w19Var;
    }

    @Override // defpackage.jv0
    public final xd6 g(c19 c19Var, xd6 xd6Var) {
        w19 w19Var = this.g0;
        boolean z = false;
        this.Z = false;
        this.g0 = null;
        if (c19Var.a.b() > 0 && w19Var != null) {
            int iD = c19Var.a.d();
            this.f0 |= iD;
            e29 e29Var = (e29) g29.a.b(iD);
            if (e29Var != null) {
                Object objG = this.h0.g(e29Var);
                objG.getClass();
                r29 r29Var = (r29) objG;
                fe3 fe3VarH = w19Var.a.h(iD);
                long j = (((long) fe3VarH.a) << 48) | (((long) fe3VarH.b) << 32) | (((long) fe3VarH.c) << 16) | ((long) fe3VarH.d);
                long j2 = r29Var.h;
                if (!d28.b(j, j2)) {
                    r29Var.j = j2;
                    r29Var.k = j;
                    r29Var.b.setValue(Boolean.TRUE);
                    b19 b19Var = c19Var.a;
                    r29Var.c.m(b19Var.c());
                    r29Var.e.m(b19Var.a());
                    r29Var.d.m(b19Var.b());
                    oh5 oh5Var = this.i0;
                    oh5Var.m(oh5Var.l() + 1);
                    synchronized (kd7.c) {
                        t05 t05Var = kd7.j.h;
                        if (t05Var != null && t05Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        kd7.c();
                        return xd6Var;
                    }
                }
            }
        }
        return xd6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = cw8.a;
        uv8.c(view, this);
        c19.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = cw8.a;
        uv8.c(view, null);
        c19.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.Z) {
            this.f0 = 0;
            this.Z = false;
            w19 w19Var = this.g0;
            if (w19Var != null) {
                E(w19Var);
                this.g0 = null;
            }
        }
    }
}
