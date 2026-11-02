package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.d;
import io.sentry.c2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class mj0 implements id1, p79, xo2, kz1 {
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;

    public mj0(byte b) {
        this.X = b;
        switch (b) {
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                this.Y = new vu8(true);
                this.Z = new vu8(true);
                break;
            case 17:
                this.Y = new ArrayList();
                float[] fArr = new float[5];
                for (int i = 0; i < 5; i++) {
                    fArr[i] = Float.NaN;
                }
                this.Z = fArr;
                break;
            case 29:
                this.Y = new SparseIntArray();
                this.Z = new SparseIntArray();
                break;
            default:
                this.Y = m02.X;
                this.Z = e02.X;
                break;
        }
    }

    public static int R(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public static mj0 t(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new mj0((Object) channel, (Object) fileLockLock, (byte) 12);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    public static String y(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#r8-abstract-class";
    }

    public void A() {
        ((c15) this.Y).g();
    }

    public void B(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.B(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void C(qk2 qk2Var, boolean z) {
        ml2 ml2Var = (ml2) this.Y;
        AppCompatActivity appCompatActivity = ml2Var.w.C0;
        qk2 qk2Var2 = ml2Var.y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.C(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void D(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.D(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void E(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.E(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void F(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.F(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void G(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.G(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void H(qk2 qk2Var, boolean z) {
        ml2 ml2Var = (ml2) this.Y;
        AppCompatActivity appCompatActivity = ml2Var.w.C0;
        qk2 qk2Var2 = ml2Var.y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.H(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void I(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.I(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void J(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.J(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void K(qk2 qk2Var, Bundle bundle, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.K(qk2Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void L(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.L(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void M(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.M(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    public void N(qk2 qk2Var, View view, boolean z) {
        view.getClass();
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.N(qk2Var, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
                ml2 ml2Var = (ml2) this.Y;
                if (qk2Var == ((qk2) mj0Var.Y)) {
                    mj0 mj0Var2 = ml2Var.o;
                    mj0Var2.getClass();
                    synchronized (((CopyOnWriteArrayList) mj0Var2.Z)) {
                        int size = ((CopyOnWriteArrayList) mj0Var2.Z).size();
                        for (int i = 0; i < size; i++) {
                            if (((cl2) ((CopyOnWriteArrayList) mj0Var2.Z).get(i)).a == mj0Var) {
                                ((CopyOnWriteArrayList) mj0Var2.Z).remove(i);
                                break;
                            }
                        }
                    }
                    kk7.l(view, (FrameLayout) mj0Var.Z);
                } else {
                    continue;
                }
            }
        }
    }

    public void O(qk2 qk2Var, boolean z) {
        qk2 qk2Var2 = ((ml2) this.Y).y;
        if (qk2Var2 != null) {
            qk2Var2.n().o.O(qk2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.Z).iterator();
        it.getClass();
        while (it.hasNext()) {
            cl2 cl2Var = (cl2) it.next();
            if (z) {
                cl2Var.getClass();
            } else {
                mj0 mj0Var = cl2Var.a;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    public a85 P(yi8 yi8Var, boolean z) {
        a85 a85Var;
        String str;
        a85 z31Var;
        final Type type = yi8Var.b;
        Class cls = yi8Var.a;
        Map map = (Map) this.Z;
        om0 om0Var = null;
        if (map.get(type) != null) {
            c2.m();
            return null;
        }
        if (map.get(cls) != null) {
            c2.m();
            return null;
        }
        final byte b = 1;
        final byte b2 = 0;
        if (EnumSet.class.isAssignableFrom(cls)) {
            a85Var = new a85() { // from class: y31
                @Override // defpackage.a85
                public final Object d() {
                    byte b3 = b2;
                    Type type2 = type;
                    switch (b3) {
                        case 0:
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new uo3("Invalid EnumSet type: " + type2);
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new uo3("Invalid EnumSet type: " + type2);
                        default:
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new uo3("Invalid EnumMap type: " + type2);
                            }
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type4 instanceof Class) {
                                return new EnumMap((Class) type4);
                            }
                            throw new uo3("Invalid EnumMap type: " + type2);
                    }
                }
            };
        } else {
            a85Var = cls == EnumMap.class ? new a85() { // from class: y31
                @Override // defpackage.a85
                public final Object d() {
                    byte b3 = b;
                    Type type2 = type;
                    switch (b3) {
                        case 0:
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new uo3("Invalid EnumSet type: " + type2);
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new uo3("Invalid EnumSet type: " + type2);
                        default:
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new uo3("Invalid EnumMap type: " + type2);
                            }
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type4 instanceof Class) {
                                return new EnumMap((Class) type4);
                            }
                            throw new uo3("Invalid EnumMap type: " + type2);
                    }
                }
            } : null;
        }
        if (a85Var != null) {
            return a85Var;
        }
        ch3.A((List) this.Y);
        if (Modifier.isAbstract(cls.getModifiers())) {
            z31Var = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                dh3 dh3Var = ec6.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + ec6.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + ec6.e(e);
                }
                z31Var = str != null ? new z31(str, (byte) 0) : new o61(declaredConstructor, (byte) 7);
            } catch (NoSuchMethodException unused) {
                z31Var = null;
            }
        }
        if (z31Var != null) {
            return z31Var;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                om0Var = new om0((byte) 18);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                om0Var = new om0((byte) 21);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                om0Var = new om0((byte) 22);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                om0Var = new om0((byte) 23);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ya4.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || nr4.A(actualTypeArguments[0]) != String.class) {
                        if (cls.isAssignableFrom(LinkedHashMap.class)) {
                            om0Var = new om0((byte) 25);
                        } else if (cls.isAssignableFrom(TreeMap.class)) {
                            om0Var = new om0((byte) 26);
                        } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                            om0Var = new om0((byte) 19);
                        } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            om0Var = new om0((byte) 20);
                        }
                    }
                }
                om0Var = new om0((byte) 24);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                om0Var = new om0((byte) 25);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                om0Var = new om0((byte) 26);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                om0Var = new om0((byte) 19);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                om0Var = new om0((byte) 20);
            }
        }
        if (om0Var != null) {
            return om0Var;
        }
        String strY = y(cls);
        if (strY != null) {
            return new z31(strY, (byte) 0);
        }
        return !z ? new z31(pc6.n("Unable to create instance of ", cls, "; Register an InstanceCreator or a TypeAdapter for this type."), (byte) 0) : new o61(cls, (byte) 8);
    }

    public Object Q(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.Z;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objB = ((gn2) this.Y).B(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objB);
        return objPutIfAbsent == null ? objB : objPutIfAbsent;
    }

    public void S() {
        ((SparseIntArray) this.Y).clear();
    }

    public void T() throws IOException {
        String str = (String) this.Y;
        if (((FileChannel) this.Z) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.Z = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.Z;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.Z = null;
            throw new IllegalStateException(pc6.p("Unable to lock file: '", str, "'."), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7 A[Catch: IOException | XmlPullParserException -> 0x01fd, IOException | XmlPullParserException -> 0x01fd, TryCatch #0 {IOException | XmlPullParserException -> 0x01fd, blocks: (B:18:0x0056, B:91:0x01f7, B:91:0x01f7, B:26:0x0068, B:27:0x0076, B:29:0x007b, B:32:0x0085, B:40:0x009f, B:35:0x008e, B:38:0x0097, B:41:0x00ad, B:45:0x00bc, B:45:0x00bc, B:47:0x00c4, B:47:0x00c4, B:48:0x00ce, B:48:0x00ce, B:57:0x00f7, B:57:0x00f7, B:58:0x00fe, B:58:0x00fe, B:59:0x0116, B:59:0x0116, B:51:0x00d7, B:51:0x00d7, B:53:0x00df, B:53:0x00df, B:54:0x00ed, B:54:0x00ed, B:60:0x0117, B:60:0x0117, B:62:0x011f, B:62:0x011f, B:63:0x012d, B:63:0x012d, B:66:0x0137, B:66:0x0137, B:67:0x0142, B:67:0x0142, B:68:0x015a, B:68:0x015a, B:69:0x015b, B:69:0x015b, B:72:0x0165, B:72:0x0165, B:73:0x0170, B:73:0x0170, B:74:0x0188, B:74:0x0188, B:75:0x0189, B:75:0x0189, B:77:0x0191, B:77:0x0191, B:78:0x019a, B:78:0x019a, B:81:0x01a4, B:81:0x01a4, B:82:0x01ae, B:82:0x01ae, B:83:0x01c6, B:83:0x01c6, B:84:0x01c7, B:84:0x01c7, B:87:0x01d1, B:87:0x01d1, B:88:0x01db, B:88:0x01db, B:89:0x01f3, B:89:0x01f3, B:90:0x01f4, B:90:0x01f4), top: B:98:0x0056 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void U(Context context, XmlResourceParser xmlResourceParser) {
        d dVar = new d();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    c cVarD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (cVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        cVarD.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (cVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        cVarD.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        cVarD = d.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (cVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        cVarD.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (cVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        cVarD.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        cVarD = d.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        cVarD.d.a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (cVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        v21.a(context, xmlResourceParser, cVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        cVarD = d.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        cVarD.d.h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (cVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        v21.a(context, xmlResourceParser, cVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        cVarD = d.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        dVar.b.put(Integer.valueOf(cVarD.a), cVarD);
                                        cVarD = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        dVar.b.put(Integer.valueOf(cVarD.a), cVarD);
                                        cVarD = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        dVar.b.put(Integer.valueOf(cVarD.a), cVarD);
                                        cVarD = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.Z).put(identifier, dVar);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException | XmlPullParserException unused) {
                }
                ((SparseArray) this.Z).put(identifier, dVar);
                return;
            }
        }
    }

    public void V() {
        try {
            ((FileLock) this.Z).release();
            ((FileChannel) this.Y).close();
        } catch (IOException unused) {
        }
    }

    public InputMethodManager W() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.Z;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.Y).getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.Z = inputMethodManager2;
        return inputMethodManager2;
    }

    public void X(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.Z;
        cardView.i0.set(i, i2, i3, i4);
        Rect rect = cardView.h0;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void Y(nw3 nw3Var, Object obj) {
        nw3Var.getClass();
        if (((zk1) this.Z).a) {
            bt.i("Cannot modify readonly DescriptorRendererOptions");
        } else {
            this.Y = obj;
        }
    }

    @Override // defpackage.p79
    public float a() {
        jj0 jj0Var = ((qj0) this.Y).b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        key.getClass();
        Object objValueOf = Float.valueOf(1.0f);
        lf0 lf0Var = (lf0) jj0Var;
        lf0Var.getClass();
        Object objC = lf0Var.c(key);
        if (objC != null) {
            objValueOf = objC;
        }
        Float f = (Float) objValueOf;
        float fFloatValue = f.floatValue();
        if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d) {
            return f.floatValue();
        }
        hi5.m0();
        return 1.0f;
    }

    public void a0() {
        synchronized (this) {
            ((AtomicInteger) this.Y).decrementAndGet();
            if (((AtomicInteger) this.Y).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // defpackage.xo2
    public void b(Object obj) {
        by7 by7Var = (by7) obj;
        by7Var.getClass();
        ((cy7) ((y5) this.Z).Y).c(by7Var);
    }

    public void b0(int i, nv0 nv0Var) {
        Iterator it = (Iterator) this.Y;
        while (true) {
            Map.Entry entry = (Map.Entry) this.Z;
            if (entry == null || ((zp2) entry.getKey()).X >= i) {
                return;
            }
            zp2 zp2Var = (zp2) ((Map.Entry) this.Z).getKey();
            Object value = ((Map.Entry) this.Z).getValue();
            b92 b92Var = b92.c;
            a39 a39Var = zp2Var.Y;
            short s = zp2Var.X;
            if (zp2Var.Z) {
                for (Object obj : (List) value) {
                    if (a39Var == a39.g0) {
                        nv0Var.g0(s, 3);
                        ((d2) obj).f(nv0Var);
                        nv0Var.g0(s, 4);
                    } else {
                        nv0Var.g0(s, a39Var.Y);
                        b92.k(nv0Var, a39Var, obj);
                    }
                }
            } else if (a39Var == a39.g0) {
                nv0Var.g0(s, 3);
                ((d2) value).f(nv0Var);
                nv0Var.g0(s, 4);
            } else {
                nv0Var.g0(s, a39Var.Y);
                b92.k(nv0Var, a39Var, value);
            }
            if (it.hasNext()) {
                this.Z = (Map.Entry) it.next();
            } else {
                this.Z = null;
            }
        }
    }

    @Override // defpackage.p79
    public float c() {
        return 1.0f;
    }

    @Override // defpackage.id1
    public Object d(hx5 hx5Var, Object obj) {
        return o(hx5Var, obj);
    }

    @Override // defpackage.id1
    public Object e(ot8 ot8Var, Object obj) {
        return null;
    }

    @Override // defpackage.id1
    public Object f(k3 k3Var, Object obj) {
        return null;
    }

    @Override // defpackage.id1
    public Object g(i44 i44Var, Object obj) {
        return null;
    }

    @Override // defpackage.id1
    public Object h(tx5 tx5Var, Object obj) {
        return o(tx5Var, obj);
    }

    @Override // defpackage.kz1
    public Object i() {
        return (qn8) this.Y;
    }

    @Override // defpackage.id1
    public Object j(n74 n74Var, Object obj) {
        return null;
    }

    @Override // defpackage.id1
    public Object k(km1 km1Var, Object obj) {
        return null;
    }

    @Override // defpackage.id1
    public Object l(wx4 wx4Var, Object obj) {
        return null;
    }

    @Override // defpackage.p79
    public xg1 m(qq8 qq8Var) {
        qq8Var.getClass();
        return qq8Var.e(i21.K(CaptureRequest.SCALER_CROP_REGION));
    }

    @Override // defpackage.id1
    public Object n(gx5 gx5Var, Object obj) {
        int i;
        ov3 ov3Var = (ov3) this.Z;
        List listY = gx5Var.Y();
        listY.getClass();
        if (listY.isEmpty()) {
            i = (gx5Var.x0 != null ? 1 : 0) + (gx5Var.y0 != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (gx5Var.j0) {
            if (i == -1) {
                return new oj1(ov3Var, gx5Var, yu3.k);
            }
            if (i == 0) {
                return new ij1(ov3Var, gx5Var, yu3.k);
            }
            if (i == 1) {
                return new kj1(ov3Var, gx5Var, yu3.k);
            }
            if (i == 2) {
                return new mj1(ov3Var, gx5Var, yu3.k);
            }
        } else {
            if (i == -1) {
                return new ik1(ov3Var, gx5Var, yu3.k);
            }
            if (i == 0) {
                return new zj1(ov3Var, gx5Var, yu3.k);
            }
            if (i == 1) {
                return new ck1(ov3Var, gx5Var, yu3.k);
            }
            if (i == 2) {
                return new fk1(ov3Var, gx5Var, yu3.k);
            }
        }
        xw3.j(gx5Var, "Unsupported property: ");
        return null;
    }

    @Override // defpackage.id1
    public Object o(ho2 ho2Var, Object obj) {
        return new gj1((ov3) this.Y, ho2Var);
    }

    @Override // defpackage.p79
    public xg1 p(qq8 qq8Var) {
        qq8Var.getClass();
        Rect rect = (Rect) this.Z;
        if (Math.abs(1.0f) < ((double) Math.ulp(Math.abs(1.0f))) * 2.0d) {
            hi5.m0();
        }
        float fWidth = rect.width() / 1.0f;
        float fHeight = rect.height() / 1.0f;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        Map mapSingletonMap = Collections.singletonMap(CaptureRequest.SCALER_CROP_REGION, new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight)));
        mapSingletonMap.getClass();
        return qq8Var.h(mapSingletonMap, oq8.b);
    }

    @Override // defpackage.id1
    public Object q(sx4 sx4Var, Object obj) {
        return null;
    }

    @Override // defpackage.kz1
    public boolean r(CharSequence charSequence, int i, int i2, oj8 oj8Var) {
        if ((oj8Var.c & 4) > 0) {
            return true;
        }
        if (((qn8) this.Y) == null) {
            this.Y = new qn8(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((be) this.Z).getClass();
        ((qn8) this.Y).setSpan(new pj8(oj8Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.id1
    public Object s(uf5 uf5Var, Object obj) {
        return null;
    }

    public String toString() {
        switch (this.X) {
            case 2:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                c15 c15Var = (c15) this.Y;
                Object[] objArr = c15Var.X;
                int i = c15Var.Z;
                for (int i2 = 0; i2 < i; i2++) {
                    gp0 gp0Var = (gp0) objArr[i2];
                    int i3 = gp0Var.c;
                    int i4 = gp0Var.d;
                    int i5 = gp0Var.a;
                    int i6 = gp0Var.b;
                    StringBuilder sbR = oi0.r(i3, "(", i4, ",", ")->(");
                    sbR.append(i5);
                    sbR.append(",");
                    sbR.append(i6);
                    sbR.append(")");
                    sb.append(sbR.toString());
                    if (i2 < ((c15) this.Y).Z - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            case 9:
                return ((Map) this.Z).toString();
            case 15:
                return "ObservableProperty(value=" + this.Y + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xo2
    public void u(Throwable th) {
        int i = ((xx7) this.Y).f;
        if (i == 2 && (th instanceof CancellationException)) {
            hi5.z0("DualSurfaceProcessorNode");
        } else {
            v18.c(i);
            hi5.z0("DualSurfaceProcessorNode");
        }
    }

    public void v(gp0 gp0Var, int i, int i2, int i3, boolean z) {
        int i4;
        c15 c15Var = (c15) this.Z;
        int i5 = c15Var.Z;
        boolean z2 = true;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 == 0) {
            em7.g("MutableVector is empty.");
            return;
        } else {
            gp0 gp0Var2 = (gp0) c15Var.X[i5 - 1];
            i4 = gp0Var2.b - gp0Var2.d;
        }
        if (gp0Var == null) {
            int i6 = i - i4;
            gp0Var = new gp0(i, z, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (!gp0Var.e && !z) {
                z2 = false;
            }
            gp0Var.e = z2;
            if (gp0Var.a > i) {
                gp0Var.a = i;
                gp0Var.c = i;
            }
            int i7 = gp0Var.b;
            if (i2 > i7) {
                int i8 = i7 - gp0Var.d;
                gp0Var.b = i2;
                gp0Var.d = i2 - i8;
            } else {
                i2 = i7;
            }
            gp0Var.b = i2 + i3;
        }
        c15Var.b(gp0Var);
    }

    public void w(Object obj, float f) {
        ArrayList arrayList = (ArrayList) this.Y;
        arrayList.add(obj);
        if (((float[]) this.Z).length < arrayList.size()) {
            this.Z = Arrays.copyOf((float[]) this.Z, arrayList.size() + 2);
        }
        ((float[]) this.Z)[arrayList.size() - 1] = f;
    }

    public boolean x() {
        synchronized (this) {
            if (((AtomicBoolean) this.Z).get()) {
                return false;
            }
            ((AtomicInteger) this.Y).incrementAndGet();
            return true;
        }
    }

    @Override // defpackage.id1
    public Object z(gs0 gs0Var, Object obj) {
        return o(gs0Var, obj);
    }

    public void Z() {
    }

    public /* synthetic */ mj0(byte b, boolean z) {
        this.X = b;
    }

    public /* synthetic */ mj0(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    public mj0(ov3 ov3Var) {
        this.X = (byte) 10;
        ov3Var.getClass();
        this.Y = ov3Var;
        this.Z = ov3Var;
    }

    public mj0(ml2 ml2Var) {
        this.X = (byte) 24;
        this.Y = ml2Var;
        this.Z = new CopyOnWriteArrayList();
    }

    public mj0(gn2 gn2Var) {
        this.X = (byte) 6;
        this.Y = gn2Var;
        this.Z = new ConcurrentHashMap();
    }

    public mj0(mj0 mj0Var) {
        c15 c15Var;
        this.X = (byte) 2;
        this.Y = new c15(0, new gp0[16]);
        this.Z = new c15(0, new gp0[16]);
        if (mj0Var == null || (c15Var = (c15) mj0Var.Y) == null) {
            return;
        }
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            gp0 gp0Var = (gp0) objArr[i2];
            ((c15) this.Y).b(new gp0(gp0Var.a, gp0Var.e, gp0Var.b, gp0Var.c, gp0Var.d));
        }
    }

    public mj0(String str) {
        this.X = (byte) 22;
        this.Y = str.concat(".lck");
    }

    public mj0(ub ubVar) {
        this.X = (byte) 3;
        this.Y = new AtomicInteger(0);
        this.Z = new AtomicBoolean(false);
    }

    public mj0(String str, Set set) {
        this.X = (byte) 14;
        str.getClass();
        this.Z = str;
        this.Y = set;
    }

    public mj0(qj0 qj0Var) {
        this.X = (byte) 11;
        this.Y = qj0Var;
        jj0 jj0Var = qj0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Object objC = ((lf0) jj0Var).c(key);
        objC.getClass();
        this.Z = (Rect) objC;
    }

    public mj0(View view) {
        this.X = (byte) 5;
        this.Y = view;
    }

    public mj0(Animation animation) {
        this.X = (byte) 23;
        this.Y = animation;
        this.Z = null;
    }

    public mj0(Animator animator) {
        this.X = (byte) 23;
        this.Y = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.Z = animatorSet;
        animatorSet.play(animator);
    }

    public /* synthetic */ mj0(byte b, Object obj, Object obj2, boolean z) {
        this.X = b;
        this.Z = obj;
        this.Y = obj2;
    }

    public mj0(ArrayList arrayList, ArrayList arrayList2) {
        this.X = (byte) 28;
        int size = arrayList.size();
        this.Y = new int[size];
        this.Z = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.Y)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.Z)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public mj0(int i, int i2) {
        this.X = (byte) 28;
        this.Y = new int[]{i, i2};
        this.Z = new float[]{0.0f, 1.0f};
    }

    public mj0(EditText editText) {
        this.X = (byte) 20;
        this.Y = editText;
        rz1 rz1Var = new rz1(editText);
        this.Z = rz1Var;
        editText.addTextChangedListener(rz1Var);
        if (ez1.b == null) {
            synchronized (ez1.a) {
                try {
                    if (ez1.b == null) {
                        ez1 ez1Var = new ez1();
                        try {
                            ez1.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ez1.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        ez1.b = ez1Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(ez1.b);
    }

    public mj0(int i, int i2, int i3) {
        this.X = (byte) 28;
        this.Y = new int[]{i, i2, i3};
        this.Z = new float[]{0.0f, 0.5f, 1.0f};
    }

    public mj0(yp2 yp2Var) {
        this.X = (byte) 27;
        b92 b92Var = yp2Var.X;
        b92Var.getClass();
        Iterator it = ((pt) b92Var.a.entrySet()).iterator();
        this.Y = it;
        if (it.hasNext()) {
            this.Z = (Map.Entry) it.next();
        }
    }

    public mj0(kk7 kk7Var, qk2 qk2Var, FrameLayout frameLayout) {
        this.X = (byte) 25;
        this.Y = qk2Var;
        this.Z = frameLayout;
    }

    public mj0(CardView cardView) {
        this.X = (byte) 1;
        this.Z = cardView;
    }
}
