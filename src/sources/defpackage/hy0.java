package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hy0 implements wv6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hy0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.wv6
    public final Bundle a() {
        qg5[] qg5VarArr;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int i = ComponentActivity.x0;
                Bundle bundle = new Bundle();
                ly0 ly0Var = ((ComponentActivity) obj).k0;
                ly0Var.getClass();
                LinkedHashMap linkedHashMap = ly0Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ly0Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ly0Var.g));
                return bundle;
            case 1:
                Map mapD = ((lv6) obj).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapD.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                AppCompatActivity appCompatActivity = (AppCompatActivity) obj;
                int i2 = FragmentActivity.D0;
                while (FragmentActivity.o(appCompatActivity.n())) {
                }
                appCompatActivity.z0.d(n84.ON_STOP);
                return new Bundle();
            case 3:
                return ((ml2) obj).Y();
            default:
                y5 y5Var = (y5) obj;
                for (Map.Entry entry2 : zp4.Q((LinkedHashMap) y5Var.f0).entrySet()) {
                    y5Var.a0(((oh7) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : zp4.Q((LinkedHashMap) y5Var.Z).entrySet()) {
                    y5Var.a0(((wv6) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) y5Var.Y;
                if (linkedHashMap2.isEmpty()) {
                    qg5VarArr = new qg5[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new qg5((String) entry4.getKey(), entry4.getValue()));
                    }
                    qg5VarArr = (qg5[]) arrayList.toArray(new qg5[0]);
                }
                return dh3.h((qg5[]) Arrays.copyOf(qg5VarArr, qg5VarArr.length));
        }
    }
}
