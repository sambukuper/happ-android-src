package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l42 implements v06 {
    public final /* synthetic */ byte X;
    public final v06 Y;

    public /* synthetic */ l42(v06 v06Var, byte b) {
        this.X = b;
        this.Y = v06Var;
    }

    @Override // defpackage.v06
    public final Object get() {
        byte b = this.X;
        v06 v06Var = this.Y;
        switch (b) {
            case 0:
                String packageName = ((Context) v06Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                b61.i("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new dx6(Integer.valueOf(dx6.f0).intValue(), (Context) v06Var.get(), "com.google.android.datatransport.events");
        }
    }
}
