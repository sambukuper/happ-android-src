.class public final Lzo2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public Y:Ljava/lang/Object;

.field public final Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lzo2;->X:B

    .line 2
    .line 3
    iput-object p2, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lb37;)V
    .locals 1

    const/16 v0, 0xd

    iput-byte v0, p0, Lzo2;->X:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo2;->Z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 11
    iput-byte p3, p0, Lzo2;->X:B

    iput-object p1, p0, Lzo2;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lzo2;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li08;

    .line 4
    .line 5
    iget-object v0, v0, Li08;->X:Lx39;

    .line 6
    .line 7
    iget-object v0, v0, Lx39;->n0:Lfv5;

    .line 8
    .line 9
    iget-object v1, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, v0, Lfv5;->k:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v2

    .line 16
    :try_start_0
    invoke-virtual {v0, v1}, Lfv5;->c(Ljava/lang/String;)La59;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, La59;->a:Ll49;

    .line 23
    .line 24
    monitor-exit v2

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    sget-object v1, Lp31;->j:Lp31;

    .line 33
    .line 34
    iget-object v2, v0, Ll49;->j:Lp31;

    .line 35
    .line 36
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Li08;

    .line 45
    .line 46
    iget-object v1, v1, Li08;->Z:Ljava/lang/Object;

    .line 47
    .line 48
    monitor-enter v1

    .line 49
    :try_start_1
    iget-object v2, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Li08;

    .line 52
    .line 53
    iget-object v2, v2, Li08;->h0:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-static {v0}, Lv18;->b(Ll49;)Ls39;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Li08;

    .line 65
    .line 66
    iget-object v3, v2, Li08;->j0:Lcc0;

    .line 67
    .line 68
    iget-object v4, v2, Li08;->Y:Ly5;

    .line 69
    .line 70
    iget-object v4, v4, Ly5;->Z:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, Lu61;

    .line 73
    .line 74
    invoke-static {v3, v0, v4, v2}, Lk39;->a(Lcc0;Ll49;Lu61;Lha5;)Log7;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object p0, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Li08;

    .line 81
    .line 82
    iget-object p0, p0, Li08;->i0:Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-static {v0}, Lv18;->b(Ll49;)Ls39;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p0, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    monitor-exit v1

    .line 92
    return-void

    .line 93
    :catchall_1
    move-exception p0

    .line 94
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    throw p0

    .line 96
    :cond_1
    return-void

    .line 97
    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    throw p0
.end method

.method private final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lna9;

    .line 4
    .line 5
    iget-object v1, v0, Lna9;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v0, v0, Lna9;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lfa5;

    .line 11
    .line 12
    iget-object p0, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lfb9;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Lfa5;->i(Lfb9;)V

    .line 17
    .line 18
    .line 19
    monitor-exit v1

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method private final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/IBinder;

    .line 4
    .line 5
    iget-object p0, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lxa9;

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    const-string v0, "Null service connection"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lxa9;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    :try_start_1
    new-instance v1, Lc89;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lc89;-><init>(Landroid/os/IBinder;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lxa9;->c:Lc89;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    :try_start_2
    iput-byte v0, p0, Lxa9;->a:B

    .line 30
    .line 31
    new-instance v0, Lra9;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {v0, p0, v1}, Lra9;-><init>(Lxa9;B)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lxa9;->f:Leb9;

    .line 38
    .line 39
    iget-object v1, v1, Leb9;->f0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 42
    .line 43
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-void

    .line 48
    :catch_0
    move-exception v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, v0}, Lxa9;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    throw v0
.end method

.method private final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lna9;

    .line 4
    .line 5
    iget-object v1, v0, Lna9;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v0, v0, Lna9;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lna5;

    .line 11
    .line 12
    iget-object p0, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lfb9;

    .line 15
    .line 16
    invoke-virtual {p0}, Lfb9;->f()Ljava/lang/Exception;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lw45;->s(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p0}, Lna5;->d(Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    monitor-exit v1

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p0
.end method

.method private final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lna9;

    .line 4
    .line 5
    iget-object v1, v0, Lna9;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v0, v0, Lna9;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lab5;

    .line 11
    .line 12
    iget-object p0, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lfb9;

    .line 15
    .line 16
    invoke-virtual {p0}, Lfb9;->g()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {v0, p0}, Lab5;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    monitor-exit v1

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p0
.end method

.method private final f()V
    .locals 5

    .line 1
    iget-object v0, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbb9;

    .line 4
    .line 5
    iget-object p0, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lxa9;

    .line 8
    .line 9
    iget v0, v0, Lbb9;->a:I

    .line 10
    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    iget-object v1, p0, Lxa9;->e:Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lbb9;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    new-instance v4, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x14

    .line 33
    .line 34
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 38
    .line 39
    .line 40
    const-string v0, "Timed out waiting for response"

    .line 41
    .line 42
    new-instance v1, Ldb9;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v1, v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1}, Lbb9;->c(Ldb9;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lxa9;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    monitor-exit p0

    .line 59
    return-void

    .line 60
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    throw v0
.end method


# virtual methods
.method public g()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    :try_start_0
    iget-object v2, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lb37;

    .line 6
    .line 7
    iget-object v2, v2, Lb37;->Y:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :try_start_1
    iget-object v0, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lb37;

    .line 16
    .line 17
    iget v4, v0, Lb37;->Z:I

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-ne v4, v5, :cond_0

    .line 21
    .line 22
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_5

    .line 35
    :cond_0
    :try_start_2
    iget-wide v6, v0, Lb37;->f0:J

    .line 36
    .line 37
    const-wide/16 v8, 0x1

    .line 38
    .line 39
    add-long/2addr v6, v8

    .line 40
    iput-wide v6, v0, Lb37;->f0:J

    .line 41
    .line 42
    iput v5, v0, Lb37;->Z:I

    .line 43
    .line 44
    move v0, v3

    .line 45
    :cond_1
    iget-object v4, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Lb37;

    .line 48
    .line 49
    iget-object v4, v4, Lb37;->Y:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Runnable;

    .line 56
    .line 57
    iput-object v4, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 58
    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    iget-object p0, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lb37;

    .line 64
    .line 65
    iput v3, p0, Lb37;->Z:I

    .line 66
    .line 67
    monitor-exit v2

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_2
    return-void

    .line 72
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 74
    .line 75
    .line 76
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    or-int/2addr v1, v2

    .line 78
    const/4 v2, 0x0

    .line 79
    :try_start_4
    iget-object v3, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Ljava/lang/Runnable;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 84
    .line 85
    .line 86
    :goto_3
    :try_start_5
    iput-object v2, p0, Lzo2;->Y:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_1
    move-exception p0

    .line 90
    goto :goto_6

    .line 91
    :catchall_2
    move-exception v0

    .line 92
    goto :goto_4

    .line 93
    :catch_0
    move-exception v3

    .line 94
    :try_start_6
    sget-object v4, Lb37;->h0:Ljava/util/logging/Logger;

    .line 95
    .line 96
    sget-object v5, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 97
    .line 98
    new-instance v6, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v7, "Exception while executing runnable "

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v7, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v7, Ljava/lang/Runnable;

    .line 111
    .line 112
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {v4, v5, v6, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :goto_4
    :try_start_7
    iput-object v2, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 124
    .line 125
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 126
    :goto_5
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 127
    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 128
    :goto_6
    if-eqz v1, :cond_4

    .line 129
    .line 130
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 135
    .line 136
    .line 137
    :cond_4
    throw p0
.end method

.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, Lzo2;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Lfb9;

    .line 15
    .line 16
    :try_start_0
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v2, v0}, Lfb9;->j(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :goto_1
    invoke-virtual {v2, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 42
    .line 43
    .line 44
    :goto_2
    return-void

    .line 45
    :pswitch_0
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v2, v0

    .line 48
    check-cast v2, Lna9;

    .line 49
    .line 50
    iget-object v0, v2, Lna9;->f0:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v3, v0

    .line 53
    check-cast v3, Lfb9;

    .line 54
    .line 55
    :try_start_1
    iget-object v0, v2, Lna9;->Z:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Liw7;

    .line 58
    .line 59
    iget-object v1, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lfb9;

    .line 62
    .line 63
    invoke-virtual {v1}, Lfb9;->g()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v0, v1}, Liw7;->b(Ljava/lang/Object;)Lfb9;

    .line 68
    .line 69
    .line 70
    move-result-object v0
    :try_end_1
    .catch Ler6; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 71
    iget-object v1, v0, Lfb9;->b:Lo8;

    .line 72
    .line 73
    sget-object v3, Lb28;->b:Ldp1;

    .line 74
    .line 75
    invoke-virtual {v0, v3, v2}, Lfb9;->c(Ljava/util/concurrent/Executor;Lab5;)V

    .line 76
    .line 77
    .line 78
    new-instance v4, Lna9;

    .line 79
    .line 80
    invoke-direct {v4, v3, v2}, Lna9;-><init>(Ljava/util/concurrent/Executor;Lna5;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v4}, Lo8;->r(Lza9;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lfb9;->n()V

    .line 87
    .line 88
    .line 89
    new-instance v4, Lna9;

    .line 90
    .line 91
    invoke-direct {v4, v3, v2}, Lna9;-><init>(Ljava/util/concurrent/Executor;Lba5;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v4}, Lo8;->r(Lza9;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lfb9;->n()V

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :catch_1
    move-exception v0

    .line 102
    goto :goto_3

    .line 103
    :catch_2
    move-exception v0

    .line 104
    goto :goto_4

    .line 105
    :goto_3
    invoke-virtual {v3, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 106
    .line 107
    .line 108
    goto :goto_5

    .line 109
    :catch_3
    invoke-virtual {v2}, Lna9;->c()V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    instance-of v1, v1, Ljava/lang/Exception;

    .line 118
    .line 119
    if-eqz v1, :cond_0

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Ljava/lang/Exception;

    .line 126
    .line 127
    invoke-virtual {v2, v0}, Lna9;->d(Ljava/lang/Exception;)V

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_0
    invoke-virtual {v3, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 132
    .line 133
    .line 134
    :goto_5
    return-void

    .line 135
    :pswitch_1
    invoke-direct {v1}, Lzo2;->f()V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_2
    invoke-direct {v1}, Lzo2;->e()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_3
    invoke-direct {v1}, Lzo2;->c()V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_4
    invoke-direct {v1}, Lzo2;->d()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_5
    invoke-direct {v1}, Lzo2;->b()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_6
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lga9;

    .line 158
    .line 159
    iget-object v2, v0, Lga9;->f0:Lfb9;

    .line 160
    .line 161
    :try_start_2
    iget-object v3, v0, Lga9;->Z:Lr51;

    .line 162
    .line 163
    iget-object v1, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v1, Lfb9;

    .line 166
    .line 167
    invoke-interface {v3, v1}, Lr51;->g(Lfb9;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Lfb9;
    :try_end_2
    .catch Ler6; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 172
    .line 173
    if-nez v1, :cond_1

    .line 174
    .line 175
    new-instance v1, Ljava/lang/NullPointerException;

    .line 176
    .line 177
    const-string v2, "Continuation returned null"

    .line 178
    .line 179
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Lga9;->d(Ljava/lang/Exception;)V

    .line 183
    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_1
    iget-object v2, v1, Lfb9;->b:Lo8;

    .line 187
    .line 188
    sget-object v3, Lb28;->b:Ldp1;

    .line 189
    .line 190
    invoke-virtual {v1, v3, v0}, Lfb9;->c(Ljava/util/concurrent/Executor;Lab5;)V

    .line 191
    .line 192
    .line 193
    new-instance v4, Lna9;

    .line 194
    .line 195
    invoke-direct {v4, v3, v0}, Lna9;-><init>(Ljava/util/concurrent/Executor;Lna5;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4}, Lo8;->r(Lza9;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Lfb9;->n()V

    .line 202
    .line 203
    .line 204
    new-instance v4, Lna9;

    .line 205
    .line 206
    invoke-direct {v4, v3, v0}, Lna9;-><init>(Ljava/util/concurrent/Executor;Lba5;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v4}, Lo8;->r(Lza9;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Lfb9;->n()V

    .line 213
    .line 214
    .line 215
    goto :goto_8

    .line 216
    :catch_4
    move-exception v0

    .line 217
    goto :goto_6

    .line 218
    :catch_5
    move-exception v0

    .line 219
    goto :goto_7

    .line 220
    :goto_6
    invoke-virtual {v2, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    instance-of v1, v1, Ljava/lang/Exception;

    .line 229
    .line 230
    if-eqz v1, :cond_2

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Ljava/lang/Exception;

    .line 237
    .line 238
    invoke-virtual {v2, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 239
    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_2
    invoke-virtual {v2, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 243
    .line 244
    .line 245
    :goto_8
    return-void

    .line 246
    :pswitch_7
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, Lfb9;

    .line 249
    .line 250
    iget-boolean v2, v0, Lfb9;->d:Z

    .line 251
    .line 252
    iget-object v3, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v3, Lga9;

    .line 255
    .line 256
    if-eqz v2, :cond_3

    .line 257
    .line 258
    iget-object v0, v3, Lga9;->f0:Lfb9;

    .line 259
    .line 260
    invoke-virtual {v0}, Lfb9;->l()V

    .line 261
    .line 262
    .line 263
    goto :goto_b

    .line 264
    :cond_3
    :try_start_3
    iget-object v2, v3, Lga9;->Z:Lr51;

    .line 265
    .line 266
    invoke-interface {v2, v0}, Lr51;->g(Lfb9;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0
    :try_end_3
    .catch Ler6; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    .line 270
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v1, Lga9;

    .line 273
    .line 274
    iget-object v1, v1, Lga9;->f0:Lfb9;

    .line 275
    .line 276
    invoke-virtual {v1, v0}, Lfb9;->j(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    goto :goto_b

    .line 280
    :catch_6
    move-exception v0

    .line 281
    goto :goto_9

    .line 282
    :catch_7
    move-exception v0

    .line 283
    goto :goto_a

    .line 284
    :goto_9
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v1, Lga9;

    .line 287
    .line 288
    iget-object v1, v1, Lga9;->f0:Lfb9;

    .line 289
    .line 290
    invoke-virtual {v1, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 291
    .line 292
    .line 293
    goto :goto_b

    .line 294
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    instance-of v2, v2, Ljava/lang/Exception;

    .line 299
    .line 300
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v1, Lga9;

    .line 303
    .line 304
    if-eqz v2, :cond_4

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v0, Ljava/lang/Exception;

    .line 311
    .line 312
    iget-object v1, v1, Lga9;->f0:Lfb9;

    .line 313
    .line 314
    invoke-virtual {v1, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 315
    .line 316
    .line 317
    goto :goto_b

    .line 318
    :cond_4
    iget-object v1, v1, Lga9;->f0:Lfb9;

    .line 319
    .line 320
    invoke-virtual {v1, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 321
    .line 322
    .line 323
    :goto_b
    return-void

    .line 324
    :pswitch_8
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, Lq89;

    .line 327
    .line 328
    iget-object v1, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, Le99;

    .line 331
    .line 332
    iget-object v2, v1, Le99;->Y:Lx11;

    .line 333
    .line 334
    iget v3, v2, Lx11;->Y:I

    .line 335
    .line 336
    if-nez v3, :cond_a

    .line 337
    .line 338
    iget-object v1, v1, Le99;->Z:Lk99;

    .line 339
    .line 340
    invoke-static {v1}, Lw45;->s(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    iget-object v2, v1, Lk99;->Z:Lx11;

    .line 344
    .line 345
    iget v3, v2, Lx11;->Y:I

    .line 346
    .line 347
    if-nez v3, :cond_9

    .line 348
    .line 349
    iget-object v2, v0, Lq89;->n:Lbl;

    .line 350
    .line 351
    iget-object v1, v1, Lk99;->Y:Landroid/os/IBinder;

    .line 352
    .line 353
    if-nez v1, :cond_5

    .line 354
    .line 355
    move-object v3, v4

    .line 356
    goto :goto_c

    .line 357
    :cond_5
    sget v3, Lv4;->h:I

    .line 358
    .line 359
    const-string v3, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 360
    .line 361
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    instance-of v5, v3, Lx23;

    .line 366
    .line 367
    if-eqz v5, :cond_6

    .line 368
    .line 369
    check-cast v3, Lx23;

    .line 370
    .line 371
    goto :goto_c

    .line 372
    :cond_6
    new-instance v3, Lcb9;

    .line 373
    .line 374
    invoke-direct {v3, v1}, Lcb9;-><init>(Landroid/os/IBinder;)V

    .line 375
    .line 376
    .line 377
    :goto_c
    iget-object v1, v0, Lq89;->k:Ljava/util/Set;

    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    if-eqz v3, :cond_8

    .line 383
    .line 384
    if-nez v1, :cond_7

    .line 385
    .line 386
    goto :goto_d

    .line 387
    :cond_7
    iput-object v3, v2, Lbl;->f0:Ljava/lang/Object;

    .line 388
    .line 389
    iput-object v1, v2, Lbl;->g0:Ljava/lang/Object;

    .line 390
    .line 391
    iget-boolean v4, v2, Lbl;->Y:Z

    .line 392
    .line 393
    if-eqz v4, :cond_b

    .line 394
    .line 395
    iget-object v2, v2, Lbl;->X:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v2, Lis2;

    .line 398
    .line 399
    check-cast v2, Lu10;

    .line 400
    .line 401
    invoke-virtual {v2, v3, v1}, Lu10;->g(Lx23;Ljava/util/Set;)V

    .line 402
    .line 403
    .line 404
    goto :goto_e

    .line 405
    :cond_8
    :goto_d
    new-instance v1, Ljava/lang/Exception;

    .line 406
    .line 407
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 408
    .line 409
    .line 410
    const-string v3, "GoogleApiManager"

    .line 411
    .line 412
    const-string v5, "Received null response from onSignInSuccess"

    .line 413
    .line 414
    invoke-static {v3, v5, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 415
    .line 416
    .line 417
    new-instance v1, Lx11;

    .line 418
    .line 419
    const/4 v3, 0x4

    .line 420
    invoke-direct {v1, v3, v4, v4}, Lx11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2, v1}, Lbl;->j(Lx11;)V

    .line 424
    .line 425
    .line 426
    goto :goto_e

    .line 427
    :cond_9
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    new-instance v3, Ljava/lang/Exception;

    .line 432
    .line 433
    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    .line 434
    .line 435
    .line 436
    const-string v4, "Sign-in succeeded with resolve account failure: "

    .line 437
    .line 438
    const-string v5, "SignInCoordinator"

    .line 439
    .line 440
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-static {v5, v1, v3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 445
    .line 446
    .line 447
    iget-object v1, v0, Lq89;->n:Lbl;

    .line 448
    .line 449
    invoke-virtual {v1, v2}, Lbl;->j(Lx11;)V

    .line 450
    .line 451
    .line 452
    iget-object v0, v0, Lq89;->m:Lz87;

    .line 453
    .line 454
    invoke-virtual {v0}, Lu10;->b()V

    .line 455
    .line 456
    .line 457
    goto :goto_f

    .line 458
    :cond_a
    iget-object v1, v0, Lq89;->n:Lbl;

    .line 459
    .line 460
    invoke-virtual {v1, v2}, Lbl;->j(Lx11;)V

    .line 461
    .line 462
    .line 463
    :cond_b
    :goto_e
    iget-object v0, v0, Lq89;->m:Lz87;

    .line 464
    .line 465
    invoke-virtual {v0}, Lu10;->b()V

    .line 466
    .line 467
    .line 468
    :goto_f
    return-void

    .line 469
    :pswitch_9
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v0, Lx11;

    .line 472
    .line 473
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v1, Lbl;

    .line 476
    .line 477
    iget-object v2, v1, Lbl;->h0:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v2, Lrs2;

    .line 480
    .line 481
    iget-object v5, v1, Lbl;->X:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v5, Lis2;

    .line 484
    .line 485
    iget-object v2, v2, Lrs2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 486
    .line 487
    iget-object v6, v1, Lbl;->Z:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v6, Lqn;

    .line 490
    .line 491
    invoke-virtual {v2, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    check-cast v2, Li89;

    .line 496
    .line 497
    if-nez v2, :cond_c

    .line 498
    .line 499
    goto :goto_11

    .line 500
    :cond_c
    iget v6, v0, Lx11;->Y:I

    .line 501
    .line 502
    if-nez v6, :cond_f

    .line 503
    .line 504
    iput-boolean v3, v1, Lbl;->Y:Z

    .line 505
    .line 506
    invoke-virtual {v5}, Lu10;->n()Z

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    if-nez v0, :cond_e

    .line 511
    .line 512
    :try_start_4
    invoke-virtual {v5}, Lu10;->n()Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v0, :cond_d

    .line 517
    .line 518
    iget-object v0, v5, Lis2;->y:Ljava/util/Set;

    .line 519
    .line 520
    goto :goto_10

    .line 521
    :cond_d
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 522
    .line 523
    :goto_10
    move-object v1, v5

    .line 524
    check-cast v1, Lu10;

    .line 525
    .line 526
    invoke-virtual {v1, v4, v0}, Lu10;->g(Lx23;Ljava/util/Set;)V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_8

    .line 527
    .line 528
    .line 529
    goto :goto_11

    .line 530
    :catch_8
    const-string v0, "Failed to get service from broker."

    .line 531
    .line 532
    check-cast v5, Lu10;

    .line 533
    .line 534
    invoke-virtual {v5, v0}, Lu10;->c(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    new-instance v0, Lx11;

    .line 538
    .line 539
    const/16 v1, 0xa

    .line 540
    .line 541
    invoke-direct {v0, v1, v4, v4}, Lx11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2, v0, v4}, Li89;->n(Lx11;Ljava/lang/RuntimeException;)V

    .line 545
    .line 546
    .line 547
    goto :goto_11

    .line 548
    :cond_e
    iget-boolean v0, v1, Lbl;->Y:Z

    .line 549
    .line 550
    if-eqz v0, :cond_10

    .line 551
    .line 552
    iget-object v0, v1, Lbl;->f0:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, Lx23;

    .line 555
    .line 556
    if-eqz v0, :cond_10

    .line 557
    .line 558
    iget-object v1, v1, Lbl;->g0:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v1, Ljava/util/Set;

    .line 561
    .line 562
    check-cast v5, Lu10;

    .line 563
    .line 564
    invoke-virtual {v5, v0, v1}, Lu10;->g(Lx23;Ljava/util/Set;)V

    .line 565
    .line 566
    .line 567
    goto :goto_11

    .line 568
    :cond_f
    invoke-virtual {v2, v0, v4}, Li89;->n(Lx11;Ljava/lang/RuntimeException;)V

    .line 569
    .line 570
    .line 571
    :cond_10
    :goto_11
    return-void

    .line 572
    :pswitch_a
    invoke-direct {v1}, Lzo2;->a()V

    .line 573
    .line 574
    .line 575
    return-void

    .line 576
    :pswitch_b
    :try_start_5
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v0, Ljava/lang/Runnable;

    .line 579
    .line 580
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 581
    .line 582
    .line 583
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, Lh37;

    .line 586
    .line 587
    iget-object v2, v0, Lh37;->f0:Ljava/lang/Object;

    .line 588
    .line 589
    monitor-enter v2

    .line 590
    :try_start_6
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v0, Lh37;

    .line 593
    .line 594
    invoke-virtual {v0}, Lh37;->a()V

    .line 595
    .line 596
    .line 597
    monitor-exit v2

    .line 598
    return-void

    .line 599
    :catchall_1
    move-exception v0

    .line 600
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 601
    throw v0

    .line 602
    :catchall_2
    move-exception v0

    .line 603
    iget-object v2, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v2, Lh37;

    .line 606
    .line 607
    iget-object v2, v2, Lh37;->f0:Ljava/lang/Object;

    .line 608
    .line 609
    monitor-enter v2

    .line 610
    :try_start_7
    iget-object v1, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v1, Lh37;

    .line 613
    .line 614
    invoke-virtual {v1}, Lh37;->a()V

    .line 615
    .line 616
    .line 617
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 618
    throw v0

    .line 619
    :catchall_3
    move-exception v0

    .line 620
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 621
    throw v0

    .line 622
    :pswitch_c
    :try_start_9
    invoke-virtual {v1}, Lzo2;->g()V
    :try_end_9
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_9

    .line 623
    .line 624
    .line 625
    return-void

    .line 626
    :catch_9
    move-exception v0

    .line 627
    iget-object v2, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v2, Lb37;

    .line 630
    .line 631
    iget-object v2, v2, Lb37;->Y:Ljava/util/ArrayDeque;

    .line 632
    .line 633
    monitor-enter v2

    .line 634
    :try_start_a
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v1, Lb37;

    .line 637
    .line 638
    iput v3, v1, Lb37;->Z:I

    .line 639
    .line 640
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 641
    throw v0

    .line 642
    :catchall_4
    move-exception v0

    .line 643
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 644
    throw v0

    .line 645
    :pswitch_d
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v0, Lmm0;

    .line 648
    .line 649
    iget-object v1, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v1, Lt52;

    .line 652
    .line 653
    invoke-virtual {v0, v1}, Lmm0;->F(Lu61;)V

    .line 654
    .line 655
    .line 656
    return-void

    .line 657
    :pswitch_e
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v0, Lay1;

    .line 660
    .line 661
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 662
    .line 663
    invoke-virtual {v0, v1}, Lay1;->accept(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    return-void

    .line 667
    :pswitch_f
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v0, Lgc4;

    .line 670
    .line 671
    iget-object v0, v0, Lgc4;->Z:Ljava/lang/Object;

    .line 672
    .line 673
    move-object v2, v0

    .line 674
    check-cast v2, Lr43;

    .line 675
    .line 676
    :try_start_c
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v0, Lxb4;

    .line 679
    .line 680
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    check-cast v0, Lkj2;

    .line 685
    .line 686
    new-instance v1, Lgh5;

    .line 687
    .line 688
    invoke-direct {v1, v0}, Lgh5;-><init>(Lkj2;)V

    .line 689
    .line 690
    .line 691
    invoke-static {v1}, Lw79;->K(Landroid/os/Parcelable;)[B

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-static {v2, v0}, Lvb4;->b(Lr43;[B)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 696
    .line 697
    .line 698
    goto :goto_12

    .line 699
    :catchall_5
    move-exception v0

    .line 700
    invoke-static {v2, v0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 701
    .line 702
    .line 703
    :goto_12
    return-void

    .line 704
    :cond_11
    :pswitch_10
    :try_start_d
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v0, Ljava/lang/Runnable;

    .line 707
    .line 708
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 709
    .line 710
    .line 711
    goto :goto_13

    .line 712
    :catchall_6
    move-exception v0

    .line 713
    :try_start_e
    sget-object v4, Lb02;->X:Lb02;

    .line 714
    .line 715
    invoke-static {v4, v0}, Lvr3;->F(Ls61;Ljava/lang/Throwable;)V

    .line 716
    .line 717
    .line 718
    :goto_13
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 719
    .line 720
    check-cast v0, Lu94;

    .line 721
    .line 722
    invoke-virtual {v0}, Lu94;->d1()Ljava/lang/Runnable;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    if-nez v0, :cond_12

    .line 727
    .line 728
    goto :goto_14

    .line 729
    :cond_12
    iput-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 730
    .line 731
    add-int/2addr v2, v3

    .line 732
    const/16 v0, 0x10

    .line 733
    .line 734
    if-lt v2, v0, :cond_11

    .line 735
    .line 736
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v0, Lu94;

    .line 739
    .line 740
    iget-object v4, v0, Lu94;->f0:Lu61;

    .line 741
    .line 742
    invoke-static {v4, v0}, Lop1;->c(Lu61;Ls61;)Z

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    if-eqz v0, :cond_11

    .line 747
    .line 748
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v0, Lu94;

    .line 751
    .line 752
    iget-object v2, v0, Lu94;->f0:Lu61;

    .line 753
    .line 754
    invoke-static {v2, v0, v1}, Lop1;->b(Lu61;Ls61;Ljava/lang/Runnable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 755
    .line 756
    .line 757
    :goto_14
    return-void

    .line 758
    :catchall_7
    move-exception v0

    .line 759
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 760
    .line 761
    check-cast v1, Lu94;

    .line 762
    .line 763
    iget-object v2, v1, Lu94;->i0:Ljava/lang/Object;

    .line 764
    .line 765
    monitor-enter v2

    .line 766
    :try_start_f
    sget-object v3, Lu94;->j0:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 767
    .line 768
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 769
    .line 770
    .line 771
    monitor-exit v2

    .line 772
    throw v0

    .line 773
    :catchall_8
    move-exception v0

    .line 774
    monitor-exit v2

    .line 775
    throw v0

    .line 776
    :pswitch_11
    invoke-static {}, Llh4;->P0()Llh4;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    sget v2, Lmh1;->d:I

    .line 781
    .line 782
    iget-object v2, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v2, Ll49;

    .line 785
    .line 786
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v0, Lmh1;

    .line 792
    .line 793
    iget-object v0, v0, Lmh1;->a:Lhu2;

    .line 794
    .line 795
    filled-new-array {v2}, [Ll49;

    .line 796
    .line 797
    .line 798
    move-result-object v1

    .line 799
    invoke-virtual {v0, v1}, Lhu2;->e([Ll49;)V

    .line 800
    .line 801
    .line 802
    return-void

    .line 803
    :pswitch_12
    :try_start_10
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v0, Lzo0;

    .line 806
    .line 807
    iget-object v3, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v3, Lxb4;

    .line 810
    .line 811
    invoke-static {v3}, Lvr3;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v3

    .line 815
    iget-object v0, v0, Lyo2;->Y:Lqd0;

    .line 816
    .line 817
    if-eqz v0, :cond_13

    .line 818
    .line 819
    invoke-virtual {v0, v3}, Lqd0;->b(Ljava/lang/Object;)Z
    :try_end_10
    .catch Ljava/util/concurrent/CancellationException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_10 .. :try_end_10} :catch_a
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 820
    .line 821
    .line 822
    :cond_13
    :goto_15
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 823
    .line 824
    check-cast v0, Lzo0;

    .line 825
    .line 826
    iput-object v4, v0, Lzo0;->i0:Lxb4;

    .line 827
    .line 828
    goto :goto_16

    .line 829
    :catchall_9
    move-exception v0

    .line 830
    goto :goto_17

    .line 831
    :catch_a
    move-exception v0

    .line 832
    :try_start_11
    iget-object v2, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 833
    .line 834
    check-cast v2, Lzo0;

    .line 835
    .line 836
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    iget-object v2, v2, Lyo2;->Y:Lqd0;

    .line 841
    .line 842
    if-eqz v2, :cond_13

    .line 843
    .line 844
    invoke-virtual {v2, v0}, Lqd0;->d(Ljava/lang/Throwable;)Z

    .line 845
    .line 846
    .line 847
    goto :goto_15

    .line 848
    :catch_b
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v0, Lzo0;

    .line 851
    .line 852
    invoke-virtual {v0, v2}, Lzo0;->cancel(Z)Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 853
    .line 854
    .line 855
    goto :goto_15

    .line 856
    :goto_16
    return-void

    .line 857
    :goto_17
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v1, Lzo0;

    .line 860
    .line 861
    iput-object v4, v1, Lzo0;->i0:Lxb4;

    .line 862
    .line 863
    throw v0

    .line 864
    :pswitch_13
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v0, Lrb8;

    .line 867
    .line 868
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast v1, Landroid/graphics/Typeface;

    .line 871
    .line 872
    iget-object v0, v0, Lrb8;->Y:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v0, Lwl7;

    .line 875
    .line 876
    if-eqz v0, :cond_14

    .line 877
    .line 878
    invoke-virtual {v0, v1}, Lwl7;->T(Landroid/graphics/Typeface;)V

    .line 879
    .line 880
    .line 881
    :cond_14
    return-void

    .line 882
    :pswitch_14
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v0, Lgv;

    .line 885
    .line 886
    iget-object v4, v0, Lgv;->f0:Liv;

    .line 887
    .line 888
    iget v5, v4, Liv;->g:I

    .line 889
    .line 890
    iget v6, v0, Lgv;->Z:I

    .line 891
    .line 892
    if-ne v5, v6, :cond_20

    .line 893
    .line 894
    iget-object v0, v0, Lgv;->Y:Ljava/util/List;

    .line 895
    .line 896
    iget-object v1, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v1, Lqo1;

    .line 899
    .line 900
    iput-object v0, v4, Liv;->e:Ljava/util/List;

    .line 901
    .line 902
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    iput-object v0, v4, Liv;->f:Ljava/util/List;

    .line 907
    .line 908
    iget-object v0, v4, Liv;->a:Lwl6;

    .line 909
    .line 910
    iget-object v5, v1, Lqo1;->b:[I

    .line 911
    .line 912
    iget-object v6, v1, Lqo1;->a:Ljava/util/ArrayList;

    .line 913
    .line 914
    iget v7, v1, Lqo1;->e:I

    .line 915
    .line 916
    iget-object v8, v1, Lqo1;->d:Lyr2;

    .line 917
    .line 918
    new-instance v9, Lw40;

    .line 919
    .line 920
    invoke-direct {v9, v0}, Lw40;-><init>(Lwl6;)V

    .line 921
    .line 922
    .line 923
    new-instance v0, Ljava/util/ArrayDeque;

    .line 924
    .line 925
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 926
    .line 927
    .line 928
    iget v10, v1, Lqo1;->f:I

    .line 929
    .line 930
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 931
    .line 932
    .line 933
    move-result v11

    .line 934
    sub-int/2addr v11, v3

    .line 935
    move v12, v11

    .line 936
    move v11, v10

    .line 937
    move v10, v7

    .line 938
    :goto_18
    if-ltz v12, :cond_1f

    .line 939
    .line 940
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v13

    .line 944
    check-cast v13, Lpo1;

    .line 945
    .line 946
    iget v14, v13, Lpo1;->a:I

    .line 947
    .line 948
    iget v15, v13, Lpo1;->c:I

    .line 949
    .line 950
    move/from16 v16, v3

    .line 951
    .line 952
    add-int v3, v14, v15

    .line 953
    .line 954
    iget v13, v13, Lpo1;->b:I

    .line 955
    .line 956
    add-int v2, v13, v15

    .line 957
    .line 958
    :goto_19
    if-le v10, v3, :cond_18

    .line 959
    .line 960
    add-int/lit8 v10, v10, -0x1

    .line 961
    .line 962
    aget v17, v5, v10

    .line 963
    .line 964
    and-int/lit8 v18, v17, 0xc

    .line 965
    .line 966
    if-eqz v18, :cond_17

    .line 967
    .line 968
    move/from16 p0, v3

    .line 969
    .line 970
    shr-int/lit8 v3, v17, 0x4

    .line 971
    .line 972
    move-object/from16 v18, v4

    .line 973
    .line 974
    move-object/from16 v19, v5

    .line 975
    .line 976
    const/4 v4, 0x0

    .line 977
    invoke-static {v0, v3, v4}, Lqo1;->a(Ljava/util/ArrayDeque;IZ)Lro1;

    .line 978
    .line 979
    .line 980
    move-result-object v5

    .line 981
    if-eqz v5, :cond_16

    .line 982
    .line 983
    iget v4, v5, Lro1;->b:I

    .line 984
    .line 985
    sub-int v4, v7, v4

    .line 986
    .line 987
    add-int/lit8 v4, v4, -0x1

    .line 988
    .line 989
    invoke-virtual {v9, v10, v4}, Lw40;->k(II)V

    .line 990
    .line 991
    .line 992
    and-int/lit8 v5, v17, 0x4

    .line 993
    .line 994
    if-eqz v5, :cond_15

    .line 995
    .line 996
    invoke-virtual {v8, v10, v3}, Lyr2;->n(II)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v3

    .line 1000
    move/from16 v5, v16

    .line 1001
    .line 1002
    invoke-virtual {v9, v4, v5, v3}, Lw40;->F(IILjava/lang/Object;)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_1a

    .line 1006
    :cond_15
    move/from16 v5, v16

    .line 1007
    .line 1008
    goto :goto_1a

    .line 1009
    :cond_16
    move/from16 v5, v16

    .line 1010
    .line 1011
    new-instance v3, Lro1;

    .line 1012
    .line 1013
    sub-int v4, v7, v10

    .line 1014
    .line 1015
    sub-int/2addr v4, v5

    .line 1016
    invoke-direct {v3, v10, v4, v5}, Lro1;-><init>(IIZ)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v0, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    goto :goto_1a

    .line 1023
    :cond_17
    move/from16 p0, v3

    .line 1024
    .line 1025
    move-object/from16 v18, v4

    .line 1026
    .line 1027
    move-object/from16 v19, v5

    .line 1028
    .line 1029
    move/from16 v5, v16

    .line 1030
    .line 1031
    invoke-virtual {v9, v10, v5}, Lw40;->w(II)V

    .line 1032
    .line 1033
    .line 1034
    add-int/lit8 v7, v7, -0x1

    .line 1035
    .line 1036
    :goto_1a
    move/from16 v3, p0

    .line 1037
    .line 1038
    move-object/from16 v4, v18

    .line 1039
    .line 1040
    move-object/from16 v5, v19

    .line 1041
    .line 1042
    const/16 v16, 0x1

    .line 1043
    .line 1044
    goto :goto_19

    .line 1045
    :cond_18
    move-object/from16 v18, v4

    .line 1046
    .line 1047
    move-object/from16 v19, v5

    .line 1048
    .line 1049
    :goto_1b
    if-le v11, v2, :cond_1c

    .line 1050
    .line 1051
    add-int/lit8 v11, v11, -0x1

    .line 1052
    .line 1053
    iget-object v3, v1, Lqo1;->c:[I

    .line 1054
    .line 1055
    aget v3, v3, v11

    .line 1056
    .line 1057
    and-int/lit8 v4, v3, 0xc

    .line 1058
    .line 1059
    if-eqz v4, :cond_1a

    .line 1060
    .line 1061
    shr-int/lit8 v4, v3, 0x4

    .line 1062
    .line 1063
    move-object/from16 p0, v1

    .line 1064
    .line 1065
    const/4 v5, 0x1

    .line 1066
    invoke-static {v0, v4, v5}, Lqo1;->a(Ljava/util/ArrayDeque;IZ)Lro1;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v1

    .line 1070
    if-nez v1, :cond_19

    .line 1071
    .line 1072
    new-instance v1, Lro1;

    .line 1073
    .line 1074
    sub-int v3, v7, v10

    .line 1075
    .line 1076
    const/4 v4, 0x0

    .line 1077
    invoke-direct {v1, v11, v3, v4}, Lro1;-><init>(IIZ)V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 1081
    .line 1082
    .line 1083
    goto :goto_1c

    .line 1084
    :cond_19
    iget v1, v1, Lro1;->b:I

    .line 1085
    .line 1086
    sub-int v1, v7, v1

    .line 1087
    .line 1088
    sub-int/2addr v1, v5

    .line 1089
    invoke-virtual {v9, v1, v10}, Lw40;->k(II)V

    .line 1090
    .line 1091
    .line 1092
    and-int/lit8 v1, v3, 0x4

    .line 1093
    .line 1094
    if-eqz v1, :cond_1b

    .line 1095
    .line 1096
    invoke-virtual {v8, v4, v11}, Lyr2;->n(II)Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v1

    .line 1100
    invoke-virtual {v9, v10, v5, v1}, Lw40;->F(IILjava/lang/Object;)V

    .line 1101
    .line 1102
    .line 1103
    goto :goto_1c

    .line 1104
    :cond_1a
    move-object/from16 p0, v1

    .line 1105
    .line 1106
    const/4 v5, 0x1

    .line 1107
    invoke-virtual {v9, v10, v5}, Lw40;->o(II)V

    .line 1108
    .line 1109
    .line 1110
    add-int/lit8 v7, v7, 0x1

    .line 1111
    .line 1112
    :cond_1b
    :goto_1c
    move-object/from16 v1, p0

    .line 1113
    .line 1114
    goto :goto_1b

    .line 1115
    :cond_1c
    move-object/from16 p0, v1

    .line 1116
    .line 1117
    move v2, v13

    .line 1118
    move v1, v14

    .line 1119
    const/4 v4, 0x0

    .line 1120
    :goto_1d
    if-ge v4, v15, :cond_1e

    .line 1121
    .line 1122
    aget v3, v19, v1

    .line 1123
    .line 1124
    and-int/lit8 v3, v3, 0xf

    .line 1125
    .line 1126
    const/4 v5, 0x2

    .line 1127
    if-ne v3, v5, :cond_1d

    .line 1128
    .line 1129
    invoke-virtual {v8, v1, v2}, Lyr2;->n(II)Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v3

    .line 1133
    const/4 v5, 0x1

    .line 1134
    invoke-virtual {v9, v1, v5, v3}, Lw40;->F(IILjava/lang/Object;)V

    .line 1135
    .line 1136
    .line 1137
    goto :goto_1e

    .line 1138
    :cond_1d
    const/4 v5, 0x1

    .line 1139
    :goto_1e
    add-int/lit8 v1, v1, 0x1

    .line 1140
    .line 1141
    add-int/lit8 v2, v2, 0x1

    .line 1142
    .line 1143
    add-int/lit8 v4, v4, 0x1

    .line 1144
    .line 1145
    goto :goto_1d

    .line 1146
    :cond_1e
    const/4 v5, 0x1

    .line 1147
    add-int/lit8 v12, v12, -0x1

    .line 1148
    .line 1149
    move-object/from16 v1, p0

    .line 1150
    .line 1151
    move v3, v5

    .line 1152
    move v11, v13

    .line 1153
    move v10, v14

    .line 1154
    move-object/from16 v4, v18

    .line 1155
    .line 1156
    move-object/from16 v5, v19

    .line 1157
    .line 1158
    const/4 v2, 0x0

    .line 1159
    goto/16 :goto_18

    .line 1160
    .line 1161
    :cond_1f
    move-object/from16 v18, v4

    .line 1162
    .line 1163
    invoke-virtual {v9}, Lw40;->a()V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual/range {v18 .. v18}, Liv;->a()V

    .line 1167
    .line 1168
    .line 1169
    :cond_20
    return-void

    .line 1170
    :pswitch_15
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 1171
    .line 1172
    iget-object v1, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 1173
    .line 1174
    :try_start_12
    sget-object v2, Lf6;->d:Ljava/lang/reflect/Method;

    .line 1175
    .line 1176
    if-eqz v2, :cond_21

    .line 1177
    .line 1178
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1179
    .line 1180
    const-string v4, "AppCompat recreation"

    .line 1181
    .line 1182
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v0

    .line 1186
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    goto :goto_1f

    .line 1190
    :cond_21
    sget-object v2, Lf6;->e:Ljava/lang/reflect/Method;

    .line 1191
    .line 1192
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1193
    .line 1194
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_12
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_c
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 1199
    .line 1200
    .line 1201
    goto :goto_1f

    .line 1202
    :catch_c
    move-exception v0

    .line 1203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v1

    .line 1207
    const-class v2, Ljava/lang/RuntimeException;

    .line 1208
    .line 1209
    if-ne v1, v2, :cond_23

    .line 1210
    .line 1211
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    if-eqz v1, :cond_23

    .line 1216
    .line 1217
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v1

    .line 1221
    const-string v2, "Unable to stop"

    .line 1222
    .line 1223
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v1

    .line 1227
    if-nez v1, :cond_22

    .line 1228
    .line 1229
    goto :goto_1f

    .line 1230
    :cond_22
    throw v0

    .line 1231
    :catchall_a
    :cond_23
    :goto_1f
    return-void

    .line 1232
    :pswitch_16
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 1233
    .line 1234
    check-cast v0, Landroid/app/Application;

    .line 1235
    .line 1236
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast v1, Le6;

    .line 1239
    .line 1240
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1241
    .line 1242
    .line 1243
    return-void

    .line 1244
    :pswitch_17
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 1245
    .line 1246
    check-cast v0, Le6;

    .line 1247
    .line 1248
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 1249
    .line 1250
    iput-object v1, v0, Le6;->X:Ljava/lang/Object;

    .line 1251
    .line 1252
    return-void

    .line 1253
    :pswitch_18
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 1254
    .line 1255
    check-cast v0, Lg5;

    .line 1256
    .line 1257
    iget-object v1, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 1258
    .line 1259
    check-cast v1, Landroidx/appcompat/widget/a;

    .line 1260
    .line 1261
    iget-object v2, v1, Lf20;->Z:Lnt4;

    .line 1262
    .line 1263
    if-eqz v2, :cond_24

    .line 1264
    .line 1265
    iget-object v3, v2, Lnt4;->e:Llt4;

    .line 1266
    .line 1267
    if-eqz v3, :cond_24

    .line 1268
    .line 1269
    invoke-interface {v3, v2}, Llt4;->D(Lnt4;)V

    .line 1270
    .line 1271
    .line 1272
    :cond_24
    iget-object v2, v1, Lf20;->j0:Lku4;

    .line 1273
    .line 1274
    check-cast v2, Landroid/view/View;

    .line 1275
    .line 1276
    if-eqz v2, :cond_27

    .line 1277
    .line 1278
    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v2

    .line 1282
    if-eqz v2, :cond_27

    .line 1283
    .line 1284
    invoke-virtual {v0}, Ldu4;->b()Z

    .line 1285
    .line 1286
    .line 1287
    move-result v2

    .line 1288
    if-eqz v2, :cond_25

    .line 1289
    .line 1290
    goto :goto_20

    .line 1291
    :cond_25
    iget-object v2, v0, Ldu4;->f:Landroid/view/View;

    .line 1292
    .line 1293
    if-nez v2, :cond_26

    .line 1294
    .line 1295
    goto :goto_21

    .line 1296
    :cond_26
    const/4 v2, 0x0

    .line 1297
    invoke-virtual {v0, v2, v2, v2, v2}, Ldu4;->d(IIZZ)V

    .line 1298
    .line 1299
    .line 1300
    :goto_20
    iput-object v0, v1, Landroidx/appcompat/widget/a;->u0:Lg5;

    .line 1301
    .line 1302
    :cond_27
    :goto_21
    iput-object v4, v1, Landroidx/appcompat/widget/a;->w0:Lzo2;

    .line 1303
    .line 1304
    return-void

    .line 1305
    :pswitch_19
    iget-object v0, v1, Lzo2;->Z:Ljava/lang/Object;

    .line 1306
    .line 1307
    move-object v2, v0

    .line 1308
    check-cast v2, Lxo2;

    .line 1309
    .line 1310
    :try_start_13
    iget-object v0, v1, Lzo2;->Y:Ljava/lang/Object;

    .line 1311
    .line 1312
    check-cast v0, Ljava/util/concurrent/Future;

    .line 1313
    .line 1314
    invoke-static {v0}, Lvr3;->x(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v0
    :try_end_13
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_13 .. :try_end_13} :catch_f
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_e
    .catch Ljava/lang/Error; {:try_start_13 .. :try_end_13} :catch_d

    .line 1318
    invoke-interface {v2, v0}, Lxo2;->b(Ljava/lang/Object;)V

    .line 1319
    .line 1320
    .line 1321
    goto :goto_24

    .line 1322
    :catch_d
    move-exception v0

    .line 1323
    goto :goto_22

    .line 1324
    :catch_e
    move-exception v0

    .line 1325
    goto :goto_22

    .line 1326
    :catch_f
    move-exception v0

    .line 1327
    goto :goto_23

    .line 1328
    :goto_22
    invoke-interface {v2, v0}, Lxo2;->u(Ljava/lang/Throwable;)V

    .line 1329
    .line 1330
    .line 1331
    goto :goto_24

    .line 1332
    :goto_23
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v1

    .line 1336
    if-nez v1, :cond_28

    .line 1337
    .line 1338
    invoke-interface {v2, v0}, Lxo2;->u(Ljava/lang/Throwable;)V

    .line 1339
    .line 1340
    .line 1341
    goto :goto_24

    .line 1342
    :cond_28
    invoke-interface {v2, v1}, Lxo2;->u(Ljava/lang/Throwable;)V

    .line 1343
    .line 1344
    .line 1345
    :goto_24
    return-void

    .line 1346
    nop

    .line 1347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-byte v0, p0, Lzo2;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lzo2;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :sswitch_0
    iget-object p0, p0, Lzo2;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/lang/Runnable;

    .line 16
    .line 17
    const-string v0, "}"

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "SequentialExecutorWorker{running="

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "SequentialExecutorWorker{state="

    .line 42
    .line 43
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast v1, Lb37;

    .line 47
    .line 48
    iget v1, v1, Lb37;->Z:I

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    if-eq v1, v2, :cond_4

    .line 52
    .line 53
    const/4 v2, 0x2

    .line 54
    if-eq v1, v2, :cond_3

    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    if-eq v1, v2, :cond_2

    .line 58
    .line 59
    const/4 v2, 0x4

    .line 60
    if-eq v1, v2, :cond_1

    .line 61
    .line 62
    const-string v1, "null"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string v1, "RUNNING"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string v1, "QUEUED"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    const-string v1, "QUEUING"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const-string v1, "IDLE"

    .line 75
    .line 76
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_1
    return-object p0

    .line 87
    :sswitch_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-class v0, Lzo2;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v0, ","

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    check-cast v1, Lxo2;

    .line 104
    .line 105
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method
