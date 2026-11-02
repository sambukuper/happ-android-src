package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z15 extends c25 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ String Z;

    public /* synthetic */ z15(String str, byte b) {
        this.Y = b;
        this.Z = str;
    }

    @Override // defpackage.c25
    public final String a(String str) {
        byte b = this.Y;
        String str2 = this.Z;
        switch (b) {
            case 0:
                return oi0.p(new StringBuilder(), str2, str);
            default:
                return str + str2;
        }
    }

    public final String toString() {
        switch (this.Y) {
            case 0:
                return oi0.p(new StringBuilder("[PrefixTransformer('"), this.Z, "')]");
            default:
                return oi0.p(new StringBuilder("[SuffixTransformer('"), this.Z, "')]");
        }
    }
}
