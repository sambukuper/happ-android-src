package defpackage;

import android.net.Uri;
import com.tencent.mmkv.MMKV;
import java.io.File;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rp8 {
    public static final /* synthetic */ nw3[] j = {new mx5(rp8.class)};
    public final MMKV a;
    public final js5 b;
    public final js5 c;
    public final is5 d;
    public final String e;
    public final Uri f;
    public final xe2 g;
    public final o h;
    public final xe2 i;

    public rp8() {
        kw4 kw4Var = kw4.a;
        MMKV mmkvL = kw4.l();
        HappApplication happApplication = HappApplication.M0;
        File externalFilesDir = k32.i().getExternalFilesDir(null);
        String path = externalFilesDir != null ? externalFilesDir.getPath() : null;
        this.a = mmkvL;
        this.b = new js5("update_params");
        this.c = new js5("download_info");
        this.d = x97.R("update", null, null, 14);
        String strO = pc6.o(path, "/Happ_new.apk");
        this.e = strO;
        this.f = Uri.parse("file://".concat(strO));
        xe2 xe2VarT = w51.t(new kp8(c(k32.i()).j(), this, (byte) 0));
        this.g = xe2VarT;
        this.h = new o(xe2VarT, (byte) 24);
        this.i = w51.t(new kp8(c(k32.i()).j(), this, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        dp8 dp8Var;
        if (s51Var instanceof dp8) {
            dp8Var = (dp8) s51Var;
            int i = dp8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                dp8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                dp8Var = new dp8(this, s51Var);
            }
        } else {
            dp8Var = new dp8(this, s51Var);
        }
        Object obj = dp8Var.f0;
        int i2 = dp8Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            HappApplication happApplication = HappApplication.M0;
            na1 na1VarC = c(k32.i());
            ep8 ep8Var = new ep8(this, q51Var, (byte) 0);
            dp8Var.h0 = 1;
            Object objX = wl7.x(na1VarC, ep8Var, dp8Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(s51 s51Var) {
        fp8 fp8Var;
        if (s51Var instanceof fp8) {
            fp8Var = (fp8) s51Var;
            int i = fp8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                fp8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                fp8Var = new fp8(this, s51Var);
            }
        } else {
            fp8Var = new fp8(this, s51Var);
        }
        Object obj = fp8Var.f0;
        int i2 = fp8Var.h0;
        q51 q51Var = null;
        byte b = 1;
        if (i2 == 0) {
            w39.n0(obj);
            HappApplication happApplication = HappApplication.M0;
            na1 na1VarC = c(k32.i());
            ep8 ep8Var = new ep8(this, q51Var, b);
            fp8Var.h0 = 1;
            Object objX = wl7.x(na1VarC, ep8Var, fp8Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }

    public final na1 c(HappApplication happApplication) {
        return (na1) this.d.a(j[0], happApplication);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(s51 s51Var) {
        gp8 gp8Var;
        if (s51Var instanceof gp8) {
            gp8Var = (gp8) s51Var;
            int i = gp8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                gp8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                gp8Var = new gp8(this, s51Var);
            }
        } else {
            gp8Var = new gp8(this, s51Var);
        }
        Object objQ = gp8Var.f0;
        int i2 = gp8Var.h0;
        dn8 dn8Var = dn8.a;
        Object obj = c71.X;
        if (i2 == 0) {
            w39.n0(objQ);
            gp8Var.h0 = 1;
            objQ = gv3.q(this.g, gp8Var);
            if (objQ != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w39.n0(objQ);
                return dn8Var;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(objQ);
        DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) objQ;
        if (downloadFilesInfo != null) {
            DownloadFilesInfo downloadFilesInfoB = DownloadFilesInfo.b(downloadFilesInfo, StateDownloadFile.SUCCESS);
            gp8Var.h0 = 2;
            if (e(downloadFilesInfoB, gp8Var) == obj) {
                return obj;
            }
        }
        return dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(DownloadFilesInfo downloadFilesInfo, s51 s51Var) {
        pp8 pp8Var;
        if (s51Var instanceof pp8) {
            pp8Var = (pp8) s51Var;
            int i = pp8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                pp8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                pp8Var = new pp8(this, s51Var);
            }
        } else {
            pp8Var = new pp8(this, s51Var);
        }
        Object obj = pp8Var.f0;
        int i2 = pp8Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            HappApplication happApplication = HappApplication.M0;
            na1 na1VarC = c(k32.i());
            co coVar = new co((Object) this, (Object) downloadFilesInfo, q51Var, (byte) 15);
            pp8Var.h0 = 1;
            Object objX = wl7.x(na1VarC, coVar, pp8Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zo8 zo8Var, s51 s51Var) {
        qp8 qp8Var;
        if (s51Var instanceof qp8) {
            qp8Var = (qp8) s51Var;
            int i = qp8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                qp8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                qp8Var = new qp8(this, s51Var);
            }
        } else {
            qp8Var = new qp8(this, s51Var);
        }
        Object obj = qp8Var.f0;
        int i2 = qp8Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            HappApplication happApplication = HappApplication.M0;
            na1 na1VarC = c(k32.i());
            co coVar = new co((Object) this, (Object) zo8Var, q51Var, (byte) 16);
            qp8Var.h0 = 1;
            Object objX = wl7.x(na1VarC, coVar, qp8Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }
}
