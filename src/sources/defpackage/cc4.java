package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cc4 extends dc4 {
    public final u91 a;

    public cc4(u91 u91Var) {
        this.a = u91Var;
    }

    @Override // defpackage.dc4
    public final u91 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cc4.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cc4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (cc4.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
