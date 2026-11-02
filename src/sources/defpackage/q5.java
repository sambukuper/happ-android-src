package defpackage;

import java.util.List;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;
import su.happ.proxyutility.dto.SubscriptionExtraStatus;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5(int i, q51 q51Var, byte b) {
        super(i, q51Var);
        this.g0 = b;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((q5) n((q51) obj2, (mk0) obj)).q(dn8Var);
            case 1:
                return ((q5) n((q51) obj2, (mk0) obj)).q(dn8Var);
            case 2:
                Object obj3 = ((sj6) obj).X;
                byte b2 = 2;
                q5 q5Var = new q5(b2, (q51) obj2, b2);
                q5Var.h0 = obj3;
                return q5Var.q(dn8Var);
            case 3:
                return ((q5) n((q51) obj2, (mk0) obj)).q(dn8Var);
            case 4:
                return ((q5) n((q51) obj2, (SubscriptionExtraStatus) obj)).q(dn8Var);
            case 5:
                return ((q5) n((q51) obj2, (hh7) obj)).q(dn8Var);
            case 6:
                ((q5) n((q51) obj2, (o05) obj)).q(dn8Var);
                return dn8Var;
            case 7:
                return ((q5) n((q51) obj2, (DownloadFilesInfo) obj)).q(dn8Var);
            case 8:
                return ((q5) n((q51) obj2, (DownloadFilesInfo) obj)).q(dn8Var);
            case 9:
                return ((q5) n((q51) obj2, (m86) obj)).q(dn8Var);
            case 10:
                return ((q5) n((q51) obj2, (mk0) obj)).q(dn8Var);
            case 11:
                return ((q5) n((q51) obj2, (List) obj)).q(dn8Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((q5) n((q51) obj2, (List) obj)).q(dn8Var);
            default:
                return ((q5) n((q51) obj2, (g87) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = 2;
        switch (this.g0) {
            case 0:
                q5 q5Var = new q5(b, q51Var, (byte) 0);
                q5Var.h0 = obj;
                return q5Var;
            case 1:
                q5 q5Var2 = new q5(b, q51Var, (byte) 1);
                q5Var2.h0 = obj;
                return q5Var2;
            case 2:
                q5 q5Var3 = new q5(b, q51Var, b);
                q5Var3.h0 = ((sj6) obj).X;
                return q5Var3;
            case 3:
                q5 q5Var4 = new q5(b, q51Var, (byte) 3);
                q5Var4.h0 = obj;
                return q5Var4;
            case 4:
                q5 q5Var5 = new q5(b, q51Var, (byte) 4);
                q5Var5.h0 = obj;
                return q5Var5;
            case 5:
                q5 q5Var6 = new q5(b, q51Var, (byte) 5);
                q5Var6.h0 = obj;
                return q5Var6;
            case 6:
                q5 q5Var7 = new q5(b, q51Var, (byte) 6);
                q5Var7.h0 = obj;
                return q5Var7;
            case 7:
                q5 q5Var8 = new q5(b, q51Var, (byte) 7);
                q5Var8.h0 = obj;
                return q5Var8;
            case 8:
                q5 q5Var9 = new q5(b, q51Var, (byte) 8);
                q5Var9.h0 = obj;
                return q5Var9;
            case 9:
                q5 q5Var10 = new q5(b, q51Var, (byte) 9);
                q5Var10.h0 = obj;
                return q5Var10;
            case 10:
                q5 q5Var11 = new q5(b, q51Var, (byte) 10);
                q5Var11.h0 = obj;
                return q5Var11;
            case 11:
                q5 q5Var12 = new q5(b, q51Var, (byte) 11);
                q5Var12.h0 = obj;
                return q5Var12;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                q5 q5Var13 = new q5(b, q51Var, (byte) 12);
                q5Var13.h0 = obj;
                return q5Var13;
            default:
                q5 q5Var14 = new q5(b, q51Var, (byte) 13);
                q5Var14.h0 = obj;
                return q5Var14;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        boolean z = false;
        switch (this.g0) {
            case 0:
                w39.n0(obj);
                mk0 mk0Var = (mk0) this.h0;
                return Boolean.valueOf((mk0Var instanceof qk0) || (mk0Var instanceof pk0));
            case 1:
                w39.n0(obj);
                return Boolean.valueOf(((mk0) this.h0) instanceof pk0);
            case 2:
                Object obj2 = this.h0;
                w39.n0(obj);
                return Boolean.valueOf(!(obj2 instanceof rj6));
            case 3:
                w39.n0(obj);
                return Boolean.valueOf(!(((mk0) this.h0) instanceof yk0));
            case 4:
                SubscriptionExtraStatus subscriptionExtraStatus = (SubscriptionExtraStatus) this.h0;
                w39.n0(obj);
                return Boolean.valueOf(subscriptionExtraStatus != null);
            case 5:
                w39.n0(obj);
                return Boolean.valueOf(!(((hh7) this.h0) instanceof ma2));
            case 6:
                o05 o05Var = (o05) this.h0;
                w39.n0(obj);
                o05Var.b();
                o05Var.a.clear();
                return dn8.a;
            case 7:
                DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) this.h0;
                w39.n0(obj);
                if (downloadFilesInfo.getState() != StateDownloadFile.SUCCESS && downloadFilesInfo.getState() != StateDownloadFile.FAILURE) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                DownloadFilesInfo downloadFilesInfo2 = (DownloadFilesInfo) this.h0;
                w39.n0(obj);
                if (downloadFilesInfo2.getState() != StateDownloadFile.SUCCESS && downloadFilesInfo2.getState() != StateDownloadFile.FAILURE) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                w39.n0(obj);
                return Boolean.valueOf(((m86) this.h0) == m86.X);
            case 10:
                w39.n0(obj);
                return Boolean.valueOf(!dh3.f((mk0) this.h0, yk0.a));
            case 11:
                List list = (List) this.h0;
                w39.n0(obj);
                return list;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                List list2 = (List) this.h0;
                w39.n0(obj);
                return list2;
            default:
                g87 g87Var = (g87) this.h0;
                w39.n0(obj);
                return Boolean.valueOf(g87Var != g87.X);
        }
    }
}
