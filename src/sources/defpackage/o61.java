package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.internal.CheckableImageButton;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.android.AndroidDns;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.Question;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.ScScannerActivity;
import su.happ.proxyutility.ui.ScannerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o61 implements sd0, DnsQuery.Factory, p95, u4, a85, r51, f53, kd3, vu, zn2, w4, fa5, p63, j6, bd6, cr0, lx8 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ o61(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.p95
    public w19 C(View view, w19 w19Var) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 2:
                BaseActivity baseActivity = (BaseActivity) obj;
                int i = BaseActivity.P0;
                view.getClass();
                t19 t19Var = w19Var.a;
                baseActivity.J0 = t19Var.h(1).b;
                baseActivity.K0 = t19Var.h(2).d;
                boolean zT = t19Var.t(8);
                int i2 = 0;
                int i3 = zT ? t19Var.h(8).d : 0;
                int i4 = t19Var.h(519).b;
                if (!ue3.y(baseActivity) && zT) {
                    i2 = i3;
                }
                view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), i2);
                break;
            default:
                d08 d08Var = (d08) obj;
                ArrayList arrayList = d08Var.b;
                t19 t19Var2 = w19Var.a;
                fe3 fe3VarB = fe3.b(t19Var2.h(519), t19Var2.h(64));
                fe3 fe3VarB2 = fe3.b(t19Var2.i(519), t19Var2.i(64));
                if (!fe3VarB.equals(d08Var.c) || !fe3VarB2.equals(d08Var.d)) {
                    d08Var.c = fe3VarB;
                    d08Var.d = fe3VarB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        vx5 vx5Var = (vx5) arrayList.get(size);
                        vx5Var.c = fe3VarB;
                        vx5Var.d = fe3VarB2;
                        vx5Var.c();
                    }
                }
                break;
        }
        return w19Var;
    }

    @Override // defpackage.bd6
    public void K(Object obj, ed6 ed6Var) {
        RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = (RemoteListenableDelegatingWorker) this.Y;
        jc4 jc4Var = remoteListenableDelegatingWorker.g;
        d43 d43Var = (d43) obj;
        d43Var.getClass();
        try {
            String string = remoteListenableDelegatingWorker.f.a.toString();
            string.getClass();
            byte[] bArrK = w79.K(new ih5(string, remoteListenableDelegatingWorker.c.get()));
            bArrK.getClass();
            d43Var.l(ed6Var, bArrK);
        } finally {
            jc4Var.b();
        }
    }

    @Override // defpackage.f53
    public void M(s57 s57Var) throws f65, fr0, oj2 {
        ((zz2) this.Y).M(s57Var);
    }

    @Override // defpackage.w4
    /* JADX INFO: renamed from: a */
    public void mo8a(Object obj) {
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 14:
                int i = MainActivity.y1;
                ((oj4) obj2).B(obj);
                break;
            case 15:
                int i2 = MainActivity.y1;
                ((oj4) obj2).B(obj);
                break;
            default:
                int i3 = ScScannerActivity.R0;
                ((t16) obj2).B(obj);
                break;
        }
    }

    @Override // defpackage.vu, defpackage.zn2
    public xb4 apply(Object obj) {
        return (xb4) ((vj2) this.Y).B(obj);
    }

    @Override // defpackage.cr0
    public void b() {
        yg7 yg7Var = (yg7) this.Y;
        CheckableImageButton checkableImageButton = yg7Var.i0;
        ue3.m0(checkableImageButton, yg7Var.n0, checkableImageButton.getContentDescription());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [q51] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // defpackage.j6
    public void c(Object obj) throws IOException {
        InputStream inputStreamOpenInputStream;
        String strE;
        byte b = this.X;
        Uri data = 0;
        Object rj6Var = null;
        Object obj2 = this.Y;
        switch (b) {
            case 20:
                PerAppProxyActivity perAppProxyActivity = (PerAppProxyActivity) obj2;
                i6 i6Var = (i6) obj;
                int i = PerAppProxyActivity.V0;
                i6Var.getClass();
                Intent intent = i6Var.Y;
                data = intent != null ? intent.getData() : 0;
                if (i6Var.X != -1 || data == 0 || (inputStreamOpenInputStream = perAppProxyActivity.getContentResolver().openInputStream(data)) == null) {
                    return;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, iq0.a), 8192);
                try {
                    String strReplace = dt7.e(bufferedReader).replace(',', '\n');
                    strReplace.getClass();
                    if (perAppProxyActivity.B().g(strReplace)) {
                        String string = perAppProxyActivity.getString(y46.toast_success);
                        string.getClass();
                        perAppProxyActivity.C(string, my2.X);
                    } else {
                        String string2 = perAppProxyActivity.getString(y46.toast_failure);
                        string2.getClass();
                        perAppProxyActivity.C(string2, my2.Y);
                    }
                    bufferedReader.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oc.h(bufferedReader, th);
                        throw th2;
                    }
                }
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
            default:
                ServerCustomConfigActivity serverCustomConfigActivity = (ServerCustomConfigActivity) obj2;
                i6 i6Var2 = (i6) obj;
                int i2 = ServerCustomConfigActivity.X0;
                i6Var2.getClass();
                Intent intent2 = i6Var2.Y;
                Uri data2 = intent2 != null ? intent2.getData() : null;
                if (i6Var2.X != -1 || data2 == null) {
                    return;
                }
                try {
                    InputStream inputStreamOpenInputStream2 = serverCustomConfigActivity.getContentResolver().openInputStream(data2);
                    if (inputStreamOpenInputStream2 != null) {
                        try {
                            strE = dt7.e(new BufferedReader(new InputStreamReader(inputStreamOpenInputStream2, iq0.a), 8192));
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                oc.h(inputStreamOpenInputStream2, th3);
                                throw th4;
                            }
                        }
                    } else {
                        strE = null;
                    }
                    serverCustomConfigActivity.C(strE);
                    oc.h(inputStreamOpenInputStream2, null);
                    return;
                } catch (Throwable th5) {
                    if ((th5 instanceof InterruptedException) || (th5 instanceof CancellationException)) {
                        throw th5;
                    }
                    return;
                }
            case 22:
                ScScannerActivity scScannerActivity = (ScScannerActivity) obj2;
                i6 i6Var3 = (i6) obj;
                int i3 = ScScannerActivity.R0;
                i6Var3.getClass();
                if (i6Var3.X == -1) {
                    jm4.Q(ys0.z(scScannerActivity.getH0()), null, new jy2((Object) i6Var3, (Object) scScannerActivity, (q51) data, (byte) 28), 3);
                }
                scScannerActivity.finish();
                return;
            case 24:
                ScannerActivity scannerActivity = (ScannerActivity) obj2;
                Uri uri = (Uri) obj;
                int i4 = ScannerActivity.T0;
                if (uri == null) {
                    scannerActivity.B("empty");
                    return;
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(scannerActivity.getContentResolver().openInputStream(uri));
                    if (bitmapDecodeStream != null) {
                        int i5 = a26.a;
                        String strB = a26.b(bitmapDecodeStream);
                        if (strB != null) {
                            scannerActivity.B(strB);
                        } else {
                            scannerActivity.B("error");
                        }
                        rj6Var = dn8.a;
                    }
                    break;
                } catch (Throwable th6) {
                    if ((th6 instanceof InterruptedException) || (th6 instanceof CancellationException)) {
                        throw th6;
                    }
                    rj6Var = new rj6(th6);
                }
                Throwable thA = sj6.a(rj6Var);
                if (thA != null) {
                    x79.i(scannerActivity, String.valueOf(thA.getMessage()));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.a85
    public Object d() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 7:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    dh3 dh3Var = ec6.a;
                    xw3.o("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + ec6.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    xw3.o("Failed to invoke constructor '" + ec6.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return xn8.a.a(cls);
                } catch (Exception e4) {
                    xw3.o(pc6.n("Unable to create instance of ", cls, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e4);
                    return null;
                }
        }
    }

    public ro0 e(lr lrVar) throws IOException {
        so0 so0Var = (so0) this.Y;
        URL url = (URL) lrVar.Y;
        if (Log.isLoggable(mb6.F("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) lrVar.f0;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    q02 q02Var = so0Var.a;
                    tx txVar = (tx) lrVar.Z;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    sn3 sn3Var = (sn3) q02Var.Y;
                    cs3 cs3Var = new cs3(bufferedWriter, sn3Var.a, sn3Var.b, sn3Var.c, sn3Var.d);
                    cs3Var.f(txVar);
                    cs3Var.h();
                    cs3Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(mb6.F("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    mb6.x(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    mb6.x(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new ro0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new ro0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            ro0 ro0Var = new ro0(responseCode, null, vy.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return ro0Var;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException | UnknownHostException unused) {
            mb6.F("CctTransportBackend");
            return new ro0(500, null, 0L);
        } catch (IOException | z02 unused2) {
            mb6.F("CctTransportBackend");
            return new ro0(400, null, 0L);
        }
    }

    @Override // defpackage.u4
    public boolean f(View view) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.Y;
        int i = BottomSheetDragHandleView.s0;
        return bottomSheetDragHandleView.c();
    }

    @Override // defpackage.r51
    public Object g(fb9 fb9Var) {
        Exception excF;
        y5 y5Var = (y5) this.Y;
        y5Var.getClass();
        if (fb9Var.i() || (excF = fb9Var.f()) == null || TextUtils.isEmpty(excF.getMessage()) || !excF.getMessage().contains("FID_ALREADY_USED:")) {
            return fb9Var;
        }
        ((mb2) ((nb2) y5Var.g0)).c.k0().delete();
        return y5Var.Y();
    }

    public void h() {
        rn2 rn2Var = (rn2) this.Y;
        synchronized (kd7.c) {
            kd7.h = wv0.D0(kd7.h, rn2Var);
        }
    }

    @Override // defpackage.fa5
    public void i(fb9 fb9Var) {
        MainViewModel mainViewModel = (MainViewModel) this.Y;
        jm4.Q(zw8.a(mainViewModel), null, new y9(mainViewModel, (String) fb9Var.g(), null, (byte) 11), 3);
    }

    @Override // defpackage.kd3
    public boolean j(q02 q02Var, int i, Bundle bundle) {
        q41 p41Var;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.Y;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((md3) q02Var.Y).f();
                Parcelable parcelable = (Parcelable) ((md3) q02Var.Y).h();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        md3 md3Var = (md3) q02Var.Y;
        ClipData clipData = new ClipData(md3Var.a(), new ClipData.Item(md3Var.e()));
        if (i2 >= 31) {
            p41Var = new p41(clipData, 2);
        } else {
            r41 r41Var = new r41();
            r41Var.b = clipData;
            r41Var.c = (byte) 2;
            p41Var = r41Var;
        }
        p41Var.b(md3Var.g());
        p41Var.setExtras(bundle);
        return cw8.j(appCompatEditText, p41Var.build()) == null;
    }

    @Override // defpackage.p63
    public void k(q63 q63Var) {
        cv4 cv4Var = (cv4) this.Y;
        synchronized (cv4Var.X) {
            cv4Var.Z++;
        }
        cv4Var.i(q63Var);
    }

    @Override // okhttp3.internal.dns.DnsQuery.Factory
    public DnsQuery newQuery(Question question) {
        return AndroidDns.queryFactory$lambda$0((AndroidDns) this.Y, question);
    }

    @Override // defpackage.sd0
    public Object t(qd0 qd0Var) {
        xb4 xb4VarU;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((rm3) obj).D(new y0((Object) qd0Var, (byte) 19));
                return "Job.asListenableFuture";
            case 4:
                jk0 jk0Var = (jk0) obj;
                synchronized (jk0Var.a) {
                    jk0Var.e = qd0Var;
                    break;
                }
                return "CameraRepository-deinit";
            default:
                zl0 zl0Var = (zl0) obj;
                zl0Var.n.f();
                if (zl0Var.o.d()) {
                    dm6 dm6Var = (dm6) zl0Var.o.getValue();
                    synchronized (dm6Var.a) {
                        dm6Var.b.disable();
                        dm6Var.c.clear();
                        dm6Var.d = -1;
                    }
                }
                jk0 jk0Var2 = zl0Var.a;
                synchronized (jk0Var2.a) {
                    try {
                        boolean zIsEmpty = jk0Var2.b.isEmpty();
                        xb4VarU = jk0Var2.d;
                        if (!zIsEmpty) {
                            if (xb4VarU == null) {
                                xb4VarU = u15.u(new o61(jk0Var2, (byte) 4));
                                jk0Var2.d = xb4VarU;
                            }
                            jk0Var2.c.addAll(jk0Var2.b.values());
                            for (cj0 cj0Var : jk0Var2.b.values()) {
                                cj0Var.a().a(new sc(jk0Var2, cj0Var, (byte) 7), dp1.a());
                            }
                            jk0Var2.b.clear();
                        } else if (xb4VarU == null) {
                            xb4VarU = u73.Z;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                xb4VarU.a(new sc(zl0Var, qd0Var, (byte) 9), zl0Var.d);
                return "CameraX shutdownInternal";
        }
    }

    @Override // defpackage.zn2
    public Object apply(Object obj) {
        return (Void) ((sn) this.Y).B(obj);
    }
}
