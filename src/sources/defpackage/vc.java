package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vc implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public final AndroidComposeView X;
    public final ub Y;
    public i41 Z;
    public final ArrayList f0 = new ArrayList();
    public qc g0 = qc.X;
    public boolean h0 = true;
    public final x90 i0 = gv3.b(1, null, null, 6);
    public vz4 j0;
    public long k0;
    public final vz4 l0;
    public z07 m0;
    public boolean n0;
    public final c1 o0;

    public vc(AndroidComposeView androidComposeView, ub ubVar) {
        this.X = androidComposeView;
        this.Y = ubVar;
        new Handler(Looper.getMainLooper());
        vz4 vz4Var = gf3.a;
        vz4Var.getClass();
        this.j0 = vz4Var;
        this.l0 = new vz4();
        this.m0 = new z07(androidComposeView.getSemanticsOwner().a(), vz4Var);
        this.o0 = new c1(this, (byte) 3);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (defpackage.u70.F(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.s51 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.uc
            if (r0 == 0) goto L13
            r0 = r9
            uc r0 = (defpackage.uc) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            uc r0 = new uc
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.g0
            int r1 = r0.i0
            r2 = 2
            r3 = 1
            c71 r4 = defpackage.c71.X
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            q90 r1 = r0.f0
            defpackage.w39.n0(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r8)
            r8 = 0
            return r8
        L34:
            q90 r1 = r0.f0
            defpackage.w39.n0(r9)
            goto L52
        L3a:
            defpackage.w39.n0(r9)
            q90 r9 = new q90
            x90 r1 = r8.i0
            r9.<init>(r1)
        L44:
            r0.f0 = r9
            r0.i0 = r3
            java.lang.Object r1 = r9.b(r0)
            if (r1 != r4) goto L4f
            goto L85
        L4f:
            r7 = r1
            r1 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r1.c()
            boolean r9 = r8.d()
            if (r9 == 0) goto L66
            r8.e()
        L66:
            androidx.compose.ui.platform.AndroidComposeView r9 = r8.X
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.n0
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.n0 = r3
            c1 r5 = r8.o0
            r9.post(r5)
        L79:
            r0.f0 = r1
            r0.i0 = r2
            r5 = 100
            java.lang.Object r9 = defpackage.u70.F(r5, r0)
            if (r9 != r4) goto L2b
        L85:
            return r4
        L86:
            dn8 r8 = defpackage.dn8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc.a(s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    public final void b(ff3 ff3Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        ff3 ff3Var2 = ff3Var;
        int[] iArr3 = ff3Var2.b;
        long[] jArr = ff3Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        z07 z07Var = (z07) this.l0.b(i7);
                        a17 a17Var = (a17) ff3Var2.b(i7);
                        y07 y07Var = a17Var != null ? a17Var.a : null;
                        if (y07Var == null) {
                            throw p61.j("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = y07Var.f;
                        s05 s05Var = y07Var.d.X;
                        if (z07Var == null) {
                            Object[] objArr = s05Var.b;
                            long[] jArr2 = s05Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                e17 e17Var = (e17) objArr[(i10 << 3) + i12];
                                                e17 e17Var2 = c17.C;
                                                if (dh3.f(e17Var, e17Var2)) {
                                                    Object objG = s05Var.g(e17Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    g(i8, String.valueOf(list != null ? (ql) wv0.t0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = s05Var.b;
                            long[] jArr3 = s05Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                e17 e17Var3 = (e17) objArr2[(i13 << 3) + i15];
                                                e17 e17Var4 = c17.C;
                                                if (dh3.f(e17Var3, e17Var4)) {
                                                    Object objG2 = z07Var.a.X.g(e17Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    ql qlVar = list2 != null ? (ql) wv0.t0(list2) : null;
                                                    Object objG3 = s05Var.g(e17Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    ql qlVar2 = list3 != null ? (ql) wv0.t0(list3) : null;
                                                    if (!dh3.f(qlVar, qlVar2)) {
                                                        g(i8, String.valueOf(qlVar2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    ff3Var2 = ff3Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            ff3Var2 = ff3Var;
            iArr3 = iArr;
        }
    }

    public final ff3 c() {
        if (this.h0) {
            this.h0 = false;
            this.j0 = jm4.A(this.X.getSemanticsOwner(), new y2((byte) 11));
            this.k0 = System.currentTimeMillis();
        }
        return this.j0;
    }

    public final boolean d() {
        return this.Z != null;
    }

    public final void e() {
        i41 i41Var = this.Z;
        if (i41Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f0;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f41 f41Var = (f41) arrayList.get(i);
                int iOrdinal = f41Var.c.ordinal();
                if (iOrdinal == 0) {
                    lr5 lr5Var = f41Var.d;
                    if (lr5Var != null) {
                        ((h41) i41Var).d((ViewStructure) lr5Var.Y);
                    }
                } else {
                    if (iOrdinal != 1) {
                        b61.c();
                        return;
                    }
                    h41 h41Var = (h41) i41Var;
                    AutofillId autofillIdB = h41Var.b(f41Var.a);
                    if (autofillIdB != null) {
                        h41Var.e(autofillIdB);
                    }
                }
            }
            ((h41) i41Var).a();
            arrayList.clear();
        }
    }

    public final void f(y07 y07Var, z07 z07Var) {
        i9 i9Var = new i9(z07Var, this, (byte) 1);
        y07Var.getClass();
        List listI = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listI.get(i2);
            if (c().a(((y07) obj).f)) {
                i9Var.K(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listI2 = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            y07 y07Var2 = (y07) listI2.get(i3);
            ff3 ff3VarC = c();
            int i4 = y07Var2.f;
            if (ff3VarC.a(i4)) {
                vz4 vz4Var = this.l0;
                if (vz4Var.a(i4)) {
                    Object objB = vz4Var.b(i4);
                    if (objB == null) {
                        throw p61.j("node not present in pruned tree before this change");
                    }
                    f(y07Var2, (z07) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void g(int i, String str) {
        i41 i41Var;
        if (Build.VERSION.SDK_INT >= 29 && (i41Var = this.Z) != null) {
            h41 h41Var = (h41) i41Var;
            AutofillId autofillIdB = h41Var.b(i);
            if (autofillIdB == null) {
                throw p61.j("Invalid content capture ID");
            }
            h41Var.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0188  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final void h(int i, y07 y07Var) {
        gn2 gn2Var;
        vz vzVarE;
        AutofillId autofillIdA;
        s86 s86VarA;
        lr5 lr5Var;
        String strX;
        gn2 gn2Var2;
        if (d()) {
            s05 s05Var = y07Var.d.X;
            Object objG = s05Var.g(c17.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.g0 == qc.X && dh3.f(bool, Boolean.TRUE)) {
                Object objG2 = s05Var.g(s07.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                q3 q3Var = (q3) objG2;
                if (q3Var != null && (gn2Var2 = (gn2) q3Var.b) != null) {
                }
            } else if (this.g0 == qc.Y && dh3.f(bool, Boolean.FALSE)) {
                Object objG3 = s05Var.g(s07.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                q3 q3Var2 = (q3) objG3;
                if (q3Var2 != null && (gn2Var = (gn2) q3Var2.b) != null) {
                }
            }
            int i2 = y07Var.f;
            i41 i41Var = this.Z;
            if (i41Var == null || Build.VERSION.SDK_INT < 29 || (vzVarE = mn7.e(this.X)) == null) {
                lr5Var = null;
            } else {
                y07 y07VarL = y07Var.l();
                int i3 = y07Var.f;
                if (y07VarL != null) {
                    autofillIdA = ((h41) i41Var).b(y07VarL.f);
                    if (autofillIdA == null) {
                        lr5Var = null;
                    }
                } else {
                    autofillIdA = vzVarE.a();
                }
                lr5 lr5VarC = ((h41) i41Var).c(autofillIdA, i3);
                if (lr5VarC == null) {
                    lr5Var = null;
                } else {
                    ViewStructure viewStructure = (ViewStructure) lr5VarC.Y;
                    t07 t07Var = y07Var.d;
                    e17 e17Var = c17.N;
                    s05 s05Var2 = t07Var.X;
                    if (s05Var2.c(e17Var)) {
                        lr5Var = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.k0);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objG4 = s05Var2.g(c17.A);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        String str = (String) objG4;
                        if (str != null) {
                            viewStructure.setId(i3, null, null, str);
                        }
                        Object objG5 = s05Var2.g(c17.n);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((Boolean) objG5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objG6 = s05Var2.g(c17.C);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        List list = (List) objG6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(tb4.a(list, "\n", null, 62));
                        }
                        Object objG7 = s05Var2.g(c17.G);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        ql qlVar = (ql) objG7;
                        if (qlVar != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(qlVar);
                        }
                        Object objG8 = s05Var2.g(c17.a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        List list2 = (List) objG8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(tb4.a(list2, "\n", null, 62));
                        }
                        Object objG9 = s05Var2.g(c17.z);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        kl6 kl6Var = (kl6) objG9;
                        if (kl6Var != null && (strX = gv3.X(kl6Var.a)) != null) {
                            viewStructure.setClassName(strX);
                        }
                        x78 x78VarC = gv3.C(t07Var);
                        if (x78VarC != null) {
                            w78 w78Var = x78VarC.a;
                            o88 o88Var = w78Var.b;
                            fi1 fi1Var = w78Var.g;
                            viewStructure.setTextStyle(fi1Var.b0() * fi1Var.getDensity() * v88.c(o88Var.a.b), 0, 0, 0);
                        }
                        i55 i55VarD = y07Var.d();
                        if (i55VarD == null) {
                            s86VarA = s86.e;
                        } else {
                            i55 i55Var = i55VarD.V0().p0 ? i55VarD : null;
                            if (i55Var != null) {
                                s86VarA = y07Var.a(i55Var);
                            } else {
                                s86VarA = s86.e;
                            }
                        }
                        float f = s86VarA.a;
                        float f2 = s86VarA.b;
                        viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (s86VarA.c - f), (int) (s86VarA.d - f2));
                        lr5Var = lr5VarC;
                    }
                }
            }
            if (lr5Var != null) {
                this.f0.add(new f41(i2, this.k0, g41.X, lr5Var));
            }
            List listI = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listI.get(i5);
                if (c().a(((y07) obj).f)) {
                    h(i4, (y07) obj);
                    i4++;
                }
            }
        }
    }

    public final void i(y07 y07Var) {
        if (d()) {
            this.f0.add(new f41(y07Var.f, this.k0, g41.Y, null));
            List listI = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                i((y07) listI.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void j() {
        vz4 vz4Var = this.l0;
        vz4Var.c();
        ff3 ff3VarC = c();
        int[] iArr = ff3VarC.b;
        Object[] objArr = ff3VarC.c;
        long[] jArr = ff3VarC.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            vz4Var.h(iArr[i4], new z07(((a17) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.m0 = new z07(this.X.getSemanticsOwner().a(), c());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(d94 d94Var) {
        this.Z = (i41) this.Y.invoke();
        h(-1, this.X.getSemanticsOwner().a());
        e();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(d94 d94Var) {
        i(this.X.getSemanticsOwner().a());
        e();
        this.Z = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.X.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.o0);
        this.Z = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
