package io.sentry.android.replay;

import android.view.View;
import defpackage.dh3;
import defpackage.g24;
import defpackage.gn2;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(View view, byte b) {
        super(1);
        this.Y = b;
        this.Z = view;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        View view = this.Z;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(dh3.f(weakReference.get(), view));
            default:
                WeakReference weakReference2 = (WeakReference) obj;
                weakReference2.getClass();
                return Boolean.valueOf(dh3.f(weakReference2.get(), view));
        }
    }
}
