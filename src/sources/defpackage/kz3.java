package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kz3 {
    public static final /* synthetic */ nw3[] q = {new p05(kz3.class, "_hasSetter", "get_hasSetter()Z", 0), new p05(kz3.class, "_hasGetter", "get_hasGetter()Z", 0)};
    public int a;
    public final String b;
    public final lz3 c;
    public final lz3 d;
    public final ArrayList e;
    public mz3 f;
    public final ArrayList g;
    public final ArrayList h;
    public qz3 i;
    public mz3 j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;

    public kz3(String str, int i, int i2, int i3) {
        int i4;
        str.getClass();
        this.a = i;
        this.b = str;
        jd2 jd2Var = md2.D;
        jd2Var.getClass();
        id2 id2Var = new id2(jd2Var, 1);
        fd2 fd2Var = fd2.X;
        int i5 = id2Var.b;
        if (i5 != 1 || (i4 = id2Var.c) != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var, " was passed"));
            throw null;
        }
        jd2 jd2Var2 = md2.C;
        jd2Var2.getClass();
        id2 id2Var2 = new id2(jd2Var2, 1);
        if (id2Var2.b != 1 || id2Var2.c != 1) {
            em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var2, " was passed"));
            throw null;
        }
        int i6 = 1 << id2Var2.a;
        lz3 lz3Var = new lz3(i2);
        nw3[] nw3VarArr = q;
        nw3VarArr[1].getClass();
        fd2Var.H(this, Integer.valueOf(i6 | this.a));
        this.c = lz3Var;
        nw3VarArr[0].getClass();
        this.d = ((((Number) fd2Var.get(this)).intValue() >>> id2Var.a) & ((1 << i5) - 1)) == i4 ? new lz3(i3) : null;
        this.e = new ArrayList(0);
        this.g = new ArrayList(0);
        new ArrayList(0);
        this.h = new ArrayList();
        this.k = new ArrayList(0);
        this.l = new LinkedHashMap(0);
        this.m = new ArrayList(0);
        this.n = new ArrayList(0);
        this.o = new ArrayList(0);
        bv4.a.getClass();
        List listA = av4.a();
        ArrayList arrayList = new ArrayList(xv0.Z(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((nt3) ((bv4) it.next())).getClass();
            arrayList.add(new vt3());
        }
        this.p = arrayList;
    }
}
