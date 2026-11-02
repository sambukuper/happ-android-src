package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c59 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ c59(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                return new hf3(((long) ((o50) obj3).a(0, (int) (((pf3) obj).a & 4294967295L))) & 4294967295L);
            default:
                return new hf3(((p50) obj3).a(0L, ((pf3) obj).a, (z24) obj2));
        }
    }
}
