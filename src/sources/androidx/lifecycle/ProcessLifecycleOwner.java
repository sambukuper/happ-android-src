package androidx.lifecycle;

import android.os.Handler;
import defpackage.c1;
import defpackage.d94;
import defpackage.g94;
import defpackage.lr5;
import defpackage.n84;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Ld94;", "<init>", "()V", "wa", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessLifecycleOwner implements d94 {
    public static final ProcessLifecycleOwner k0 = new ProcessLifecycleOwner();
    public int X;
    public int Y;
    public Handler g0;
    public boolean Z = true;
    public boolean f0 = true;
    public final g94 h0 = new g94(this, true);
    public final c1 i0 = new c1(this, 28);
    public final lr5 j0 = new lr5((Object) this, (byte) 2);

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i = this.Y + 1;
        this.Y = i;
        if (i == 1) {
            if (this.Z) {
                this.h0.d(n84.ON_RESUME);
                this.Z = false;
            } else {
                Handler handler = this.g0;
                handler.getClass();
                handler.removeCallbacks(this.i0);
            }
        }
    }

    @Override // defpackage.d94
    /* JADX INFO: renamed from: h, reason: from getter */
    public final g94 getX() {
        return this.h0;
    }
}
