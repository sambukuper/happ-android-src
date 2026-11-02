package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import su.happ.proxyutility.dto.AuthData;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.enums.InboundAuthMode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class c16 {
    public final Context a;
    public final vz7 b = new vz7(new dw4((byte) 27));
    public final vz7 c = new vz7(new dw4((byte) 28));
    public final vz7 d;
    public String e;
    public Network f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c16(Context context) {
        this.a = context;
        final byte b = 0;
        vz7 vz7Var = new vz7(new dn2(this) { // from class: y06
            public final /* synthetic */ c16 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b2 = b;
                c16 c16Var = this.Y;
                switch (b2) {
                    case 0:
                        Object systemService = c16Var.a.getSystemService("connectivity");
                        if (systemService instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService;
                        }
                        return null;
                    default:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        return c16Var.a(builder.callTimeout(7000L, timeUnit).readTimeout(7000L, timeUnit).writeTimeout(7000L, timeUnit).connectTimeout(7000L, timeUnit), 7000).build();
                }
            }
        });
        this.d = vz7Var;
        this.g = "happ_user";
        this.i = "happ_user";
        try {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().removeCapability(15).build();
            b16 b16Var = new b16(this);
            ConnectivityManager connectivityManager = (ConnectivityManager) vz7Var.getValue();
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(networkRequestBuild, b16Var);
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        final byte b2 = 1;
        new vz7(new dn2(this) { // from class: y06
            public final /* synthetic */ c16 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b3 = b2;
                c16 c16Var = this.Y;
                switch (b3) {
                    case 0:
                        Object systemService = c16Var.a.getSystemService("connectivity");
                        if (systemService instanceof ConnectivityManager) {
                            return (ConnectivityManager) systemService;
                        }
                        return null;
                    default:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        return c16Var.a(builder.callTimeout(7000L, timeUnit).readTimeout(7000L, timeUnit).writeTimeout(7000L, timeUnit).connectTimeout(7000L, timeUnit), 7000).build();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c() {
        ArrayList arrayListA0 = xv0.a0(i21.L(new bq0[]{new bq0('0', '9'), new bq0('a', 'z'), new bq0('A', 'Z')}));
        kf3 kf3VarA0 = x97.a0(0, 12);
        ArrayList arrayList = new ArrayList(xv0.Z(kf3VarA0, 10));
        jf3 it = kf3VarA0.iterator();
        while (true) {
            jf3 jf3Var = it;
            if (!jf3Var.Z) {
                break;
            }
            jf3Var.nextInt();
            l66 l66Var = m66.X;
            arrayList.add(Integer.valueOf(m66.Y.g(arrayListA0.size())));
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Character ch = (Character) arrayListA0.get(((Number) it2.next()).intValue());
            ch.getClass();
            arrayList2.add(ch);
        }
        return wv0.y0(arrayList2, "", (String) null, (String) null, (gn2) null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OkHttpClient.Builder a(OkHttpClient.Builder builder, int i) {
        builder.getClass();
        h();
        if (!g()) {
            return builder;
        }
        ss8 ss8Var = ss8.a;
        ss8.t();
        String str = this.h;
        if (str != null) {
            OkHttpClient.Builder builderSocketFactory = builder.socketFactory(new rw(this.g, n67.d(), i, str));
            if (builderSocketFactory != null) {
                return builderSocketFactory;
            }
        }
        return builder.proxy(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", n67.d())));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:110:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f4 A[Catch: all -> 0x0388, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0206  */
    /* JADX WARN: Code duplicated, block: B:116:0x0207 A[Catch: all -> 0x0388, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x021d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0220  */
    /* JADX WARN: Code duplicated, block: B:124:0x0223  */
    /* JADX WARN: Code duplicated, block: B:126:0x0226 A[Catch: all -> 0x0388, TRY_ENTER, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x022d A[Catch: all -> 0x0388, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0233 A[Catch: all -> 0x0388, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x023f  */
    /* JADX WARN: Code duplicated, block: B:134:0x024c  */
    /* JADX WARN: Code duplicated, block: B:135:0x024d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0254 A[Catch: all -> 0x0388, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x025e A[Catch: all -> 0x0388, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0267 A[Catch: all -> 0x0388, TRY_LEAVE, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003e A[Catch: all -> 0x0388, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x029d A[Catch: all -> 0x029a, TryCatch #5 {all -> 0x029a, blocks: (B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:224:0x0276, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f6 A[Catch: all -> 0x029a, TryCatch #5 {all -> 0x029a, blocks: (B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:224:0x0276, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x032d  */
    /* JADX WARN: Code duplicated, block: B:175:0x032e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0331 A[Catch: all -> 0x029a, TryCatch #5 {all -> 0x029a, blocks: (B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:224:0x0276, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x034c  */
    /* JADX WARN: Code duplicated, block: B:188:0x035b A[Catch: all -> 0x029a, TryCatch #5 {all -> 0x029a, blocks: (B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:224:0x0276, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x036c  */
    /* JADX WARN: Code duplicated, block: B:205:0x037c A[Catch: all -> 0x0388, TryCatch #3 {all -> 0x0388, blocks: (B:3:0x0004, B:5:0x0011, B:6:0x0016, B:11:0x002b, B:15:0x0047, B:23:0x0071, B:108:0x01df, B:113:0x01f4, B:117:0x0210, B:126:0x0226, B:206:0x0384, B:127:0x022d, B:128:0x0232, B:129:0x0233, B:132:0x0240, B:136:0x024e, B:137:0x0254, B:138:0x025e, B:140:0x0267, B:205:0x037c, B:204:0x037b, B:116:0x0207, B:25:0x007a, B:26:0x007f, B:27:0x0080, B:30:0x008d, B:33:0x009a, B:34:0x009f, B:35:0x00a8, B:37:0x00b0, B:106:0x01d4, B:107:0x01d5, B:14:0x003e, B:99:0x01c9, B:101:0x01cd, B:104:0x01d2, B:197:0x0370, B:199:0x0374, B:202:0x0379, B:143:0x0276, B:145:0x0282, B:148:0x0289, B:152:0x02b5, B:157:0x02c5, B:159:0x02cf, B:160:0x02f0, B:162:0x02f6, B:164:0x0313, B:168:0x031f, B:170:0x0323, B:172:0x0329, B:177:0x0331, B:179:0x033b, B:181:0x0347, B:184:0x034f, B:186:0x0355, B:189:0x035d, B:191:0x0361, B:193:0x0367, B:195:0x036d, B:188:0x035b, B:151:0x029d), top: B:221:0x0004, inners: #1, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x031e A[SYNTHETIC] */
    public final void b(String str) {
        InboundAuthMode inboundAuthMode;
        vz7 vz7Var;
        bq3 bq3Var;
        en3 en3Var;
        Object objB;
        bo3 bo3VarJ;
        String strD;
        bo3 bo3VarJ2;
        bo3 bo3VarJ3;
        bo3 bo3Var;
        int iE;
        Integer numValueOf;
        InboundAuthMode inboundAuthMode2;
        int i;
        ServerConfig serverConfigB;
        String strI;
        bq3 bq3Var2;
        en3 en3Var2;
        md8 md8VarL0;
        Iterator it;
        Object objB2;
        bq3 bq3Var3;
        bo3 bo3VarJ4;
        bo3 bo3VarJ5;
        bq3 bq3VarC;
        String strD2;
        String strD3;
        bo3 bo3VarJ6;
        bo3 bo3VarJ7;
        bo3 bo3Var2;
        bq3 bq3Var4;
        String strJ;
        String strJ2;
        try {
            if (e().c("pref_proxy_sharing_enabled", false)) {
                i();
                return;
            }
            int iE2 = e().e(-1, "pref_socks_auth_mode");
            Integer numValueOf2 = Integer.valueOf(iE2);
            if (iE2 == -1) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                inboundAuthMode = (InboundAuthMode) InboundAuthMode.b().get(numValueOf2.intValue());
                if (inboundAuthMode == null) {
                    InboundAuthMode.INSTANCE.getClass();
                    inboundAuthMode = InboundAuthMode.f5default;
                }
            } else {
                InboundAuthMode.INSTANCE.getClass();
                inboundAuthMode = InboundAuthMode.f5default;
            }
            int i2 = z06.b[inboundAuthMode.ordinal()];
            vz7 vz7Var2 = this.c;
            String str2 = "";
            if (i2 == 1) {
                kw4 kw4Var = kw4.a;
                ServerConfig serverConfigB2 = kw4.b(str);
                if (serverConfigB2 != null) {
                    if (z06.a[serverConfigB2.getConfigType().ordinal()] == 1) {
                        try {
                            String strI2 = ((MMKV) vz7Var2.getValue()).i(str);
                            if (strI2 == null || fm7.o0(strI2)) {
                                a aVar = yw2.c;
                                String strValueOf = String.valueOf(serverConfigB2.getFullConfig());
                                aVar.getClass();
                                bq3Var = (bq3) aVar.c(strValueOf, new yi8(bq3.class));
                            } else {
                                a aVar2 = yw2.c;
                                aVar2.getClass();
                                bq3Var = (bq3) aVar2.c(strI2, new yi8(bq3.class));
                            }
                            bq3 bq3Var5 = bq3Var;
                            int iD = n67.d();
                            if (!bq3Var5.X.containsKey("inbounds")) {
                                bq3Var5 = null;
                            }
                            if (bq3Var5 != null && (en3Var = (en3) bq3Var5.X.get("inbounds")) != null) {
                                vz7Var = vz7Var2;
                                try {
                                    md8 md8VarL1 = w27.l0(new la2(new hu(en3Var, (byte) 1), true, new zw5((byte) 2)), new zw5((byte) 3));
                                    Iterator it2 = md8VarL1.a.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            objB = null;
                                            break;
                                        }
                                        objB = md8VarL1.b.B(it2.next());
                                        bq3 bq3Var6 = (bq3) objB;
                                        md8 md8Var = md8VarL1;
                                        Iterator it3 = it2;
                                        if (dh3.f(bq3Var6.j("protocol").d(), "socks") && bq3Var6.j("port").a() == iD) {
                                            break;
                                        }
                                        it2 = it3;
                                        md8VarL1 = md8Var;
                                    }
                                    bq3 bq3Var7 = (bq3) objB;
                                    if (bq3Var7 != null && (bo3VarJ = bq3Var7.j("settings")) != null) {
                                        if (!(bo3VarJ instanceof bq3)) {
                                            bo3VarJ = null;
                                        }
                                        if (bo3VarJ != null) {
                                            bo3 bo3VarJ8 = bo3VarJ.c().j("accounts");
                                            bq3 bq3VarC2 = (bo3VarJ8 == null || (bo3Var = (bo3) wv0.q0(bo3VarJ8.b())) == null) ? null : bo3Var.c();
                                            if (bq3VarC2 == null || (bo3VarJ3 = bq3VarC2.j("user")) == null || (strD = bo3VarJ3.d()) == null) {
                                                strD = this.g;
                                            }
                                            this.g = strD;
                                            this.h = (bq3VarC2 == null || (bo3VarJ2 = bq3VarC2.j("pass")) == null) ? null : bo3VarJ2.d();
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            vz7Var = vz7Var2;
                        }
                    } else {
                        vz7Var = vz7Var2;
                        this.g = "happ-socks";
                        this.h = c();
                    }
                }
                iE = e().e(-1, "pref_http_auth_mode");
                numValueOf = Integer.valueOf(iE);
                if (iE != -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    inboundAuthMode2 = (InboundAuthMode) InboundAuthMode.b().get(numValueOf.intValue());
                    if (inboundAuthMode2 != null) {
                        InboundAuthMode.INSTANCE.getClass();
                        inboundAuthMode2 = InboundAuthMode.f5default;
                    }
                } else {
                    InboundAuthMode.INSTANCE.getClass();
                    inboundAuthMode2 = InboundAuthMode.f5default;
                }
                i = z06.b[inboundAuthMode2.ordinal()];
                if (i != 1) {
                    kw4 kw4Var2 = kw4.a;
                    serverConfigB = kw4.b(str);
                    if (serverConfigB != null) {
                        if (z06.a[serverConfigB.getConfigType().ordinal()] == 1) {
                            try {
                                strI = ((MMKV) vz7Var.getValue()).i(str);
                                if (strI != null || fm7.o0(strI)) {
                                    a aVar3 = yw2.c;
                                    String strValueOf2 = String.valueOf(serverConfigB.getFullConfig());
                                    aVar3.getClass();
                                    bq3Var2 = (bq3) aVar3.c(strValueOf2, new yi8(bq3.class));
                                } else {
                                    a aVar4 = yw2.c;
                                    aVar4.getClass();
                                    bq3Var2 = (bq3) aVar4.c(strI, new yi8(bq3.class));
                                }
                                int iB = n67.b();
                                if (bq3Var2.X.containsKey("inbounds")) {
                                    bq3Var2 = null;
                                }
                                if (bq3Var2 != null && (en3Var2 = (en3) bq3Var2.X.get("inbounds")) != null) {
                                    md8VarL0 = w27.l0(new la2(new hu(en3Var2, (byte) 1), true, new zw5((byte) 4)), new zw5((byte) 5));
                                    it = md8VarL0.a.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            objB2 = null;
                                            break;
                                        }
                                        objB2 = md8VarL0.b.B(it.next());
                                        bq3Var4 = (bq3) objB2;
                                        if (!dh3.f(bq3Var4.j("protocol").d(), "http") && bq3Var4.j("port").a() == iB) {
                                            break;
                                        }
                                    }
                                    bq3Var3 = (bq3) objB2;
                                    if (bq3Var3 != null && (bo3VarJ4 = bq3Var3.j("settings")) != null) {
                                        if (bo3VarJ4 instanceof bq3) {
                                            bo3VarJ4 = null;
                                        }
                                        if (bo3VarJ4 != null) {
                                            bo3VarJ5 = bo3VarJ4.c().j("accounts");
                                            if (bo3VarJ5 != null || (bo3Var2 = (bo3) wv0.q0(bo3VarJ5.b())) == null) {
                                                bq3VarC = null;
                                            } else {
                                                bq3VarC = bo3Var2.c();
                                            }
                                            if (bq3VarC != null || (bo3VarJ7 = bq3VarC.j("user")) == null || (strD2 = bo3VarJ7.d()) == null) {
                                                strD2 = this.i;
                                            }
                                            this.i = strD2;
                                            if (bq3VarC != null || (bo3VarJ6 = bq3VarC.j("pass")) == null) {
                                                strD3 = null;
                                            } else {
                                                strD3 = bo3VarJ6.d();
                                            }
                                            this.j = strD3;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                                    throw th3;
                                }
                            }
                        } else {
                            this.i = "happ-http";
                            this.j = c();
                        }
                    }
                } else if (i != 2) {
                    this.i = "happ-http";
                    this.j = c();
                } else if (i != 3) {
                    strJ = e().j("pref_http_auth_manual_user", "");
                    if (strJ == null) {
                        strJ = "";
                    }
                    strJ2 = e().j("pref_http_auth_manual_pass", "");
                    if (strJ2 == null) {
                        str2 = strJ2;
                    }
                    this.i = strJ;
                    this.j = str2;
                } else {
                    if (i == 4) {
                        throw new b55();
                    }
                    this.i = "happ-http";
                    this.j = null;
                }
                j();
            }
            if (i2 == 2) {
                this.g = "happ-socks";
                this.h = c();
            } else if (i2 == 3) {
                String strJ3 = e().j("pref_socks_auth_manual_user", "");
                if (strJ3 == null) {
                    strJ3 = "";
                }
                String strJ4 = e().j("pref_socks_auth_manual_pass", "");
                if (strJ4 == null) {
                    strJ4 = "";
                }
                this.g = strJ3;
                this.h = strJ4;
            } else {
                if (i2 != 4) {
                    throw new b55();
                }
                this.g = "happ-socks";
                this.h = null;
            }
            vz7Var = vz7Var2;
            iE = e().e(-1, "pref_http_auth_mode");
            numValueOf = Integer.valueOf(iE);
            if (iE != -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                inboundAuthMode2 = (InboundAuthMode) InboundAuthMode.b().get(numValueOf.intValue());
                if (inboundAuthMode2 != null) {
                    InboundAuthMode.INSTANCE.getClass();
                    inboundAuthMode2 = InboundAuthMode.f5default;
                }
            } else {
                InboundAuthMode.INSTANCE.getClass();
                inboundAuthMode2 = InboundAuthMode.f5default;
            }
            i = z06.b[inboundAuthMode2.ordinal()];
            if (i != 1) {
                kw4 kw4Var3 = kw4.a;
                serverConfigB = kw4.b(str);
                if (serverConfigB != null) {
                    if (z06.a[serverConfigB.getConfigType().ordinal()] == 1) {
                        strI = ((MMKV) vz7Var.getValue()).i(str);
                        if (strI != null) {
                            a aVar5 = yw2.c;
                            String strValueOf3 = String.valueOf(serverConfigB.getFullConfig());
                            aVar5.getClass();
                            bq3Var2 = (bq3) aVar5.c(strValueOf3, new yi8(bq3.class));
                        } else {
                            a aVar6 = yw2.c;
                            String strValueOf4 = String.valueOf(serverConfigB.getFullConfig());
                            aVar6.getClass();
                            bq3Var2 = (bq3) aVar6.c(strValueOf4, new yi8(bq3.class));
                        }
                        int iB2 = n67.b();
                        if (bq3Var2.X.containsKey("inbounds")) {
                            bq3Var2 = null;
                        }
                        if (bq3Var2 != null) {
                            md8VarL0 = w27.l0(new la2(new hu(en3Var2, (byte) 1), true, new zw5((byte) 4)), new zw5((byte) 5));
                            it = md8VarL0.a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    objB2 = null;
                                    break;
                                } else {
                                    objB2 = md8VarL0.b.B(it.next());
                                    bq3Var4 = (bq3) objB2;
                                    if (!dh3.f(bq3Var4.j("protocol").d(), "http")) {
                                    }
                                }
                            }
                            bq3Var3 = (bq3) objB2;
                            if (bq3Var3 != null) {
                                if (bo3VarJ4 instanceof bq3) {
                                    bo3VarJ4 = null;
                                }
                                if (bo3VarJ4 != null) {
                                    bo3VarJ5 = bo3VarJ4.c().j("accounts");
                                    if (bo3VarJ5 != null) {
                                        bq3VarC = null;
                                    } else {
                                        bq3VarC = null;
                                    }
                                    if (bq3VarC != null) {
                                        strD2 = this.i;
                                    } else {
                                        strD2 = this.i;
                                    }
                                    this.i = strD2;
                                    if (bq3VarC != null) {
                                        strD3 = null;
                                    } else {
                                        strD3 = null;
                                    }
                                    this.j = strD3;
                                }
                            }
                        }
                    } else {
                        this.i = "happ-http";
                        this.j = c();
                    }
                }
            } else if (i != 2) {
                this.i = "happ-http";
                this.j = c();
            } else if (i != 3) {
                strJ = e().j("pref_http_auth_manual_user", "");
                if (strJ == null) {
                    strJ = "";
                }
                strJ2 = e().j("pref_http_auth_manual_pass", "");
                if (strJ2 == null) {
                    str2 = strJ2;
                }
                this.i = strJ;
                this.j = str2;
            } else {
                if (i == 4) {
                    throw new b55();
                }
                this.i = "happ-http";
                this.j = null;
            }
            j();
        } catch (Throwable th4) {
            if ((th4 instanceof InterruptedException) || (th4 instanceof CancellationException)) {
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AuthData d() {
        h();
        return new AuthData(this.i, this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MMKV e() {
        return (MMKV) this.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AuthData f() {
        h();
        return new AuthData(this.g, this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        dn8 rj6Var;
        try {
            new Socket("127.0.0.1", n67.d()).close();
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (!(rj6Var instanceof rj6)) {
            if (Build.VERSION.SDK_INT >= 30 ? dh3.f(this.e, "su.happ.proxyutility") : true) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        Boolean rj6Var;
        try {
            String strI = e().i("proxy_controller_auth_data");
            if (strI != null) {
                Map map = (Map) yw2.c.d(strI, ((yi8) new a16()).b);
                map.getClass();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    AuthData authData = (AuthData) entry.getValue();
                    if (dh3.f(str, "SOCKS")) {
                        this.g = authData.getUser();
                        this.h = authData.getPassword();
                    } else if (dh3.f(str, "HTTP")) {
                        this.i = authData.getUser();
                        this.j = authData.getPassword();
                    }
                }
            }
            rj6Var = Boolean.TRUE;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Boolean bool = Boolean.FALSE;
        if (rj6Var instanceof rj6) {
            rj6Var = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        try {
            this.g = "happ_user";
            this.h = null;
            this.i = "happ_user";
            this.j = null;
            j();
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Serializable j() {
        try {
            return Boolean.valueOf(e().q("proxy_controller_auth_data", yw2.c.h(zp4.J(new qg5[]{new qg5("SOCKS", new AuthData(this.g, this.h)), new qg5("HTTP", new AuthData(this.i, this.j))}))));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }
}
