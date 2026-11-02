package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r39 implements lj2 {
    public final y5 X;
    public final fv5 Y;
    public final n49 Z;

    static {
        lh4.a1("WMFgUpdater");
    }

    public r39(WorkDatabase workDatabase, fv5 fv5Var, y5 y5Var) {
        this.Y = fv5Var;
        this.X = y5Var;
        this.Z = workDatabase.x();
    }

    @Override // defpackage.lj2
    public final xb4 c(Context context, UUID uuid, kj2 kj2Var) {
        return vr3.u((h37) this.X.Y, "setForegroundAsync", new hd(this, uuid, kj2Var, context, (byte) 6));
    }
}
