package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ho8 {
    public static final Set a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        go8[] go8VarArrValues = go8.values();
        ArrayList arrayList = new ArrayList(go8VarArrValues.length);
        for (go8 go8Var : go8VarArrValues) {
            arrayList.add(go8Var.Y);
        }
        a = wv0.c1(arrayList);
        co8[] co8VarArrValues = co8.values();
        ArrayList arrayList2 = new ArrayList(co8VarArrValues.length);
        for (co8 co8Var : co8VarArrValues) {
            arrayList2.add(co8Var.X);
        }
        wv0.c1(arrayList2);
        b = new HashMap();
        c = new HashMap();
        zp4.I(new qg5(co8.UBYTEARRAY, v15.e("ubyteArrayOf")), new qg5(co8.USHORTARRAY, v15.e("ushortArrayOf")), new qg5(co8.UINTARRAY, v15.e("uintArrayOf")), new qg5(co8.ULONGARRAY, v15.e("ulongArrayOf")));
        go8[] go8VarArrValues2 = go8.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (go8 go8Var2 : go8VarArrValues2) {
            linkedHashSet.add(go8Var2.Z.f());
        }
        d = linkedHashSet;
        for (go8 go8Var3 : go8.values()) {
            HashMap map = b;
            qs0 qs0Var = go8Var3.Z;
            qs0 qs0Var2 = go8Var3.X;
            map.put(qs0Var, qs0Var2);
            c.put(qs0Var2, go8Var3.Z);
        }
    }

    public static final boolean a(t14 t14Var) {
        ot0 ot0VarX;
        if (cj8.l(t14Var) || (ot0VarX = t14Var.n0().x()) == null) {
            return false;
        }
        ed1 ed1VarP = ot0VarX.p();
        return (ed1VarP instanceof tf5) && dh3.f(((uf5) ((tf5) ed1VarP)).i0, ug7.k) && a.contains(ot0VarX.getName());
    }
}
