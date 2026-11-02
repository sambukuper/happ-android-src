package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pl1 implements dn2 {
    public final /* synthetic */ byte X;
    public final ArrayList Y;

    public /* synthetic */ pl1(ArrayList arrayList, byte b) {
        this.X = b;
        this.Y = arrayList;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        return this.Y;
    }
}
