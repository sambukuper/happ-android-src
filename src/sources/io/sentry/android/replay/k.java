package io.sentry.android.replay;

import defpackage.aa6;
import defpackage.ea6;
import defpackage.g24;
import defpackage.gn2;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.u6;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Serializable g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(long j, Object obj, Serializable serializable, byte b) {
        super(1);
        this.Y = b;
        this.Z = j;
        this.f0 = obj;
        this.g0 = serializable;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        Serializable serializable = this.g0;
        long j = this.Z;
        Object obj2 = this.f0;
        switch (b) {
            case 0:
                m mVar = (m) obj;
                mVar.getClass();
                if (mVar.b < j) {
                    ((l) obj2).k(mVar.a);
                    return Boolean.TRUE;
                }
                ea6 ea6Var = (ea6) serializable;
                if (ea6Var.X == null) {
                    ea6Var.X = mVar.c;
                }
                return Boolean.FALSE;
            default:
                io.sentry.android.replay.capture.i iVar = (io.sentry.android.replay.capture.i) obj;
                io.sentry.android.replay.capture.f fVar = (io.sentry.android.replay.capture.f) obj2;
                iVar.getClass();
                u6 u6Var = iVar.a;
                if (u6Var.w0.getTime() >= j) {
                    return Boolean.FALSE;
                }
                fVar.k(fVar.e() - 1);
                File file = u6Var.r0;
                s6 s6Var = fVar.v;
                if (file != null) {
                    try {
                        if (!file.delete()) {
                            s6Var.getLogger().h(s5.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                        }
                    } catch (Throwable th) {
                        s6Var.getLogger().d(s5.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
                    }
                    break;
                }
                ((aa6) serializable).X = true;
                return Boolean.TRUE;
        }
    }
}
