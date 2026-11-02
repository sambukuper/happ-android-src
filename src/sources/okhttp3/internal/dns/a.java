package okhttp3.internal.dns;

import defpackage.gn2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ a(byte b) {
        this.X = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        boolean zEnqueue$lambda$0;
        LookupDnsCall.State state = (LookupDnsCall.State) obj;
        switch (this.X) {
            case 0:
                zEnqueue$lambda$0 = LookupDnsCall.enqueue$lambda$0(state);
                break;
            case 1:
                zEnqueue$lambda$0 = LookupDnsCall.runOnce$lambda$0(state);
                break;
            case 2:
                zEnqueue$lambda$0 = LookupDnsCall.runOnce$lambda$2(state);
                break;
            default:
                zEnqueue$lambda$0 = LookupDnsCall.cancel$lambda$0(state);
                break;
        }
        return Boolean.valueOf(zEnqueue$lambda$0);
    }
}
