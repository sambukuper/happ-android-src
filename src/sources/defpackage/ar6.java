package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import com.google.gson.a;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import libxray.XRayPoint;
import su.happ.proxyutility.dto.ResolveForPingData;
import su.happ.proxyutility.dto.ResolveForPingResultData;
import su.happ.proxyutility.dto.SocketServerInfo;
import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity;
import su.happ.proxyutility.service.XRayTestService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ar6 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar6(q51 q51Var, Object obj, Object obj2, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = obj;
        this.i0 = obj2;
    }

    private final Object u(Object obj) {
        pk7 pk7Var = (pk7) this.h0;
        w39.n0(obj);
        wk2 wk2Var = ((ok7) this.i0).t1;
        if (wk2Var == null) {
            dh3.T("binding");
            throw null;
        }
        xk2 xk2Var = (xk2) wk2Var;
        xk2Var.v0 = pk7Var;
        synchronized (xk2Var) {
            xk2Var.x0 |= 1;
        }
        synchronized (xk2Var) {
        }
        xk2Var.f();
        return dn8.a;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((ar6) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                return ((ar6) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 2:
                ((ar6) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 3:
                return ((ar6) n((q51) obj2, (o05) obj)).q(dn8Var);
            case 4:
                ((ar6) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 5:
                ((ar6) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 6:
                ((ar6) n((q51) obj2, (pk7) obj)).q(dn8Var);
                return dn8Var;
            case 7:
                return ((ar6) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                ((ar6) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 9:
                ((ar6) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            default:
                ((ar6) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                ar6 ar6Var = new ar6((rn2) obj2, q51Var, (byte) 0);
                ar6Var.h0 = obj;
                return ar6Var;
            case 1:
                return new ar6(this.h0, obj2, q51Var, (byte) 1);
            case 2:
                return new ar6(this.h0, obj2, q51Var, (byte) 2);
            case 3:
                ar6 ar6Var2 = new ar6((Set) obj2, q51Var, (byte) 3);
                ar6Var2.h0 = obj;
                return ar6Var2;
            case 4:
                return new ar6(q51Var, this.h0, obj2, (byte) 4);
            case 5:
                return new ar6(q51Var, this.h0, obj2, (byte) 5);
            case 6:
                ar6 ar6Var3 = new ar6((ok7) obj2, q51Var, (byte) 6);
                ar6Var3.h0 = obj;
                return ar6Var3;
            case 7:
                ar6 ar6Var4 = new ar6((r68) obj2, q51Var, (byte) 7);
                ar6Var4.h0 = obj;
                return ar6Var4;
            case 8:
                return new ar6(this.h0, obj2, q51Var, (byte) 8);
            case 9:
                return new ar6(this.h0, obj2, q51Var, (byte) 9);
            default:
                return new ar6(this.h0, obj2, q51Var, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01f4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        Object rj6Var;
        int iIntValue;
        kh7 kh7Var;
        Object[] objArr;
        int i;
        int i2;
        boolean z;
        Integer num;
        List listY0;
        boolean z2 = false;
        Object[] objArr2 = 0;
        z2 = false;
        byte b = 1;
        switch (this.g0) {
            case 0:
                w39.n0(obj);
                q61 q61VarH0 = ((b71) this.h0).getCoroutineContext().H0(pz2.E0);
                q61VarH0.getClass();
                u61 u61Var = (u61) q61VarH0;
                ux0 ux0Var = new ux0();
                w51.F(cs2.X, u61Var, e71.f0, new qk4((Object) ux0Var, this.i0, (q51) (null == true ? 1 : 0), (byte) 15));
                while (!ux0Var.S()) {
                    try {
                        return z51.R(u61Var, new ve0(ux0Var, null == true ? 1 : 0, b));
                    } catch (InterruptedException unused) {
                    }
                }
                return ux0Var.G();
            case 1:
                w39.n0(obj);
                SocketServerInfo socketServerInfo = (SocketServerInfo) this.h0;
                String[] strArr = (String[]) this.i0;
                try {
                    Socket socket = new Socket();
                    try {
                        if (socketServerInfo.getIp() != null && socketServerInfo.getPort() != null) {
                            socket.connect(new InetSocketAddress(socketServerInfo.getIp(), socketServerInfo.getPort().intValue()), 15000);
                            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
                            try {
                                printWriter.println(eu.x0(strArr, "\n", null, null, null, 62));
                                printWriter.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    oc.h(printWriter, th);
                                    throw th2;
                                }
                            }
                        }
                        socket.close();
                        rj6Var = dn8.a;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            oc.h(socket, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    if ((th5 instanceof InterruptedException) || (th5 instanceof CancellationException)) {
                        throw th5;
                    }
                    rj6Var = new rj6(th5);
                }
                return new sj6(rj6Var);
            case 2:
                w39.n0(obj);
                ServerCustomConfigActivity serverCustomConfigActivity = (ServerCustomConfigActivity) this.h0;
                String string = serverCustomConfigActivity.getString(y46.toast_malformed_json);
                Throwable cause = ((Throwable) this.i0).getCause();
                pu.N(serverCustomConfigActivity, string + " " + (cause != null ? cause.getMessage() : null), null, 6);
                return dn8.a;
            case 3:
                w39.n0(obj);
                Set setKeySet = ((o05) this.h0).a().keySet();
                ArrayList arrayList = new ArrayList(xv0.Z(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((js5) it.next()).a);
                }
                Set set = (Set) this.i0;
                if (set == c87.a) {
                    z2 = true;
                } else {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                                z2 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 4:
                w39.n0(obj);
                if (!((Set) this.h0).isEmpty()) {
                    h57 h57Var = new h57((Set) this.h0, true);
                    f57 f57Var = ((e57) h57Var.e.getValue()).c() ? (f57) h57Var.f.getValue() : null;
                    if (f57Var != null) {
                        int i3 = f57Var.g.c;
                        Integer numValueOf = i3 != -1 ? Integer.valueOf(i3) : null;
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 1;
                        }
                    } else {
                        iIntValue = 1;
                    }
                    synchronized (((kh7) this.i0).d) {
                        kh7Var = (kh7) this.i0;
                        if (kh7Var.i != iIntValue) {
                            kh7Var.i = iIntValue;
                            objArr2 = 1;
                        }
                    }
                    if (objArr2 != 0) {
                        kh7Var.f();
                    }
                }
                return dn8.a;
            case 5:
                w39.n0(obj);
                kh7 kh7Var2 = (kh7) this.h0;
                long j = ((da6) this.i0).X;
                qq8 qq8Var = kh7Var2.e;
                if (qq8Var == null) {
                    kh7Var2.c(new nh0("Camera is not active."));
                } else {
                    synchronized (kh7Var2.d) {
                        objArr = j == kh7Var2.g;
                    }
                    if (objArr != false) {
                        synchronized (kh7Var2.d) {
                            i = kh7Var2.h;
                            i2 = kh7Var2.i;
                            z = kh7Var2.j;
                            num = kh7Var2.k;
                        }
                        int iD = kh7Var2.d(i, z, num);
                        byte b2 = 4;
                        int i4 = (i2 == 1 || i2 != 3) ? 4 : 3;
                        qg5 qg5Var = new qg5(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(vj8.P(kh7Var2.a.b, iD)));
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
                        jj0 jj0Var = kh7Var2.a.b;
                        jj0Var.getClass();
                        if (!vj8.E(jj0Var).contains(Integer.valueOf(i4))) {
                            if (vj8.E(jj0Var).contains(4)) {
                                i4 = 4;
                            } else {
                                i4 = vj8.E(jj0Var).contains(1) ? 1 : 0;
                            }
                        }
                        qg5 qg5Var2 = new qg5(key, Integer.valueOf(i4));
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
                        jj0 jj0Var2 = kh7Var2.a.b;
                        jj0Var2.getClass();
                        try {
                            xg1 xg1VarG = qq8Var.g(zp4.J(qg5Var, qg5Var2, new qg5(key2, Integer.valueOf((vj8.F(jj0Var2).contains(1) || vj8.F(jj0Var2).contains(1)) ? 1 : 0))), pq8.Y, oq8.b);
                            synchronized (kh7Var2.d) {
                                listY0 = wv0.Y0(kh7Var2.f);
                            }
                            ((rm3) xg1VarG).D(new gq6(listY0, kh7Var2, b2));
                        } catch (Exception e) {
                            kh7Var2.c(e);
                        }
                    }
                }
                return dn8.a;
            case 6:
                return u(obj);
            case 7:
                w39.n0(obj);
                b71 b71Var = (b71) this.h0;
                r68 r68Var = (r68) this.i0;
                w51.G(b71Var, null, null, new x48(r68Var, null == true ? 1 : 0, b), 3);
                return w51.G(b71Var, null, null, new x48(r68Var, null == true ? 1 : 0, (byte) 2), 3);
            case 8:
                w39.n0(obj);
                ((h57) this.h0).a(((ug1) this.i0).X);
                return dn8.a;
            case 9:
                h69 h69Var = (h69) this.h0;
                w39.n0(obj);
                XRayPoint xRayPoint = n69.a;
                if (n69.a.getIsRunning()) {
                    h69Var.b();
                    n69.d(h69Var, false, new xl0((Context) this.i0, (byte) 5));
                }
                return dn8.a;
            default:
                w39.n0(obj);
                String str = (String) this.h0;
                XRayTestService xRayTestService = (XRayTestService) this.i0;
                try {
                    a aVar = yw2.b;
                    aVar.getClass();
                    ResolveForPingData resolveForPingData = (ResolveForPingData) aVar.c(str, new yi8(ResolveForPingData.class));
                    of7 of7Var = of7.a;
                    qe4.L0(xRayTestService, "su.happ.proxyutility.action.service", 81, aVar.h(new ResolveForPingResultData(of7.e(resolveForPingData.getConfig(), EPingType.VIA_PROXY_GET), resolveForPingData.getIp(), resolveForPingData.getConfig())));
                    break;
                } catch (Throwable th6) {
                    if ((th6 instanceof InterruptedException) || (th6 instanceof CancellationException)) {
                        throw th6;
                    }
                }
                return dn8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar6(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar6(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = obj;
        this.i0 = obj2;
    }
}
