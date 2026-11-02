package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import defpackage.a31;
import defpackage.a66;
import defpackage.b31;
import defpackage.c31;
import defpackage.d31;
import defpackage.i46;
import defpackage.kp5;
import defpackage.oc;
import defpackage.oi0;
import defpackage.p61;
import defpackage.v21;
import defpackage.z21;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.HpkeSuite;
import org.conscrypt.metrics.ConscryptStatsLog;
import org.xmlpull.v1.XmlPullParserException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final int[] c = {0, 4, 8};
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray.append(a66.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(a66.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(a66.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(a66.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(a66.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(a66.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(a66.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(a66.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(a66.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(a66.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(a66.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(a66.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(a66.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(a66.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(a66.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(a66.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(a66.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(a66.Constraint_android_orientation, 27);
        sparseIntArray.append(a66.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(a66.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(a66.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(a66.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(a66.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(a66.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(a66.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(a66.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(a66.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(a66.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(a66.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(a66.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(a66.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(a66.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(a66.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(a66.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(a66.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(a66.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(a66.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(a66.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(a66.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(a66.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(a66.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(a66.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(a66.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(a66.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(a66.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(a66.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(a66.Constraint_android_layout_width, 23);
        sparseIntArray.append(a66.Constraint_android_layout_height, 21);
        sparseIntArray.append(a66.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(a66.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(a66.Constraint_android_visibility, 22);
        sparseIntArray.append(a66.Constraint_android_alpha, 43);
        sparseIntArray.append(a66.Constraint_android_elevation, 44);
        sparseIntArray.append(a66.Constraint_android_rotationX, 45);
        sparseIntArray.append(a66.Constraint_android_rotationY, 46);
        sparseIntArray.append(a66.Constraint_android_rotation, 60);
        sparseIntArray.append(a66.Constraint_android_scaleX, 47);
        sparseIntArray.append(a66.Constraint_android_scaleY, 48);
        sparseIntArray.append(a66.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(a66.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(a66.Constraint_android_translationX, 51);
        sparseIntArray.append(a66.Constraint_android_translationY, 52);
        sparseIntArray.append(a66.Constraint_android_translationZ, 53);
        sparseIntArray.append(a66.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(a66.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(a66.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(a66.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(a66.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(a66.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(a66.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(a66.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(a66.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(a66.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(a66.Constraint_transitionEasing, 65);
        sparseIntArray.append(a66.Constraint_drawPath, 66);
        sparseIntArray.append(a66.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(a66.Constraint_motionStagger, 79);
        sparseIntArray.append(a66.Constraint_android_id, 38);
        sparseIntArray.append(a66.Constraint_motionProgress, 68);
        sparseIntArray.append(a66.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(a66.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(a66.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(a66.Constraint_chainUseRtl, 71);
        sparseIntArray.append(a66.Constraint_barrierDirection, 72);
        sparseIntArray.append(a66.Constraint_barrierMargin, 73);
        sparseIntArray.append(a66.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(a66.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(a66.Constraint_pathMotionArc, 76);
        sparseIntArray.append(a66.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(a66.Constraint_visibilityMode, 78);
        sparseIntArray.append(a66.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(a66.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(a66.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(a66.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(a66.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(a66.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(a66.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(a66.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(a66.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(a66.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(a66.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(a66.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(a66.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(a66.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(a66.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(a66.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(a66.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(a66.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(a66.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(a66.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(a66.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(a66.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(a66.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(a66.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(a66.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(a66.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(a66.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(a66.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(a66.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(a66.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(a66.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(a66.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(a66.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(a66.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(a66.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(a66.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(a66.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(a66.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(a66.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(a66.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(a66.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(a66.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(a66.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(a66.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(a66.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(a66.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(a66.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(a66.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(a66.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(a66.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(a66.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(a66.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(a66.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(a66.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(a66.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(a66.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(a66.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(a66.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(a66.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = i46.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.r0;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.r0.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c d(Context context, AttributeSet attributeSet, boolean z) {
        c cVar = new c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? a66.ConstraintOverride : a66.Constraint);
        String[] strArr = oc.c;
        c31 c31Var = cVar.b;
        d31 d31Var = cVar.e;
        b31 b31Var = cVar.c;
        a31 a31Var = cVar.d;
        int[] iArr = c;
        SparseIntArray sparseIntArray = d;
        int i = 3;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            z21 z21Var = new z21();
            z21Var.a = new int[10];
            z21Var.b = new int[10];
            z21Var.c = 0;
            z21Var.d = new int[10];
            z21Var.e = new float[10];
            z21Var.f = 0;
            z21Var.g = new int[5];
            z21Var.h = new String[5];
            z21Var.i = 0;
            z21Var.j = new int[4];
            z21Var.k = new boolean[4];
            z21Var.l = 0;
            int i2 = 0;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (e.get(index)) {
                    case 2:
                        z21Var.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.I));
                        continue;
                        i2++;
                        i = 3;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 5:
                        z21Var.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2++;
                        i = 3;
                        break;
                    case 6:
                        z21Var.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, a31Var.C));
                        break;
                    case 7:
                        z21Var.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, a31Var.D));
                        break;
                    case 8:
                        z21Var.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.J));
                        break;
                    case 11:
                        z21Var.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.P));
                        break;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        z21Var.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.Q));
                        break;
                    case 13:
                        z21Var.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.M));
                        break;
                    case 14:
                        z21Var.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.O));
                        break;
                    case 15:
                        z21Var.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.R));
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        z21Var.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.N));
                        break;
                    case 17:
                        z21Var.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, a31Var.d));
                        break;
                    case 18:
                        z21Var.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, a31Var.e));
                        break;
                    case 19:
                        z21Var.a(19, typedArrayObtainStyledAttributes.getFloat(index, a31Var.f));
                        break;
                    case 20:
                        z21Var.a(20, typedArrayObtainStyledAttributes.getFloat(index, a31Var.w));
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        z21Var.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, a31Var.c));
                        break;
                    case 22:
                        z21Var.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c31Var.a)]);
                        break;
                    case 23:
                        z21Var.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, a31Var.b));
                        break;
                    case 24:
                        z21Var.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.F));
                        break;
                    case 27:
                        z21Var.b(27, typedArrayObtainStyledAttributes.getInt(index, a31Var.E));
                        break;
                    case _DnsMessageKt.TYPE_AAAA /* 28 */:
                        z21Var.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.G));
                        break;
                    case 31:
                        z21Var.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.K));
                        break;
                    case 34:
                        z21Var.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.H));
                        break;
                    case 37:
                        z21Var.a(37, typedArrayObtainStyledAttributes.getFloat(index, a31Var.x));
                        break;
                    case 38:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, cVar.a);
                        cVar.a = resourceId;
                        z21Var.b(38, resourceId);
                        break;
                    case 39:
                        z21Var.a(39, typedArrayObtainStyledAttributes.getFloat(index, a31Var.U));
                        break;
                    case 40:
                        z21Var.a(40, typedArrayObtainStyledAttributes.getFloat(index, a31Var.T));
                        break;
                    case 41:
                        z21Var.b(41, typedArrayObtainStyledAttributes.getInt(index, a31Var.V));
                        break;
                    case 42:
                        z21Var.b(42, typedArrayObtainStyledAttributes.getInt(index, a31Var.W));
                        break;
                    case 43:
                        z21Var.a(43, typedArrayObtainStyledAttributes.getFloat(index, c31Var.c));
                        break;
                    case 44:
                        z21Var.d(44, true);
                        z21Var.a(44, typedArrayObtainStyledAttributes.getDimension(index, d31Var.m));
                        break;
                    case 45:
                        z21Var.a(45, typedArrayObtainStyledAttributes.getFloat(index, d31Var.b));
                        break;
                    case 46:
                        z21Var.a(46, typedArrayObtainStyledAttributes.getFloat(index, d31Var.c));
                        break;
                    case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                        z21Var.a(47, typedArrayObtainStyledAttributes.getFloat(index, d31Var.d));
                        break;
                    case 48:
                        z21Var.a(48, typedArrayObtainStyledAttributes.getFloat(index, d31Var.e));
                        break;
                    case 49:
                        z21Var.a(49, typedArrayObtainStyledAttributes.getDimension(index, d31Var.f));
                        break;
                    case 50:
                        z21Var.a(50, typedArrayObtainStyledAttributes.getDimension(index, d31Var.g));
                        break;
                    case 51:
                        z21Var.a(51, typedArrayObtainStyledAttributes.getDimension(index, d31Var.i));
                        break;
                    case 52:
                        z21Var.a(52, typedArrayObtainStyledAttributes.getDimension(index, d31Var.j));
                        break;
                    case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                        z21Var.a(53, typedArrayObtainStyledAttributes.getDimension(index, d31Var.k));
                        break;
                    case 54:
                        z21Var.b(54, typedArrayObtainStyledAttributes.getInt(index, a31Var.X));
                        break;
                    case 55:
                        z21Var.b(55, typedArrayObtainStyledAttributes.getInt(index, a31Var.Y));
                        break;
                    case 56:
                        z21Var.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.Z));
                        break;
                    case 57:
                        z21Var.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.a0));
                        break;
                    case 58:
                        z21Var.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.b0));
                        break;
                    case 59:
                        z21Var.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.c0));
                        break;
                    case 60:
                        z21Var.a(60, typedArrayObtainStyledAttributes.getFloat(index, d31Var.a));
                        break;
                    case 62:
                        z21Var.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.A));
                        break;
                    case 63:
                        z21Var.a(63, typedArrayObtainStyledAttributes.getFloat(index, a31Var.B));
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        z21Var.b(64, f(typedArrayObtainStyledAttributes, index, b31Var.a));
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            z21Var.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            z21Var.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                        z21Var.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        z21Var.a(67, typedArrayObtainStyledAttributes.getFloat(index, b31Var.e));
                        break;
                    case 68:
                        z21Var.a(68, typedArrayObtainStyledAttributes.getFloat(index, c31Var.d));
                        break;
                    case 69:
                        z21Var.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        z21Var.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        break;
                    case 72:
                        z21Var.b(72, typedArrayObtainStyledAttributes.getInt(index, a31Var.f0));
                        break;
                    case 73:
                        z21Var.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.g0));
                        break;
                    case 74:
                        z21Var.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        z21Var.d(75, typedArrayObtainStyledAttributes.getBoolean(index, a31Var.n0));
                        break;
                    case 76:
                        z21Var.b(76, typedArrayObtainStyledAttributes.getInt(index, b31Var.c));
                        break;
                    case 77:
                        z21Var.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        z21Var.b(78, typedArrayObtainStyledAttributes.getInt(index, c31Var.b));
                        break;
                    case 79:
                        z21Var.a(79, typedArrayObtainStyledAttributes.getFloat(index, b31Var.d));
                        break;
                    case 80:
                        z21Var.d(80, typedArrayObtainStyledAttributes.getBoolean(index, a31Var.l0));
                        break;
                    case 81:
                        z21Var.d(81, typedArrayObtainStyledAttributes.getBoolean(index, a31Var.m0));
                        break;
                    case 82:
                        z21Var.b(82, typedArrayObtainStyledAttributes.getInteger(index, b31Var.b));
                        break;
                    case 83:
                        z21Var.b(83, f(typedArrayObtainStyledAttributes, index, d31Var.h));
                        break;
                    case 84:
                        z21Var.b(84, typedArrayObtainStyledAttributes.getInteger(index, b31Var.g));
                        break;
                    case 85:
                        z21Var.a(85, typedArrayObtainStyledAttributes.getFloat(index, b31Var.f));
                        break;
                    case 86:
                        int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            b31Var.i = resourceId2;
                            z21Var.b(89, resourceId2);
                            if (b31Var.i != -1) {
                                z21Var.b(88, -2);
                            }
                        } else if (i3 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            b31Var.h = string;
                            z21Var.c(90, string);
                            if (b31Var.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                b31Var.i = resourceId3;
                                z21Var.b(89, resourceId3);
                                z21Var.b(88, -2);
                            } else {
                                z21Var.b(88, -1);
                            }
                        } else {
                            z21Var.b(88, typedArrayObtainStyledAttributes.getInteger(index, b31Var.i));
                        }
                        break;
                    case 87:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 93:
                        z21Var.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.L));
                        break;
                    case 94:
                        z21Var.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a31Var.S));
                        break;
                    case 95:
                        g(z21Var, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        g(z21Var, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        z21Var.b(97, typedArrayObtainStyledAttributes.getInt(index, a31Var.o0));
                        break;
                    case 98:
                        int i4 = MotionLayout.v0;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == i) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            cVar.a = typedArrayObtainStyledAttributes.getResourceId(index, cVar.a);
                        }
                        break;
                    case 99:
                        z21Var.d(99, typedArrayObtainStyledAttributes.getBoolean(index, a31Var.g));
                        break;
                }
                i2++;
                i = 3;
            }
        } else {
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount2; i5++) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i5);
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        a31Var.p = f(typedArrayObtainStyledAttributes, index2, a31Var.p);
                        break;
                    case 2:
                        a31Var.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.I);
                        break;
                    case 3:
                        a31Var.o = f(typedArrayObtainStyledAttributes, index2, a31Var.o);
                        break;
                    case 4:
                        a31Var.n = f(typedArrayObtainStyledAttributes, index2, a31Var.n);
                        break;
                    case 5:
                        a31Var.y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        a31Var.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, a31Var.C);
                        break;
                    case 7:
                        a31Var.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, a31Var.D);
                        break;
                    case 8:
                        a31Var.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.J);
                        break;
                    case 9:
                        a31Var.v = f(typedArrayObtainStyledAttributes, index2, a31Var.v);
                        break;
                    case 10:
                        a31Var.u = f(typedArrayObtainStyledAttributes, index2, a31Var.u);
                        break;
                    case 11:
                        a31Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.P);
                        break;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        a31Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.Q);
                        break;
                    case 13:
                        a31Var.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.M);
                        break;
                    case 14:
                        a31Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.O);
                        break;
                    case 15:
                        a31Var.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.R);
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        a31Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.N);
                        break;
                    case 17:
                        a31Var.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, a31Var.d);
                        break;
                    case 18:
                        a31Var.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, a31Var.e);
                        break;
                    case 19:
                        a31Var.f = typedArrayObtainStyledAttributes.getFloat(index2, a31Var.f);
                        break;
                    case 20:
                        a31Var.w = typedArrayObtainStyledAttributes.getFloat(index2, a31Var.w);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        a31Var.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, a31Var.c);
                        break;
                    case 22:
                        int i6 = typedArrayObtainStyledAttributes.getInt(index2, c31Var.a);
                        c31Var.a = i6;
                        c31Var.a = iArr[i6];
                        break;
                    case 23:
                        a31Var.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, a31Var.b);
                        break;
                    case 24:
                        a31Var.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.F);
                        break;
                    case 25:
                        a31Var.h = f(typedArrayObtainStyledAttributes, index2, a31Var.h);
                        break;
                    case 26:
                        a31Var.i = f(typedArrayObtainStyledAttributes, index2, a31Var.i);
                        break;
                    case 27:
                        a31Var.E = typedArrayObtainStyledAttributes.getInt(index2, a31Var.E);
                        break;
                    case _DnsMessageKt.TYPE_AAAA /* 28 */:
                        a31Var.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.G);
                        break;
                    case 29:
                        a31Var.j = f(typedArrayObtainStyledAttributes, index2, a31Var.j);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        a31Var.k = f(typedArrayObtainStyledAttributes, index2, a31Var.k);
                        break;
                    case 31:
                        a31Var.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.K);
                        break;
                    case 32:
                        a31Var.s = f(typedArrayObtainStyledAttributes, index2, a31Var.s);
                        break;
                    case 33:
                        a31Var.t = f(typedArrayObtainStyledAttributes, index2, a31Var.t);
                        break;
                    case 34:
                        a31Var.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.H);
                        break;
                    case 35:
                        a31Var.m = f(typedArrayObtainStyledAttributes, index2, a31Var.m);
                        break;
                    case 36:
                        a31Var.l = f(typedArrayObtainStyledAttributes, index2, a31Var.l);
                        break;
                    case 37:
                        a31Var.x = typedArrayObtainStyledAttributes.getFloat(index2, a31Var.x);
                        break;
                    case 38:
                        cVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, cVar.a);
                        break;
                    case 39:
                        a31Var.U = typedArrayObtainStyledAttributes.getFloat(index2, a31Var.U);
                        break;
                    case 40:
                        a31Var.T = typedArrayObtainStyledAttributes.getFloat(index2, a31Var.T);
                        break;
                    case 41:
                        a31Var.V = typedArrayObtainStyledAttributes.getInt(index2, a31Var.V);
                        break;
                    case 42:
                        a31Var.W = typedArrayObtainStyledAttributes.getInt(index2, a31Var.W);
                        break;
                    case 43:
                        c31Var.c = typedArrayObtainStyledAttributes.getFloat(index2, c31Var.c);
                        break;
                    case 44:
                        d31Var.l = true;
                        d31Var.m = typedArrayObtainStyledAttributes.getDimension(index2, d31Var.m);
                        break;
                    case 45:
                        d31Var.b = typedArrayObtainStyledAttributes.getFloat(index2, d31Var.b);
                        break;
                    case 46:
                        d31Var.c = typedArrayObtainStyledAttributes.getFloat(index2, d31Var.c);
                        break;
                    case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                        d31Var.d = typedArrayObtainStyledAttributes.getFloat(index2, d31Var.d);
                        break;
                    case 48:
                        d31Var.e = typedArrayObtainStyledAttributes.getFloat(index2, d31Var.e);
                        break;
                    case 49:
                        d31Var.f = typedArrayObtainStyledAttributes.getDimension(index2, d31Var.f);
                        break;
                    case 50:
                        d31Var.g = typedArrayObtainStyledAttributes.getDimension(index2, d31Var.g);
                        break;
                    case 51:
                        d31Var.i = typedArrayObtainStyledAttributes.getDimension(index2, d31Var.i);
                        break;
                    case 52:
                        d31Var.j = typedArrayObtainStyledAttributes.getDimension(index2, d31Var.j);
                        break;
                    case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                        d31Var.k = typedArrayObtainStyledAttributes.getDimension(index2, d31Var.k);
                        break;
                    case 54:
                        a31Var.X = typedArrayObtainStyledAttributes.getInt(index2, a31Var.X);
                        break;
                    case 55:
                        a31Var.Y = typedArrayObtainStyledAttributes.getInt(index2, a31Var.Y);
                        break;
                    case 56:
                        a31Var.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.Z);
                        break;
                    case 57:
                        a31Var.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.a0);
                        break;
                    case 58:
                        a31Var.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.b0);
                        break;
                    case 59:
                        a31Var.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.c0);
                        break;
                    case 60:
                        d31Var.a = typedArrayObtainStyledAttributes.getFloat(index2, d31Var.a);
                        break;
                    case 61:
                        a31Var.z = f(typedArrayObtainStyledAttributes, index2, a31Var.z);
                        break;
                    case 62:
                        a31Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.A);
                        break;
                    case 63:
                        a31Var.B = typedArrayObtainStyledAttributes.getFloat(index2, a31Var.B);
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        b31Var.a = f(typedArrayObtainStyledAttributes, index2, b31Var.a);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                        }
                        break;
                    case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        b31Var.e = typedArrayObtainStyledAttributes.getFloat(index2, b31Var.e);
                        break;
                    case 68:
                        c31Var.d = typedArrayObtainStyledAttributes.getFloat(index2, c31Var.d);
                        break;
                    case 69:
                        a31Var.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        a31Var.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        a31Var.f0 = typedArrayObtainStyledAttributes.getInt(index2, a31Var.f0);
                        break;
                    case 73:
                        a31Var.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.g0);
                        break;
                    case 74:
                        a31Var.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        a31Var.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, a31Var.n0);
                        break;
                    case 76:
                        b31Var.c = typedArrayObtainStyledAttributes.getInt(index2, b31Var.c);
                        break;
                    case 77:
                        a31Var.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        c31Var.b = typedArrayObtainStyledAttributes.getInt(index2, c31Var.b);
                        break;
                    case 79:
                        b31Var.d = typedArrayObtainStyledAttributes.getFloat(index2, b31Var.d);
                        break;
                    case 80:
                        a31Var.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, a31Var.l0);
                        break;
                    case 81:
                        a31Var.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, a31Var.m0);
                        break;
                    case 82:
                        b31Var.b = typedArrayObtainStyledAttributes.getInteger(index2, b31Var.b);
                        break;
                    case 83:
                        d31Var.h = f(typedArrayObtainStyledAttributes, index2, d31Var.h);
                        break;
                    case 84:
                        b31Var.g = typedArrayObtainStyledAttributes.getInteger(index2, b31Var.g);
                        break;
                    case 85:
                        b31Var.f = typedArrayObtainStyledAttributes.getFloat(index2, b31Var.f);
                        break;
                    case 86:
                        int i7 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i7 == 1) {
                            b31Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i7 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            b31Var.h = string2;
                            if (string2.indexOf("/") > 0) {
                                b31Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, b31Var.i);
                        }
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 91:
                        a31Var.q = f(typedArrayObtainStyledAttributes, index2, a31Var.q);
                        break;
                    case 92:
                        a31Var.r = f(typedArrayObtainStyledAttributes, index2, a31Var.r);
                        break;
                    case 93:
                        a31Var.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.L);
                        break;
                    case 94:
                        a31Var.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, a31Var.S);
                        break;
                    case 95:
                        g(a31Var, typedArrayObtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        g(a31Var, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        a31Var.o0 = typedArrayObtainStyledAttributes.getInt(index2, a31Var.o0);
                        break;
                }
            }
            if (a31Var.j0 != null) {
                a31Var.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        z21 z21Var;
        a31 a31Var;
        ConstraintLayout.LayoutParams layoutParams;
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                        layoutParams.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                        layoutParams.X = z;
                        return;
                    }
                }
                if (obj instanceof a31) {
                    a31Var = (a31) obj;
                    if (i2 == 0) {
                        a31Var.b = i4;
                        a31Var.l0 = z;
                        return;
                    } else {
                        a31Var.c = i4;
                        a31Var.m0 = z;
                        return;
                    }
                }
                if (obj instanceof z21) {
                    z21Var = (z21) obj;
                    if (i2 == 0) {
                        z21Var.b(23, i4);
                        z21Var.d(80, z);
                        return;
                    } else {
                        z21Var.b(21, i4);
                        z21Var.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                    layoutParams.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                    layoutParams.X = z;
                    return;
                }
            }
            if (obj instanceof a31) {
                a31Var = (a31) obj;
                if (i2 == 0) {
                    a31Var.b = i4;
                    a31Var.l0 = z;
                    return;
                } else {
                    a31Var.c = i4;
                    a31Var.m0 = z;
                    return;
                }
            }
            if (obj instanceof z21) {
                z21Var = (z21) obj;
                if (i2 == 0) {
                    z21Var.b(23, i4);
                    z21Var.d(80, z);
                    return;
                } else {
                    z21Var.b(21, i4);
                    z21Var.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                    }
                    h(layoutParams2, strTrim2);
                    return;
                }
                if (obj instanceof a31) {
                    ((a31) obj).y = strTrim2;
                    return;
                } else {
                    if (obj instanceof z21) {
                        ((z21) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.I = f;
                            return;
                        }
                    }
                    if (obj instanceof a31) {
                        a31 a31Var2 = (a31) obj;
                        if (i2 == 0) {
                            a31Var2.b = 0;
                            a31Var2.U = f;
                            return;
                        } else {
                            a31Var2.c = 0;
                            a31Var2.T = f;
                            return;
                        }
                    }
                    if (obj instanceof z21) {
                        z21 z21Var2 = (z21) obj;
                        if (i2 == 0) {
                            z21Var2.b(23, 0);
                            z21Var2.a(39, f);
                            return;
                        } else {
                            z21Var2.b(21, 0);
                            z21Var2.a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                            layoutParams4.R = fMax;
                            layoutParams4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.S = fMax;
                            layoutParams4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof a31) {
                        a31 a31Var3 = (a31) obj;
                        if (i2 == 0) {
                            a31Var3.b = 0;
                            a31Var3.d0 = fMax;
                            a31Var3.X = 2;
                            return;
                        } else {
                            a31Var3.c = 0;
                            a31Var3.e0 = fMax;
                            a31Var3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof z21) {
                        z21 z21Var3 = (z21) obj;
                        if (i2 == 0) {
                            z21Var3.b(23, 0);
                            z21Var3.b(54, 2);
                        } else {
                            z21Var3.b(21, 0);
                            z21Var3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.b;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (id == -1) {
                    kp5.t("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    c cVar = (c) map.get(Integer.valueOf(id));
                    if (cVar != null) {
                        c31 c31Var = cVar.b;
                        a31 a31Var = cVar.d;
                        d31 d31Var = cVar.e;
                        if (childAt instanceof Barrier) {
                            a31Var.h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(a31Var.f0);
                            barrier.setMargin(a31Var.g0);
                            barrier.setAllowsGoneWidget(a31Var.n0);
                            int[] iArr = a31Var.i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = a31Var.j0;
                                if (str != null) {
                                    int[] iArrC = c(barrier, str);
                                    a31Var.i0 = iArrC;
                                    barrier.setReferencedIds(iArrC);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.a();
                        cVar.a(layoutParams);
                        HashMap map2 = cVar.f;
                        Class<?> cls = childAt.getClass();
                        for (String strL : map2.keySet()) {
                            v21 v21Var = (v21) map2.get(strL);
                            if (!v21Var.a) {
                                strL = oi0.l("set", strL);
                            }
                            try {
                                int iB = p61.B(v21Var.b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (iB) {
                                    case 0:
                                        cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(v21Var.c));
                                        break;
                                    case 1:
                                        cls.getMethod(strL, cls2).invoke(childAt, Float.valueOf(v21Var.d));
                                        break;
                                    case 2:
                                        cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(v21Var.g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strL, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(v21Var.g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(strL, CharSequence.class).invoke(childAt, v21Var.e);
                                        break;
                                    case 5:
                                        cls.getMethod(strL, Boolean.TYPE).invoke(childAt, Boolean.valueOf(v21Var.f));
                                        break;
                                    case 6:
                                        cls.getMethod(strL, cls2).invoke(childAt, Float.valueOf(v21Var.d));
                                        break;
                                    case 7:
                                        cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(v21Var.c));
                                        break;
                                }
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                            }
                        }
                        childAt.setLayoutParams(layoutParams);
                        if (c31Var.b == 0) {
                            childAt.setVisibility(c31Var.a);
                        }
                        childAt.setAlpha(c31Var.c);
                        childAt.setRotation(d31Var.a);
                        childAt.setRotationX(d31Var.b);
                        childAt.setRotationY(d31Var.c);
                        childAt.setScaleX(d31Var.d);
                        childAt.setScaleY(d31Var.e);
                        if (d31Var.h != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(d31Var.h);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(d31Var.f)) {
                                childAt.setPivotX(d31Var.f);
                            }
                            if (!Float.isNaN(d31Var.g)) {
                                childAt.setPivotY(d31Var.g);
                            }
                        }
                        childAt.setTranslationX(d31Var.i);
                        childAt.setTranslationY(d31Var.j);
                        childAt.setTranslationZ(d31Var.k);
                        if (d31Var.l) {
                            childAt.setElevation(d31Var.m);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            c cVar2 = (c) map.get(num);
            if (cVar2 != null) {
                a31 a31Var2 = cVar2.d;
                if (a31Var2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = a31Var2.i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = a31Var2.j0;
                        if (str2 != null) {
                            int[] iArrC2 = c(barrier2, str2);
                            a31Var2.i0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(a31Var2.f0);
                    barrier2.setMargin(a31Var2.g0);
                    ConstraintLayout.LayoutParams layoutParamsG = ConstraintLayout.g();
                    barrier2.i();
                    cVar2.a(layoutParamsG);
                    constraintLayout.addView(barrier2, layoutParamsG);
                }
                if (a31Var2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsG2 = ConstraintLayout.g();
                    cVar2.a(layoutParamsG2);
                    constraintLayout.addView(guideline, layoutParamsG2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        int i3;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = dVar.b;
        map2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                kp5.t("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new c());
            }
            c cVar = (c) map2.get(Integer.valueOf(id));
            if (cVar == null) {
                i = childCount;
                map = map2;
                i2 = i4;
            } else {
                c31 c31Var = cVar.b;
                a31 a31Var = cVar.d;
                d31 d31Var = cVar.e;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map4 = dVar.a;
                for (String str : map4.keySet()) {
                    int i5 = childCount;
                    v21 v21Var = (v21) map4.get(str);
                    HashMap map5 = map2;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i3 = i4;
                            try {
                                map3.put(str, new v21(v21Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        } else {
                            i3 = i4;
                            map3.put(str, new v21(v21Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                        i3 = i4;
                    }
                    map2 = map5;
                    childCount = i5;
                    i4 = i3;
                }
                i = childCount;
                map = map2;
                i2 = i4;
                cVar.f = map3;
                cVar.a = id;
                a31Var.h = layoutParams.e;
                a31Var.i = layoutParams.f;
                a31Var.j = layoutParams.g;
                a31Var.k = layoutParams.h;
                a31Var.l = layoutParams.i;
                a31Var.m = layoutParams.j;
                a31Var.n = layoutParams.k;
                a31Var.o = layoutParams.l;
                a31Var.p = layoutParams.m;
                a31Var.q = layoutParams.n;
                a31Var.r = layoutParams.o;
                a31Var.s = layoutParams.s;
                a31Var.t = layoutParams.t;
                a31Var.u = layoutParams.u;
                a31Var.v = layoutParams.v;
                a31Var.w = layoutParams.E;
                a31Var.x = layoutParams.F;
                a31Var.y = layoutParams.G;
                a31Var.z = layoutParams.p;
                a31Var.A = layoutParams.q;
                a31Var.B = layoutParams.r;
                a31Var.C = layoutParams.T;
                a31Var.D = layoutParams.U;
                a31Var.E = layoutParams.V;
                a31Var.f = layoutParams.c;
                a31Var.d = layoutParams.a;
                a31Var.e = layoutParams.b;
                a31Var.b = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                a31Var.c = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                a31Var.F = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                a31Var.G = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                a31Var.H = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                a31Var.I = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                a31Var.L = layoutParams.D;
                a31Var.T = layoutParams.I;
                a31Var.U = layoutParams.H;
                a31Var.W = layoutParams.K;
                a31Var.V = layoutParams.J;
                a31Var.l0 = layoutParams.W;
                a31Var.m0 = layoutParams.X;
                a31Var.X = layoutParams.L;
                a31Var.Y = layoutParams.M;
                a31Var.Z = layoutParams.P;
                a31Var.a0 = layoutParams.Q;
                a31Var.b0 = layoutParams.N;
                a31Var.c0 = layoutParams.O;
                a31Var.d0 = layoutParams.R;
                a31Var.e0 = layoutParams.S;
                a31Var.k0 = layoutParams.Y;
                a31Var.N = layoutParams.x;
                a31Var.P = layoutParams.z;
                a31Var.M = layoutParams.w;
                a31Var.O = layoutParams.y;
                a31Var.R = layoutParams.A;
                a31Var.Q = layoutParams.B;
                a31Var.S = layoutParams.C;
                a31Var.o0 = layoutParams.Z;
                a31Var.J = layoutParams.getMarginEnd();
                a31Var.K = layoutParams.getMarginStart();
                c31Var.a = childAt.getVisibility();
                c31Var.c = childAt.getAlpha();
                d31Var.a = childAt.getRotation();
                d31Var.b = childAt.getRotationX();
                d31Var.c = childAt.getRotationY();
                d31Var.d = childAt.getScaleX();
                d31Var.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    d31Var.f = pivotX;
                    d31Var.g = pivotY;
                }
                d31Var.i = childAt.getTranslationX();
                d31Var.j = childAt.getTranslationY();
                d31Var.k = childAt.getTranslationZ();
                if (d31Var.l) {
                    d31Var.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    a31Var.n0 = barrier.getAllowsGoneWidget();
                    a31Var.i0 = barrier.getReferencedIds();
                    a31Var.f0 = barrier.getType();
                    a31Var.g0 = barrier.getMargin();
                }
            }
            i4 = i2 + 1;
            dVar = this;
            map2 = map;
            childCount = i;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    c cVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        cVarD.d.a = true;
                    }
                    this.b.put(Integer.valueOf(cVarD.a), cVarD);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
