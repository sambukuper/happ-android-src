package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jj8 extends g28 {
    public static final Class a;
    public static final Constructor b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    public static boolean p(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.g28
    public final Typeface e(Context context, ui2 ui2Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (vi2 vi2Var : ui2Var.a) {
                int i2 = vi2Var.f;
                File fileH = u28.h(context);
                if (fileH != null) {
                    try {
                        if (u28.b(fileH, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileH);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileH.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileH.delete();
                        }
                        if (map != null && p(objNewInstance, map, vi2Var.e, vi2Var.b, vi2Var.c)) {
                        }
                    } catch (Throwable th3) {
                        fileH.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return q(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.g28
    public final Typeface f(Context context, gj2[] gj2VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            l97 l97Var = new l97(0);
            for (gj2 gj2Var : gj2VarArr) {
                Uri uri = gj2Var.a;
                ByteBuffer byteBufferK = (ByteBuffer) l97Var.get(uri);
                if (byteBufferK == null) {
                    byteBufferK = u28.k(context, uri);
                    l97Var.put(uri, byteBufferK);
                }
                if (byteBufferK != null && p(objNewInstance, byteBufferK, gj2Var.b, gj2Var.c, gj2Var.d)) {
                }
            }
            Typeface typefaceQ = q(objNewInstance);
            if (typefaceQ != null) {
                return Typeface.create(typefaceQ, i);
            }
        }
        return null;
    }
}
