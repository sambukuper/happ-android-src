package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ga7 implements u06 {
    public static final Object Z = new Object();
    public volatile j70 X;
    public volatile Object Y;

    @Override // defpackage.v06
    public final Object get() {
        Object obj = this.Y;
        if (obj != Z) {
            return obj;
        }
        j70 j70Var = this.X;
        if (j70Var == null) {
            return this.Y;
        }
        Object obj2 = j70Var.get();
        this.Y = obj2;
        this.X = null;
        return obj2;
    }
}
