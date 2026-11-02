package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.internal.dns._DnsMessageKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rm1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public final Serializable g;
    public Object h;

    public rm1(AssetManager assetManager, Executor executor, hw5 hw5Var, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = hw5Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = z39.k0;
                    break;
                case 26:
                    bArr = z39.j0;
                    break;
                case 27:
                    bArr = z39.i0;
                    break;
                case _DnsMessageKt.TYPE_AAAA /* 28 */:
                case 29:
                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                    bArr = z39.h0;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = z39.g0;
        }
        this.d = bArr;
    }

    public Integer a(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.g).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        rm1 rm1Var = (rm1) this.e;
        if (rm1Var != null) {
            return rm1Var.a(i);
        }
        return null;
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void c(final int i, final Serializable serializable) {
        ((Executor) this.b).execute(new Runnable() { // from class: qm1
            @Override // java.lang.Runnable
            public final void run() {
                ((hw5) this.X.c).i(i, serializable);
            }
        });
    }

    public rm1 d(List list) {
        list.getClass();
        rm1 rm1Var = new rm1((w15) this.b, (ux4) this.c, (dv8) this.d, this.a, this, (List) this.f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sz5 sz5Var = (sz5) it.next();
            ((LinkedHashMap) rm1Var.g).put(Integer.valueOf(sz5Var.g0), Integer.valueOf(sz5Var.f0));
        }
        return rm1Var;
    }

    public /* synthetic */ rm1(w15 w15Var, ux4 ux4Var, dv8 dv8Var, boolean z, List list, int i) {
        this(w15Var, ux4Var, dv8Var, z, (rm1) null, (i & 32) != 0 ? d02.X : list);
    }

    public rm1(w15 w15Var, ux4 ux4Var, dv8 dv8Var, boolean z, rm1 rm1Var, List list) {
        w15Var.getClass();
        ux4Var.getClass();
        dv8Var.getClass();
        list.getClass();
        this.b = w15Var;
        this.c = ux4Var;
        this.d = dv8Var;
        this.a = z;
        this.e = rm1Var;
        this.f = list;
        this.g = new LinkedHashMap();
        bv4.a.getClass();
        this.h = av4.a();
    }
}
