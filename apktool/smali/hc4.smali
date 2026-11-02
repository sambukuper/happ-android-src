.class public final Lhc4;
.super Lc43;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final p:[B


# instance fields
.field public final h:Landroid/content/Context;

.field public final i:Lxy0;

.field public final j:Ly5;

.field public final k:Lwe5;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/util/HashMap;

.field public final n:Ljava/util/HashMap;

.field public final o:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "ListenableWorkerImpl"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    sput-object v0, Lhc4;->p:[B

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroidx/work/multiprocess/RemoteWorkerService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ld43;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lhc4;->h:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {p1}, Lz47;->I(Landroid/content/Context;)Lz47;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p1, Lz47;->Y:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lxy0;

    .line 22
    .line 23
    iput-object v0, p0, Lhc4;->i:Lxy0;

    .line 24
    .line 25
    iget-object v0, p1, Lz47;->Z:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ly5;

    .line 28
    .line 29
    iput-object v0, p0, Lhc4;->j:Ly5;

    .line 30
    .line 31
    iget-object p1, p1, Lz47;->g0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lwe5;

    .line 34
    .line 35
    iput-object p1, p0, Lhc4;->k:Lwe5;

    .line 36
    .line 37
    new-instance p1, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lhc4;->l:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance p1, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lhc4;->m:Ljava/util/HashMap;

    .line 50
    .line 51
    new-instance p1, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lhc4;->n:Ljava/util/HashMap;

    .line 57
    .line 58
    new-instance p1, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lhc4;->o:Ljava/util/HashMap;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Landroidx/work/WorkerParameters;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lhc4;->m:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lec4;

    .line 8
    .line 9
    iget-object v2, p0, Lhc4;->n:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/lang/Throwable;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    :try_start_0
    iget-object v1, p0, Lhc4;->i:Lxy0;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v1, Lpz2;->G0:Lpz2;

    .line 27
    .line 28
    iget-object p0, p0, Lhc4;->h:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1, p0, p2, p3}, Lpz2;->l(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lec4;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    invoke-virtual {v2, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final e(Lr43;[B)V
    .locals 12

    .line 1
    iget-object v9, p0, Lhc4;->j:Ly5;

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lkh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 4
    .line 5
    invoke-static {p2, v0}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lkh5;

    .line 10
    .line 11
    iget-object v0, p2, Lkh5;->Y:Lai5;

    .line 12
    .line 13
    iget-object v1, p0, Lhc4;->i:Lxy0;

    .line 14
    .line 15
    iget-object v10, p0, Lhc4;->k:Lwe5;

    .line 16
    .line 17
    move-object v2, v0

    .line 18
    new-instance v0, Landroidx/work/WorkerParameters;

    .line 19
    .line 20
    move-object v3, v1

    .line 21
    iget-object v1, v2, Lai5;->X:Ljava/util/UUID;

    .line 22
    .line 23
    move-object v4, v2

    .line 24
    iget-object v2, v4, Lai5;->Y:Lu91;

    .line 25
    .line 26
    move-object v5, v3

    .line 27
    iget-object v3, v4, Lai5;->Z:Ljava/util/HashSet;

    .line 28
    .line 29
    move-object v6, v4

    .line 30
    iget-object v4, v6, Lai5;->f0:Lzv7;

    .line 31
    .line 32
    move-object v7, v5

    .line 33
    iget v5, v6, Lai5;->g0:I

    .line 34
    .line 35
    iget v6, v6, Lai5;->h0:I

    .line 36
    .line 37
    iget-object v8, v7, Lxy0;->Y:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v8, Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    iget-object v7, v7, Lxy0;->Z:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v7, Lu61;

    .line 44
    .line 45
    move-object v11, v8

    .line 46
    move-object v8, v7

    .line 47
    move-object v7, v11

    .line 48
    invoke-direct/range {v0 .. v10}, Landroidx/work/WorkerParameters;-><init>(Ljava/util/UUID;Lu91;Ljava/util/AbstractCollection;Lzv7;IILjava/util/concurrent/Executor;Lu61;Ly5;Llj2;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    iget-object p2, p2, Lkh5;->X:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {}, Llh4;->P0()Llh4;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p2, v0}, Lhc4;->f(Ljava/lang/String;Landroidx/work/WorkerParameters;)Lwy7;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    new-instance v2, Loo0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 69
    .line 70
    const/4 v7, 0x1

    .line 71
    move-object v3, p0

    .line 72
    move-object v5, p1

    .line 73
    :try_start_1
    invoke-direct/range {v2 .. v7}, Loo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    iget-object p0, v9, Ly5;->Y:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, Lh37;

    .line 79
    .line 80
    iget-object p1, v4, Lwy7;->Y:Lif6;

    .line 81
    .line 82
    invoke-virtual {p1, v2, p0}, Lu2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    :goto_0
    move-object p0, v0

    .line 88
    goto :goto_1

    .line 89
    :catchall_1
    move-exception v0

    .line 90
    move-object v5, p1

    .line 91
    goto :goto_0

    .line 92
    :goto_1
    invoke-static {v5, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final f(Ljava/lang/String;Landroidx/work/WorkerParameters;)Lwy7;
    .locals 11

    .line 1
    iget-object v0, p2, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lhc4;->l:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    invoke-virtual {p0, v0, p1, p2}, Lhc4;->b(Ljava/lang/String;Ljava/lang/String;Landroidx/work/WorkerParameters;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lhc4;->m:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    move-object v4, v2

    .line 20
    check-cast v4, Lec4;

    .line 21
    .line 22
    iget-object v2, p0, Lhc4;->n:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v5, v2

    .line 29
    check-cast v5, Ljava/lang/Throwable;

    .line 30
    .line 31
    iget-object v6, p0, Lhc4;->i:Lxy0;

    .line 32
    .line 33
    iget-object v7, p0, Lhc4;->j:Ly5;

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v2, v7, Ly5;->h0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lki3;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, Lxy7;->a:Lm51;

    .line 56
    .line 57
    new-instance v3, Lia1;

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    move-object v8, p1

    .line 61
    move-object v9, p2

    .line 62
    invoke-direct/range {v3 .. v10}, Lia1;-><init>(Lec4;Ljava/lang/Throwable;Lxy0;Ly5;Ljava/lang/String;Landroidx/work/WorkerParameters;Lq51;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-static {v2, p1, v3}, Lxy7;->a(Ls61;ZLrn2;)Lwy7;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object p0, p0, Lhc4;->o:Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-virtual {p0, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    monitor-exit v1

    .line 76
    return-object p1

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    move-object p0, v0

    .line 79
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    throw p0
.end method

.method public final h(Lr43;[B)V
    .locals 13

    .line 1
    :try_start_0
    sget-object v0, Lkh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lkh5;

    .line 8
    .line 9
    iget-object v0, p2, Lkh5;->Y:Lai5;

    .line 10
    .line 11
    iget-object v1, p0, Lhc4;->i:Lxy0;

    .line 12
    .line 13
    iget-object v11, p0, Lhc4;->j:Ly5;

    .line 14
    .line 15
    iget-object v12, p0, Lhc4;->k:Lwe5;

    .line 16
    .line 17
    new-instance v2, Landroidx/work/WorkerParameters;

    .line 18
    .line 19
    iget-object v3, v0, Lai5;->X:Ljava/util/UUID;

    .line 20
    .line 21
    iget-object v4, v0, Lai5;->Y:Lu91;

    .line 22
    .line 23
    iget-object v5, v0, Lai5;->Z:Ljava/util/HashSet;

    .line 24
    .line 25
    iget-object v6, v0, Lai5;->f0:Lzv7;

    .line 26
    .line 27
    iget v7, v0, Lai5;->g0:I

    .line 28
    .line 29
    iget v8, v0, Lai5;->h0:I

    .line 30
    .line 31
    iget-object v0, v1, Lxy0;->Y:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v9, v0

    .line 34
    check-cast v9, Ljava/util/concurrent/Executor;

    .line 35
    .line 36
    iget-object v0, v1, Lxy0;->Z:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v10, v0

    .line 39
    check-cast v10, Lu61;

    .line 40
    .line 41
    invoke-direct/range {v2 .. v12}, Landroidx/work/WorkerParameters;-><init>(Ljava/util/UUID;Lu91;Ljava/util/AbstractCollection;Lzv7;IILjava/util/concurrent/Executor;Lu61;Ly5;Llj2;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p2, p2, Lkh5;->X:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v1, p0, Lhc4;->l:Ljava/lang/Object;

    .line 51
    .line 52
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :try_start_1
    invoke-virtual {p0, v0, p2, v2}, Lhc4;->b(Ljava/lang/String;Ljava/lang/String;Landroidx/work/WorkerParameters;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Lhc4;->m:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, Lec4;

    .line 63
    .line 64
    iget-object v2, p0, Lhc4;->n:Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/lang/Throwable;

    .line 71
    .line 72
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    :try_start_2
    invoke-static {p1, v0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    move-object p0, v0

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    if-eqz p2, :cond_1

    .line 83
    .line 84
    iget-object v0, p0, Lhc4;->j:Ly5;

    .line 85
    .line 86
    iget-object v0, v0, Ly5;->Y:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lh37;

    .line 89
    .line 90
    new-instance v1, Lgc4;

    .line 91
    .line 92
    invoke-direct {v1, p0, p2, p1}, Lgc4;-><init>(Lhc4;Lec4;Lr43;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Lh37;->execute(Ljava/lang/Runnable;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    const-string p2, "Should never happen."

    .line 102
    .line 103
    invoke-direct {p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p1, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catchall_1
    move-exception v0

    .line 111
    move-object p0, v0

    .line 112
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 113
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 114
    :goto_0
    invoke-static {p1, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final l(Lr43;[B)V
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Lih5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lih5;

    .line 8
    .line 9
    iget-object v4, p2, Lih5;->X:Ljava/lang/String;

    .line 10
    .line 11
    iget v3, p2, Lih5;->Y:I

    .line 12
    .line 13
    invoke-static {}, Llh4;->P0()Llh4;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Lhc4;->l:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    :try_start_1
    iget-object v0, p0, Lhc4;->m:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    move-object v2, v0

    .line 30
    check-cast v2, Lec4;

    .line 31
    .line 32
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    :try_start_2
    iget-object p2, p0, Lhc4;->j:Ly5;

    .line 36
    .line 37
    iget-object p2, p2, Ly5;->Y:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p2, Lh37;

    .line 40
    .line 41
    new-instance v0, Lfc4;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    .line 43
    move-object v1, p0

    .line 44
    move-object v5, p1

    .line 45
    :try_start_3
    invoke-direct/range {v0 .. v5}, Lfc4;-><init>(Lhc4;Lec4;ILjava/lang/String;Lr43;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v0}, Lh37;->execute(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    :goto_0
    move-object p0, v0

    .line 54
    goto :goto_2

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    move-object v5, p1

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move-object v5, p1

    .line 59
    sget-object p0, Lhc4;->p:[B

    .line 60
    .line 61
    invoke-static {v5, p0}, Lvb4;->b(Lr43;[B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :catchall_2
    move-exception v0

    .line 66
    move-object v5, p1

    .line 67
    :goto_1
    move-object p0, v0

    .line 68
    :try_start_4
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 69
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 70
    :catchall_3
    move-exception v0

    .line 71
    goto :goto_1

    .line 72
    :goto_2
    invoke-static {v5, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
