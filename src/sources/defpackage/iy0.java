package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iy0 implements ia5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ iy0(ComponentActivity componentActivity, byte b) {
        this.a = b;
        this.b = componentActivity;
    }

    @Override // defpackage.ia5
    public final void a(ComponentActivity componentActivity) {
        byte b = this.a;
        ComponentActivity componentActivity2 = this.b;
        switch (b) {
            case 0:
                int i = ComponentActivity.x0;
                componentActivity.getClass();
                Bundle bundleI = ((xd6) componentActivity2.f0.Z).i("android:support:activity-result");
                if (bundleI != null) {
                    ly0 ly0Var = componentActivity2.k0;
                    LinkedHashMap linkedHashMap = ly0Var.b;
                    LinkedHashMap linkedHashMap2 = ly0Var.a;
                    Bundle bundle = ly0Var.g;
                    ArrayList<Integer> integerArrayList = bundleI.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleI.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleI.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            ly0Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleI.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    ci8.f(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            ly0Var.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                int i3 = FragmentActivity.D0;
                tk2 tk2Var = (tk2) ((AppCompatActivity) componentActivity2).y0.Y;
                tk2Var.E0.b(tk2Var, tk2Var, null);
                break;
        }
    }
}
