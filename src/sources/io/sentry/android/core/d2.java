package io.sentry.android.core;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 implements Comparator {
    public final /* synthetic */ byte X;

    public /* synthetic */ d2(byte b) {
        this.X = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                io.sentry.q1 q1Var = (io.sentry.q1) obj;
                io.sentry.q1 q1Var2 = (io.sentry.q1) obj2;
                if (q1Var == q1Var2) {
                    return 0;
                }
                int iCompareTo = q1Var.w().compareTo(q1Var2.w());
                return iCompareTo != 0 ? iCompareTo : q1Var.s().Y.a().compareTo(q1Var2.s().Y.a());
            case 1:
                io.sentry.android.core.anr.a aVar = (io.sentry.android.core.anr.a) obj;
                io.sentry.android.core.anr.a aVar2 = (io.sentry.android.core.anr.a) obj2;
                return Float.compare((aVar.b + 1.0f) * aVar.f * aVar.a, (aVar2.b + 1.0f) * aVar2.f * aVar2.a);
            default:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
