package defpackage;

import io.sentry.android.replay.capture.f;
import io.sentry.android.replay.capture.i;
import io.sentry.android.replay.capture.k;
import io.sentry.android.replay.capture.m;
import io.sentry.i1;
import io.sentry.util.b;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i79 extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i79(Object obj, Object obj2, byte b) {
        super(1);
        this.Y = b;
        this.Z = obj;
        this.f0 = obj2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws InterruptedException {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.f0;
        Object obj3 = this.Z;
        switch (b) {
            case 0:
                eo5 eo5Var = (eo5) obj3;
                float f = ((j79) obj2).q0;
                ((do5) obj).d(eo5Var);
                eo5Var.S(hf3.c(0L, eo5Var.g0), f, null);
                break;
            case 1:
                k kVar = (k) obj;
                kVar.getClass();
                f fVar = (f) obj3;
                ArrayList arrayList = fVar.y;
                i1 i1Var = fVar.w;
                arrayList.getClass();
                i iVar = (i) (arrayList.isEmpty() ? null : arrayList.remove(0));
                while (iVar != null) {
                    i.a(iVar, i1Var);
                    iVar = (i) (arrayList.isEmpty() ? null : arrayList.remove(0));
                    Thread.sleep(100L);
                }
                if (kVar instanceof i) {
                    i iVar2 = (i) kVar;
                    i.a(iVar2, i1Var);
                    ((gn2) obj2).B(iVar2.a.w0);
                }
                break;
            default:
                k kVar2 = (k) obj;
                m mVar = (m) obj3;
                kVar2.getClass();
                if (kVar2 instanceof i) {
                    i.a((i) kVar2, mVar.w);
                }
                mVar.k(-1);
                File file = (File) obj2;
                if (file != null) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            if (file2.isDirectory() || !da2.S(file2).equals("mp4")) {
                                b.g(file2);
                            }
                        }
                    }
                    file.delete();
                }
                break;
        }
        return dn8Var;
    }
}
