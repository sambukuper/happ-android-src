package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f85 {
    public static final f85 f = new f85(jx5.g0, Object.class, null, false, null);
    public final jx5 a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final boolean e;

    public f85(jx5 jx5Var, Class cls, Class cls2, boolean z, Class cls3) {
        this.a = jx5Var;
        this.d = cls;
        this.b = cls2;
        this.e = z;
        this.c = cls3 == null ? x97.class : cls3;
    }

    public final String toString() {
        return "ObjectIdInfo: propName=" + this.a + ", scope=" + it0.u(this.d) + ", generatorType=" + it0.u(this.b) + ", alwaysAsId=" + this.e;
    }
}
