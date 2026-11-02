package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l59 implements i94, ao2 {
    public final /* synthetic */ m01 a;

    public l59(m01 m01Var) {
        this.a = m01Var;
    }

    @Override // defpackage.ao2
    public final on2 b() {
        return new no2(1, this.a, m01.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof i94) && (obj instanceof ao2)) {
            return b().equals(((ao2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
