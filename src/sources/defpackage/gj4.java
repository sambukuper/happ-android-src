package defpackage;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gj4 implements dh0 {
    public long X;
    public final Object Y;
    public final Object Z;

    public gj4() {
        this.Y = new vu8();
        this.Z = new vu8();
    }

    public static gj4 g(String str) {
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new gj4(0L, str, obj);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new gj4(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }

    @Override // defpackage.dh0
    public d18 a() {
        return (d18) this.Z;
    }

    @Override // defpackage.dh0
    public int b() {
        dh0 dh0Var = (dh0) this.Y;
        if (dh0Var != null) {
            return dh0Var.b();
        }
        return 1;
    }

    @Override // defpackage.dh0
    public ch0 c() {
        dh0 dh0Var = (dh0) this.Y;
        return dh0Var != null ? dh0Var.c() : ch0.X;
    }

    @Override // defpackage.dh0
    public ah0 d() {
        dh0 dh0Var = (dh0) this.Y;
        return dh0Var != null ? dh0Var.d() : ah0.X;
    }

    @Override // defpackage.dh0
    public bh0 e() {
        dh0 dh0Var = (dh0) this.Y;
        return dh0Var != null ? dh0Var.e() : bh0.X;
    }

    public void f(long j, long j2) {
        ((vu8) this.Y).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((vu8) this.Z).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    @Override // defpackage.dh0
    public long getTimestamp() {
        dh0 dh0Var = (dh0) this.Y;
        if (dh0Var != null) {
            return dh0Var.getTimestamp();
        }
        long j = this.X;
        if (j != -1) {
            return j;
        }
        bt.i("No timestamp is available.");
        return 0L;
    }

    public void h(ht4 ht4Var, d53 d53Var, Map map, long j) {
        e86 e86Var = (e86) this.Z;
        long j2 = e86Var.X;
        LinkedHashMap linkedHashMap = (LinkedHashMap) e86Var.Z;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(ht4Var);
            if (objRemove != null) {
                e86Var.Y = e86Var.c() - e86Var.g(ht4Var, objRemove);
                e86Var.b(ht4Var, objRemove, null);
            }
            ((b8) this.Y).r(ht4Var, d53Var, map, j);
            return;
        }
        d86 d86Var = new d86(d53Var, map, j);
        Object objPut = linkedHashMap.put(ht4Var, d86Var);
        e86Var.Y = e86Var.g(ht4Var, d86Var) + e86Var.c();
        if (objPut != null) {
            e86Var.Y = e86Var.c() - e86Var.g(ht4Var, objPut);
            e86Var.b(ht4Var, objPut, d86Var);
        }
        e86Var.h(e86Var.X);
    }

    public gj4(long j, b8 b8Var) {
        this.X = j;
        this.Y = b8Var;
        this.Z = new e86(this, j);
    }

    public /* synthetic */ gj4(long j, Object obj, Object obj2) {
        this.Y = obj;
        this.Z = obj2;
        this.X = j;
    }
}
