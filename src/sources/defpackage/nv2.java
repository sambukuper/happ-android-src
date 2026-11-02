package defpackage;

import java.util.List;
import okhttp3.Handshake;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nv2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ List Y;

    public /* synthetic */ nv2(List list, byte b) {
        this.X = b;
        this.Y = list;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        List list = this.Y;
        switch (b) {
            case 0:
                return Handshake.Companion.get$lambda$0(list);
            default:
                return Handshake.Companion.handshake$lambda$2(list);
        }
    }
}
