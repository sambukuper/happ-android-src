package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hl0 implements fg3 {
    public final Context a;
    public final l91 b;
    public final Object c;
    public Map d;

    public hl0(Context context, l91 l91Var, Set set) throws pc3 {
        context.getClass();
        this.a = context;
        l91Var.getClass();
        this.b = l91Var;
        this.c = new Object();
        this.d = e02.X;
        try {
            a(wv0.Y0(set));
        } catch (ll0 e) {
            throw new pc3(e);
        }
    }

    @Override // defpackage.fg3
    public final void a(List list) throws ll0 {
        List<String> listE0;
        m82 lrVar;
        synchronized (this.c) {
            listE0 = wv0.E0(list, this.d.keySet());
        }
        if (!listE0.isEmpty() && hi5.i0("CXCP")) {
            listE0.toString();
        }
        l91 l91Var = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listE0.isEmpty()) {
            try {
                for (String str : listE0) {
                    zh0 zh0VarA = l91Var.a();
                    vi0.a(str);
                    jj0 jj0VarB = zh0.b(zh0VarA, str);
                    CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                    key.getClass();
                    ik0 ik0Var = new ik0(jj0VarB, new vk7((StreamConfigurationMap) ((lf0) jj0VarB).c(key), new ue5(jj0VarB)));
                    Context context = this.a;
                    x02 x02Var = new x02(str, ik0Var.a());
                    if (Build.VERSION.SDK_INT >= 35) {
                        rj0 rj0Var = (rj0) l91Var.a.f0;
                        hi5.R(rj0Var);
                        lrVar = new lr(jj0VarB, rj0Var, ik0Var, (byte) 27);
                    } else {
                        lrVar = m82.o;
                    }
                    linkedHashMap.put(str, new mx7(context, jj0VarB, x02Var, lrVar));
                }
            } catch (ms1 e) {
                throw new ll0("Failed to query camera metadata", e);
            } catch (Exception e2) {
                throw new ll0("Failed to build surface combinations", e2);
            }
        }
        synchronized (this.c) {
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.d.containsKey(str2)) {
                        Object obj = this.d.get(str2);
                        obj.getClass();
                        linkedHashMap2.put(str2, obj);
                    }
                }
                linkedHashMap2.putAll(linkedHashMap);
                this.d = linkedHashMap2;
                if (hi5.i0("CXCP")) {
                    linkedHashMap2.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
