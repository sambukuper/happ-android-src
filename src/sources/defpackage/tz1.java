package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tz1 implements bb3 {
    public final boolean X;

    public tz1(boolean z) {
        this.X = z;
    }

    @Override // defpackage.bb3
    public final boolean k() {
        return this.X;
    }

    @Override // defpackage.bb3
    public final k55 l() {
        return null;
    }

    public final String toString() {
        return oi0.o(new StringBuilder("Empty{"), this.X ? "Active" : "New", '}');
    }
}
