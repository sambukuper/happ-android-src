package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qm8 implements um8 {
    public abstract int a();

    public char b() {
        return 's';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qm8)) {
            return false;
        }
        qm8 qm8Var = (qm8) obj;
        return b() == qm8Var.b() && a() == qm8Var.a();
    }

    public final int hashCode() {
        return a() + (Character.hashCode(b()) * 31);
    }

    public final String toString() {
        return mm7.V(a(), String.valueOf(b()));
    }
}
