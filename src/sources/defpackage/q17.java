package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q17 {
    public final vz7 a = new vz7(new w76(24));
    public final vz7 b = new vz7(new w76(25));
    public final vz7 c = new vz7(new w76(26));

    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:44:0x00b4, B:46:0x00b8, B:48:0x00be), top: B:70:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [int, short] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7, types: [short] */
    public final Object a(String str, int i, s51 s51Var) throws Throwable {
        p17 p17Var;
        List list;
        Throwable th;
        int i2;
        Object obj;
        List list2;
        ?? r13;
        int i3;
        Object rj6Var;
        Object obj2;
        Boolean bool;
        if (s51Var instanceof p17) {
            p17Var = (p17) s51Var;
            int i4 = p17Var.l0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p17Var.l0 = i4 - Integer.MIN_VALUE;
            } else {
                p17Var = new p17(this, s51Var);
            }
        } else {
            p17Var = new p17(this, s51Var);
        }
        Object objF = p17Var.j0;
        int i5 = p17Var.l0;
        boolean zBooleanValue = true;
        Object obj3 = c71.X;
        try {
            try {
                if (i5 == 0) {
                    w39.n0(objF);
                    kw4 kw4Var = kw4.a;
                    ArrayList arrayListT = kw4.t();
                    try {
                        qo qoVar = (qo) this.a.getValue();
                        p17Var.f0 = str;
                        p17Var.g0 = arrayListT;
                        p17Var.h0 = i;
                        p17Var.i0 = 0;
                        p17Var.l0 = 1;
                        Object objJ = qoVar.j(str, arrayListT, 9000, p17Var);
                        if (objJ != obj3) {
                            obj = objJ;
                            list2 = arrayListT;
                            r13 = i;
                            i3 = 0;
                        }
                        return obj3;
                    } catch (Throwable th2) {
                        list = arrayListT;
                        th = th2;
                        i2 = 0;
                        if (i2 != 0) {
                            th.printStackTrace();
                        }
                        if (th instanceof InterruptedException) {
                        }
                        throw th;
                    }
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = p17Var.i0;
                    list = p17Var.g0;
                    try {
                        w39.n0(objF);
                        bool = (Boolean) objF;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        rj6Var = Boolean.valueOf(zBooleanValue);
                    } catch (Throwable th3) {
                        th = th3;
                        if (i2 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                            th.printStackTrace();
                        }
                        if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var = new rj6(th);
                    }
                    obj2 = Boolean.FALSE;
                    if (rj6Var instanceof rj6) {
                        rj6Var = obj2;
                    }
                    Boolean bool2 = (Boolean) rj6Var;
                    ((kf4) this.c.getValue()).g(new zs1((Object) list, bool2.booleanValue(), (byte) 5));
                    return bool2;
                }
                i2 = p17Var.i0;
                short s = p17Var.h0;
                list2 = p17Var.g0;
                String str2 = p17Var.f0;
                try {
                    w39.n0(objF);
                    i3 = i2;
                    str = str2;
                    obj = ((sj6) objF).X;
                    r13 = s;
                } catch (Throwable th4) {
                    th = th4;
                    list = list2;
                    if (i2 != 0) {
                        th.printStackTrace();
                    }
                    if (th instanceof InterruptedException) {
                    }
                    throw th;
                }
                if (sj6.a(obj) == null) {
                    int iIntValue = ((Number) ((qg5) obj).X).intValue();
                    if (200 <= iIntValue && iIntValue < 300) {
                        list = list2;
                    }
                    rj6Var = Boolean.valueOf(zBooleanValue);
                    obj2 = Boolean.FALSE;
                    if (rj6Var instanceof rj6) {
                        rj6Var = obj2;
                    }
                    Boolean bool3 = (Boolean) rj6Var;
                    ((kf4) this.c.getValue()).g(new zs1((Object) list, bool3.booleanValue(), (byte) 5));
                    return bool3;
                }
                vr1 vr1Var = (vr1) this.b.getValue();
                p17Var.f0 = null;
                p17Var.g0 = list2;
                p17Var.h0 = r13;
                p17Var.i0 = i3;
                p17Var.l0 = 2;
                objF = vr1Var.f(str, list2, p17Var);
                if (objF != obj3) {
                    list = list2;
                    bool = (Boolean) objF;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    rj6Var = Boolean.valueOf(zBooleanValue);
                    obj2 = Boolean.FALSE;
                    if (rj6Var instanceof rj6) {
                        rj6Var = obj2;
                    }
                    Boolean bool4 = (Boolean) rj6Var;
                    ((kf4) this.c.getValue()).g(new zs1((Object) list, bool4.booleanValue(), (byte) 5));
                    return bool4;
                }
                return obj3;
            } catch (Throwable th5) {
                th = th5;
                i2 = i3;
                list = list2;
                if (i2 != 0) {
                    th.printStackTrace();
                }
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
