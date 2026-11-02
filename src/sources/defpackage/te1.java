package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class te1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ue1 b;

    public /* synthetic */ te1(ue1 ue1Var, byte b) {
        this.a = b;
        this.b = ue1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.a) {
            case 0:
                ue1 ue1Var = this.b;
                synchronized (ue1Var) {
                    try {
                        sz2 sz2Var = (sz2) ue1Var.a.get();
                        ArrayList arrayListA = sz2Var.a();
                        synchronized (sz2Var) {
                            sz2Var.a.a(new ya2(sz2Var, (byte) 19));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            my myVar = (my) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", myVar.a);
                            jSONObject.put("dates", new JSONArray((Collection) myVar.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                ue1 ue1Var2 = this.b;
                synchronized (ue1Var2) {
                    sz2 sz2Var2 = (sz2) ue1Var2.a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = ((rg1) ue1Var2.c.get()).a();
                    synchronized (sz2Var2) {
                        sz2Var2.a.a(new sn(sz2Var2, sz2.b(jCurrentTimeMillis), strA, new js5(strA)));
                    }
                }
                return null;
        }
    }
}
