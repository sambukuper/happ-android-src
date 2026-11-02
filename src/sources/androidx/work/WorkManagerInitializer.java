package androidx.work;

import android.content.Context;
import defpackage.lh4;
import defpackage.mj0;
import defpackage.rc3;
import defpackage.x39;
import defpackage.xy0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements rc3 {
    static {
        lh4.a1("WrkMgrInitializer");
    }

    @Override // defpackage.rc3
    public final Object create(Context context) {
        lh4.P0().getClass();
        xy0 xy0Var = new xy0(new mj0((byte) 7, false));
        context.getClass();
        x39.w0(context, xy0Var);
        x39 x39VarV0 = x39.v0(context);
        x39VarV0.getClass();
        return x39VarV0;
    }

    @Override // defpackage.rc3
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
