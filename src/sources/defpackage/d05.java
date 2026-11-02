package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d05 extends mp4 {
    public final em5 f0;
    public za4 g0;
    public final int h0;

    public d05(em5 em5Var, Object obj, za4 za4Var) {
        super(obj, za4Var.a, (byte) 1);
        this.f0 = em5Var;
        this.g0 = za4Var;
        this.h0 = em5Var.f0.h0;
    }

    @Override // defpackage.mp4, java.util.Map.Entry
    public final Object getValue() {
        return this.g0.a;
    }

    @Override // defpackage.mp4, java.util.Map.Entry
    public final Object setValue(Object obj) {
        za4 za4Var = this.g0;
        Object obj2 = za4Var.a;
        za4 za4Var2 = new za4(obj, za4Var.b, za4Var.c);
        this.g0 = za4Var2;
        em5 em5Var = this.f0;
        ol5 ol5Var = em5Var.f0;
        int i = ol5Var.h0;
        int i2 = this.h0;
        Object obj3 = this.Y;
        if (i == i2) {
            em5Var.X = null;
            ol5Var.put(obj3, za4Var2);
            return obj2;
        }
        if (ol5Var.containsKey(obj3)) {
            em5Var.put(obj3, obj);
        }
        return obj2;
    }
}
