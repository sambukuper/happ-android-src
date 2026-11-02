package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uy3 extends py3 {
    public final int a;

    public uy3(int i) {
        this.a = i;
    }

    @Override // defpackage.py3
    public final Object a() {
        return new lk8(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy3) && this.a == ((uy3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
