package defpackage;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q12 {
    static {
        lh4.a1("EnqueueRunnable");
    }

    public static final void a(l39 l39Var) {
        x39 x39Var = l39Var.a;
        if (l39.b(l39Var, new HashSet())) {
            om0.l("WorkContinuation has cycles (", l39Var, ")");
            return;
        }
        x39Var.getClass();
        xy0 xy0Var = x39Var.j0;
        WorkDatabase workDatabase = x39Var.k0;
        workDatabase.getClass();
        workDatabase.b();
        try {
            xy0Var.getClass();
            z51.q(workDatabase, xy0Var, l39Var);
            boolean zB = b(l39Var);
            workDatabase.p();
            workDatabase.l();
            if (zB) {
                ax6.b(xy0Var, workDatabase, x39Var.m0);
            }
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01f5  */
    public static boolean b(l39 l39Var) {
        boolean zB;
        String[] strArr;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WorkDatabase workDatabase;
        List list;
        String[] strArr2;
        boolean z6;
        boolean z7;
        boolean z8;
        l39 l39Var2 = l39Var;
        List<l39> list2 = l39Var2.g;
        if (list2 != null) {
            zB = false;
            for (l39 l39Var3 : list2) {
                if (l39Var3.h) {
                    lh4 lh4VarP0 = lh4.P0();
                    TextUtils.join(", ", l39Var3.e);
                    lh4VarP0.getClass();
                } else {
                    zB |= b(l39Var3);
                }
            }
        } else {
            zB = false;
        }
        HashSet hashSetC = l39.c(l39Var2);
        x39 x39Var = l39Var2.a;
        x39Var.getClass();
        WorkDatabase workDatabase2 = x39Var.k0;
        List list3 = l39Var2.d;
        list3.getClass();
        String[] strArr3 = (String[]) hashSetC.toArray(new String[0]);
        String str = l39Var2.b;
        g62 g62Var = l39Var2.c;
        g62Var.getClass();
        x39Var.j0.getClass();
        x39Var.l0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        workDatabase2.getClass();
        boolean z9 = strArr3.length == 0;
        boolean z10 = !z9;
        u39 u39Var = u39.Z;
        u39 u39Var2 = u39.h0;
        u39 u39Var3 = u39.f0;
        if (!z9) {
            int length = strArr3.length;
            strArr = strArr3;
            int i = 0;
            z = true;
            z2 = false;
            z3 = false;
            while (true) {
                if (i < length) {
                    int i2 = i;
                    int i3 = length;
                    l49 l49VarC = workDatabase2.x().c(strArr[i2]);
                    if (l49VarC == null) {
                        lh4.P0().getClass();
                        z5 = zB;
                    } else {
                        u39 u39Var4 = l49VarC.b;
                        z &= u39Var4 == u39Var;
                        if (u39Var4 == u39Var3) {
                            z3 = true;
                        } else if (u39Var4 == u39Var2) {
                            z2 = true;
                        }
                        i = i2 + 1;
                        length = i3;
                    }
                }
                z8 = false;
                z7 = true;
                l39Var2.h = z7;
                return z5 | z8;
            }
        }
        strArr = strArr3;
        z = true;
        z2 = false;
        z3 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        u39 u39Var5 = u39.X;
        if (zIsEmpty || !z9) {
            z4 = zIsEmpty;
            z5 = zB;
            workDatabase = workDatabase2;
            list = list3;
            strArr2 = strArr;
            z6 = false;
        } else {
            n49 n49VarX = workDatabase2.x();
            str.getClass();
            List listD = n49VarX.d(str);
            if (listD.isEmpty()) {
                z4 = zIsEmpty;
                z5 = zB;
                workDatabase = workDatabase2;
                list = list3;
                strArr2 = strArr;
            } else {
                z4 = zIsEmpty;
                g62 g62Var2 = g62.Z;
                z5 = zB;
                g62 g62Var3 = g62.f0;
                if (g62Var == g62Var2 || g62Var == g62Var3) {
                    pi1 pi1VarR = workDatabase2.r();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        WorkDatabase workDatabase3 = workDatabase2;
                        j49 j49Var = (j49) it.next();
                        List list4 = list3;
                        String str2 = j49Var.a;
                        pi1VarR.getClass();
                        str2.getClass();
                        Iterator it2 = it;
                        pi1 pi1Var = pi1VarR;
                        if (!((Boolean) u15.G(pi1VarR.a, true, false, new m40(str2, (byte) 3))).booleanValue()) {
                            u39 u39Var6 = j49Var.b;
                            z &= u39Var6 == u39Var;
                            if (u39Var6 == u39Var3) {
                                z3 = true;
                            } else if (u39Var6 == u39Var2) {
                                z2 = true;
                            }
                            arrayList.add(j49Var.a);
                        }
                        it = it2;
                        workDatabase2 = workDatabase3;
                        list3 = list4;
                        pi1VarR = pi1Var;
                    }
                    workDatabase = workDatabase2;
                    list = list3;
                    if (g62Var == g62Var3 && (z2 || z3)) {
                        n49 n49VarX2 = workDatabase.x();
                        List listD2 = n49VarX2.d(str);
                        ArrayList arrayList2 = new ArrayList(xv0.Z(listD2, 10));
                        Iterator it3 = listD2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((j49) it3.next()).a);
                        }
                        Iterator it4 = listD2.iterator();
                        while (it4.hasNext()) {
                            n49VarX2.a(((j49) it4.next()).a);
                        }
                        arrayList = new ArrayList();
                        z2 = false;
                        z3 = false;
                    }
                    strArr2 = (String[]) arrayList.toArray(new String[0]);
                    z10 = strArr2.length > 0;
                } else {
                    if (g62Var == g62.Y) {
                        Iterator it5 = listD.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                u39 u39Var7 = ((j49) it5.next()).b;
                                if (u39Var7 == u39Var5 || u39Var7 == u39.Y) {
                                    z8 = false;
                                    z7 = true;
                                    l39Var2.h = z7;
                                    return z5 | z8;
                                }
                            }
                        }
                    }
                    workDatabase2.getClass();
                    workDatabase2.o(new jm0(workDatabase2, str, x39Var, (byte) 0));
                    n49 n49VarX3 = workDatabase2.x();
                    Iterator it6 = listD.iterator();
                    while (it6.hasNext()) {
                        n49VarX3.a(((j49) it6.next()).a);
                    }
                    workDatabase = workDatabase2;
                    list = list3;
                    strArr2 = strArr;
                    z6 = true;
                }
            }
            z6 = false;
        }
        Iterator it7 = list.iterator();
        boolean z11 = z6;
        while (it7.hasNext()) {
            g49 g49Var = (g49) it7.next();
            l49 l49Var = g49Var.b;
            UUID uuid = g49Var.a;
            if (!z10 || z) {
                l49Var.n = jCurrentTimeMillis;
            } else if (z3) {
                l49Var.b = u39Var3;
            } else if (z2) {
                l49Var.b = u39Var2;
            } else {
                l49Var.b = u39.g0;
            }
            if (l49Var.b == u39Var5) {
                z11 = true;
            }
            n49 n49VarX4 = workDatabase.x();
            List list5 = x39Var.m0;
            list5.getClass();
            l49 l49VarZ = z51.Z(list5, l49Var);
            n49VarX4.getClass();
            u39 u39Var8 = u39Var5;
            Iterator it8 = it7;
            u15.G(n49VarX4.a, false, true, new gq6(n49VarX4, l49VarZ, (byte) 28));
            if (z10) {
                int i4 = 0;
                for (int length2 = strArr2.length; i4 < length2; length2 = length2) {
                    String str3 = strArr2[i4];
                    String string = uuid.toString();
                    string.getClass();
                    ki1 ki1Var = new ki1(string, str3);
                    pi1 pi1VarR2 = workDatabase.r();
                    pi1VarR2.getClass();
                    u15.G(pi1VarR2.a, false, true, new p0(pi1VarR2, ki1Var, (byte) 14));
                    i4++;
                    strArr2 = strArr2;
                }
            }
            String[] strArr4 = strArr2;
            p49 p49VarY = workDatabase.y();
            String string2 = uuid.toString();
            string2.getClass();
            p49VarY.a(string2, g49Var.c);
            if (!z4) {
                b49 b49VarV = workDatabase.v();
                str.getClass();
                String string3 = uuid.toString();
                string3.getClass();
                a49 a49Var = new a49(str, string3);
                b49VarV.getClass();
                u15.G(b49VarV.a, false, true, new gq6(b49VarV, a49Var, (byte) 24));
            }
            u39Var5 = u39Var8;
            it7 = it8;
            strArr2 = strArr4;
        }
        z7 = true;
        l39Var2 = l39Var;
        z8 = z11;
        l39Var2.h = z7;
        return z5 | z8;
    }
}
