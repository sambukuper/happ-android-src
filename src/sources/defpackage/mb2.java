package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mb2 implements nb2 {
    public static final Object l = new Object();
    public final xa2 a;
    public final kb2 b;
    public final zz2 c;
    public final ts8 d;
    public final h44 e;
    public final Object f;
    public final ExecutorService g;
    public final b37 h;
    public String i;
    public final HashSet j;
    public final ArrayList k;

    static {
        new AtomicInteger(1);
    }

    public mb2(xa2 xa2Var, w06 w06Var, ExecutorService executorService, b37 b37Var) {
        xa2Var.a();
        kb2 kb2Var = new kb2(xa2Var.a, w06Var);
        zz2 zz2Var = new zz2((Object) xa2Var, (byte) 21);
        we5 we5Var = we5.Y;
        if (we5Var == null) {
            we5Var = new we5((byte) 29);
            we5.Y = we5Var;
        }
        ts8 ts8Var = ts8.b;
        if (ts8Var == null) {
            ts8Var = new ts8(we5Var);
            ts8.b = ts8Var;
        }
        h44 h44Var = new h44(new qy0(xa2Var, (byte) 2));
        this.f = new Object();
        this.j = new HashSet();
        this.k = new ArrayList();
        this.a = xa2Var;
        this.b = kb2Var;
        this.c = zz2Var;
        this.d = ts8Var;
        this.e = h44Var;
        this.g = executorService;
        this.h = b37Var;
    }

    public final void a() {
        bz bzVarK0;
        byte b;
        synchronized (l) {
            try {
                xa2 xa2Var = this.a;
                xa2Var.a();
                mj0 mj0VarT = mj0.t(xa2Var.a);
                try {
                    bzVarK0 = this.c.K0();
                    int i = bzVarK0.b;
                    b = 1;
                    if (i == 2 || i == 1) {
                        String strF = f(bzVarK0);
                        zz2 zz2Var = this.c;
                        az azVarA = bzVarK0.a();
                        azVarA.a = strF;
                        azVarA.b = 3;
                        bzVarK0 = azVarA.a();
                        zz2Var.r0(bzVarK0);
                    }
                    if (mj0VarT != null) {
                        mj0VarT.V();
                    }
                } catch (Throwable th) {
                    if (mj0VarT != null) {
                        mj0VarT.V();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(bzVarK0);
        this.h.execute(new lb2(this, b));
    }

    public final bz b(bz bzVar) throws ob2 {
        String str;
        pz pzVar;
        pz pzVarF;
        kb2 kb2Var = this.b;
        xa2 xa2Var = this.a;
        xa2Var.a();
        String str2 = xa2Var.c.a;
        String str3 = bzVar.a;
        xa2 xa2Var2 = this.a;
        xa2Var2.a();
        String str4 = xa2Var2.c.h;
        String str5 = bzVar.d;
        xe3 xe3Var = kb2Var.c;
        if (!xe3Var.a()) {
            throw new ob2("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = kb2.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new ob2("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = kb2Var.c(urlA, str2);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    httpURLConnectionC.setDoOutput(true);
                    kb2.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    xe3Var.c(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        pzVarF = kb2.f(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    kb2.b(httpURLConnectionC, null);
                    str = str5;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            pzVar = new pz(3, null, 0L);
                        } else {
                            if (responseCode == 429) {
                                throw new ob2("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                pzVar = new pz(2, null, 0L);
                            }
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                            str5 = str;
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        pzVarF = pzVar;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
                str = str5;
            }
        }
        int iB = p61.B(pzVarF.c);
        if (iB == 0) {
            String str6 = pzVarF.a;
            long j = pzVarF.b;
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            az azVarA = bzVar.a();
            azVarA.c = str6;
            azVarA.e = j;
            byte b = (byte) (azVarA.h | 1);
            azVarA.f = jCurrentTimeMillis;
            azVarA.h = (byte) (b | 2);
            return azVarA.a();
        }
        if (iB == 1) {
            az azVarA2 = bzVar.a();
            azVarA2.g = "BAD CONFIG";
            azVarA2.b = 5;
            return azVarA2.a();
        }
        if (iB != 2) {
            throw new ob2("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.i = null;
        }
        az azVarA3 = bzVar.a();
        azVarA3.b = 2;
        return azVarA3.a();
    }

    public final fb9 c() {
        String str;
        e();
        synchronized (this) {
            str = this.i;
        }
        if (str != null) {
            return g28.l(str);
        }
        z18 z18Var = new z18();
        rr2 rr2Var = new rr2(z18Var);
        synchronized (this.f) {
            this.k.add(rr2Var);
        }
        fb9 fb9Var = z18Var.a;
        this.g.execute(new lb2(this, (byte) 0));
        return fb9Var;
    }

    public final fb9 d() {
        e();
        z18 z18Var = new z18();
        qr2 qr2Var = new qr2(this.d, z18Var);
        synchronized (this.f) {
            this.k.add(qr2Var);
        }
        fb9 fb9Var = z18Var.a;
        this.g.execute(new lb2(this, (byte) 2));
        return fb9Var;
    }

    public final void e() {
        xa2 xa2Var = this.a;
        xa2Var.a();
        w45.r(xa2Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        xa2Var.a();
        w45.r(xa2Var.c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        xa2Var.a();
        w45.r(xa2Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        xa2Var.a();
        String str = xa2Var.c.b;
        Pattern pattern = ts8.a;
        w45.n(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        xa2Var.a();
        w45.n(ts8.a.matcher(xa2Var.c.a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final String f(bz bzVar) {
        ak3 ak3Var;
        String strEncodeToString;
        String str;
        String str2;
        PublicKey publicKeyGeneratePublic;
        xa2 xa2Var = this.a;
        xa2Var.a();
        String str3 = xa2Var.b;
        if (!str3.equals("CHIME_ANDROID_SDK")) {
            xa2Var.a();
            if ("[DEFAULT]".equals(str3)) {
                if (bzVar.b == 1) {
                    ak3Var = ((z43) this.e.get()).a;
                    strEncodeToString = null;
                    str = (String) ak3Var.b(z43.d, null);
                    if (str != null) {
                        strEncodeToString = str;
                    } else {
                        str2 = (String) ak3Var.b(z43.c, null);
                        if (str2 != null) {
                            try {
                                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                                e.toString();
                                publicKeyGeneratePublic = null;
                            }
                            if (publicKeyGeneratePublic != null) {
                                try {
                                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                                    bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                                    strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
                                } catch (NoSuchAlgorithmException unused) {
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(strEncodeToString)) {
                        return n66.a();
                    }
                    return strEncodeToString;
                }
            }
        } else if (bzVar.b == 1) {
            ak3Var = ((z43) this.e.get()).a;
            strEncodeToString = null;
            str = (String) ak3Var.b(z43.d, null);
            if (str != null) {
                strEncodeToString = str;
            } else {
                str2 = (String) ak3Var.b(z43.c, null);
                if (str2 != null) {
                    publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                    if (publicKeyGeneratePublic != null) {
                        byte[] bArrDigest2 = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                        bArrDigest2[0] = (byte) (((bArrDigest2[0] & 15) + 112) & 255);
                        strEncodeToString = Base64.encodeToString(bArrDigest2, 0, 8, 11);
                    }
                }
            }
            if (TextUtils.isEmpty(strEncodeToString)) {
                return n66.a();
            }
            return strEncodeToString;
        }
        return n66.a();
    }

    public final bz g(bz bzVar) throws ob2 {
        py pyVarE;
        String str = bzVar.a;
        String string = null;
        if (str != null && str.length() == 11) {
            z43 z43Var = (z43) this.e.get();
            z43Var.getClass();
            for (String str2 : z43.e) {
                String str3 = (String) z43Var.a.b(new js5(oi0.m("|T|", z43Var.b, "|", str2)), null);
                if (str3 != null && !str3.isEmpty()) {
                    if (!str3.startsWith("{")) {
                        string = str3;
                        break;
                    }
                    try {
                        string = new JSONObject(str3).getString("token");
                        break;
                    } catch (JSONException unused) {
                        break;
                    }
                }
            }
        }
        xa2 xa2Var = this.a;
        xa2Var.a();
        String str4 = xa2Var.c.a;
        xa2Var.a();
        String str5 = xa2Var.c.h;
        xa2Var.a();
        String str6 = xa2Var.c.b;
        kb2 kb2Var = this.b;
        xe3 xe3Var = kb2Var.c;
        if (!xe3Var.a()) {
            throw new ob2("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = kb2.a("projects/" + str5 + "/installations");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new ob2("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = kb2Var.c(urlA, str4);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    kb2.g(httpURLConnectionC, str, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    xe3Var.c(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        pyVarE = kb2.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    kb2.b(httpURLConnectionC, str6);
                    if (responseCode == 429) {
                        throw new ob2("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        py pyVar = new py(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        pyVarE = pyVar;
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (IOException | AssertionError unused2) {
                }
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        int iB = p61.B(pyVarE.e);
        if (iB != 0) {
            if (iB != 1) {
                throw new ob2("Firebase Installations Service is unavailable. Please try again later.");
            }
            az azVarA = bzVar.a();
            azVarA.g = "BAD CONFIG";
            azVarA.b = 5;
            return azVarA.a();
        }
        String str7 = pyVarE.b;
        String str8 = pyVarE.c;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        pz pzVar = pyVarE.d;
        String str9 = pzVar.a;
        long j = pzVar.b;
        az azVarA2 = bzVar.a();
        azVarA2.a = str7;
        azVarA2.b = 4;
        azVarA2.c = str9;
        azVarA2.d = str8;
        azVarA2.e = j;
        byte b = (byte) (azVarA2.h | 1);
        azVarA2.f = jCurrentTimeMillis;
        azVarA2.h = (byte) (b | 2);
        return azVarA2.a();
    }

    public final void h(Exception exc) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((xh7) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(bz bzVar) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((xh7) it.next()).b(bzVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
