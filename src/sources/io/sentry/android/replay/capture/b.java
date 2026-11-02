package io.sentry.android.replay.capture;

import defpackage.dn2;
import defpackage.dn8;
import defpackage.g24;
import io.sentry.android.replay.d0;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g24 implements dn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ c g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, c cVar, byte b) {
        super(0);
        this.Y = b;
        this.Z = obj;
        this.f0 = obj2;
        this.g0 = cVar;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.Y;
        Object obj = this.Z;
        dn8 dn8Var = dn8.a;
        c cVar = this.g0;
        Object obj2 = this.f0;
        switch (b) {
            case 0:
                d0 d0Var = (d0) obj2;
                if (d0Var != null) {
                    io.sentry.android.replay.l lVar = cVar.h;
                    if (lVar != null) {
                        lVar.p("config.height", String.valueOf(d0Var.b));
                    }
                    io.sentry.android.replay.l lVar2 = cVar.h;
                    if (lVar2 != null) {
                        lVar2.p("config.width", String.valueOf(d0Var.a));
                    }
                    io.sentry.android.replay.l lVar3 = cVar.h;
                    if (lVar3 != null) {
                        lVar3.p("config.frame-rate", String.valueOf(d0Var.e));
                    }
                    io.sentry.android.replay.l lVar4 = cVar.h;
                    if (lVar4 != null) {
                        lVar4.p("config.bit-rate", String.valueOf(d0Var.f));
                    }
                }
                break;
            case 1:
                Date date = (Date) obj2;
                io.sentry.android.replay.l lVar5 = cVar.h;
                if (lVar5 != null) {
                    lVar5.p("segment.timestamp", date == null ? null : io.sentry.vendor.a.f(date.getTime()));
                }
                break;
            default:
                io.sentry.android.replay.l lVar6 = cVar.h;
                if (lVar6 != null) {
                    lVar6.p("replay.screen-at-start", String.valueOf(obj2));
                }
                break;
        }
        return dn8Var;
    }
}
