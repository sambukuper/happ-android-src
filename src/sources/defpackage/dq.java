package defpackage;

import android.R;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import coil3.compose.AsyncImagePainter;
import defpackage.dh3;
import defpackage.og5;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class dq implements ye3, xo2, lv1, lu0, vl, jm, r18, rr6 {
    public static final int[] f0 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final dq g0;
    public static final Object h0;
    public static j39 i0;
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        g0 = new dq((Object) new rg5(fValueOf2, fValueOf2), (Object) new rg5(fValueOf, fValueOf), (byte) 1);
        h0 = new Object();
    }

    public dq(byte b) {
        this.X = b;
        d02 d02Var = d02.X;
        switch (b) {
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                this.Y = new qc6();
                this.Z = nr4.g(d02Var);
                break;
            case 29:
                hj0 hj0Var = new hj0();
                hj0Var.a = nr4.g(d02Var);
                this.Y = hj0Var;
                this.Z = new dq((byte) 28);
                break;
            default:
                this.Y = Choreographer.getInstance();
                this.Z = Looper.myLooper();
                break;
        }
    }

    public static fb9 j(Context context, Intent intent, boolean z) {
        j39 j39Var;
        synchronized (h0) {
            try {
                j39Var = i0;
                if (j39Var == null) {
                    j39Var = new j39(context);
                    i0 = j39Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return j39Var.b(intent).d(new nd((byte) 2), new u52((byte) 2));
        }
        if (z47.H().L(context)) {
            synchronized (i21.f0) {
                try {
                    i21.n(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        i21.g0.a();
                    }
                    j39Var.b(intent).a(new j78(intent, (byte) 3));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            j39Var.b(intent);
        }
        return g28.l(-1);
    }

    public static g94 s(v63 v63Var) {
        r18 r18Var = v63Var.c;
        Object context = r18Var instanceof lq2 ? ((lq2) r18Var).getView().getContext() : v63Var.a;
        while (!(context instanceof d94)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((d94) context).getH0();
    }

    public static boolean y(v63 v63Var, Bitmap.Config config) {
        if (!ue3.z(config)) {
            return true;
        }
        if (!((Boolean) z68.F(v63Var, b73.g)).booleanValue()) {
            return false;
        }
        r18 r18Var = v63Var.c;
        if (!(r18Var instanceof lq2)) {
            return true;
        }
        View view = ((lq2) r18Var).getView();
        return !view.isAttachedToWindow() || view.isHardwareAccelerated();
    }

    public void A(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.X) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.Y;
                zv7 zv7VarR = zv7.r(i, 0, absSeekBar.getContext(), attributeSet, f0);
                Drawable drawableF = zv7VarR.f(0);
                if (drawableF != null) {
                    if (drawableF instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableF;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableN = N(animationDrawable.getFrame(i2), true);
                            drawableN.setLevel(10000);
                            animationDrawable2.addFrame(drawableN, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableF = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableF);
                }
                Drawable drawableF2 = zv7VarR.f(1);
                if (drawableF2 != null) {
                    absSeekBar.setProgressDrawable(N(drawableF2, false));
                }
                zv7VarR.v();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.Y).getContext().obtainStyledAttributes(attributeSet, h66.AppCompatTextView, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(h66.AppCompatTextView_emojiCompatEnabled)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(h66.AppCompatTextView_emojiCompatEnabled, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    M(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public void B(String str) {
        str.getClass();
        Iterator it = ((List) ((tv) this.Z).a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onClosed((qc6) this.Y);
        }
    }

    public void C(String str) {
        str.getClass();
        Iterator it = ((List) ((tv) this.Z).a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((qc6) this.Y);
        }
    }

    public void D(String str) {
        str.getClass();
        Iterator it = ((List) ((tv) this.Z).a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigured((qc6) this.Y);
        }
    }

    public gz1 E(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        vk1 vk1Var = (vk1) this.Z;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            mj0 mj0Var = (mj0) vk1Var.Y;
            if (!(inputConnection instanceof gz1)) {
                inputConnection = new gz1(editorInfo, inputConnection, (EditText) mj0Var.Y);
            }
            inputConnection2 = inputConnection;
        }
        return (gz1) inputConnection2;
    }

    public void F(l5 l5Var) {
        yr6 yr6Var = (yr6) this.Y;
        ((ActionMode.Callback) yr6Var.Y).onDestroyActionMode(yr6Var.e(l5Var));
        wp wpVar = (wp) this.Z;
        if (wpVar.x0 != null) {
            wpVar.n0.getDecorView().removeCallbacks(wpVar.y0);
        }
        if (wpVar.w0 != null) {
            qx8 qx8Var = wpVar.z0;
            if (qx8Var != null) {
                qx8Var.b();
            }
            qx8 qx8VarA = cw8.a(wpVar.w0);
            qx8VarA.a(0.0f);
            wpVar.z0 = qx8VarA;
            qx8VarA.d(new qp(this, (byte) 2));
        }
        wpVar.v0 = null;
        ViewGroup viewGroup = wpVar.B0;
        WeakHashMap weakHashMap = cw8.a;
        viewGroup.requestApplyInsets();
        wpVar.I();
    }

    public boolean G(l5 l5Var, Menu menu) {
        ViewGroup viewGroup = ((wp) this.Z).B0;
        WeakHashMap weakHashMap = cw8.a;
        viewGroup.requestApplyInsets();
        yr6 yr6Var = (yr6) this.Y;
        ActionMode.Callback callback = (ActionMode.Callback) yr6Var.Y;
        qw7 qw7VarE = yr6Var.e(l5Var);
        l97 l97Var = (l97) yr6Var.g0;
        Menu lu4Var = (Menu) l97Var.get(menu);
        if (lu4Var == null) {
            lu4Var = new lu4((Context) yr6Var.Z, (nt4) menu);
            l97Var.put(menu, lu4Var);
        }
        return callback.onPrepareActionMode(qw7VarE, lu4Var);
    }

    public void H(ri2 ri2Var) {
        r52 r52Var = (r52) this.Z;
        rb8 rb8Var = (rb8) this.Y;
        int i = ri2Var.b;
        if (i == 0) {
            r52Var.execute(new zo2(rb8Var, ri2Var.a, (byte) 6));
        } else {
            r52Var.execute(new vd0(rb8Var, i, (byte) 0));
        }
    }

    public void I(String str, CameraDevice.StateCallback stateCallback) {
        s98 s98Var = (s98) this.Z;
        CameraManager cameraManager = (CameraManager) ((v06) this.Y).get();
        try {
            Trace.beginSection(((Object) vi0.b(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                cameraManager.getClass();
                en.K(cameraManager, str, (Executor) s98Var.j.getValue(), stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, s98Var.a());
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:8:0x004b  */
    public pd5 J(v63 v63Var, ta7 ta7Var) {
        boolean z;
        Context context;
        ta7 ta7Var2;
        boolean z2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        Context context2 = v63Var.a;
        pw6 pw6Var = v63Var.p;
        tr5 tr5Var = v63Var.q;
        s92 s92Var = v63Var.e;
        kc0 kc0Var = v63Var.i;
        kc0 kc0Var2 = v63Var.j;
        kc0 kc0Var3 = v63Var.k;
        f4 f4Var = b73.b;
        Bitmap.Config config = (Bitmap.Config) z68.F(v63Var, f4Var);
        f4 f4Var2 = b73.h;
        boolean zBooleanValue = ((Boolean) z68.F(v63Var, f4Var2)).booleanValue();
        f4 f4Var3 = y63.a;
        if (((List) z68.F(v63Var, f4Var3)).isEmpty()) {
            z = true;
        } else {
            if (eu.Z((Bitmap.Config) z68.F(v63Var, f4Var), at8.a)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (ue3.z((Bitmap.Config) z68.F(v63Var, f4Var))) {
            if (y(v63Var, (Bitmap.Config) z68.F(v63Var, f4Var))) {
                context = context2;
                ta7Var2 = ta7Var;
                if (((gz2) this.Z).f(ta7Var2)) {
                }
                if (z || !z2) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue || !((List) z68.F(v63Var, f4Var3)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                linkedHashMap = new LinkedHashMap(zp4.L(v63Var.t.n.a, v63Var.r.a));
                if (config != ((Bitmap.Config) z68.F(v63Var, f4Var))) {
                    if (config != null) {
                        linkedHashMap.put(f4Var, config);
                    } else {
                        linkedHashMap.remove(f4Var);
                    }
                }
                if (z3 != ((Boolean) z68.F(v63Var, f4Var2)).booleanValue()) {
                    linkedHashMap.put(f4Var2, Boolean.valueOf(z3));
                }
                return new pd5(context, ta7Var2, pw6Var, tr5Var, null, s92Var, kc0Var, kc0Var2, kc0Var3, new s72(w51.P(linkedHashMap)));
            }
            context = context2;
            ta7Var2 = ta7Var;
            z2 = false;
            if (z) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z3 = false;
            } else {
                z3 = false;
            }
            linkedHashMap = new LinkedHashMap(zp4.L(v63Var.t.n.a, v63Var.r.a));
            if (config != ((Bitmap.Config) z68.F(v63Var, f4Var))) {
                if (config != null) {
                    linkedHashMap.put(f4Var, config);
                } else {
                    linkedHashMap.remove(f4Var);
                }
            }
            if (z3 != ((Boolean) z68.F(v63Var, f4Var2)).booleanValue()) {
                linkedHashMap.put(f4Var2, Boolean.valueOf(z3));
            }
            return new pd5(context, ta7Var2, pw6Var, tr5Var, null, s92Var, kc0Var, kc0Var2, kc0Var3, new s72(w51.P(linkedHashMap)));
        }
        context = context2;
        ta7Var2 = ta7Var;
        z2 = true;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z3 = false;
        } else {
            z3 = false;
        }
        linkedHashMap = new LinkedHashMap(zp4.L(v63Var.t.n.a, v63Var.r.a));
        if (config != ((Bitmap.Config) z68.F(v63Var, f4Var))) {
            if (config != null) {
                linkedHashMap.put(f4Var, config);
            } else {
                linkedHashMap.remove(f4Var);
            }
        }
        if (z3 != ((Boolean) z68.F(v63Var, f4Var2)).booleanValue()) {
            linkedHashMap.put(f4Var2, Boolean.valueOf(z3));
        }
        return new pd5(context, ta7Var2, pw6Var, tr5Var, null, s92Var, kc0Var, kc0Var2, kc0Var3, new s72(w51.P(linkedHashMap)));
    }

    public fb9 K(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        byte b = 0;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.Y;
        nd ndVar = (nd) this.Z;
        boolean z = zc1.T() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? g28.d(ndVar, new i82(context, intent, b)).e(ndVar, new r51() { // from class: j82
            @Override // defpackage.r51
            public final Object g(fb9 fb9Var) {
                return (zc1.T() && ((Integer) fb9Var.g()).intValue() == 402) ? dq.j(context, intent, z2).d(new nd((byte) 2), new u52((byte) 1)) : fb9Var;
            }
        }) : j(context, intent, z2);
    }

    public s21 L(t14 t14Var, zx5 zx5Var, w15 w15Var) {
        zx5Var.getClass();
        w15Var.getClass();
        boolean zBooleanValue = md2.U.e(zx5Var.o0).booleanValue();
        yx5 yx5Var = zx5Var.Z;
        switch (yx5Var == null ? -1 : im.a[yx5Var.ordinal()]) {
            case 1:
                byte b = (byte) zx5Var.f0;
                return zBooleanValue ? new gk8(b) : new lb0(b);
            case 2:
                return new gq0(Character.valueOf((char) zx5Var.f0));
            case 3:
                short s = (short) zx5Var.f0;
                return zBooleanValue ? new gk8(s) : new t87(s);
            case 4:
                int i = (int) zx5Var.f0;
                return zBooleanValue ? new gk8(i) : new rf3(i);
            case 5:
                long j = zx5Var.f0;
                return zBooleanValue ? new gk8(j) : new ri4(j);
            case 6:
                return new v60(zx5Var.g0);
            case 7:
                return new v60(zx5Var.h0);
            case 8:
                return new v60(Boolean.valueOf(zx5Var.f0 != 0));
            case 9:
                return new bm7(w15Var.getString(zx5Var.i0));
            case 10:
                return new kv3(u70.L(w15Var, zx5Var.j0), zx5Var.n0);
            case 11:
                return new x22(u70.L(w15Var, zx5Var.j0), v15.d(w15Var.getString(zx5Var.k0)));
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                cy5 cy5Var = zx5Var.l0;
                cy5Var.getClass();
                return new qm((Object) m(cy5Var, w15Var));
            case 13:
                List<zx5> list = zx5Var.m0;
                list.getClass();
                ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
                for (zx5 zx5Var2 : list) {
                    aa7 aa7VarE = ((vx4) this.Y).f().e();
                    zx5Var2.getClass();
                    arrayList.add(L(aa7VarE, zx5Var2, w15Var));
                }
                return new gj8(arrayList, t14Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + zx5Var.Z + " (expected " + t14Var + ')').toString());
        }
    }

    public void M(boolean z) {
        rz1 rz1Var = (rz1) ((mj0) ((vk1) this.Z).Y).Z;
        if (rz1Var.Z != z) {
            if (rz1Var.Y != null) {
                yy1 yy1VarA = yy1.a();
                qz1 qz1Var = rz1Var.Y;
                yy1VarA.getClass();
                mb6.r(qz1Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = yy1VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    yy1VarA.b.remove(qz1Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            rz1Var.Z = z;
            if (z) {
                rz1.a(rz1Var.X, yy1.a().c());
            }
        }
    }

    public Drawable N(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.Z) == null) {
                this.Z = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = N(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public pd5 O(pd5 pd5Var) {
        boolean z;
        s72 s72Var = pd5Var.j;
        f4 f4Var = b73.b;
        if (!ue3.z((Bitmap.Config) z68.G(pd5Var, f4Var)) || ((gz2) this.Z).e()) {
            z = false;
        } else {
            s72Var.getClass();
            LinkedHashMap linkedHashMapS = zp4.S(s72Var.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapS.put(f4Var, config);
            } else {
                linkedHashMapS.remove(f4Var);
            }
            s72Var = new s72(w51.P(linkedHashMapS));
            z = true;
        }
        return z ? new pd5(pd5Var.a, pd5Var.b, pd5Var.c, pd5Var.d, pd5Var.e, pd5Var.f, pd5Var.g, pd5Var.h, pd5Var.i, s72Var) : pd5Var;
    }

    @Override // defpackage.jm
    public List a(wb4 wb4Var, d2 d2Var, int i) {
        ja0 ja0Var = (ja0) this.Y;
        w15 w15Var = (w15) wb4Var.b;
        if (i == 0) {
            throw null;
        }
        if (d2Var instanceof iy5) {
            iy5 iy5Var = (iy5) d2Var;
            List list = iy5Var.j0;
            list.getClass();
            return z(list, (List) iy5Var.k(ja0Var.b), w15Var);
        }
        if (d2Var instanceof vy5) {
            vy5 vy5Var = (vy5) d2Var;
            List list2 = vy5Var.w0;
            list2.getClass();
            return z(list2, (List) vy5Var.k(ja0Var.d), w15Var);
        }
        if (!(d2Var instanceof cz5)) {
            b61.o(d2Var, "Unknown message: ");
            return null;
        }
        int iB = p61.B(i);
        if (iB == 1) {
            cz5 cz5Var = (cz5) d2Var;
            List list3 = cz5Var.w0;
            list3.getClass();
            return z(list3, (List) cz5Var.k(ja0Var.e), w15Var);
        }
        if (iB == 2) {
            cz5 cz5Var2 = (cz5) d2Var;
            List list4 = cz5Var2.x0;
            list4.getClass();
            return z(list4, (List) cz5Var2.k(ja0Var.f), w15Var);
        }
        if (iB != 3) {
            bt.i("Unsupported callable kind with property proto");
            return null;
        }
        cz5 cz5Var3 = (cz5) d2Var;
        List list5 = cz5Var3.y0;
        list5.getClass();
        return z(list5, (List) cz5Var3.k(ja0Var.g), w15Var);
    }

    @Override // defpackage.xo2
    public void b(Object obj) {
        switch (this.X) {
            case 4:
                mb6.s(null, ((qd0) this.Y).b(null));
                break;
            default:
                ((d41) this.Y).accept(new lz(0, (Surface) this.Z));
                break;
        }
    }

    @Override // defpackage.vl
    public Object c(wb4 wb4Var, cz5 cz5Var, t14 t14Var) {
        return null;
    }

    @Override // defpackage.vl
    public Object d(wb4 wb4Var, cz5 cz5Var, t14 t14Var) {
        zx5 zx5Var = (zx5) ch3.y(cz5Var, ((ja0) this.Y).i);
        if (zx5Var == null) {
            return null;
        }
        return ((dq) this.Z).L(t14Var, zx5Var, (w15) wb4Var.b);
    }

    @Override // defpackage.jm
    public List e(wb4 wb4Var, d2 d2Var, int i) {
        String str;
        w15 w15Var = (w15) wb4Var.b;
        if (i == 0) {
            throw null;
        }
        if (d2Var instanceof vy5) {
            List list = ((vy5) d2Var).x0;
            list.getClass();
            return z(list, null, w15Var);
        }
        if (!(d2Var instanceof cz5)) {
            b61.o(d2Var, "Unknown message: ");
            return null;
        }
        int iB = p61.B(i);
        if (iB == 1 || iB == 2 || iB == 3) {
            List list2 = ((cz5) d2Var).z0;
            list2.getClass();
            return z(list2, null, w15Var);
        }
        if (i == 1) {
            str = "FUNCTION";
        } else if (i == 2) {
            str = "PROPERTY";
        } else if (i != 3) {
            str = i != 4 ? "null" : "PROPERTY_SETTER";
        } else {
            str = "PROPERTY_GETTER";
        }
        throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
    }

    @Override // defpackage.jm
    public ArrayList f(nz5 nz5Var, w15 w15Var) {
        nz5Var.getClass();
        w15Var.getClass();
        List list = nz5Var.t0;
        list.getClass();
        return z(list, (List) nz5Var.k(((ja0) this.Y).k), w15Var);
    }

    @Override // defpackage.jm
    public List g(wb4 wb4Var, d2 d2Var, int i, int i2, vz5 vz5Var) {
        if (i == 0) {
            throw null;
        }
        List listK = vz5Var != null ? k(wb4Var, d2Var, i, i2, vz5Var) : null;
        return listK == null ? d02.X : listK;
    }

    @Override // defpackage.jm
    public ArrayList h(sz5 sz5Var, w15 w15Var) {
        sz5Var.getClass();
        w15Var.getClass();
        List list = sz5Var.m0;
        list.getClass();
        return z(list, (List) sz5Var.k(((ja0) this.Y).l), w15Var);
    }

    @Override // defpackage.lv1
    public Object i(pi piVar, wu1 wu1Var) {
        Object objA = ((t5) this.Z).a(f15.Y, new ja(this, piVar, null), wu1Var);
        return objA == c71.X ? objA : dn8.a;
    }

    @Override // defpackage.jm
    public List k(wb4 wb4Var, d2 d2Var, int i, int i2, vz5 vz5Var) {
        if (i == 0) {
            throw null;
        }
        vz5Var.getClass();
        List list = vz5Var.l0;
        list.getClass();
        return z(list, (List) vz5Var.k(((ja0) this.Y).j), (w15) wb4Var.b);
    }

    @Override // defpackage.jm
    public List l(wb4 wb4Var, cz5 cz5Var) {
        List list = cz5Var.A0;
        list.getClass();
        return z(list, null, (w15) wb4Var.b);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    public hm m(cy5 cy5Var, w15 w15Var) {
        Map mapP;
        cy5Var.getClass();
        w15Var.getClass();
        sx4 sx4VarO = oc.o((vx4) this.Y, u70.L(w15Var, cy5Var.Z), (z47) this.Z);
        if (cy5Var.f0.size() == 0 || u32.f(sx4VarO)) {
            mapP = e02.X;
        } else {
            int i = bl1.a;
            if (bl1.l(sx4VarO, us0.g0)) {
                Collection collectionB = sx4VarO.B();
                collectionB.getClass();
                gs0 gs0Var = (gs0) wv0.P0(collectionB);
                if (gs0Var != null) {
                    List listL = gs0Var.L();
                    listL.getClass();
                    int iG = aq4.G(xv0.Z(listL, 10));
                    if (iG < 16) {
                        iG = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                    for (Object obj : listL) {
                        linkedHashMap.put(((ot8) obj).getName(), obj);
                    }
                    List<ay5> list = cy5Var.f0;
                    list.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (ay5 ay5Var : list) {
                        ay5Var.getClass();
                        ot8 ot8Var = (ot8) linkedHashMap.get(v15.d(w15Var.getString(ay5Var.Z)));
                        Object qg5Var = null;
                        if (ot8Var != null) {
                            v15 v15VarD = v15.d(w15Var.getString(ay5Var.Z));
                            t14 t14VarC = ot8Var.c();
                            t14VarC.getClass();
                            zx5 zx5Var = ay5Var.f0;
                            zx5Var.getClass();
                            s21 s21VarL = L(t14VarC, zx5Var, w15Var);
                            qg5Var = n(s21VarL, t14VarC, zx5Var) ? s21VarL : null;
                            if (qg5Var == null) {
                                qg5Var = new v32("Unexpected argument value: actual type " + zx5Var.Z + " != expected type " + t14VarC);
                            }
                            qg5Var = new qg5(v15VarD, qg5Var);
                        }
                        if (qg5Var != null) {
                            arrayList.add(qg5Var);
                        }
                    }
                    mapP = zp4.P(arrayList);
                } else {
                    mapP = e02.X;
                }
            } else {
                mapP = e02.X;
            }
        }
        return new hm(sx4VarO.X(), mapP, ke7.G);
    }

    public boolean n(s21 s21Var, t14 t14Var, zx5 zx5Var) {
        s21 s21Var2;
        zx5 zx5Var2;
        vx4 vx4Var = (vx4) this.Y;
        yx5 yx5Var = zx5Var.Z;
        int i = yx5Var == null ? -1 : im.a[yx5Var.ordinal()];
        if (i != 10) {
            if (i != 13) {
                return dh3.f(s21Var.a(vx4Var), t14Var);
            }
            if (s21Var instanceof du) {
                Object obj = ((du) s21Var).a;
                if (((List) obj).size() == zx5Var.m0.size()) {
                    t14 t14VarG = vx4Var.f().g(t14Var);
                    if (t14VarG != null) {
                        Iterable iterableC = i21.C((Collection) obj);
                        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
                            return true;
                        }
                        Iterator it = iterableC.iterator();
                        do {
                            jf3 jf3Var = (jf3) it;
                            if (!jf3Var.Z) {
                                return true;
                            }
                            int iNextInt = jf3Var.nextInt();
                            s21Var2 = (s21) ((List) obj).get(iNextInt);
                            zx5Var2 = (zx5) zx5Var.m0.get(iNextInt);
                            zx5Var2.getClass();
                        } while (n(s21Var2, t14VarG, zx5Var2));
                    }
                }
            }
            xw3.s(s21Var, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
            return false;
        }
        ot0 ot0VarX = t14Var.n0().x();
        sx4 sx4Var = ot0VarX instanceof sx4 ? (sx4) ot0VarX : null;
        if (sx4Var == null) {
            return true;
        }
        v15 v15Var = zz3.e;
        if (zz3.b(sx4Var, tg7.Q)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rr6
    public qr6 o(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        by0 by0Var = (by0) this.Z;
        if (!str.equals(":memory:")) {
            str = ((lb1) by0Var.c).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        o52 o52Var = new o52(str, (by0Var.a || by0Var.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = o52Var.a;
        reentrantLock.lock();
        mj0 mj0Var = o52Var.b;
        if (mj0Var != null) {
            try {
                mj0Var.T();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (by0Var.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                qr6 qr6VarO = ((rr6) this.Y).o(str);
                if (by0Var.a) {
                    if (((lb1) by0Var.c).g == pl6.Y) {
                        nr4.r(qr6VarO, "PRAGMA synchronous = NORMAL");
                    } else {
                        nr4.r(qr6VarO, "PRAGMA synchronous = FULL");
                    }
                    by0.c(qr6VarO);
                    ((td5) by0Var.d).t(qr6VarO);
                } else {
                    try {
                        by0Var.b = true;
                        by0Var.d(qr6VarO);
                        by0Var.b = false;
                    } catch (Throwable th2) {
                        by0Var.b = false;
                        throw th2;
                    }
                }
                if (mj0Var != null && (fileChannel2 = (FileChannel) mj0Var.Z) != null) {
                    try {
                        fileChannel2.close();
                        mj0Var.Z = null;
                    } catch (Throwable th3) {
                        mj0Var.Z = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return qr6VarO;
            } catch (Throwable th4) {
                if (mj0Var != null && (fileChannel = (FileChannel) mj0Var.Z) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        mj0Var.Z = null;
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th5;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // defpackage.r18
    public void onStart(d53 d53Var) {
        og5 og5VarJ;
        v63 v63Var = (v63) this.Y;
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.Z;
        final og5 og5VarM = d53Var != null ? wl7.m(d53Var, v63Var.a) : null;
        if (og5VarM == null && ((Boolean) z68.F(v63Var, z63.a)).booleanValue() && (og5VarJ = asyncImagePainter.j()) != null) {
            og5VarM = og5VarJ;
        }
        asyncImagePainter.n(new av(og5VarM) { // from class: coil3.compose.AsyncImagePainter$State$Loading
            private final og5 painter;

            {
                this.painter = og5VarM;
            }

            @Override // defpackage.av
            /* JADX INFO: renamed from: a, reason: from getter */
            public final og5 getPainter() {
                return this.painter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AsyncImagePainter$State$Loading) && dh3.f(this.painter, ((AsyncImagePainter$State$Loading) obj).painter);
            }

            public final int hashCode() {
                og5 og5Var = this.painter;
                if (og5Var == null) {
                    return 0;
                }
                return og5Var.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.painter + ")";
            }
        });
    }

    @Override // defpackage.jm
    public List p(wb4 wb4Var, qy5 qy5Var) {
        wb4Var.getClass();
        List list = qy5Var.g0;
        list.getClass();
        return z(list, (List) qy5Var.k(((ja0) this.Y).h), (w15) wb4Var.b);
    }

    @Override // defpackage.jm
    public List q(c06 c06Var) {
        c06Var.getClass();
        fy5 fy5Var = c06Var.e;
        List list = fy5Var.B0;
        list.getClass();
        return z(list, (List) fy5Var.k(((ja0) this.Y).c), (w15) c06Var.b);
    }

    @Override // defpackage.jm
    public List r(wb4 wb4Var, cz5 cz5Var) {
        List list = cz5Var.B0;
        list.getClass();
        return z(list, null, (w15) wb4Var.b);
    }

    public w50 t() {
        int[] iArr;
        w50 w50Var = (w50) this.Z;
        if (w50Var != null) {
            return w50Var;
        }
        lr lrVar = (lr) this.Y;
        ld2 ld2Var = (ld2) lrVar.Y;
        int i = ld2Var.b;
        int i2 = ld2Var.c;
        w50 w50Var2 = new w50(i, i2);
        if (((byte[]) lrVar.Z).length < i) {
            lrVar.Z = new byte[i];
        }
        int i3 = 0;
        while (true) {
            iArr = (int[]) lrVar.f0;
            if (i3 >= 32) {
                break;
            }
            iArr[i3] = 0;
            i3++;
        }
        for (int i4 = 1; i4 < 5; i4++) {
            byte[] bArrK = ld2Var.k((i2 * i4) / 5, (byte[]) lrVar.Z);
            int i5 = (i * 4) / 5;
            for (int i6 = i / 5; i6 < i5; i6++) {
                int i7 = (bArrK[i6] & 255) >> 3;
                iArr[i7] = iArr[i7] + 1;
            }
        }
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 > i8) {
                i10 = i11;
                i8 = i12;
            }
            if (i12 > i9) {
                i9 = i12;
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i15 - i10;
            int i17 = iArr[i15] * i16 * i16;
            if (i17 > i14) {
                i13 = i15;
                i14 = i17;
            }
        }
        if (i10 <= i13) {
            int i18 = i10;
            i10 = i13;
            i13 = i18;
        }
        if (i10 - i13 <= length / 16) {
            throw f65.a();
        }
        int i19 = i10 - 1;
        int i20 = -1;
        int i21 = i19;
        while (i19 > i13) {
            int i22 = i19 - i13;
            int i23 = (i9 - iArr[i19]) * (i10 - i19) * i22 * i22;
            if (i23 > i20) {
                i21 = i19;
                i20 = i23;
            }
            i19--;
        }
        int i24 = i21 << 3;
        byte[] bArrJ = ld2Var.j();
        for (int i25 = 0; i25 < i2; i25++) {
            int i26 = i25 * i;
            for (int i27 = 0; i27 < i; i27++) {
                if ((bArrJ[i26 + i27] & 255) < i24) {
                    int i28 = (i27 / 32) + (w50Var2.Z * i25);
                    int[] iArr2 = w50Var2.f0;
                    iArr2[i28] = iArr2[i28] | (1 << (i27 & 31));
                }
            }
        }
        this.Z = w50Var2;
        return w50Var2;
    }

    @Override // defpackage.ye3
    public te3 toInstant() {
        throw new ve3(((String) this.Y) + " when parsing an Instant from \"" + jb5.T(64, (String) this.Z) + '\"');
    }

    public String toString() {
        switch (this.X) {
            case 22:
                try {
                    return t().toString();
                } catch (f65 unused) {
                    return _UrlKt.FRAGMENT_ENCODE_SET;
                }
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xo2
    public void u(Throwable th) {
        switch (this.X) {
            case 4:
                if (!(th instanceof fy7)) {
                    mb6.s(null, ((qd0) this.Y).b(null));
                } else {
                    mb6.s(null, ((ud0) this.Z).cancel(false));
                }
                break;
            default:
                mb6.s("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof fy7);
                ((d41) this.Y).accept(new lz(1, (Surface) this.Z));
                break;
        }
    }

    public ClipboardManager v() {
        ClipboardManager clipboardManager = (ClipboardManager) this.Z;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.Y).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.Z = clipboardManager2;
        return clipboardManager2;
    }

    public KeyListener w(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof jz1)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new jz1(keyListener);
    }

    public boolean x(nw3 nw3Var, Object obj) {
        nw3Var.getClass();
        id2 id2Var = (id2) this.Z;
        return ((((Number) ((yv3) this.Y).get(obj)).intValue() >>> id2Var.a) & ((1 << id2Var.b) - 1)) == id2Var.c;
    }

    public ArrayList z(List list, List list2, w15 w15Var) {
        if (list.isEmpty()) {
            list = list2 == null ? d02.X : list2;
        }
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        for (cy5 cy5Var : list) {
            cy5Var.getClass();
            w15Var.getClass();
            arrayList.add(((dq) this.Z).m(cy5Var, w15Var));
        }
        return arrayList;
    }

    @Override // defpackage.r18
    public void onError(d53 d53Var) {
    }

    @Override // defpackage.r18
    public void onSuccess(d53 d53Var) {
    }

    public /* synthetic */ dq(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    public /* synthetic */ dq(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    public dq(String str, w79 w79Var, be beVar) {
        this.X = (byte) 15;
        this.Z = str;
        this.Y = w79Var;
    }

    public dq(vx4 vx4Var, z47 z47Var, ja0 ja0Var) {
        this.X = (byte) 13;
        vx4Var.getClass();
        ja0Var.getClass();
        this.Y = ja0Var;
        this.Z = new dq(vx4Var, z47Var);
    }

    public dq(yv3 yv3Var, id2 id2Var) {
        this.X = (byte) 23;
        this.Y = yv3Var;
        this.Z = id2Var;
        if (id2Var.b == 1 && id2Var.c == 1) {
            return;
        }
        em7.c(p61.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", id2Var, " was passed"));
        throw null;
    }

    public dq(v76 v76Var) {
        Object y73Var;
        this.X = (byte) 9;
        this.Y = v76Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            boolean z = hz2.a;
        } else {
            if (!hz2.a) {
                if (i != 26 && i != 27) {
                    y73Var = new y73(true);
                } else {
                    y73Var = new k42();
                }
            }
            this.Z = y73Var;
        }
        y73Var = new y73(false);
        this.Z = y73Var;
    }

    public dq(vx4 vx4Var, z47 z47Var) {
        this.X = (byte) 14;
        vx4Var.getClass();
        z47Var.getClass();
        this.Y = vx4Var;
        this.Z = z47Var;
    }

    public dq(EditText editText) {
        this.X = (byte) 17;
        this.Y = editText;
        this.Z = new vk1(editText);
    }

    public dq(Context context) {
        this.X = (byte) 2;
        this.Y = context;
        this.Z = new nd((byte) 2);
    }

    public dq(by0 by0Var, rr6 rr6Var) {
        this.X = (byte) 21;
        rr6Var.getClass();
        this.Z = by0Var;
        this.Y = rr6Var;
    }

    public dq(fu6 fu6Var, HashMap map, HashMap map2) {
        this.X = (byte) 6;
        this.Y = fu6Var;
        this.Z = map;
    }

    public dq(v06 v06Var, s98 s98Var) {
        this.X = (byte) 26;
        v06Var.getClass();
        s98Var.getClass();
        this.Y = v06Var;
        this.Z = s98Var;
    }

    public /* synthetic */ dq(byte b, boolean z) {
        this.X = b;
    }

    public dq(t5 t5Var) {
        this.X = (byte) 7;
        this.Z = t5Var;
        this.Y = new ka(t5Var, (byte) 0);
    }

    public dq(wp wpVar, yr6 yr6Var) {
        this.X = (byte) 16;
        this.Z = wpVar;
        this.Y = yr6Var;
    }
}
