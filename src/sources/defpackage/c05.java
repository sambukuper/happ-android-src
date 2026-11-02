package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c05 extends mp4 {
    public final tl5 f0;
    public Object g0;

    public c05(tl5 tl5Var, Object obj, Object obj2) {
        super(obj, obj2, (byte) 1);
        this.f0 = tl5Var;
        this.g0 = obj2;
    }

    @Override // defpackage.mp4, java.util.Map.Entry
    public final Object getValue() {
        return this.g0;
    }

    @Override // defpackage.mp4, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.g0;
        this.g0 = obj;
        pl5 pl5Var = (pl5) this.f0.Y;
        ol5 ol5Var = pl5Var.g0;
        Object obj3 = this.Y;
        if (!ol5Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = pl5Var.Z;
        if (!z) {
            ol5Var.put(obj3, obj);
        } else {
            if (!z) {
                bt.n();
                return null;
            }
            kf8 kf8Var = ((kf8[]) pl5Var.f0)[pl5Var.Y];
            Object obj4 = kf8Var.Y[kf8Var.f0];
            ol5Var.put(obj3, obj);
            pl5Var.f(obj4 != null ? obj4.hashCode() : 0, ol5Var.Z, obj4, 0, 0, false);
        }
        pl5Var.j0 = ol5Var.g0;
        return obj2;
    }
}
