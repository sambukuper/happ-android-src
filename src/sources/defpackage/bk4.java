package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class bk4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ MainActivity h0;
    public final /* synthetic */ String i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk4(MainActivity mainActivity, String str, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = mainActivity;
        this.i0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, b71Var).q(dn8Var);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                n(q51Var, b71Var).q(dn8Var);
                break;
            default:
                n(q51Var, b71Var).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        String str = this.i0;
        MainActivity mainActivity = this.h0;
        switch (b) {
            case 0:
                return new bk4(mainActivity, str, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new bk4(mainActivity, str, q51Var, (byte) 1);
            default:
                return new bk4(mainActivity, str, q51Var, (byte) 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, java.lang.Object, su.happ.proxyutility.feature.main.MainActivity] */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        String str = this.i0;
        ?? r8 = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                try {
                    String[] strArr = {"geosite.dat", "geoip.dat"};
                    String[] list = r8.getAssets().list("");
                    if (list != null) {
                        ArrayList<String> arrayList = new ArrayList();
                        for (String str2 : list) {
                            if (eu.Z(str2, strArr)) {
                                arrayList.add(str2);
                            }
                        }
                        for (String str3 : arrayList) {
                            try {
                                File file = new File(str, str3);
                                g00 g00Var = new g00((Object) r8, str3, file, (byte) 12);
                                if (file.exists()) {
                                    FileInputStream fileInputStream = new FileInputStream(file);
                                    try {
                                        int length = gv3.O(fileInputStream).length;
                                        fileInputStream.close();
                                        InputStream inputStreamOpen = r8.getAssets().open(str3);
                                        try {
                                            inputStreamOpen.getClass();
                                            int length2 = gv3.O(inputStreamOpen).length;
                                            inputStreamOpen.close();
                                            if (length != length2) {
                                                g00Var.invoke();
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                oc.h(inputStreamOpen, th);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            oc.h(fileInputStream, th3);
                                            throw th4;
                                        }
                                    }
                                } else {
                                    g00Var.invoke();
                                }
                            } catch (Throwable th5) {
                                try {
                                    if ((th5 instanceof InterruptedException) || (th5 instanceof CancellationException)) {
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    }
                } catch (Throwable th7) {
                    if ((th7 instanceof InterruptedException) || (th7 instanceof CancellationException)) {
                        throw th7;
                    }
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                r8.G().E(str, true);
                r8.G().G();
                return dn8Var;
            default:
                w39.n0(obj);
                int i = MainActivity.y1;
                r8.Q(str, true);
                ss8 ss8Var = ss8.a;
                ss8.E(r8, str);
                return dn8Var;
        }
    }
}
