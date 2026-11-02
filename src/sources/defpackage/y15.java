package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y15 extends c25 {
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;

    public y15(String str, String str2) {
        this.Y = str;
        this.Z = str2;
    }

    @Override // defpackage.c25
    public final String a(String str) {
        return this.Y + str + this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[PreAndSuffixTransformer('");
        sb.append(this.Y);
        sb.append("','");
        return oi0.p(sb, this.Z, "')]");
    }
}
