.class public abstract Lpd6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static c(Landroid/content/Context;)Lpd6;
    .locals 4

    .line 1
    invoke-static {p0}, Lx39;->v0(Landroid/content/Context;)Lx39;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lx39;->r0:Lpd6;

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    sget-object v0, Lx39;->v0:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lx39;->r0:Lpd6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_1
    const-class v1, Landroidx/work/multiprocess/RemoteWorkManagerClient;

    .line 17
    .line 18
    sget-object v2, Landroidx/work/multiprocess/RemoteWorkManagerClient;->j:Lkp5;

    .line 19
    .line 20
    const-class v2, Landroid/content/Context;

    .line 21
    .line 22
    const-class v3, Lx39;

    .line 23
    .line 24
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lx39;->i0:Landroid/content/Context;

    .line 33
    .line 34
    filled-new-array {v2, p0}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lpd6;

    .line 43
    .line 44
    iput-object v1, p0, Lx39;->r0:Lpd6;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    :try_start_2
    invoke-static {}, Llh4;->P0()Llh4;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    :goto_0
    iget-object v1, p0, Lx39;->r0:Lpd6;

    .line 55
    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    iget-object v1, p0, Lx39;->j0:Lxy0;

    .line 59
    .line 60
    iget-object v1, v1, Lxy0;->i0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    const-string p0, "Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library"

    .line 72
    .line 73
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v1

    .line 79
    :catchall_1
    move-exception p0

    .line 80
    goto :goto_2

    .line 81
    :cond_1
    :goto_1
    monitor-exit v0

    .line 82
    goto :goto_3

    .line 83
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    throw p0

    .line 85
    :cond_2
    :goto_3
    iget-object p0, p0, Lx39;->r0:Lpd6;

    .line 86
    .line 87
    if-eqz p0, :cond_3

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_3
    const-string p0, "Unable to initialize RemoteWorkManager"

    .line 91
    .line 92
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    return-object p0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lwy7;
.end method

.method public abstract b(Ljava/lang/String;Lfl5;)Lwy7;
.end method
