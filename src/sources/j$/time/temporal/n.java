package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements m {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // j$.time.temporal.m
    public final l f(l lVar) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                int iH = lVar.h(ChronoField.DAY_OF_WEEK);
                if (iH == i) {
                    return lVar;
                }
                int i2 = iH - i;
                return lVar.c(i2 >= 0 ? 7 - i2 : -i2, a.DAYS);
            default:
                int iH2 = lVar.h(ChronoField.DAY_OF_WEEK);
                if (iH2 == i) {
                    return lVar;
                }
                int i3 = i - iH2;
                return lVar.a(i3 >= 0 ? 7 - i3 : -i3, a.DAYS);
        }
    }
}
