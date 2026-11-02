package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bi7 {
    public long a;
    public bi7 b;

    public bi7(long j) {
        this.a = j;
    }

    public abstract void a(bi7 bi7Var);

    public bi7 b() {
        return new yi1(kd7.h().g());
    }

    public bi7 c(long j) {
        bi7 bi7VarB = b();
        bi7VarB.a = j;
        return bi7VarB;
    }
}
