.class public final Lio/sentry/android/replay/a;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# static fields
.field public static final Z:Lio/sentry/android/replay/a;

.field public static final f0:Lio/sentry/android/replay/a;

.field public static final g0:Lio/sentry/android/replay/a;

.field public static final h0:Lio/sentry/android/replay/a;

.field public static final i0:Lio/sentry/android/replay/a;

.field public static final j0:Lio/sentry/android/replay/a;

.field public static final k0:Lio/sentry/android/replay/a;


# instance fields
.field public final synthetic Y:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/android/replay/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1}, Lio/sentry/android/replay/a;-><init>(BI)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/sentry/android/replay/a;->Z:Lio/sentry/android/replay/a;

    .line 9
    .line 10
    new-instance v0, Lio/sentry/android/replay/a;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v2, v1}, Lio/sentry/android/replay/a;-><init>(BI)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lio/sentry/android/replay/a;->f0:Lio/sentry/android/replay/a;

    .line 17
    .line 18
    new-instance v0, Lio/sentry/android/replay/a;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v2, v1}, Lio/sentry/android/replay/a;-><init>(BI)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lio/sentry/android/replay/a;->g0:Lio/sentry/android/replay/a;

    .line 25
    .line 26
    new-instance v0, Lio/sentry/android/replay/a;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v2, v1}, Lio/sentry/android/replay/a;-><init>(BI)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lio/sentry/android/replay/a;->h0:Lio/sentry/android/replay/a;

    .line 33
    .line 34
    new-instance v0, Lio/sentry/android/replay/a;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v2, v1}, Lio/sentry/android/replay/a;-><init>(BI)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lio/sentry/android/replay/a;->i0:Lio/sentry/android/replay/a;

    .line 41
    .line 42
    new-instance v0, Lio/sentry/android/replay/a;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v2, v1}, Lio/sentry/android/replay/a;-><init>(BI)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lio/sentry/android/replay/a;->j0:Lio/sentry/android/replay/a;

    .line 49
    .line 50
    new-instance v0, Lio/sentry/android/replay/a;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v0, v2, v1}, Lio/sentry/android/replay/a;-><init>(BI)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lio/sentry/android/replay/a;->k0:Lio/sentry/android/replay/a;

    .line 57
    .line 58
    return-void
.end method

.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lio/sentry/android/replay/a;->Y:B

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lg24;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte p0, p0, Lio/sentry/android/replay/a;->Y:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p0, Lio/sentry/android/replay/l0;->a:Lg44;

    .line 9
    .line 10
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/lang/Class;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    :try_start_0
    const-string v2, "mWindow"

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    move-object v1, v2

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    return-object v1

    .line 33
    :pswitch_0
    :try_start_1
    const-string p0, "com.android.internal.policy.DecorView"

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    :catchall_0
    return-object v1

    .line 40
    :pswitch_1
    sget-object p0, Lio/sentry/android/replay/g0;->a:Lg44;

    .line 41
    .line 42
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/lang/Class;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    const-string v0, "getInstance"

    .line 51
    .line 52
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_1
    return-object v1

    .line 63
    :pswitch_2
    const-string p0, "android.view.WindowManagerGlobal"

    .line 64
    .line 65
    :try_start_2
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 69
    :catchall_1
    return-object v1

    .line 70
    :pswitch_3
    sget-object p0, Lio/sentry/android/replay/g0;->a:Lg44;

    .line 71
    .line 72
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Ljava/lang/Class;

    .line 77
    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    const-string v1, "mViews"

    .line 81
    .line 82
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-object v1

    .line 90
    :pswitch_4
    new-instance p0, Lio/sentry/android/replay/a0;

    .line 91
    .line 92
    invoke-direct {p0}, Lio/sentry/android/replay/a0;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance v0, Landroid/os/Handler;

    .line 96
    .line 97
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lio/sentry/android/core/internal/modules/a;

    .line 105
    .line 106
    const/4 v2, 0x3

    .line 107
    invoke-direct {v1, p0, v2}, Lio/sentry/android/core/internal/modules/a;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 111
    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_5
    new-instance p0, Lkc6;

    .line 115
    .line 116
    const-string v0, "_[a-z]"

    .line 117
    .line 118
    invoke-direct {p0, v0}, Lkc6;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
