package defpackage;

import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jp8 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ze2 Y;
    public final /* synthetic */ rp8 Z;

    public /* synthetic */ jp8(ze2 ze2Var, rp8 rp8Var, byte b) {
        this.X = b;
        this.Y = ze2Var;
        this.Z = rp8Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        ip8 ip8Var;
        op8 op8Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        rp8 rp8Var = this.Z;
        ze2 ze2Var = this.Y;
        c71 c71Var = c71.X;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (q51Var instanceof ip8) {
                    ip8Var = (ip8) q51Var;
                    int i = ip8Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ip8Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        ip8Var = new ip8(this, q51Var);
                    }
                } else {
                    ip8Var = new ip8(this, q51Var);
                }
                Object obj3 = ip8Var.f0;
                int i2 = ip8Var.g0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        w39.n0(obj3);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj3);
                String str = (String) ((o05) obj).c(rp8Var.c);
                if (str != null) {
                    cp3 cp3Var = mr.a;
                    g55 g55Var = cp3Var.b;
                    obj2 = (DownloadFilesInfo) cp3Var.a(DownloadFilesInfo.INSTANCE.serializer(), str);
                }
                ip8Var.g0 = 1;
                return ze2Var.l(obj2, ip8Var) == c71Var ? c71Var : dn8Var;
            default:
                if (q51Var instanceof op8) {
                    op8Var = (op8) q51Var;
                    int i3 = op8Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        op8Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        op8Var = new op8(this, q51Var);
                    }
                } else {
                    op8Var = new op8(this, q51Var);
                }
                Object obj4 = op8Var.f0;
                int i4 = op8Var.g0;
                if (i4 != 0) {
                    if (i4 == 1) {
                        w39.n0(obj4);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj4);
                String str2 = (String) ((o05) obj).c(rp8Var.b);
                if (str2 != null) {
                    cp3 cp3Var2 = mr.a;
                    g55 g55Var2 = cp3Var2.b;
                    obj2 = (zo8) cp3Var2.a(zo8.Companion.serializer(), str2);
                }
                op8Var.g0 = 1;
                return ze2Var.l(obj2, op8Var) == c71Var ? c71Var : dn8Var;
        }
    }
}
