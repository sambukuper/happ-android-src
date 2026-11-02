package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ms3 extends p05 {
    public static final ms3 X = new ms3(ns3.class, "jvmFlags", "getJvmFlags(Lkotlin/metadata/KmProperty;)I", 1);

    @Override // defpackage.p05, defpackage.yv3
    public final void H(Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        nw3[] nw3VarArr = ns3.a;
        ch3.F((kz3) obj).a = iIntValue;
    }

    @Override // defpackage.p05, defpackage.lw3
    public final Object get(Object obj) {
        nw3[] nw3VarArr = ns3.a;
        return Integer.valueOf(ch3.F((kz3) obj).a);
    }
}
