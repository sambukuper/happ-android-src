package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.LinkedHashMap;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qt2 {
    public final tv a = nr4.g(new jh7(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Code duplicated, block: B:64:0x0085  */
    /* JADX WARN: Code duplicated, block: B:73:0x009c  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ad  */
    public static void b(qt2 qt2Var, s7 s7Var, t7 t7Var, i00 i00Var, qd2 qd2Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        List list4;
        List list5;
        List list6;
        s7 s7Var2 = (i & 1) != 0 ? null : s7Var;
        t7 t7Var2 = (i & 2) != 0 ? null : t7Var;
        i00 i00Var2 = (i & 4) != 0 ? null : i00Var;
        qd2 qd2Var2 = (i & 8) != 0 ? null : qd2Var;
        List list7 = (i & 16) != 0 ? null : list;
        List list8 = (i & 32) != 0 ? null : list2;
        List list9 = (i & 64) != 0 ? null : list3;
        Boolean bool4 = (i & 128) != 0 ? null : bool;
        Boolean bool5 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : bool2;
        Boolean bool6 = (i & 512) != 0 ? null : bool3;
        tv tvVar = qt2Var.a;
        while (true) {
            Object obj = tvVar.a;
            jh7 jh7Var = (jh7) obj;
            s7 s7Var3 = s7Var2 == null ? jh7Var.a : s7Var2;
            t7 t7Var3 = t7Var2 == null ? jh7Var.b : t7Var2;
            i00 i00Var3 = i00Var2 == null ? jh7Var.c : i00Var2;
            Boolean bool7 = bool6;
            qd2 qd2Var3 = qd2Var2 == null ? jh7Var.d : qd2Var2;
            if (list7 == null) {
                list4 = jh7Var.e;
            } else {
                list4 = list7.isEmpty() ? null : list7;
                if (list4 == null) {
                    list4 = jh7Var.e;
                }
            }
            if (list8 == null) {
                list5 = jh7Var.f;
            } else {
                list5 = list8.isEmpty() ? null : list8;
                if (list5 == null) {
                    list5 = jh7Var.f;
                }
            }
            if (list9 == null) {
                list6 = jh7Var.g;
            } else {
                list6 = list9.isEmpty() ? null : list9;
                if (list6 == null) {
                    list6 = jh7Var.g;
                }
            }
            Boolean bool8 = bool4 == null ? jh7Var.h : bool4;
            Boolean bool9 = bool5 == null ? jh7Var.i : bool5;
            Boolean bool10 = bool7 == null ? jh7Var.j : bool7;
            jh7Var.getClass();
            if (tvVar.a(obj, new jh7(s7Var3, t7Var3, i00Var3, qd2Var3, list4, list5, list6, bool8, bool9, bool10))) {
                return;
            } else {
                bool6 = bool7;
            }
        }
    }

    public final LinkedHashMap a() {
        jh7 jh7Var = (jh7) this.a.a;
        jh7Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        s7 s7Var = jh7Var.a;
        if (s7Var != null) {
            int i = s7Var.a;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            key.getClass();
            linkedHashMap.put(key, Integer.valueOf(i));
        }
        t7 t7Var = jh7Var.b;
        if (t7Var != null) {
            byte b = t7Var.a;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            key2.getClass();
            linkedHashMap.put(key2, Integer.valueOf(b));
        }
        i00 i00Var = jh7Var.c;
        if (i00Var != null) {
            byte b2 = i00Var.a;
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
            key3.getClass();
            linkedHashMap.put(key3, Integer.valueOf(b2));
        }
        qd2 qd2Var = jh7Var.d;
        if (qd2Var != null) {
            byte b3 = qd2Var.a;
            CaptureRequest.Key key4 = CaptureRequest.FLASH_MODE;
            key4.getClass();
            linkedHashMap.put(key4, Integer.valueOf(b3));
        }
        List list = jh7Var.e;
        if (list != null) {
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_REGIONS;
            key5.getClass();
            linkedHashMap.put(key5, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = jh7Var.f;
        if (list2 != null) {
            CaptureRequest.Key key6 = CaptureRequest.CONTROL_AF_REGIONS;
            key6.getClass();
            linkedHashMap.put(key6, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = jh7Var.g;
        if (list3 != null) {
            CaptureRequest.Key key7 = CaptureRequest.CONTROL_AWB_REGIONS;
            key7.getClass();
            linkedHashMap.put(key7, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = jh7Var.h;
        if (bool != null) {
            CaptureRequest.Key key8 = CaptureRequest.CONTROL_AE_LOCK;
            key8.getClass();
            linkedHashMap.put(key8, bool);
        }
        Boolean bool2 = jh7Var.j;
        if (bool2 != null) {
            CaptureRequest.Key key9 = CaptureRequest.CONTROL_AWB_LOCK;
            key9.getClass();
            linkedHashMap.put(key9, bool2);
        }
        return linkedHashMap;
    }
}
