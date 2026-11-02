package defpackage;

import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfoKt;
import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.feature.routing.sub.SubRoutingActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class et1 extends uy7 implements rn2 {
    public /* synthetic */ Object g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ mr2 j0;
    public final /* synthetic */ ht1 k0;
    public final /* synthetic */ fn6[] l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et1(String str, String str2, mr2 mr2Var, ht1 ht1Var, fn6[] fn6VarArr, q51 q51Var) {
        super(2, q51Var);
        this.h0 = str;
        this.i0 = str2;
        this.j0 = mr2Var;
        this.k0 = ht1Var;
        this.l0 = fn6VarArr;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        et1 et1Var = (et1) n((q51) obj2, (DownloadFilesInfo) obj);
        dn8 dn8Var = dn8.a;
        et1Var.q(dn8Var);
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        et1 et1Var = new et1(this.h0, this.i0, this.j0, this.k0, this.l0, q51Var);
        et1Var.g0 = obj;
        return et1Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        Object progress;
        Object obj2;
        DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) this.g0;
        w39.n0(obj);
        mr2 mr2Var = this.j0;
        String str = this.h0;
        String str2 = this.i0;
        GeoFileKey geoFileKey = new GeoFileKey(mr2Var, str, str2);
        downloadFilesInfo.getClass();
        int i = DownloadFilesInfoKt.WhenMappings.$EnumSwitchMapping$0[downloadFilesInfo.getState().ordinal()];
        Object obj3 = null;
        if (i == 1) {
            progress = StateDownloadFileV2.Loading.Start.INSTANCE;
        } else if (i == 2) {
            long downloadBytes = downloadFilesInfo.getDownloadBytes();
            long totalBytes = downloadFilesInfo.getTotalBytes();
            Long lValueOf = Long.valueOf(totalBytes);
            if (totalBytes <= 0) {
                lValueOf = null;
            }
            progress = new StateDownloadFileV2.Loading.Progress(downloadBytes, lValueOf);
        } else if (i == 3) {
            progress = new StateDownloadFileV2.Success(System.currentTimeMillis());
        } else if (i == 4) {
            progress = new StateDownloadFileV2.Error.Failure(System.currentTimeMillis());
        } else {
            if (i != 5) {
                b61.c();
                return null;
            }
            progress = new StateDownloadFileV2.Error.LinkNotCorrect(System.currentTimeMillis());
        }
        ht1 ht1Var = this.k0;
        oh7 oh7Var = ht1Var.b;
        while (true) {
            Object value = oh7Var.getValue();
            obj2 = obj3;
            if (oh7Var.k(value, ((cm5) value).d(geoFileKey, progress))) {
                break;
            }
            obj3 = obj2;
        }
        int i2 = dt1.a[downloadFilesInfo.getState().ordinal()];
        fn6[] fn6VarArr = this.l0;
        int i3 = 0;
        if (i2 == 1) {
            ht1Var.b(mr2Var, str, str2, true);
            int length = fn6VarArr.length;
            while (i3 < length) {
                fn6VarArr[i3].a(str, true);
                i3++;
            }
        } else if (i2 == 2 || i2 == 3) {
            ht1Var.b(mr2Var, str, str2, false);
            for (fn6 fn6Var : fn6VarArr) {
                fn6Var.a(str, false);
            }
        } else if (i2 == 4) {
            int length2 = fn6VarArr.length;
            while (i3 < length2) {
                fn6 fn6Var2 = fn6VarArr[i3];
                byte b = fn6Var2.a;
                str.getClass();
                switch (b) {
                    case 0:
                        mn6.z((mn6) fn6Var2.b, str);
                        break;
                    case 1:
                        SubRoutingActivity subRoutingActivity = (SubRoutingActivity) fn6Var2.b;
                        int i4 = SubRoutingActivity.C0;
                        ((np7) subRoutingActivity.y0.getValue()).g(zo7.a);
                        break;
                    default:
                        ((np7) fn6Var2.b).h();
                        break;
                }
                i3++;
            }
        } else {
            if (i2 != 5) {
                b61.c();
                return obj2;
            }
            int length3 = fn6VarArr.length;
            while (i3 < length3) {
                fn6VarArr[i3].b(downloadFilesInfo);
                i3++;
            }
        }
        return dn8.a;
    }
}
