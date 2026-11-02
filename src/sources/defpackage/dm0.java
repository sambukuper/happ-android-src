package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dm0 implements em0 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ dm0(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.em0
    public final void b(Throwable th) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((gn2) obj).B(th);
                break;
            default:
                ((gq1) obj).a();
                break;
        }
    }

    public final String toString() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((gn2) obj).getClass().getSimpleName() + '@' + zc1.L(this) + ']';
            default:
                return "DisposeOnCancel[" + ((gq1) obj) + ']';
        }
    }
}
