package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jg0 {
    public static final Map c;
    public static final Map d;
    public final ig0 a;
    public final tl7 b;

    static {
        Map mapSingletonMap = Collections.singletonMap("Google", eu.L0(new String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"}));
        mapSingletonMap.getClass();
        c = mapSingletonMap;
        d = zp4.J(new qg5("google", eu.L0(new String[]{"pixel 4", "pixel 4 xl"})), new qg5("samsung", w45.U("sm-g770f")));
    }

    public jg0(ig0 ig0Var, tl7 tl7Var) {
        ig0Var.getClass();
        tl7Var.getClass();
        this.a = ig0Var;
        this.b = tl7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public final boolean a(String str) {
        boolean z;
        str.getClass();
        this.b.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            ij0 ij0Var = jj0.h;
            jj0 jj0VarA = ((hg0) this.a).a(str);
            ij0Var.getClass();
            if (ij0.c(jj0VarA)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z || ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && str.equals("1"));
    }
}
