package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class so2 {
    public final fk2 a;
    public final String b;
    public final int c;

    public so2(fk2 fk2Var, String str, int i) {
        fk2Var.getClass();
        this.a = fk2Var;
        this.b = str;
        this.c = i;
    }

    public final v15 a(int i) {
        return v15.e(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        return oi0.o(sb, this.b, 'N');
    }
}
