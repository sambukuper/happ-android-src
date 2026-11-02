package defpackage;

import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.capture.i;
import io.sentry.android.replay.capture.k;
import io.sentry.android.replay.capture.m;
import io.sentry.android.replay.d0;
import io.sentry.android.replay.l;
import io.sentry.android.replay.w;
import io.sentry.s5;
import io.sentry.s6;
import java.io.IOException;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ix0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ long f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ ix0(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = j;
        this.g0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        byte b = this.X;
        Object obj = this.g0;
        long j = this.f0;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                ((me6) obj3).X((te6) obj2, j, (se6) obj);
                break;
            case 1:
                ((me6) obj3).U((te6) obj2, j, (ee) obj);
                break;
            default:
                m mVar = (m) obj3;
                w wVar = (w) obj2;
                d0 d0Var = (d0) obj;
                l lVar = mVar.h;
                s6 s6Var = mVar.v;
                if (lVar != null) {
                    wVar.K(lVar, Long.valueOf(j));
                }
                Date date = (Date) mVar.j.a(c.u[1], mVar);
                if (date == null) {
                    s6Var.getLogger().h(s5.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                } else if (mVar.g.get()) {
                    s6Var.getLogger().h(s5.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                } else if (d0Var != null) {
                    if (j - date.getTime() >= s6Var.getSessionReplay().i) {
                        k kVarC = c.c(mVar, s6Var.getSessionReplay().i, date, mVar.d(), mVar.e(), d0Var.b, d0Var.a, d0Var.e, d0Var.f);
                        if (kVarC instanceof i) {
                            i iVar = (i) kVarC;
                            i.a(iVar, mVar.w);
                            mVar.k(mVar.e() + 1);
                            mVar.m(iVar.a.w0);
                        }
                    }
                    if (j - mVar.k.get() >= s6Var.getSessionReplay().j) {
                        s6Var.getReplayController().stop();
                        s6Var.getLogger().h(s5.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                    }
                } else {
                    s6Var.getLogger().h(s5.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                }
                break;
        }
    }
}
