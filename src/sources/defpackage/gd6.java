package defpackage;

import android.content.ComponentName;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.RemoteListenableDelegatingWorker;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gd6 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ RemoteListenableDelegatingWorker i0;
    public final /* synthetic */ RemoteListenableDelegatingWorker j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd6(RemoteListenableDelegatingWorker remoteListenableDelegatingWorker, q51 q51Var, RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = remoteListenableDelegatingWorker;
        this.j0 = remoteListenableDelegatingWorker2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((gd6) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = this.j0;
        RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2 = this.i0;
        switch (b) {
            case 0:
                return new gd6(remoteListenableDelegatingWorker2, q51Var, remoteListenableDelegatingWorker, (byte) 0);
            default:
                return new gd6(remoteListenableDelegatingWorker2, q51Var, remoteListenableDelegatingWorker, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = this.j0;
        c71 c71Var = c71.X;
        RemoteListenableDelegatingWorker remoteListenableDelegatingWorker2 = this.i0;
        switch (b) {
            case 0:
                WorkerParameters workerParameters = remoteListenableDelegatingWorker2.b;
                jc4 jc4Var = remoteListenableDelegatingWorker2.g;
                boolean z = this.h0;
                try {
                    if (z) {
                        if (!z) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                        byte[] bArr = (byte[]) obj;
                        bArr.getClass();
                        Object objO = w79.O(bArr, gh5.CREATOR);
                        objO.getClass();
                        kj2 kj2Var = ((gh5) objO).X;
                        lh4.P0().getClass();
                        jc4Var.b();
                        return kj2Var;
                    }
                    w39.n0(obj);
                    String strA = workerParameters.b.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                    String strA2 = workerParameters.b.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                    if (strA == null) {
                        bt.q("Need to specify a package name for the Remote Service.");
                    } else {
                        if (strA2 != null) {
                            ComponentName componentName = new ComponentName(strA, strA2);
                            remoteListenableDelegatingWorker2.h = componentName;
                            wy7 wy7VarA = jc4Var.a(componentName, new lr5(remoteListenableDelegatingWorker, (byte) 6));
                            this.h0 = true;
                            obj = b59.a(wy7VarA, remoteListenableDelegatingWorker2, this);
                            if (obj == c71Var) {
                                return c71Var;
                            }
                            byte[] bArr2 = (byte[]) obj;
                            bArr2.getClass();
                            Object objO2 = w79.O(bArr2, gh5.CREATOR);
                            objO2.getClass();
                            kj2 kj2Var2 = ((gh5) objO2).X;
                            lh4.P0().getClass();
                            jc4Var.b();
                            return kj2Var2;
                        }
                        bt.q("Need to specify a class name for the Remote Service.");
                    }
                    return null;
                } catch (Throwable th) {
                    lh4.P0().getClass();
                    jc4Var.b();
                    throw th;
                }
            default:
                WorkerParameters workerParameters2 = remoteListenableDelegatingWorker2.b;
                jc4 jc4Var2 = remoteListenableDelegatingWorker2.g;
                boolean z2 = this.h0;
                try {
                    if (z2) {
                        if (!z2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                        byte[] bArr3 = (byte[]) obj;
                        bArr3.getClass();
                        Object objO3 = w79.O(bArr3, lh5.CREATOR);
                        objO3.getClass();
                        dc4 dc4Var = ((lh5) objO3).X;
                        dc4Var.getClass();
                        lh4.P0().getClass();
                        jc4Var2.b();
                        return dc4Var;
                    }
                    w39.n0(obj);
                    String strA3 = workerParameters2.b.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                    String strA4 = workerParameters2.b.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                    if (strA3 == null) {
                        bt.q("Need to specify a package name for the Remote Service.");
                    } else {
                        if (strA4 != null) {
                            ComponentName componentName2 = new ComponentName(strA3, strA4);
                            remoteListenableDelegatingWorker2.h = componentName2;
                            wy7 wy7VarA2 = jc4Var2.a(componentName2, new y45(remoteListenableDelegatingWorker));
                            this.h0 = true;
                            obj = b59.a(wy7VarA2, remoteListenableDelegatingWorker2, this);
                            if (obj == c71Var) {
                                return c71Var;
                            }
                            byte[] bArr4 = (byte[]) obj;
                            bArr4.getClass();
                            Object objO4 = w79.O(bArr4, lh5.CREATOR);
                            objO4.getClass();
                            dc4 dc4Var2 = ((lh5) objO4).X;
                            dc4Var2.getClass();
                            lh4.P0().getClass();
                            jc4Var2.b();
                            return dc4Var2;
                        }
                        bt.q("Need to specify a class name for the Remote Service.");
                    }
                    return null;
                } catch (Throwable th2) {
                    lh4.P0().getClass();
                    jc4Var2.b();
                    throw th2;
                }
        }
    }
}
