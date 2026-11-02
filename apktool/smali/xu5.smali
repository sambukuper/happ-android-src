.class public final Lxu5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Lxu5;


# instance fields
.field public final a:Ld6;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxu5;

    .line 2
    .line 3
    new-instance v1, Ld6;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v1, v2}, Ld6;-><init>(B)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lxu5;-><init>(Ld6;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lxu5;->b:Lxu5;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ld6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxu5;->a:Ld6;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final varargs a(Lsu/happ/proxyutility/ui/ScannerActivity;Llk0;[Lhq8;)Lp84;
    .locals 4

    .line 1
    iget-object p0, p0, Lxu5;->a:Ld6;

    .line 2
    .line 3
    array-length v0, p3

    .line 4
    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    check-cast p3, [Lhq8;

    .line 9
    .line 10
    const-string v0, "CX:bindToLifecycle"

    .line 11
    .line 12
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, Ld6;->i0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lzl0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    move v3, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v2

    .line 26
    :goto_0
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Lzl0;->g:Lt6;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lt6;->h0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lvh0;

    .line 38
    .line 39
    iget-object v2, v0, Lvh0;->b:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    :try_start_1
    iget-boolean v0, v0, Lvh0;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    :try_start_2
    monitor-exit v2

    .line 45
    move v2, v0

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    monitor-exit v2

    .line 49
    throw p0

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p1, "CameraX not initialized yet."

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_2
    :goto_1
    const/4 v0, 0x2

    .line 59
    if-eq v2, v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Ld6;->e(I)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lxy0;

    .line 65
    .line 66
    invoke-static {p3}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    sget-object v1, Ld02;->X:Ld02;

    .line 71
    .line 72
    invoke-direct {v0, p3, v1}, Lxy0;-><init>(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, p1, p2, v0}, Ld6;->a(Ld6;Lsu/happ/proxyutility/ui/ScannerActivity;Llk0;Lxy0;)Lp84;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_3
    :try_start_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 84
    .line 85
    const-string p1, "bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first"

    .line 86
    .line 87
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 91
    :catchall_1
    move-exception p0

    .line 92
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 93
    .line 94
    .line 95
    throw p0
.end method
