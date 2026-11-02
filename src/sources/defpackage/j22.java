package defpackage;

import java.util.List;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j22 implements dn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ j22(int i, String str, k22 k22Var) {
        this.Y = i;
        this.Z = str;
        this.f0 = k22Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        Object obj = this.f0;
        int i = this.Y;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                String str = (String) obj2;
                k22 k22Var = (k22) obj;
                e37[] e37VarArr = new e37[i];
                for (int i2 = 0; i2 < i; i2++) {
                    e37VarArr[i2] = km4.n(str + '.' + k22Var.e[i2], pm7.P, new e37[0]);
                }
                return e37VarArr;
            default:
                return Http2Connection.pushRequestLater$lambda$1((Http2Connection) obj2, i, (List) obj);
        }
    }

    public /* synthetic */ j22(Http2Connection http2Connection, int i, List list) {
        this.Z = http2Connection;
        this.Y = i;
        this.f0 = list;
    }
}
