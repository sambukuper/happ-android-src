package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.ah2;
import defpackage.ai1;
import defpackage.ai2;
import defpackage.au2;
import defpackage.b09;
import defpackage.b17;
import defpackage.b61;
import defpackage.be7;
import defpackage.bi3;
import defpackage.bt;
import defpackage.c15;
import defpackage.c17;
import defpackage.c71;
import defpackage.ch2;
import defpackage.ch3;
import defpackage.cw8;
import defpackage.cx8;
import defpackage.d94;
import defpackage.dd7;
import defpackage.dh3;
import defpackage.di7;
import defpackage.dk6;
import defpackage.dn2;
import defpackage.dn8;
import defpackage.do5;
import defpackage.dp4;
import defpackage.dx4;
import defpackage.e55;
import defpackage.ea6;
import defpackage.eb;
import defpackage.eh2;
import defpackage.ei2;
import defpackage.ex8;
import defpackage.ez2;
import defpackage.f08;
import defpackage.f18;
import defpackage.fd3;
import defpackage.fi1;
import defpackage.fi2;
import defpackage.fo5;
import defpackage.fq5;
import defpackage.fw8;
import defpackage.fx8;
import defpackage.g46;
import defpackage.g94;
import defpackage.gc;
import defpackage.gd8;
import defpackage.ge4;
import defpackage.gf3;
import defpackage.gh2;
import defpackage.gi;
import defpackage.gn2;
import defpackage.gq5;
import defpackage.gs8;
import defpackage.gv3;
import defpackage.h80;
import defpackage.h85;
import defpackage.hc;
import defpackage.he;
import defpackage.hq1;
import defpackage.hy0;
import defpackage.hy4;
import defpackage.i55;
import defpackage.i75;
import defpackage.i94;
import defpackage.ic;
import defpackage.ic3;
import defpackage.in;
import defpackage.iq1;
import defpackage.iu0;
import defpackage.iy4;
import defpackage.j05;
import defpackage.j57;
import defpackage.j72;
import defpackage.j75;
import defpackage.j94;
import defpackage.je3;
import defpackage.jh2;
import defpackage.jm4;
import defpackage.jq5;
import defpackage.jx4;
import defpackage.k02;
import defpackage.k75;
import defpackage.k94;
import defpackage.kd7;
import defpackage.km4;
import defpackage.kt;
import defpackage.l59;
import defpackage.lb;
import defpackage.lc;
import defpackage.lf5;
import defpackage.lh4;
import defpackage.lr;
import defpackage.lu0;
import defpackage.lv6;
import defpackage.m34;
import defpackage.m70;
import defpackage.mb;
import defpackage.mf5;
import defpackage.mo5;
import defpackage.mv6;
import defpackage.mx4;
import defpackage.n03;
import defpackage.n71;
import defpackage.nb;
import defpackage.nc;
import defpackage.nq5;
import defpackage.nr4;
import defpackage.o61;
import defpackage.o7;
import defpackage.o78;
import defpackage.ob;
import defpackage.oc;
import defpackage.of5;
import defpackage.oh1;
import defpackage.oi0;
import defpackage.on;
import defpackage.or4;
import defpackage.os4;
import defpackage.ox1;
import defpackage.p34;
import defpackage.p41;
import defpackage.p5;
import defpackage.p61;
import defpackage.pb;
import defpackage.pd;
import defpackage.pm0;
import defpackage.pr4;
import defpackage.pz2;
import defpackage.q03;
import defpackage.q31;
import defpackage.q51;
import defpackage.q78;
import defpackage.q88;
import defpackage.qb;
import defpackage.qh;
import defpackage.qi4;
import defpackage.r34;
import defpackage.rb;
import defpackage.rd7;
import defpackage.rf;
import defpackage.rh5;
import defpackage.ri1;
import defpackage.rn2;
import defpackage.ro5;
import defpackage.s05;
import defpackage.s07;
import defpackage.s51;
import defpackage.s61;
import defpackage.s86;
import defpackage.sb;
import defpackage.sc;
import defpackage.sf;
import defpackage.t05;
import defpackage.t07;
import defpackage.t09;
import defpackage.t6;
import defpackage.ta;
import defpackage.tb2;
import defpackage.tc;
import defpackage.ti1;
import defpackage.tl6;
import defpackage.u09;
import defpackage.u15;
import defpackage.u86;
import defpackage.u98;
import defpackage.ua;
import defpackage.ub;
import defpackage.ue3;
import defpackage.ug2;
import defpackage.ul6;
import defpackage.ur4;
import defpackage.uw8;
import defpackage.v7;
import defpackage.vc;
import defpackage.vc0;
import defpackage.vj2;
import defpackage.vl6;
import defpackage.vm0;
import defpackage.vt2;
import defpackage.vw6;
import defpackage.vz4;
import defpackage.w39;
import defpackage.wb;
import defpackage.wc3;
import defpackage.wd3;
import defpackage.wd7;
import defpackage.wg;
import defpackage.wi4;
import defpackage.wr4;
import defpackage.wu1;
import defpackage.wz4;
import defpackage.x97;
import defpackage.xb;
import defpackage.xd3;
import defpackage.xd5;
import defpackage.xd6;
import defpackage.xd7;
import defpackage.xr5;
import defpackage.xt2;
import defpackage.xz;
import defpackage.xz0;
import defpackage.y05;
import defpackage.y2;
import defpackage.y45;
import defpackage.y74;
import defpackage.yb;
import defpackage.yb6;
import defpackage.yh2;
import defpackage.yn0;
import defpackage.yr6;
import defpackage.yv6;
import defpackage.yw;
import defpackage.z24;
import defpackage.z3;
import defpackage.z51;
import defpackage.z68;
import defpackage.zb;
import defpackage.zb3;
import defpackage.zd3;
import defpackage.zi1;
import defpackage.zu3;
import defpackage.zz2;
import io.sentry.c2;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\u0004:\u0006Ì\u0002Í\u0002Î\u0002J\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b\"\u0010#R+\u0010+\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u00105\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010=\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010D\u001a\u00020>2\u0006\u0010?\u001a\u00020>8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR+\u0010K\u001a\u00020E2\u0006\u0010$\u001a\u00020E8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010&\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010Q\u001a\u00020L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010_\u001a\u00020Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R+\u0010b\u001a\u00020`2\u0006\u0010$\u001a\u00020`8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010&\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001b\u0010i\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010cR\u0017\u0010o\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR \u0010v\u001a\u00020p8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bq\u0010r\u0012\u0004\bu\u00104\u001a\u0004\bs\u0010tR \u0010|\u001a\b\u0012\u0004\u0012\u00020p0w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u001d\u0010\u0082\u0001\u001a\u00020}8\u0016X\u0096\u0004¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0088\u0001\u001a\u00030\u0083\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0096\u0001\u001a\u00030\u0091\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R3\u0010£\u0001\u001a\u00030\u009d\u00012\u0007\u0010$\u001a\u00030\u009d\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009e\u0001\u0010&\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R \u0010¨\u0001\u001a\u00030¤\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b¥\u0001\u0010g\u001a\u0006\b¦\u0001\u0010§\u0001R\"\u0010®\u0001\u001a\u0005\u0018\u00010©\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\"\u0010´\u0001\u001a\u0005\u0018\u00010¯\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R \u0010º\u0001\u001a\u00030µ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R'\u0010¿\u0001\u001a\u00020`8V@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0005\b½\u0001\u0010c\"\u0005\b¾\u0001\u0010eR/\u0010Æ\u0001\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\bÀ\u0001\u0010Á\u0001\u0012\u0005\bÅ\u0001\u00104\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0005\bÄ\u0001\u0010\u0016R \u0010Ë\u0001\u001a\u00030Ç\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bÈ\u0001\u0010&\u001a\u0006\bÉ\u0001\u0010Ê\u0001R3\u0010Ò\u0001\u001a\u00030Ì\u00012\u0007\u0010$\u001a\u00030Ì\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÍ\u0001\u0010&\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R \u0010Ø\u0001\u001a\u00030Ó\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001RD\u0010â\u0001\u001a\u0016\u0012\u0005\u0012\u00030Ú\u0001\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00140Ù\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÛ\u0001\u0010Ü\u0001\u0012\u0005\bá\u0001\u00104\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R'\u0010æ\u0001\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bã\u0001\u0010¼\u0001\u001a\u0005\bä\u0001\u0010c\"\u0005\bå\u0001\u0010eR \u0010ì\u0001\u001a\u00030ç\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R'\u0010ï\u0001\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bí\u0001\u0010(\"\u0005\bî\u0001\u0010*R\u0018\u0010ó\u0001\u001a\u00030ð\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010ò\u0001R\u0017\u0010ö\u0001\u001a\u00020!8VX\u0096\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001R\u0015\u0010ú\u0001\u001a\u00030÷\u00018F¢\u0006\b\u001a\u0006\bø\u0001\u0010ù\u0001R\u001f\u0010ÿ\u0001\u001a\u00030û\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bþ\u0001\u00104\u001a\u0006\bü\u0001\u0010ý\u0001R\u0018\u0010\u0083\u0002\u001a\u00030\u0080\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0084\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R*\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0005\b\u008c\u0002\u0010\u001aR\u0018\u0010\u0090\u0002\u001a\u00030\u008d\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0091\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0018\u0010\u0098\u0002\u001a\u00030\u0095\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u0099\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0017\u0010\u009e\u0002\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010Ã\u0001R\u0016\u0010 \u0002\u001a\u00020`8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0002\u0010cR\u001f\u0010¥\u0002\u001a\u00030¡\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b¤\u0002\u00104\u001a\u0006\b¢\u0002\u0010£\u0002R\u0018\u0010©\u0002\u001a\u00030¦\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b§\u0002\u0010¨\u0002R\u0018\u0010\u00ad\u0002\u001a\u00030ª\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002R\u001f\u0010²\u0002\u001a\u00030®\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b±\u0002\u00104\u001a\u0006\b¯\u0002\u0010°\u0002R\u0018\u0010¶\u0002\u001a\u00030³\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010µ\u0002R\u0018\u0010º\u0002\u001a\u00030·\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¸\u0002\u0010¹\u0002R\u0018\u0010¾\u0002\u001a\u00030»\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0002\u0010½\u0002R\u0013\u0010À\u0002\u001a\u00020`8F¢\u0006\u0007\u001a\u0005\b¿\u0002\u0010cR\u0019\u0010Ã\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010Â\u0002R\u0018\u0010Ç\u0002\u001a\u00030Ä\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010Æ\u0002R\u0018\u0010Ë\u0002\u001a\u00030È\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010Ê\u0002¨\u0006Ï\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lmf5;", "Lro5;", _UrlKt.FRAGMENT_ENCODE_SET, "Lpr4;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lxd5;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Lch2;", _UrlKt.FRAGMENT_ENCODE_SET, "getImportantForAutofill", "()I", "Ls86;", "getEmbeddedViewFocusRect", "()Ls86;", _UrlKt.FRAGMENT_ENCODE_SET, "intervalMillis", "Ldn8;", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Ltl6;", "handler", "setUncaughtExceptionHandler", "(Ltl6;)V", "Lkotlin/Function1;", "Lxz0;", "callback", "setOnReadyForComposition", "(Lgn2;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "<set-?>", "f0", "Ly05;", "get_composeViewContext", "()Lxz0;", "set_composeViewContext", "(Lxz0;)V", "_composeViewContext", "Lzb3;", "i0", "Lzb3;", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui", "()Lzb3;", "setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui", "(Lzb3;)V", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations", "()V", "primaryDirectionalMotionAxisOverride", "Li94;", "j0", "Li94;", "getFrameEndScheduler$ui", "()Li94;", "setFrameEndScheduler$ui", "(Li94;)V", "frameEndScheduler", "Ldk6;", "value", "m0", "Ldk6;", "getRetainedValuesStore", "()Ldk6;", "retainedValuesStore", "Lfi1;", "p0", "getDensity", "()Lfi1;", "setDensity", "(Lfi1;)V", "density", "Leh2;", "r0", "Leh2;", "getFocusOwner", "()Leh2;", "focusOwner", "Ls61;", "s0", "Ls61;", "getCoroutineContext", "()Ls61;", "setCoroutineContext", "(Ls61;)V", "coroutineContext", "Lpd;", "t0", "Lpd;", "getDragAndDropManager", "()Lpd;", "dragAndDropManager", _UrlKt.FRAGMENT_ENCODE_SET, "u0", "isAttached", "()Z", "setAttached", "(Z)V", "v0", "Llh7;", "getDerivedIsAttached", "derivedIsAttached", "Lje3;", "w0", "Lje3;", "getInsetsListener", "()Lje3;", "insetsListener", "Landroidx/compose/ui/node/LayoutNode;", "x0", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "getRoot$annotations", "root", "Lvz4;", "y0", "Lvz4;", "getLayoutNodes", "()Lvz4;", "layoutNodes", "Lu86;", "z0", "Lu86;", "getRectManager", "()Lu86;", "rectManager", "Lb17;", "A0", "Lb17;", "getSemanticsOwner", "()Lb17;", "semanticsOwner", "Lvc;", "C0", "Lvc;", "getContentCaptureManager$ui", "()Lvc;", "setContentCaptureManager$ui", "(Lvc;)V", "contentCaptureManager", "Lvt2;", "D0", "Lvt2;", "getGraphicsContext", "()Lvt2;", "graphicsContext", "Lxz;", "E0", "Lxz;", "getAutofillTree", "()Lxz;", "autofillTree", "Landroid/content/res/Configuration;", "K0", "getConfiguration", "()Landroid/content/res/Configuration;", "setConfiguration", "(Landroid/content/res/Configuration;)V", "configuration", "Lge4;", "L0", "getLocaleList", "()Lge4;", "localeList", "Lta;", "M0", "Lta;", "getAutofill", "()Lta;", "autofill", "Lua;", "N0", "Lua;", "getAutofillManager", "()Lua;", "autofillManager", "Lof5;", "P0", "Lof5;", "getSnapshotObserver", "()Lof5;", "snapshotObserver", "Q0", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "showLayoutBounds", "b1", "J", "getLastMatrixRecalculationAnimationTime$ui", "()J", "setLastMatrixRecalculationAnimationTime$ui", "getLastMatrixRecalculationAnimationTime$ui$annotations", "lastMatrixRecalculationAnimationTime", "Lfi2;", "j1", "getFontFamilyResolver", "()Lfi2;", "fontFamilyResolver", "Lz24;", "k1", "getLayoutDirection", "()Lz24;", "setLayoutDirection", "(Lz24;)V", "layoutDirection", "Lmx4;", "m1", "Lmx4;", "getModifierLocalManager", "()Lmx4;", "modifierLocalManager", "Lkotlin/Function2;", "Lug2;", "z1", "Lrn2;", "getPlayNavigationSoundEffect$ui", "()Lrn2;", "setPlayNavigationSoundEffect$ui", "(Lrn2;)V", "getPlayNavigationSoundEffect$ui$annotations", "playNavigationSoundEffect", "E1", "getComposeViewContextIncrementedDuringInit$ui", "setComposeViewContextIncrementedDuringInit$ui", "composeViewContextIncrementedDuringInit", "Lgq5;", "I1", "Lgq5;", "getPointerIconService", "()Lgq5;", "pointerIconService", "getComposeViewContext", "setComposeViewContext", "composeViewContext", "Lp34;", "getSharedDrawScope", "()Lp34;", "sharedDrawScope", "getView", "()Landroid/view/View;", "view", "Lhq1;", "getSavedStateRegistry", "()Lhq1;", "savedStateRegistry", "Lt09;", "getWindowInfo", "()Lt09;", "getWindowInfo$annotations", "windowInfo", "Lfw8;", "getViewConfiguration", "()Lfw8;", "viewConfiguration", "Lul6;", "getRootForTest", "()Lul6;", "rootForTest", "uncaughtExceptionHandler", "Ltl6;", "getUncaughtExceptionHandler$ui", "()Ltl6;", "setUncaughtExceptionHandler$ui", "Lz3;", "getAccessibilityManager", "()Lz3;", "accessibilityManager", "Llu0;", "getClipboardManager", "()Llu0;", "clipboardManager", "Liu0;", "getClipboard", "()Liu0;", "clipboard", "Lgi;", "getAndroidViewsHandler$ui", "()Lgi;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lo78;", "getTextInputService", "()Lo78;", "getTextInputService$annotations", "textInputService", "Lbe7;", "getSoftwareKeyboardController", "()Lbe7;", "softwareKeyboardController", "Ldo5;", "getPlacementScope", "()Ldo5;", "placementScope", "Lei2;", "getFontLoader", "()Lei2;", "getFontLoader$annotations", "fontLoader", "Lez2;", "getHapticFeedBack", "()Lez2;", "hapticFeedBack", "Lzd3;", "getInputModeManager", "()Lzd3;", "inputModeManager", "Lq88;", "getTextToolbar", "()Lq88;", "textToolbar", "getScrollCaptureInProgress", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "outOfFrameExecutor", "Lvm0;", "getCanvasHolder", "()Lvm0;", "canvasHolder", "Lq78;", "getLegacyTextInputServiceAndroid", "()Lq78;", "legacyTextInputServiceAndroid", "sb", "ch3", "tb", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidComposeView extends ViewGroup implements mf5, ro5, ul6, pr4, DefaultLifecycleObserver, xd5, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, ch2 {
    public static Class J1;
    public static Method K1;
    public static Method L1;
    public static final j05 M1 = new j05();
    public static v7 N1;
    public static Method O1;
    public static Method P1;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public final b17 semanticsOwner;
    public final m70 A1;
    public final gc B0;
    public final mb B1;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public vc contentCaptureManager;
    public final mb C1;
    public final he D0;
    public boolean D1;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public final xz autofillTree;

    /* JADX INFO: renamed from: E1, reason: from kotlin metadata */
    public boolean composeViewContextIncrementedDuringInit;
    public final j05 F0;
    public boolean F1;
    public j05 G0;
    public final p41 G1;
    public boolean H0;
    public View H1;
    public final hy4 I0;
    public final wb I1;
    public final wg J0;
    public final rh5 K0;
    public final zi1 L0;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public final ta autofill;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public final ua autofillManager;
    public boolean O0;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public final of5 snapshotObserver;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public gi R0;
    public q31 S0;
    public boolean T0;
    public final ri1 U0;
    public long V0;
    public final int[] W0;
    public final float[] X0;
    public final Matrix Y0;
    public final float[] Z0;
    public final float[] a1;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;
    public boolean c1;
    public long d1;
    public gn2 e1;
    public final rh5 f0;
    public q78 f1;
    public long g0;
    public o78 g1;
    public final boolean h0;
    public final AtomicReference h1;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public zb3 primaryDirectionalMotionAxisOverride;
    public ai1 i1;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public i94 frameEndScheduler;

    /* JADX INFO: renamed from: j1, reason: from kotlin metadata */
    public final y05 fontFamilyResolver;
    public j94 k0;
    public final rh5 k1;
    public hq1 l0;
    public zd3 l1;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public dk6 retainedValuesStore;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    public final mx4 modifierLocalManager;
    public final kt n0;
    public qh n1;
    public final rb o0;
    public MotionEvent o1;
    public final rh5 p0;
    public long p1;
    public final View q0;
    public final xd6 q1;
    public final gh2 r0;
    public final j05 r1;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public s61 coroutineContext;
    public float s1;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public final pd dragAndDropManager;
    public float t1;
    public final rh5 u0;
    public float u1;
    public final zi1 v0;
    public float v1;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public final je3 insetsListener;
    public final xb w1;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public final LayoutNode root;
    public final rb x1;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public final vz4 layoutNodes;
    public boolean y1;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public final u86 rectManager;

    /* JADX INFO: renamed from: z1, reason: from kotlin metadata */
    public rn2 playNavigationSoundEffect;

    public AndroidComposeView(Context context, xz0 xz0Var) {
        z24 z24Var;
        super(context);
        this.f0 = z51.H(xz0Var);
        this.g0 = 9205357640488583168L;
        byte b = 1;
        this.h0 = true;
        this.retainedValuesStore = pz2.S0;
        this.n0 = new kt();
        byte b2 = 0;
        this.o0 = new rb(this, b2);
        this.p0 = new rh5(gv3.d(context), lh4.x0);
        this.r0 = new gh2(this, this);
        this.coroutineContext = xz0Var.c().j();
        this.dragAndDropManager = new pd();
        this.u0 = z51.H(Boolean.FALSE);
        byte b3 = 2;
        this.v0 = rd7.b(new mb(this, b3));
        this.insetsListener = new je3();
        LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.f0(vl6.c);
        layoutNode.c0(getDensity());
        layoutNode.h0(getViewConfiguration());
        layoutNode.g0(new yb(this).y(((gh2) getFocusOwner()).e).y(getDragAndDropManager().c));
        this.root = layoutNode;
        vz4 vz4Var = gf3.a;
        this.layoutNodes = new vz4();
        this.rectManager = new u86(getLayoutNodes(), this);
        this.semanticsOwner = new b17(getRoot(), new k02(), getLayoutNodes());
        gc gcVar = new gc(this);
        this.B0 = gcVar;
        this.contentCaptureManager = new vc(this, new ub(0, this, oc.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, (byte) 0));
        this.D0 = new he(this);
        this.autofillTree = new xz();
        this.F0 = new j05();
        this.I0 = new hy4();
        LayoutNode root = getRoot();
        wg wgVar = new wg();
        wgVar.b = root;
        wgVar.c = new n03((fd3) root.H0.f0);
        byte b4 = 4;
        wgVar.d = new y45((byte) 4);
        wgVar.e = new q03();
        this.J0 = wgVar;
        this.K0 = z51.H(new Configuration(context.getResources().getConfiguration()));
        this.L0 = rd7.b(new mb(this, (byte) 3));
        this.autofill = b() ? new ta(this, getAutofillTree()) : null;
        this.autofillManager = b() ? new ua(new mo5(context), getSemanticsOwner(), this, getRectManager(), context.getPackageName()) : null;
        this.snapshotObserver = new of5(new lb(this, b));
        LayoutNode root2 = getRoot();
        ri1 ri1Var = new ri1();
        ri1Var.c = root2;
        ri1Var.d = new lr((byte) 21);
        ri1Var.e = new zz2((byte) 17);
        ri1Var.f = new c15(0, new LayoutNode[16]);
        ri1Var.g = new c15(0, new ur4[16]);
        this.U0 = ri1Var;
        this.V0 = 9223372034707292159L;
        this.W0 = new int[]{0, 0};
        this.X0 = or4.a();
        this.Y0 = new Matrix();
        this.Z0 = or4.a();
        this.a1 = or4.a();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.d1 = 9187343241974906880L;
        this.h1 = new AtomicReference(null);
        this.fontFamilyResolver = xz0Var.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = ah2.a;
        z24 z24Var2 = z24.X;
        if (layoutDirection != 0) {
            z24Var = layoutDirection != 1 ? null : z24.Y;
        } else {
            z24Var = z24Var2;
        }
        this.k1 = z51.H(z24Var != null ? z24Var : z24Var2);
        this.modifierLocalManager = new mx4(this);
        this.q1 = new xd6((byte) 25);
        this.r1 = new j05();
        this.s1 = Float.NaN;
        this.t1 = Float.NaN;
        this.u1 = Float.NaN;
        this.v1 = Float.NaN;
        this.w1 = new xb(this, b2);
        this.x1 = new rb(this, b);
        this.playNavigationSoundEffect = new sb(this, b2);
        this.A1 = new m70(context, new lb(this, b3));
        this.B1 = new mb(this, b4);
        this.C1 = new mb(this, b2);
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            nc.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        cw8.n(this, gcVar);
        setOnDragListener(getDragAndDropManager());
        if (i >= 29) {
            ic.a.a(this);
        }
        if (l()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(g46.hide_in_inspector_tag, Boolean.TRUE);
            this.q0 = view;
            addView(view, -1);
        }
        this.G1 = i >= 31 ? new p41() : null;
        this.I1 = new wb(this);
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).s();
            } else if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt);
            }
        }
    }

    public static long d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        c2.g();
        return 0L;
    }

    public static final boolean f(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    private final vm0 getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.v0.getValue()).booleanValue();
    }

    private final q78 getLegacyTextInputServiceAndroid() {
        q78 q78Var = this.f1;
        if (q78Var != null) {
            return q78Var;
        }
        q78 q78Var2 = new q78(getView(), this, new ob(this, (byte) 0));
        this.f1 = q78Var2;
        return q78Var2;
    }

    private final xz0 get_composeViewContext() {
        return (xz0) this.f0.getValue();
    }

    public static void i(LayoutNode layoutNode) {
        layoutNode.G();
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            i((LayoutNode) objArr[i2]);
        }
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean m(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !iy4.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.u0.setValue(Boolean.valueOf(z));
    }

    private void setDensity(fi1 fi1Var) {
        this.p0.setValue(fi1Var);
    }

    private void setLayoutDirection(z24 z24Var) {
        this.k1.setValue(z24Var);
    }

    private final void set_composeViewContext(xz0 xz0Var) {
        this.f0.setValue(xz0Var);
    }

    public final void A() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.Z0;
        int[] iArr = this.W0;
        if (i >= 29) {
            vc0.a.a(this, fArr, this.Y0, iArr);
        } else {
            or4.d(fArr);
            os4.T(this, fArr, this.X0, iArr);
        }
        x97.D(fArr, this.a1);
    }

    public final boolean B() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void C(dn2 dn2Var) {
        kt ktVar = this.n0;
        boolean zIsEmpty = ktVar.isEmpty();
        ktVar.addLast(dn2Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.o0);
            } else {
                bt.q("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void D(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.r() == m34.X) {
                if (!this.T0) {
                    LayoutNode layoutNodeW = layoutNode.w();
                    if (layoutNodeW == null) {
                        break;
                    }
                    long j = ((fd3) layoutNodeW.H0.f0).f0;
                    if (q31.f(j) && q31.e(j)) {
                        break;
                    }
                }
                layoutNode = layoutNode.w();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long E(long j) {
        y();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.d1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.d1 & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        return or4.b(this.a1, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (jFloatToRawIntBits << 32));
    }

    public final int F(MotionEvent motionEvent) {
        Object obj;
        if (this.D1) {
            this.D1 = false;
            y74 y74Var = getComposeViewContext().t;
            u09.a.setValue(new nq5(motionEvent.getMetaState()));
        }
        hy4 hy4Var = this.I0;
        zz2 zz2VarC = hy4Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        wg wgVar = this.J0;
        if (zz2VarC == null) {
            if (!wgVar.a) {
                ((qi4) ((y45) wgVar.d).X).a();
                ((n03) wgVar.c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) zz2VarC.Y;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = arrayList.get(size);
            if (((jq5) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        jq5 jq5Var = (jq5) obj;
        if (jq5Var != null) {
            this.g0 = jq5Var.d;
        }
        int iS = wgVar.s(zz2VarC, this, n(motionEvent));
        zz2VarC.Z = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iS & 1) != 0) {
            return iS;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        hy4Var.c.delete(pointerId);
        hy4Var.b.delete(pointerId);
        return iS;
    }

    public final void G(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jP = p((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jP >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jP & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        zz2 zz2VarC = this.I0.c(motionEventObtain, this);
        zz2VarC.getClass();
        this.J0.s(zz2VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void H(rn2 rn2Var, s51 s51Var) {
        zb zbVar;
        if (s51Var instanceof zb) {
            zbVar = (zb) s51Var;
            int i = zbVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                zbVar.h0 = i - Integer.MIN_VALUE;
            } else {
                zbVar = new zb(this, s51Var);
            }
        } else {
            zbVar = new zb(this, s51Var);
        }
        Object obj = zbVar.f0;
        int i2 = zbVar.h0;
        if (i2 == 0) {
            w39.n0(obj);
            lb lbVar = new lb(this, (byte) 0);
            zbVar.h0 = 1;
            if (gv3.n(new wu1((Object) lbVar, (Serializable) this.h1, (Object) rn2Var, (q51) null, (byte) 9), zbVar) == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        b61.n();
    }

    public final void I(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (dh3.f(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(gv3.d(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void J() {
        boolean z;
        int i;
        int[] iArr = this.W0;
        getLocationOnScreen(iArr);
        long j = this.V0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.lastMatrixRecalculationAnimationTime >= 0) {
            z = false;
        } else {
            this.V0 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                c15 c15VarC = getRoot().C();
                Object[] objArr = c15VarC.X;
                int i5 = c15VarC.Z;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((LayoutNode) objArr[i6]).I0.p.s0();
                }
                z = true;
            }
        }
        y();
        View rootView = this.H1;
        if (rootView == null) {
            rootView = getRootView();
            this.H1 = rootView;
        }
        u86 rectManager = getRectManager();
        long j2 = this.V0;
        long jM = nr4.M(this.d1);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.Z0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        u98 u98Var = rectManager.d;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.g = u98Var.b(j2, jM, fArr, width, height) || rectManager.g;
        this.U0.f(z);
        getRectManager().a();
    }

    public final void K(float f) {
        if (l()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.s1) || f > this.s1) {
                    this.s1 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.t1) || f < this.t1) {
                    this.t1 = f;
                }
            }
        }
    }

    @Override // defpackage.ch2
    public final void a(ai2 ai2Var, ai2 ai2Var2) {
        t6 t6Var;
        boolean z;
        t6 t6Var2;
        boolean z2;
        if (ai2Var != null) {
            ai2 ai2Var3 = ai2Var;
            if (!ai2Var3.X.p0) {
                wc3.b("visitAncestors called on an unattached node");
            }
            jx4 jx4Var = ai2Var3.X;
            LayoutNode layoutNodeZ = yn0.Z(ai2Var);
            t05 t05Var = null;
            ArrayList arrayList = null;
            while (layoutNodeZ != null) {
                if ((((jx4) layoutNodeZ.H0.i0).f0 & 2097152) != 0) {
                    while (jx4Var != null) {
                        if ((jx4Var.Z & 2097152) != 0) {
                            jx4 jx4VarT = jx4Var;
                            c15 c15Var = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ic3) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(jx4VarT);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (jx4VarT.Z & 2097152) != 0 && (jx4VarT instanceof oh1)) {
                                    int i = 0;
                                    for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                        if ((jx4Var2.Z & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                jx4VarT = jx4Var2;
                                            } else {
                                                if (c15Var == null) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT != null) {
                                                    c15Var.b(jx4VarT);
                                                    jx4VarT = null;
                                                }
                                                c15Var.b(jx4Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                jx4VarT = yn0.T(c15Var);
                            }
                        }
                        jx4Var = jx4Var.g0;
                    }
                }
                layoutNodeZ = layoutNodeZ.w();
                jx4Var = (layoutNodeZ == null || (t6Var2 = layoutNodeZ.H0) == null) ? null : (f18) t6Var2.h0;
            }
            if (arrayList == null) {
                return;
            }
            if (ai2Var2 != null) {
                if (!ai2Var2.X.p0) {
                    wc3.b("visitAncestors called on an unattached node");
                }
                jx4 jx4Var3 = ai2Var2.X;
                LayoutNode layoutNodeZ2 = yn0.Z(ai2Var2);
                t05 t05Var2 = null;
                while (layoutNodeZ2 != null) {
                    if ((((jx4) layoutNodeZ2.H0.i0).f0 & 2097152) != 0) {
                        while (jx4Var3 != null) {
                            if ((jx4Var3.Z & 2097152) != 0) {
                                jx4 jx4VarT2 = jx4Var3;
                                c15 c15Var2 = null;
                                while (jx4VarT2 != null) {
                                    if (jx4VarT2 instanceof ic3) {
                                        if (t05Var2 == null) {
                                            t05 t05Var3 = vw6.a;
                                            t05Var2 = new t05();
                                        }
                                        t05Var2.a(jx4VarT2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (jx4VarT2.Z & 2097152) != 0 && (jx4VarT2 instanceof oh1)) {
                                        int i2 = 0;
                                        for (jx4 jx4Var4 = ((oh1) jx4VarT2).r0; jx4Var4 != null; jx4Var4 = jx4Var4.h0) {
                                            if ((jx4Var4.Z & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    jx4VarT2 = jx4Var4;
                                                } else {
                                                    if (c15Var2 == null) {
                                                        c15Var2 = new c15(0, new jx4[16]);
                                                    }
                                                    if (jx4VarT2 != null) {
                                                        c15Var2.b(jx4VarT2);
                                                        jx4VarT2 = null;
                                                    }
                                                    c15Var2.b(jx4Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    jx4VarT2 = yn0.T(c15Var2);
                                }
                            }
                            jx4Var3 = jx4Var3.g0;
                        }
                    }
                    layoutNodeZ2 = layoutNodeZ2.w();
                    jx4Var3 = (layoutNodeZ2 == null || (t6Var = layoutNodeZ2.H0) == null) ? null : (f18) t6Var.h0;
                }
                t05Var = t05Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ic3 ic3Var = (ic3) arrayList.get(i3);
                if (!(t05Var != null ? t05Var.c(ic3Var) : false)) {
                    ic3Var.l0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ai2 ai2Var = ((gh2) getFocusOwner()).c;
        if (!ai2Var.p0) {
            return;
        }
        if (!ai2Var.X.p0) {
            wc3.b("visitSubtreeIf called on an unattached node");
        }
        c15 c15Var = new c15(0, new jx4[16]);
        jx4 jx4Var = ai2Var.X;
        jx4 jx4Var2 = jx4Var.h0;
        if (jx4Var2 == null) {
            yn0.n(c15Var, jx4Var);
        } else {
            c15Var.b(jx4Var2);
        }
        while (true) {
            int i3 = c15Var.Z;
            if (i3 == 0) {
                return;
            }
            jx4 jx4Var3 = (jx4) c15Var.k(i3 - 1);
            if ((jx4Var3.f0 & 1024) != 0) {
                for (jx4 jx4Var4 = jx4Var3; jx4Var4 != null && jx4Var4.p0; jx4Var4 = jx4Var4.h0) {
                    if ((jx4Var4.Z & 1024) != 0) {
                        jx4 jx4VarT = jx4Var4;
                        c15 c15Var2 = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ai2) {
                                ai2 ai2Var2 = (ai2) jx4VarT;
                                if (ai2Var2.p0 && ai2Var2.a1().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    ai2 ai2Var3 = ((gh2) getFocusOwner()).c;
                                    if (ai2Var3.p0) {
                                        if (!ai2Var3.X.p0) {
                                            wc3.b("visitSubtreeIf called on an unattached node");
                                        }
                                        c15 c15Var3 = new c15(0, new jx4[16]);
                                        jx4 jx4Var5 = ai2Var3.X;
                                        jx4 jx4Var6 = jx4Var5.h0;
                                        if (jx4Var6 == null) {
                                            yn0.n(c15Var3, jx4Var5);
                                        } else {
                                            c15Var3.b(jx4Var6);
                                        }
                                        while (true) {
                                            int i4 = c15Var3.Z;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            jx4 jx4Var7 = (jx4) c15Var3.k(i4 - 1);
                                            if ((jx4Var7.f0 & 1024) != 0) {
                                                for (jx4 jx4Var8 = jx4Var7; jx4Var8 != null && jx4Var8.p0; jx4Var8 = jx4Var8.h0) {
                                                    if ((jx4Var8.Z & 1024) != 0) {
                                                        jx4 jx4VarT2 = jx4Var8;
                                                        c15 c15Var4 = null;
                                                        while (jx4VarT2 != null) {
                                                            if (jx4VarT2 instanceof ai2) {
                                                                ai2 ai2Var4 = (ai2) jx4VarT2;
                                                                if (ai2Var4.p0) {
                                                                    jh2 jh2VarA1 = ai2Var4.a1();
                                                                    if (ai2Var4.p0 && jh2VarA1.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((jx4VarT2.Z & 1024) != 0 && (jx4VarT2 instanceof oh1)) {
                                                                int i5 = 0;
                                                                for (jx4 jx4Var9 = ((oh1) jx4VarT2).r0; jx4Var9 != null; jx4Var9 = jx4Var9.h0) {
                                                                    if ((jx4Var9.Z & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            jx4VarT2 = jx4Var9;
                                                                        } else {
                                                                            if (c15Var4 == null) {
                                                                                c15Var4 = new c15(0, new jx4[16]);
                                                                            }
                                                                            if (jx4VarT2 != null) {
                                                                                c15Var4.b(jx4VarT2);
                                                                                jx4VarT2 = null;
                                                                            }
                                                                            c15Var4.b(jx4Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            jx4VarT2 = yn0.T(c15Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            yn0.n(c15Var3, jx4Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                int i6 = 0;
                                for (jx4 jx4Var10 = ((oh1) jx4VarT).r0; jx4Var10 != null; jx4Var10 = jx4Var10.h0) {
                                    if ((jx4Var10.Z & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            jx4VarT = jx4Var10;
                                        } else {
                                            if (c15Var2 == null) {
                                                c15Var2 = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var2.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var2.b(jx4Var10);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var2);
                        }
                    }
                }
            }
            yn0.n(c15Var, jx4Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (b()) {
            ua autofillManager = getAutofillManager();
            if (autofillManager != null) {
                autofillManager.b(sparseArray);
            }
            ta autofill = getAutofill();
            if (autofill != null) {
                ue3.D(autofill, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.B0.m(false, i, this.g0);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.B0.m(true, i, this.g0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j05 j05Var = this.F0;
        if (!isAttachedToWindow()) {
            i(getRoot());
        }
        q(true);
        kd7.h().m();
        this.H0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            vm0 canvasHolder = getCanvasHolder();
            eb ebVar = canvasHolder.a;
            Canvas canvas2 = ebVar.a;
            ebVar.a = canvas;
            getRoot().i(ebVar, null);
            canvasHolder.a.a = canvas2;
            if (j05Var.j()) {
                int i = j05Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((au2) ((lf5) j05Var.g(i2))).g();
                }
            }
            int i3 = uw8.f0;
            j05Var.d();
            this.H0 = false;
            Trace.endSection();
            j05 j05Var2 = this.G0;
            if (j05Var2 != null) {
                j05Var.b(j05Var2);
                j05Var2.d();
            }
            if (l()) {
                if (Float.compare(this.s1, this.u1) != 0) {
                    float f = this.s1;
                    this.u1 = f;
                    on.a(this, f);
                }
                View view = this.q0;
                if (view != null) {
                    if (Float.compare(this.t1, this.v1) != 0) {
                        float f2 = this.t1;
                        this.v1 = f2;
                        on.a(view, f2);
                    }
                    if (!Float.isNaN(this.t1)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.s1 = Float.NaN;
                this.t1 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 2003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014d, code lost:
    
        if (o(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        byte b = 1;
        if (!isFocused()) {
            return ((gh2) getFocusOwner()).d(keyEvent, new p5(this, keyEvent, b));
        }
        y74 y74Var = getComposeViewContext().t;
        u09.a.setValue(new nq5(keyEvent.getMetaState()));
        return ((gh2) getFocusOwner()).d(keyEvent, new j72((byte) 10)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        t6 t6Var;
        if (isFocused()) {
            gh2 gh2Var = (gh2) getFocusOwner();
            if (gh2Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                ai2 ai2VarL = u15.l(gh2Var.c);
                if (ai2VarL != null) {
                    if (!ai2VarL.X.p0) {
                        wc3.b("visitAncestors called on an unattached node");
                    }
                    jx4 jx4Var = ai2VarL.X;
                    LayoutNode layoutNodeZ = yn0.Z(ai2VarL);
                    while (layoutNodeZ != null) {
                        if ((((jx4) layoutNodeZ.H0.i0).f0 & 131072) != 0) {
                            while (jx4Var != null) {
                                if ((jx4Var.Z & 131072) != 0) {
                                    jx4 jx4VarT = jx4Var;
                                    c15 c15Var = null;
                                    while (jx4VarT != null) {
                                        if ((jx4VarT.Z & 131072) != 0 && (jx4VarT instanceof oh1)) {
                                            int i = 0;
                                            for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                                if ((jx4Var2.Z & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        jx4VarT = jx4Var2;
                                                    } else {
                                                        if (c15Var == null) {
                                                            c15Var = new c15(0, new jx4[16]);
                                                        }
                                                        if (jx4VarT != null) {
                                                            c15Var.b(jx4VarT);
                                                            jx4VarT = null;
                                                        }
                                                        c15Var.b(jx4Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        jx4VarT = yn0.T(c15Var);
                                    }
                                }
                                jx4Var = jx4Var.g0;
                            }
                        }
                        layoutNodeZ = layoutNodeZ.w();
                        jx4Var = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (b()) {
            this.F1 = true;
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                this.F1 = false;
                x(viewStructure);
            } catch (Throwable th) {
                this.F1 = false;
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            hc.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object ywVar;
        ai2 ai2VarF;
        if (this.y1) {
            rb rbVar = this.x1;
            removeCallbacks(rbVar);
            MotionEvent motionEvent2 = this.o1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.y1 = false;
            } else {
                rbVar.run();
            }
        }
        if (!m(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int iH = h(motionEvent);
            int i = 1;
            if ((iH & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (ywVar = view.getTag(g46.auto_clear_focus_behavior_tag)) == null) {
                    ywVar = new yw(i);
                }
                if (ywVar.equals(new yw(i)) && (ai2VarF = ((gh2) getFocusOwner()).f()) != null) {
                    i55 i55VarY = yn0.Y(ai2VarF);
                    if (!jm4.x(i55VarY).H(i55VarY, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((gh2) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iH & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final lf5 e(rn2 rn2Var, e55 e55Var, xt2 xt2Var) {
        c15 c15Var;
        Reference referencePoll;
        Object obj;
        if (xt2Var != null) {
            return new au2(xt2Var, null, this, rn2Var, e55Var);
        }
        do {
            xd6 xd6Var = this.q1;
            ReferenceQueue referenceQueue = (ReferenceQueue) xd6Var.Z;
            c15Var = (c15) xd6Var.Y;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                c15Var.j(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = c15Var.Z;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) c15Var.k(i - 1)).get();
        } while (obj == null);
        lf5 lf5Var = (lf5) obj;
        if (lf5Var == null) {
            return new au2(getGraphicsContext().c(), getGraphicsContext(), this, rn2Var, e55Var);
        }
        au2 au2Var = (au2) lf5Var;
        vt2 vt2Var = au2Var.Y;
        if (vt2Var == null) {
            throw p61.j("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!au2Var.X.s) {
            wc3.a("layer should have been released before reuse");
        }
        au2Var.X = vt2Var.c();
        au2Var.i0 = false;
        au2Var.f0 = rn2Var;
        au2Var.g0 = e55Var;
        au2Var.s0 = false;
        au2Var.t0 = false;
        au2Var.u0 = true;
        or4.d(au2Var.j0);
        float[] fArr = au2Var.k0;
        if (fArr != null) {
            or4.d(fArr);
        }
        au2Var.q0 = gd8.b;
        au2Var.v0 = false;
        au2Var.h0 = 9223372034707292159L;
        au2Var.r0 = null;
        au2Var.p0 = 0;
        return lf5Var;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return ch3.t(this, accessibilityId);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        s86 s86VarA;
        if (view == null || this.U0.a) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus != null && !viewFindNextFocus.equals(this)) {
            ViewParent parent = viewFindNextFocus.getParent();
            while (true) {
                if (parent == null) {
                    viewFindNextFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        } else {
            viewFindNextFocus = null;
            break;
        }
        if (view == this) {
            ai2 ai2VarL = u15.l(((gh2) getFocusOwner()).c);
            s86VarA = ai2VarL != null ? u15.o(ai2VarL) : null;
            if (s86VarA == null) {
                s86VarA = ah2.a(view, this);
            }
        } else {
            s86VarA = ah2.a(view, this);
        }
        ug2 ug2VarC = ah2.c(i);
        int i2 = ug2VarC != null ? ug2VarC.a : 6;
        ea6 ea6Var = new ea6();
        if (((gh2) getFocusOwner()).e(i2, s86VarA, new nb(ea6Var, (byte) 0)) == null) {
            return view;
        }
        Object obj = ea6Var.X;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || gs8.k(u15.o((ai2) obj), ah2.a(viewFindNextFocus, this), s86VarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final void g(LayoutNode layoutNode, boolean z) {
        this.U0.l(layoutNode, z);
    }

    @Override // defpackage.mf5
    public z3 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final gi getAndroidViewsHandler$ui() {
        if (this.R0 == null) {
            gi giVar = new gi(getContext());
            this.R0 = giVar;
            addView(giVar, -1);
            requestLayout();
        }
        gi giVar2 = this.R0;
        giVar2.getClass();
        return giVar2;
    }

    @Override // defpackage.mf5
    public xz getAutofillTree() {
        return this.autofillTree;
    }

    @Override // defpackage.mf5
    public iu0 getClipboard() {
        return getComposeViewContext().n;
    }

    @Override // defpackage.mf5
    public lu0 getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final xz0 getComposeViewContext() {
        return get_composeViewContext();
    }

    /* JADX INFO: renamed from: getComposeViewContextIncrementedDuringInit$ui, reason: from getter */
    public final boolean getComposeViewContextIncrementedDuringInit() {
        return this.composeViewContextIncrementedDuringInit;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.K0.getValue();
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui, reason: from getter */
    public final vc getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // defpackage.mf5
    public s61 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // defpackage.mf5
    public fi1 getDensity() {
        return (fi1) this.p0.getValue();
    }

    @Override // defpackage.ro5
    public s86 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            ai2 ai2VarL = u15.l(((gh2) getFocusOwner()).c);
            if (ai2VarL != null) {
                return u15.o(ai2VarL);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return ah2.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // defpackage.mf5
    public eh2 getFocusOwner() {
        return this.r0;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        s86 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (dh3.f(((gh2) getFocusOwner()).e(6, null, new y2((byte) 7)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // defpackage.mf5
    public fi2 getFontFamilyResolver() {
        return (fi2) this.fontFamilyResolver.getValue();
    }

    @Override // defpackage.mf5
    public ei2 getFontLoader() {
        return getComposeViewContext().o;
    }

    /* JADX INFO: renamed from: getFrameEndScheduler$ui, reason: from getter */
    public final i94 getFrameEndScheduler() {
        return this.frameEndScheduler;
    }

    @Override // defpackage.mf5
    public vt2 getGraphicsContext() {
        return this.D0;
    }

    @Override // defpackage.mf5
    public ez2 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((lr) this.U0.d).w() || !this.n0.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.mf5
    public zd3 getInputModeManager() {
        zd3 zd3Var = this.l1;
        if (zd3Var == null) {
            zd3Var = new zd3(isInTouchMode() ? 1 : 2);
            this.l1 = zd3Var;
        }
        return zd3Var;
    }

    public final je3 getInsetsListener() {
        return this.insetsListener;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, defpackage.mf5
    public z24 getLayoutDirection() {
        return (z24) this.k1.getValue();
    }

    @Override // defpackage.mf5
    public ge4 getLocaleList() {
        return (ge4) this.L0.getValue();
    }

    public long getMeasureIteration() {
        if (this.U0.a) {
            return 1L;
        }
        wc3.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    @Override // defpackage.mf5
    public mx4 getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // defpackage.mf5
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // defpackage.mf5
    public do5 getPlacementScope() {
        dx4 dx4Var = fo5.a;
        return new wi4(this, (byte) 1);
    }

    /* JADX INFO: renamed from: getPlayNavigationSoundEffect$ui, reason: from getter */
    public final rn2 getPlayNavigationSoundEffect() {
        return this.playNavigationSoundEffect;
    }

    @Override // defpackage.mf5
    public gq5 getPointerIconService() {
        return this.I1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name and from getter */
    public final zb3 getPrimaryDirectionalMotionAxisOverride() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // defpackage.mf5
    public u86 getRectManager() {
        return this.rectManager;
    }

    @Override // defpackage.mf5
    public dk6 getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // defpackage.mf5
    public LayoutNode getRoot() {
        return this.root;
    }

    public final hq1 getSavedStateRegistry() {
        hq1 hq1Var = this.l0;
        if (hq1Var != null) {
            return hq1Var;
        }
        xz0 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        yv6 yv6Var = composeViewContext.e;
        yv6Var.getClass();
        Object parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(g46.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strL = oi0.l("SaveableStateRegistry:", strValueOf);
        xd6 xd6VarF = yv6Var.f();
        Bundle bundleI = xd6VarF.i(strL);
        if (bundleI != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleI.keySet()) {
                ArrayList parcelableArrayList = bundleI.getParcelableArrayList(str);
                parcelableArrayList.getClass();
                linkedHashMap.put(str, parcelableArrayList);
            }
        }
        h80 h80Var = new h80((byte) 14);
        ox1 ox1Var = mv6.a;
        lv6 lv6Var = new lv6(linkedHashMap, h80Var);
        boolean z = false;
        if (xd6VarF.s(strL) == null) {
            try {
                xd6VarF.D(strL, new hy0(lv6Var, (byte) 1));
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        hq1 hq1Var2 = new hq1(lv6Var, new iq1(z, xd6VarF, strL));
        this.l0 = hq1Var2;
        return hq1Var2;
    }

    public final boolean getScrollCaptureInProgress() {
        p41 p41Var;
        if (Build.VERSION.SDK_INT >= 31 && (p41Var = this.G1) != null && ((Boolean) ((rh5) p41Var.b).getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AndroidComposeView) {
                return ((AndroidComposeView) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    @Override // defpackage.mf5
    public b17 getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // defpackage.mf5
    public p34 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    @Override // defpackage.mf5
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? in.a.a(this) : this.showLayoutBounds;
    }

    @Override // defpackage.mf5
    public of5 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // defpackage.mf5
    public be7 getSoftwareKeyboardController() {
        ai1 ai1Var = this.i1;
        if (ai1Var != null) {
            return ai1Var;
        }
        ai1 ai1Var2 = new ai1(getTextInputService());
        this.i1 = ai1Var2;
        return ai1Var2;
    }

    @Override // defpackage.mf5
    public o78 getTextInputService() {
        o78 o78Var = this.g1;
        if (o78Var != null) {
            return o78Var;
        }
        o78 o78Var2 = new o78(getLegacyTextInputServiceAndroid());
        this.g1 = o78Var2;
        return o78Var2;
    }

    @Override // defpackage.mf5
    public q88 getTextToolbar() {
        qh qhVar = this.n1;
        if (qhVar != null) {
            return qhVar;
        }
        qh qhVar2 = new qh();
        new f08(new o7((Object) qhVar2, (byte) 5));
        this.n1 = qhVar2;
        return qhVar2;
    }

    public final tl6 getUncaughtExceptionHandler$ui() {
        return null;
    }

    @Override // defpackage.mf5
    public fw8 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    @Override // defpackage.mf5
    public t09 getWindowInfo() {
        return getComposeViewContext().t;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:120:0x0180, B:121:0x018c, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:144:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    public final int h(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        AndroidComposeView androidComposeView;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent3;
        int iF;
        n03 n03Var;
        AndroidComposeView androidComposeView2;
        MotionEvent motionEvent4;
        int pointerId;
        int action;
        hy4 hy4Var;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z4;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z5;
        n03 n03Var2;
        AndroidComposeView androidComposeView3 = this;
        androidComposeView3.removeCallbacks(androidComposeView3.w1);
        try {
            z(motionEvent);
            androidComposeView3.c1 = true;
            androidComposeView3.q(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = androidComposeView3.o1;
                boolean z6 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                wg wgVar = androidComposeView3.J0;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6) {
                        androidComposeView = this;
                    } else {
                        androidComposeView = this;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = androidComposeView.o1;
                    if (motionEvent3 != null) {
                        motionEvent4 = androidComposeView.o1;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        hy4Var = androidComposeView.I0;
                        if (action == 9) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = androidComposeView.o1;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = androidComposeView.o1;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                motionEvent6 = androidComposeView.o1;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (pointerId >= 0) {
                                        hy4Var.c.delete(pointerId);
                                        hy4Var.b.delete(pointerId);
                                    }
                                    n03Var2 = (n03) wgVar.c;
                                    if (n03Var2.d) {
                                        n03Var2.d = true;
                                    } else {
                                        n03Var2.g.a.g();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        hy4Var.c.delete(pointerId);
                                        hy4Var.b.delete(pointerId);
                                    }
                                    n03Var2 = (n03) wgVar.c;
                                    if (n03Var2.d) {
                                        n03Var2.d = true;
                                    } else {
                                        n03Var2.g.a.g();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = androidComposeView.o1;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = androidComposeView.o1;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            motionEvent6 = androidComposeView.o1;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                if (pointerId >= 0) {
                                    hy4Var.c.delete(pointerId);
                                    hy4Var.b.delete(pointerId);
                                }
                                n03Var2 = (n03) wgVar.c;
                                if (n03Var2.d) {
                                    n03Var2.d = true;
                                } else {
                                    n03Var2.g.a.g();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    hy4Var.c.delete(pointerId);
                                    hy4Var.b.delete(pointerId);
                                }
                                n03Var2 = (n03) wgVar.c;
                                if (n03Var2.d) {
                                    n03Var2.d = true;
                                } else {
                                    n03Var2.g.a.g();
                                }
                            }
                        }
                    }
                    androidComposeView.o1 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        androidComposeView.G(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iF = F(motionEvent);
                    Trace.endSection();
                    if ((iF & 4) != 0) {
                        androidComposeView2 = this;
                    } else {
                        n03Var = (n03) wgVar.c;
                        if (n03Var.d) {
                            n03Var.d = true;
                        } else {
                            n03Var.g.a.g();
                        }
                        androidComposeView2 = this;
                        androidComposeView2.G(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    androidComposeView2.c1 = false;
                    return iF;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!wgVar.a) {
                            ((qi4) ((y45) wgVar.d).X).a();
                            ((n03) wgVar.c).c();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z6) {
                        motionEvent2 = motionEvent7;
                    } else {
                        androidComposeView3.G(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !n(motionEvent)) {
                        androidComposeView = this;
                    } else {
                        androidComposeView = this;
                        androidComposeView.G(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 || z2 || motionEvent2 == null || motionEvent2.isFromSource(4098)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = androidComposeView.o1;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = androidComposeView.o1;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        hy4Var = androidComposeView.I0;
                        if (action == 9 || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = androidComposeView.o1;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = androidComposeView.o1;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                motionEvent6 = androidComposeView.o1;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4 || z5) {
                                    if (pointerId >= 0) {
                                        hy4Var.c.delete(pointerId);
                                        hy4Var.b.delete(pointerId);
                                    }
                                    n03Var2 = (n03) wgVar.c;
                                    if (n03Var2.d) {
                                        n03Var2.d = true;
                                    } else {
                                        n03Var2.g.a.g();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            hy4Var.c.delete(pointerId);
                            hy4Var.b.delete(pointerId);
                        }
                    }
                    androidComposeView.o1 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        androidComposeView.G(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iF = F(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iF & 4) != 0 && z3) {
                            n03Var = (n03) wgVar.c;
                            if (n03Var.d) {
                                n03Var.d = true;
                            } else {
                                n03Var.g.a.g();
                            }
                            androidComposeView2 = this;
                            androidComposeView2.G(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            androidComposeView2 = this;
                        }
                        androidComposeView2.c1 = false;
                        return iF;
                    } catch (Throwable th) {
                        th = th;
                        androidComposeView3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        androidComposeView3.c1 = false;
        throw th;
    }

    public final void j(LayoutNode layoutNode) {
        this.U0.z(layoutNode, false);
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            j((LayoutNode) objArr[i2]);
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.o1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        dk6 dk6Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().K()) {
            getRoot().d(this);
        }
        byte b = 1;
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(ch3.B());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().e();
        }
        int i = 0;
        this.composeViewContextIncrementedDuringInit = false;
        j(getRoot());
        i(getRoot());
        getSnapshotObserver().a.d();
        AndroidComposeView outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            bt.i("Expected the view to be attached to window.");
            return;
        }
        outOfFrameExecutor.C(new mb(this, b));
        getComposeViewContext().d();
        xz0 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        fx8 fx8Var = composeViewContext.f;
        i94 i94Var = this.frameEndScheduler;
        if (fx8Var == null || i94Var == null) {
            dk6Var = null;
        } else {
            ex8 ex8VarE = fx8Var.e();
            cx8 cx8Var = new cx8();
            n71 n71Var = n71.b;
            ex8VarE.getClass();
            n71Var.getClass();
            yr6 yr6Var = new yr6(ex8VarE, cx8Var, n71Var);
            zu3 zu3VarB = yb6.a.b(k94.class);
            String strP = zu3VarB.p();
            if (strP == null) {
                bt.q("Local and anonymous classes can not be ViewModels");
                return;
            }
            k94 k94Var = (k94) yr6Var.g(zu3VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            vz4 vz4Var = k94Var.b;
            Object objB = vz4Var.b(id);
            if (objB == null) {
                objB = new j05(1);
                vz4Var.h(id, objB);
            }
            j05 j05Var = (j05) objB;
            Object[] objArr = j05Var.a;
            int i2 = j05Var.b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((j94) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            j94 j94Var = (j94) obj;
            if (j94Var == null) {
                j94Var = new j94();
                j05Var.a(j94Var);
            }
            j94Var.c = true;
            this.k0 = j94Var;
            dk6Var = j94Var.b;
        }
        if (dk6Var == null) {
            dk6Var = pz2.S0;
        }
        this.retainedValuesStore = dk6Var;
        gn2 gn2Var = this.e1;
        if (gn2Var != null) {
            gn2Var.B(getComposeViewContext());
            this.e1 = null;
        }
        g94 h0 = getComposeViewContext().d().getH0();
        h0.a(this);
        h0.a(this.contentCaptureManager);
        getInputModeManager().a.setValue(new xd3(isInTouchMode() ? (byte) 1 : (byte) 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            lc.a.b(this);
        }
        ua autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((gh2) getFocusOwner()).g.a(autofillManager);
            getSemanticsOwner().d.a(autofillManager);
        }
        ((gh2) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        j57 j57Var = (j57) this.h1.get();
        rf rfVar = (rf) (j57Var != null ? j57Var.b : null);
        if (rfVar == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return false;
        }
        j57 j57Var2 = (j57) rfVar.f0.get();
        wd3 wd3Var = (wd3) (j57Var2 != null ? j57Var2.b : null);
        return wd3Var != null && (wd3Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection j75Var;
        j57 j57Var = (j57) this.h1.get();
        rf rfVar = (rf) (j57Var != null ? j57Var.b : null);
        if (rfVar == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return null;
        }
        j57 j57Var2 = (j57) rfVar.f0.get();
        wd3 wd3Var = (wd3) (j57Var2 != null ? j57Var2.b : null);
        if (wd3Var == null) {
            return null;
        }
        synchronized (wd3Var.c) {
            if (wd3Var.e) {
                return null;
            }
            di7 di7VarA = wd3Var.a.a(editorInfo);
            vj2 vj2Var = new vj2((Object) wd3Var, (byte) 8);
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                j75Var = new k75(di7VarA, vj2Var);
            } else {
                j75Var = i >= 25 ? new j75(di7VarA, vj2Var) : new i75(di7VarA, vj2Var);
            }
            wd3Var.d.b(new b09(j75Var));
            return j75Var;
        }
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        vc vcVar = this.contentCaptureManager;
        vcVar.getClass();
        tc.u(vcVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.insetsListener.onViewDetachedFromWindow(this);
        View view = this.q0;
        if (l() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            j05 j05Var = M1;
            synchronized (j05Var) {
                j05Var.k(this);
            }
        }
        getComposeViewContext().b();
        xd7 xd7Var = getSnapshotObserver().a;
        o61 o61Var = xd7Var.h;
        if (o61Var != null) {
            o61Var.h();
        }
        xd7Var.a();
        g94 h0 = getComposeViewContext().d().getH0();
        h0.f(this.contentCaptureManager);
        h0.f(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        j94 j94Var = this.k0;
        if (j94Var != null) {
            j94Var.c = false;
        }
        this.k0 = null;
        if (i >= 31) {
            lc.a.a(this);
        }
        ua autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.k(autofillManager);
            ((gh2) getFocusOwner()).g.k(autofillManager);
        }
        u86 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        u86 rectManager2 = getRectManager();
        pb pbVar = rectManager2.i;
        if (pbVar != null) {
            rectManager2.b.removeCallbacks(pbVar);
            rectManager2.i = null;
        }
        ((gh2) getFocusOwner()).g.k(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        gh2 gh2Var = (gh2) getFocusOwner();
        os4.F(gh2Var.c, true);
        if (gh2Var.f() != null) {
            ai2 ai2VarF = gh2Var.f();
            gh2Var.i(null);
            if (ai2VarF != null) {
                ai2VarF.Z0(yh2.X, yh2.Z);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        J();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        I(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.U0.r(this.B1);
            this.S0 = null;
            J();
            if (this.R0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ri1 ri1Var = this.U0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().K()) {
                getRoot().d(this);
            }
            if (!isAttachedToWindow()) {
                j(getRoot());
            }
            long jD = d(i);
            long jD2 = d(i2);
            long jA = z68.A((int) (jD >>> 32), (int) (jD & 4294967295L), (int) (jD2 >>> 32), (int) (4294967295L & jD2));
            q31 q31Var = this.S0;
            if (q31Var == null) {
                this.S0 = new q31(jA);
                this.T0 = false;
            } else if (!q31.b(q31Var.a, jA)) {
                this.T0 = true;
            }
            ri1Var.A(jA);
            ri1Var.t();
            setMeasuredDimension(getRoot().z(), getRoot().o());
            if (this.R0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().z(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().o(), 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!b() || viewStructure == null || this.F1) {
            return;
        }
        x(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        fq5 fq5Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (fq5Var = ((wb) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return fq5Var instanceof sf ? PointerIcon.getSystemIcon(context, ((sf) fq5Var).b) : PointerIcon.getSystemIcon(context, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(d94 d94Var) {
        pm0 pm0VarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(ch3.B());
        }
        j94 j94Var = this.k0;
        if (j94Var != null) {
            i94 i94Var = this.frameEndScheduler;
            i94Var.getClass();
            dp4 dp4Var = (dp4) j94Var.a.Y;
            if (!dp4Var.X || dp4Var.Z) {
                return;
            }
            try {
                pm0VarS = ((l59) i94Var).a.s(new tb2(j94Var, (byte) 20));
            } catch (CancellationException unused) {
                if (!dp4Var.Y) {
                    if (dp4Var.Z) {
                        xr5.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    dp4Var.a();
                    dp4Var.Z = true;
                }
                pm0VarS = null;
            }
            pm0 pm0Var = j94Var.d;
            if (pm0Var != null) {
                pm0Var.cancel();
            }
            j94Var.d = pm0VarS;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        z24 z24Var;
        if (this.h0) {
            int[] iArr = ah2.a;
            z24 z24Var2 = z24.X;
            if (i != 0) {
                z24Var = i != 1 ? null : z24.Y;
            } else {
                z24Var = z24Var2;
            }
            if (z24Var != null) {
                z24Var2 = z24Var;
            }
            setLayoutDirection(z24Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        p41 p41Var;
        if (Build.VERSION.SDK_INT < 31 || (p41Var = this.G1) == null) {
            return;
        }
        p41Var.f(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        J();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(d94 d94Var) {
        j94 j94Var = this.k0;
        if (j94Var != null) {
            dp4 dp4Var = (dp4) j94Var.a.Y;
            if (dp4Var.X && !dp4Var.Z) {
                pm0 pm0Var = j94Var.d;
                if (pm0Var != null) {
                    pm0Var.cancel();
                }
                j94Var.d = null;
                return;
            }
            if (dp4Var.Y) {
                return;
            }
            if (!dp4Var.Z) {
                xr5.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!dp4Var.f0.i()) {
                xr5.a("Attempted to start retaining exited values with pending exited values");
            }
            dp4Var.Z = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new xd3(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        vc vcVar = this.contentCaptureManager;
        vcVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (dh3.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            tc.d(vcVar, longSparseArray);
        } else {
            vcVar.X.post(new sc(vcVar, longSparseArray, (byte) 0));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zB;
        this.D1 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zB = ch3.B())) {
            return;
        }
        setShowLayoutBounds(zB);
        i(getRoot());
    }

    public final long p(long j) {
        y();
        long jB = or4.b(this.Z0, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.d1 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.d1 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void q(boolean z) {
        ri1 ri1Var = this.U0;
        if (((lr) ri1Var.d).w() || ((c15) ((zz2) ri1Var.e).Y).Z != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (ri1Var.r(z ? this.B1 : this.C1)) {
                    requestLayout();
                }
                ri1Var.f(false);
                getRectManager().a();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void r(LayoutNode layoutNode, long j) {
        ri1 ri1Var = this.U0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            ri1Var.s(layoutNode, j);
            if (!((lr) ri1Var.d).w()) {
                ri1Var.f(false);
                getRectManager().a();
                this.C1.invoke();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        byte b = 1;
        if (!isFocused()) {
            ug2 ug2VarC = ah2.c(i);
            int i2 = ug2VarC != null ? ug2VarC.a : 7;
            Boolean boolE = ((gh2) getFocusOwner()).e(i2, rect != null ? new s86(rect.left, rect.top, rect.right, rect.bottom) : null, new qb((byte) 0, i2));
            Boolean bool = Boolean.TRUE;
            if (!dh3.f(boolE, bool)) {
                if (!dh3.f(((gh2) getFocusOwner()).e(i2, null, new qb(b, i2)), bool)) {
                    if (hasFocus() && (i2 == 1 || i2 == 2)) {
                        return ((gh2) getFocusOwner()).h(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s() {
        j05 j05Var;
        ua autofillManager;
        Object[] objArr;
        if (this.O0) {
            xd7 xd7Var = getSnapshotObserver().a;
            dx4 dx4Var = new dx4((byte) 17);
            synchronized (xd7Var.g) {
                try {
                    c15 c15Var = xd7Var.f;
                    int i = c15Var.Z;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = c15Var.X;
                        if (i2 >= i) {
                            break;
                        }
                        wd7 wd7Var = (wd7) objArr[i2];
                        wd7Var.c(dx4Var);
                        if (!(wd7Var.f.e != 0)) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = c15Var.X;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    c15Var.Z = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.O0 = false;
        }
        gi giVar = this.R0;
        if (giVar != null) {
            c(giVar);
        }
        if (b() && (autofillManager = getAutofillManager()) != null) {
            wz4 wz4Var = autofillManager.j0;
            if (wz4Var.d == 0 && autofillManager.k0) {
                autofillManager.X.a();
                autofillManager.k0 = false;
            }
            if (wz4Var.d != 0) {
                autofillManager.k0 = true;
            }
        }
        while (this.r1.j() && this.r1.g(0) != null) {
            int i5 = this.r1.b;
            int i6 = 0;
            while (true) {
                j05Var = this.r1;
                if (i6 < i5) {
                    dn2 dn2Var = (dn2) j05Var.g(i6);
                    this.r1.o(i6, null);
                    if (dn2Var != null) {
                        dn2Var.invoke();
                    }
                    i6++;
                }
            }
            j05Var.m(0, i5);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.B0.j0 = intervalMillis;
    }

    public final void setComposeViewContext(xz0 xz0Var) {
        if (getCoroutineContext() != xz0Var.c().j() && !getRoot().getChildren$ui().isEmpty()) {
            wc3.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        dd7 dd7VarD = yn0.D();
        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
        dd7 dd7VarP = yn0.P(dd7VarD);
        try {
            xz0 xz0Var2 = get_composeViewContext();
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            if (xz0Var != xz0Var2) {
                if (isAttachedToWindow()) {
                    xz0Var2.b();
                    xz0Var.e();
                }
                set_composeViewContext(xz0Var);
                setCoroutineContext(xz0Var.c().j());
            }
        } catch (Throwable th) {
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.K0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(vc vcVar) {
        this.contentCaptureManager = vcVar;
    }

    public void setCoroutineContext(s61 s61Var) {
        this.coroutineContext = s61Var;
    }

    public final void setFrameEndScheduler$ui(i94 i94Var) {
        this.frameEndScheduler = i94Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnReadyForComposition(gn2 callback) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            callback.B(getComposeViewContext());
        } else {
            this.e1 = callback;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(rn2 rn2Var) {
        this.playNavigationSoundEffect = rn2Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(zb3 zb3Var) {
        this.primaryDirectionalMotionAxisOverride = zb3Var;
    }

    @Override // defpackage.mf5
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public void setUncaughtExceptionHandler(tl6 handler) {
        this.U0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(LayoutNode layoutNode) {
        gc gcVar = this.B0;
        gcVar.z0 = true;
        if (gcVar.v()) {
            gcVar.w(layoutNode);
        }
        vc vcVar = this.contentCaptureManager;
        vcVar.h0 = true;
        if (vcVar.d()) {
            vcVar.i0.b(dn8.a);
        }
    }

    public final void u(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        LayoutNode layoutNodeW;
        LayoutNode layoutNodeW2;
        ri1 ri1Var = this.U0;
        if (!z) {
            if (ri1Var.z(layoutNode, z2) && z3) {
                D(layoutNode);
                return;
            }
            return;
        }
        lr lrVar = (lr) ri1Var.d;
        LayoutNode layoutNode2 = layoutNode.k0;
        r34 r34Var = layoutNode.I0;
        if (layoutNode2 == null) {
            wc3.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = r34Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    b61.c();
                    return;
                }
                if (!r34Var.e || z2) {
                    r34Var.e = true;
                    r34Var.p.x0 = true;
                    if (layoutNode.Q0) {
                        return;
                    }
                    if ((dh3.f(layoutNode.M(), Boolean.TRUE) || ri1.n(layoutNode)) && ((layoutNodeW = layoutNode.w()) == null || !layoutNodeW.I0.e)) {
                        lrVar.a(layoutNode, bi3.X);
                    } else if ((layoutNode.L() || ri1.o(layoutNode)) && ((layoutNodeW2 = layoutNode.w()) == null || !layoutNodeW2.q())) {
                        lrVar.a(layoutNode, bi3.Z);
                    }
                    if (ri1Var.b || !z3) {
                        return;
                    }
                    D(layoutNode);
                    return;
                }
                return;
            }
        }
        ((c15) ri1Var.g).b(new ur4(layoutNode, true, z2));
    }

    public final void v(LayoutNode layoutNode, boolean z, boolean z2) {
        r34 r34Var = layoutNode.I0;
        bi3 bi3Var = bi3.f0;
        ri1 ri1Var = this.U0;
        if (!z) {
            ri1Var.getClass();
            int iOrdinal = r34Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                b61.c();
                return;
            }
            LayoutNode layoutNodeW = layoutNode.w();
            boolean z3 = layoutNodeW == null || layoutNodeW.L();
            if (!z2) {
                if (layoutNode.q()) {
                    return;
                }
                if (layoutNode.p() && layoutNode.L() == z3 && layoutNode.L() == r34Var.p.w0) {
                    return;
                }
            }
            wr4 wr4Var = r34Var.p;
            wr4Var.y0 = true;
            wr4Var.z0 = true;
            if (!layoutNode.Q0 && wr4Var.w0 && z3) {
                if ((layoutNodeW == null || !layoutNodeW.p()) && (layoutNodeW == null || !layoutNodeW.q())) {
                    ((lr) ri1Var.d).a(layoutNode, bi3Var);
                }
                if (ri1Var.b) {
                    return;
                }
                D(null);
                return;
            }
            return;
        }
        lr lrVar = (lr) ri1Var.d;
        int iOrdinal2 = r34Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    b61.c();
                    return;
                }
            }
        }
        if ((r34Var.e || r34Var.f) && !z2) {
            return;
        }
        r34Var.f = true;
        r34Var.g = true;
        wr4 wr4Var2 = r34Var.p;
        wr4Var2.y0 = true;
        wr4Var2.z0 = true;
        if (layoutNode.Q0) {
            return;
        }
        LayoutNode layoutNodeW2 = layoutNode.w();
        if (dh3.f(layoutNode.M(), Boolean.TRUE) && ((layoutNodeW2 == null || !layoutNodeW2.I0.e) && (layoutNodeW2 == null || !layoutNodeW2.I0.f))) {
            lrVar.a(layoutNode, bi3.Y);
        } else if (layoutNode.L() && ((layoutNodeW2 == null || !layoutNodeW2.p()) && (layoutNodeW2 == null || !layoutNodeW2.q()))) {
            lrVar.a(layoutNode, bi3Var);
        }
        if (ri1Var.b) {
            return;
        }
        D(null);
    }

    public final void w() {
        gc gcVar = this.B0;
        gcVar.z0 = true;
        Handler handler = gcVar.f0.getHandler();
        if (gcVar.v() && !gcVar.K0 && handler != null) {
            gcVar.K0 = true;
            handler.post(gcVar.M0);
        }
        vc vcVar = this.contentCaptureManager;
        vcVar.h0 = true;
        Handler handler2 = vcVar.X.getHandler();
        if (!vcVar.d() || vcVar.n0 || handler2 == null) {
            return;
        }
        vcVar.n0 = true;
        handler2.post(vcVar.o0);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    public final void x(ViewStructure viewStructure) {
        ua autofillManager = getAutofillManager();
        if (autofillManager != null) {
            LayoutNode layoutNode = autofillManager.Y.a;
            AutofillId autofillId = autofillManager.i0;
            String str = autofillManager.g0;
            u86 u86Var = autofillManager.f0;
            os4.E(viewStructure, layoutNode, autofillId, str, u86Var);
            Object[] objArr = h85.a;
            j05 j05Var = new j05(2);
            j05Var.a(layoutNode);
            j05Var.a(viewStructure);
            while (j05Var.j()) {
                Object objL = j05Var.l(j05Var.b - 1);
                objL.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objL;
                Object objL2 = j05Var.l(j05Var.b - 1);
                objL2.getClass();
                List<LayoutNode> childrenInfo = ((LayoutNode) objL2).getChildrenInfo();
                int size = childrenInfo.size();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode2 = childrenInfo.get(i);
                    if (!layoutNode2.Q0 && layoutNode2.K() && layoutNode2.L()) {
                        t07 t07VarY = layoutNode2.y();
                        if (t07VarY != null) {
                            s05 s05Var = t07VarY.X;
                            if (s05Var.b(s07.g) || s05Var.b(s07.h) || s05Var.b(c17.r) || s05Var.b(c17.s) || (Build.VERSION.SDK_INT >= 34 && s05Var.b(km4.k))) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                os4.E(viewStructureNewChild, layoutNode2, autofillManager.i0, str, u86Var);
                                j05Var.a(layoutNode2);
                                j05Var.a(viewStructureNewChild);
                            } else {
                                j05Var.a(layoutNode2);
                                j05Var.a(viewStructure2);
                            }
                        } else {
                            j05Var.a(layoutNode2);
                            j05Var.a(viewStructure2);
                        }
                    }
                }
            }
        }
        ta autofill = getAutofill();
        if (autofill != null) {
            xz xzVar = autofill.b;
            LinkedHashMap linkedHashMap = xzVar.a;
            LinkedHashMap linkedHashMap2 = xzVar.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    c2.m();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                ue3.O(viewStructureNewChild2, autofill.c, iIntValue);
                viewStructureNewChild2.setId(iIntValue, autofill.a.getContext().getPackageName(), null, null);
                ue3.P(viewStructureNewChild2, 1);
                throw null;
            }
        }
    }

    public final void y() {
        if (this.c1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            A();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.W0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.d1 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void z(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        A();
        float x = motionEvent.getX();
        long jB = or4.b(this.Z0, (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32));
        this.d1 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L);
    }

    @Override // defpackage.mf5
    public ta getAutofill() {
        return this.autofill;
    }

    @Override // defpackage.mf5
    public ua getAutofillManager() {
        return this.autofillManager;
    }

    @Override // defpackage.mf5
    public pd getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    public vz4 getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @ti1
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @ti1
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    public ul6 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(tl6 tl6Var) {
    }
}
