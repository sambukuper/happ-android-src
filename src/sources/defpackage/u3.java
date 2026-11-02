package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u3 {
    public static boolean A(kd8 kd8Var, PreviewableHandwritingGesture previewableHandwritingGesture, y78 y78Var, CancellationSignal cancellationSignal) {
        byte b = 1;
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            q(kd8Var, g33.y(y78Var, pu.V(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            q(kd8Var, g33.y(y78Var, pu.V(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() == 1 ? 1 : 0), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            q(kd8Var, g33.z(y78Var, pu.V(selectRangeGesture.getSelectionStartArea()), pu.V(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            q(kd8Var, g33.z(y78Var, pu.V(deleteRangeGesture.getDeletionStartArea()), pu.V(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() == 1 ? 1 : 0), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new qz0(kd8Var, b));
        }
        return true;
    }

    public static void B(PendingIntent pendingIntent) {
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Objects.toString(pendingIntent);
            e.toString();
        }
    }

    public static void C(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void D(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void E(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(i21.L(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(eu.L0(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static void F(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static final void G(ExtensionSessionConfiguration extensionSessionConfiguration, OutputConfiguration outputConfiguration) {
        extensionSessionConfiguration.setPostviewOutputConfiguration(outputConfiguration);
    }

    public static final void H(LinkedHashMap linkedHashMap) {
        linkedHashMap.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    public static final void a(CursorAnchorInfo.Builder builder, x78 x78Var, s86 s86Var) {
        if (s86Var.h()) {
            return;
        }
        bz4 bz4Var = x78Var.b;
        int i = bz4Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iN = x97.n(bz4Var.d(s86Var.b), 0, i);
        int iN2 = x97.n(bz4Var.d(s86Var.d), 0, i);
        if (iN > iN2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(x78Var.f(iN), bz4Var.e(iN), x78Var.g(iN), bz4Var.a(iN));
            if (iN == iN2) {
                return;
            } else {
                iN++;
            }
        }
    }

    public static Context b(Context context, int i) {
        return context.createDeviceContext(i);
    }

    public static float c(float f, DisplayMetrics displayMetrics) {
        return TypedValue.deriveDimension(2, f, displayMetrics);
    }

    public static int d(kd8 kd8Var, HandwritingGesture handwritingGesture) {
        y68 y68Var = kd8Var.a;
        de3 de3Var = kd8Var.b;
        y68Var.b.a().A();
        g48 g48Var = y68Var.b;
        g48Var.l0 = null;
        kd8Var.l(g48Var);
        y68Var.b(de3Var, true, e58.X);
        y68Var.f(true);
        y68Var.e(y68Var.b.g0);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        kd8.h(kd8Var, fallbackText, false, false, 28);
        return 5;
    }

    public static JobScheduler e(JobScheduler jobScheduler) {
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction f() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float g(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int j(Context context) {
        context.getClass();
        return context.getDeviceId();
    }

    public static int k(Context context) {
        return context.getDeviceId();
    }

    public static int[] l(v78 v78Var, RectF rectF, int i, final b1 b1Var) {
        return v78Var.f.getRangeForRect(rectF, i == 1 ? new ln(new xd6(v78Var.f.getText(), v78Var.k(), (byte) 27)) : new GraphemeClusterSegmentFinder(v78Var.f.getText(), v78Var.a), new Layout.TextInclusionStrategy() { // from class: qe
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) b1Var.K(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int o(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int p(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static void q(kd8 kd8Var, long j, int i) {
        boolean zB = f88.b(j);
        e58 e58Var = e58.X;
        if (zB) {
            y68 y68Var = kd8Var.a;
            de3 de3Var = kd8Var.b;
            y68Var.b.a().A();
            g48 g48Var = y68Var.b;
            g48Var.l0 = null;
            kd8Var.l(g48Var);
            y68Var.b(de3Var, true, e58Var);
            y68Var.f(true);
            y68Var.e(y68Var.b.g0);
            return;
        }
        long jE = kd8Var.e(j);
        y68 y68Var2 = kd8Var.a;
        de3 de3Var2 = kd8Var.b;
        y68Var2.b.a().A();
        g48 g48Var2 = y68Var2.b;
        int i2 = (int) (jE >> 32);
        int i3 = (int) (jE & 4294967295L);
        mi5 mi5Var = g48Var2.Z;
        if (i2 >= i3) {
            bt.q(pc6.m("Do not set reversed or empty range: ", i2, i3, " > "));
            return;
        }
        g48Var2.l0 = new qg5(new h78(i), new f88(ct7.c(x97.n(i2, 0, mi5Var.length()), x97.n(i3, 0, mi5Var.length()))));
        y68Var2.b(de3Var2, true, e58Var);
        y68Var2.f(true);
        y68Var2.e(y68Var2.b.g0);
    }

    public static boolean r(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static final boolean s(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(i);
    }

    public static final boolean t(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isPostviewAvailable(i);
    }

    public static boolean u(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static final boolean v(jj0 jj0Var) {
        jj0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
        key.getClass();
        int[] iArr = (int[]) ((lf0) jj0Var).c(key);
        return iArr != null && eu.a0(iArr, 1);
    }

    public static final ColorSpace w(lw0 lw0Var) {
        if (dh3.f(lw0Var, nw0.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (dh3.f(lw0Var, nw0.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static final void x(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        captureCallback.onReadoutStarted(cameraCaptureSession, captureRequest, j, j2);
    }

    public static void y(kd8 kd8Var, long j, boolean z) {
        if (z) {
            h48 h48VarD = kd8Var.d();
            int i = f88.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (4294967295L & j);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(h48VarD, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < h48VarD.Z.length() ? Character.codePointAt(h48VarD, iCharCount2) : 10;
            if (g33.H(iCodePointBefore) && (g33.G(iCodePointAt) || g33.F(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(h48VarD, iCharCount);
                    }
                } while (g33.H(iCodePointBefore));
                j = ct7.c(iCharCount, iCharCount2);
            } else if (g33.H(iCodePointAt) && (g33.G(iCodePointBefore) || g33.F(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == h48VarD.Z.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(h48VarD, iCharCount2);
                    }
                } while (g33.H(iCodePointAt));
                j = ct7.c(iCharCount, iCharCount2);
            }
        }
        kd8.i(kd8Var, _UrlKt.FRAGMENT_ENCODE_SET, j, false, false, 28);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0229  */
    public static int z(kd8 kd8Var, HandwritingGesture handwritingGesture, y78 y78Var, dn2 dn2Var, fw8 fw8Var) {
        long jG;
        int i;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jY = g33.y(y78Var, pu.V(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (f88.b(jY)) {
                return d(kd8Var, selectGesture);
            }
            kd8Var.j(jY);
            if (dn2Var != null) {
                dn2Var.invoke();
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i2 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jY2 = g33.y(y78Var, pu.V(deleteGesture.getDeletionArea()), i2);
                if (f88.b(jY2)) {
                    return d(kd8Var, deleteGesture);
                }
                y(kd8Var, jY2, i2 == 1);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i3 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jZ = g33.z(y78Var, pu.V(deleteRangeGesture.getDeletionStartArea()), pu.V(deleteRangeGesture.getDeletionEndArea()), i3);
                    if (f88.b(jZ)) {
                        return d(kd8Var, deleteRangeGesture);
                    }
                    y(kd8Var, jZ, i3 == 1);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (kd8Var.a.c() != kd8Var.a.c()) {
                        return 3;
                    }
                    int iW = g33.w(y78Var, g33.T(joinOrSplitGesture.getJoinOrSplitPoint()), fw8Var);
                    if (iW != -1) {
                        x78 x78VarC = y78Var.c();
                        if (x78VarC != null) {
                            bz4 bz4Var = x78VarC.b;
                            int iC = bz4Var.c(iW);
                            if (iW != x78VarC.h(iC)) {
                            }
                        }
                        h48 h48VarD = kd8Var.d();
                        int iCharCount = iW;
                        while (iCharCount > 0) {
                            int iCodePointBefore = Character.codePointBefore(h48VarD, iCharCount);
                            if (!g33.G(iCodePointBefore)) {
                                break;
                            }
                            iCharCount -= Character.charCount(iCodePointBefore);
                        }
                        while (iW < h48VarD.Z.length()) {
                            int iCodePointAt = Character.codePointAt(h48VarD, iW);
                            if (!g33.G(iCodePointAt)) {
                                break;
                            }
                            iW += Character.charCount(iCodePointAt);
                        }
                        long jC = ct7.c(iCharCount, iW);
                        if (f88.b(jC)) {
                            kd8.i(kd8Var, " ", jC, false, false, 28);
                            return 1;
                        }
                        kd8.i(kd8Var, _UrlKt.FRAGMENT_ENCODE_SET, jC, false, false, 28);
                        return 1;
                    }
                    return d(kd8Var, joinOrSplitGesture);
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    int iW2 = g33.w(y78Var, g33.T(insertGesture.getInsertionPoint()), fw8Var);
                    if (iW2 == -1) {
                        return d(kd8Var, insertGesture);
                    }
                    kd8.i(kd8Var, insertGesture.getTextToInsert(), ct7.c(iW2, iW2), false, false, 28);
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                x78 x78VarC2 = y78Var.c();
                long jT = g33.T(removeSpaceGesture.getStartPoint());
                long jT2 = g33.T(removeSpaceGesture.getEndPoint());
                y24 y24VarE = y78Var.e();
                if (x78VarC2 != null) {
                    bz4 bz4Var2 = x78VarC2.b;
                    if (y24VarE == null) {
                        jG = f88.b;
                    } else {
                        long jE = y24VarE.E(jT);
                        long jE2 = y24VarE.E(jT2);
                        int iV = g33.v(bz4Var2, jE, fw8Var);
                        int iV2 = g33.v(bz4Var2, jE2, fw8Var);
                        if (iV != -1) {
                            if (iV2 != -1) {
                                iV = Math.min(iV, iV2);
                            }
                            iV2 = iV;
                        } else if (iV2 == -1) {
                            jG = f88.b;
                        }
                        float fA = (bz4Var2.a(iV2) + bz4Var2.e(iV2)) / 2.0f;
                        int i4 = (int) (jE >> 32);
                        int i5 = (int) (jE2 >> 32);
                        jG = bz4Var2.g(new s86(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), fA - 0.1f, Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), fA + 0.1f), 0, qe4.y0);
                    }
                } else {
                    jG = f88.b;
                }
                if (f88.b(jG)) {
                    return d(kd8Var, removeSpaceGesture);
                }
                ca6 ca6Var = new ca6();
                ca6Var.X = -1;
                ca6 ca6Var2 = new ca6();
                ca6Var2.X = -1;
                String strE = new kc6("\\s+").e(kd8Var.d().Z.subSequence(f88.d(jG), f88.c(jG)).toString(), new p0(ca6Var, ca6Var2, (byte) 27));
                int i6 = ca6Var.X;
                if (i6 == -1 || (i = ca6Var2.X) == -1) {
                    return d(kd8Var, removeSpaceGesture);
                }
                int i7 = (int) (jG >> 32);
                kd8.i(kd8Var, strE.substring(ca6Var.X, strE.length() - ((f88.c(jG) - f88.d(jG)) - ca6Var2.X)), ct7.c(i6 + i7, i7 + i), false, false, 28);
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jZ2 = g33.z(y78Var, pu.V(selectRangeGesture.getSelectionStartArea()), pu.V(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (f88.b(jZ2)) {
                return d(kd8Var, selectRangeGesture);
            }
            kd8Var.j(jZ2);
            if (dn2Var != null) {
                dn2Var.invoke();
            }
        }
        return 1;
    }
}
