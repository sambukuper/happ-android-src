package io.sentry.android.replay;

import android.os.Handler;
import defpackage.dn8;
import defpackage.ea6;
import defpackage.g24;
import defpackage.gn2;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends g24 implements gn2 {
    public final /* synthetic */ ReplayIntegration Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ io.sentry.protocol.w f0;
    public final /* synthetic */ ea6 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ReplayIntegration replayIntegration, long j, io.sentry.protocol.w wVar, ea6 ea6Var) {
        super(1);
        this.Y = replayIntegration;
        this.Z = j;
        this.f0 = wVar;
        this.g0 = ea6Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        Date date = (Date) obj;
        date.getClass();
        ReplayIntegration replayIntegration = this.Y;
        io.sentry.d dVar = replayIntegration.p0;
        q qVar = new q(replayIntegration, this.Z, this.f0, this.g0, date);
        dVar.getClass();
        ((Handler) dVar.Y).post(qVar);
        return dn8.a;
    }
}
