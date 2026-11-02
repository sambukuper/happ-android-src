package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sj0 {
    public static final xu4 a;
    public static final xu4 b;
    public static final xu4 c;

    static {
        HashMap map = xu4.c;
        zb6 zb6Var = yb6.a;
        a = nr4.o(zb6Var.b(Integer.class), "androidx.camera.camera2.pipe.extensionMode");
        b = nr4.o(zb6Var.b(Object.class), "androidx.camera.camera2.pipe.captureRequestTag");
        c = nr4.o(zb6Var.b(Boolean.class), "androidx.camera.camera2.pipe.ignore3ARequiredParameters");
    }
}
