package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e05 extends mp4 {
    public final tl5 f0;
    public Object g0;

    public e05(tl5 tl5Var, Object obj, Object obj2) {
        super(obj, obj2, (byte) 0);
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
        ql5 ql5Var = (ql5) this.f0.Y;
        jl5 jl5Var = ql5Var.g0;
        Object obj3 = this.Y;
        if (!jl5Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ql5Var.Z;
        if (!z) {
            jl5Var.put(obj3, obj);
        } else {
            if (!z) {
                bt.n();
                return null;
            }
            kf8 kf8Var = ((kf8[]) ql5Var.f0)[ql5Var.Y];
            Object obj4 = kf8Var.Y[kf8Var.f0];
            jl5Var.put(obj3, obj);
            ql5Var.f(obj4 != null ? obj4.hashCode() : 0, jl5Var.Y, obj4, 0);
        }
        ql5Var.j0 = jl5Var.f0;
        return obj2;
    }
}
