.class public final Lm76;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final X:Ll95;

.field public final Y:Ly5;

.field public final Z:Lry1;

.field public final f0:Ll76;

.field public final g0:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public h0:Ljava/lang/Object;

.field public i0:Lp42;

.field public j0:Lp76;

.field public k0:Lwg;

.field public l0:Z

.field public m0:Z

.field public n0:Z

.field public volatile o0:Z

.field public volatile p0:Lwg;

.field public volatile q0:Lp76;


# direct methods
.method public constructor <init>(Ll95;Ly5;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm76;->X:Ll95;

    .line 5
    .line 6
    iput-object p2, p0, Lm76;->Y:Ly5;

    .line 7
    .line 8
    iget-object p2, p1, Ll95;->Y:Lwl6;

    .line 9
    .line 10
    iget-object p2, p2, Lwl6;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, Lry1;

    .line 13
    .line 14
    iput-object p2, p0, Lm76;->Z:Lry1;

    .line 15
    .line 16
    new-instance p2, Ll76;

    .line 17
    .line 18
    invoke-direct {p2, p0}, Ll76;-><init>(Lm76;)V

    .line 19
    .line 20
    .line 21
    iget p1, p1, Ll95;->q0:I

    .line 22
    .line 23
    int-to-long v0, p1

    .line 24
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    invoke-virtual {p2, v0, v1, p1}, Lta8;->timeout(JLjava/util/concurrent/TimeUnit;)Lta8;

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, Lm76;->f0:Ll76;

    .line 30
    .line 31
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lm76;->g0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, Lm76;->n0:Z

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a(Lp76;)V
    .locals 2

    .line 1
    sget-object v0, Lks8;->a:[B

    .line 2
    .line 3
    iget-object v0, p0, Lm76;->j0:Lp76;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lm76;->j0:Lp76;

    .line 8
    .line 9
    iget-object p1, p1, Lp76;->p:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lk76;

    .line 12
    .line 13
    iget-object v1, p0, Lm76;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lk76;-><init>(Lm76;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "Check failed."

    .line 23
    .line 24
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final b(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    sget-object v0, Lks8;->a:[B

    .line 2
    .line 3
    iget-object v0, p0, Lm76;->j0:Lp76;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Lm76;->g()Ljava/net/Socket;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    iget-object v0, p0, Lm76;->j0:Lp76;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-static {v1}, Lks8;->d(Ljava/net/Socket;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string p0, "Check failed."

    .line 27
    .line 28
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v0

    .line 35
    throw p0

    .line 36
    :cond_2
    :goto_0
    iget-object p0, p0, Lm76;->f0:Ll76;

    .line 37
    .line 38
    invoke-virtual {p0}, Lnv;->exit()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_3

    .line 43
    .line 44
    move-object p0, p1

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 47
    .line 48
    const-string v0, "timeout"

    .line 49
    .line 50
    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    :cond_4
    :goto_1
    if-eqz p1, :cond_5

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    :cond_5
    return-object p0
.end method

.method public final c(Z)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lm76;->n0:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lm76;->p0:Lwg;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v1, p1, Lwg;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lo42;

    .line 17
    .line 18
    invoke-interface {v1}, Lo42;->cancel()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p1, Lwg;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lm76;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, p1, v2, v2, v0}, Lm76;->e(Lwg;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 27
    .line 28
    .line 29
    :cond_0
    iput-object v0, p0, Lm76;->k0:Lwg;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    :try_start_1
    const-string p1, "released"

    .line 33
    .line 34
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    monitor-exit p0

    .line 42
    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lm76;

    .line 2
    .line 3
    iget-object v1, p0, Lm76;->X:Ll95;

    .line 4
    .line 5
    iget-object p0, p0, Lm76;->Y:Ly5;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lm76;-><init>(Ll95;Ly5;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final d()Lzf6;
    .locals 10

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm76;->X:Ll95;

    .line 7
    .line 8
    iget-object v0, v0, Ll95;->Z:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v2, v0}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lr11;

    .line 14
    .line 15
    iget-object v1, p0, Lm76;->X:Ll95;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lr11;-><init>(Ll95;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    new-instance v0, Lm80;

    .line 24
    .line 25
    iget-object v1, p0, Lm76;->X:Ll95;

    .line 26
    .line 27
    iget-object v1, v1, Ll95;->g0:Ld61;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lm80;-><init>(Ld61;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance v0, Lr11;

    .line 36
    .line 37
    const/4 v9, 0x1

    .line 38
    invoke-direct {v0, v9}, Lr11;-><init>(B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    sget-object v0, Lr11;->b:Lr11;

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lm76;->X:Ll95;

    .line 50
    .line 51
    iget-object v0, v0, Ll95;->f0:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v2, v0}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lr11;

    .line 57
    .line 58
    const/4 v1, 0x2

    .line 59
    invoke-direct {v0, v1}, Lr11;-><init>(B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    new-instance v0, Ly76;

    .line 66
    .line 67
    iget-object v5, p0, Lm76;->Y:Ly5;

    .line 68
    .line 69
    iget-object v1, p0, Lm76;->X:Ll95;

    .line 70
    .line 71
    iget v6, v1, Ll95;->r0:I

    .line 72
    .line 73
    iget v7, v1, Ll95;->s0:I

    .line 74
    .line 75
    iget v8, v1, Ll95;->t0:I

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    move-object v1, p0

    .line 80
    invoke-direct/range {v0 .. v8}, Ly76;-><init>(Lm76;Ljava/util/ArrayList;ILwg;Ly5;III)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    const/4 v2, 0x0

    .line 85
    :try_start_0
    invoke-virtual {v0, v5}, Ly76;->b(Ly5;)Lzf6;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-boolean v3, v1, Lm76;->o0:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    if-nez v3, :cond_0

    .line 92
    .line 93
    invoke-virtual {v1, p0}, Lm76;->f(Ljava/io/IOException;)Ljava/io/IOException;

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_0
    :try_start_1
    invoke-static {v0}, Lks8;->c(Ljava/io/Closeable;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Ljava/io/IOException;

    .line 101
    .line 102
    const-string v3, "Canceled"

    .line 103
    .line 104
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    move v9, v2

    .line 110
    goto :goto_0

    .line 111
    :catch_0
    move-exception v0

    .line 112
    :try_start_2
    invoke-virtual {v1, v0}, Lm76;->f(Ljava/io/IOException;)Ljava/io/IOException;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 120
    :catchall_1
    move-exception v0

    .line 121
    :goto_0
    if-nez v9, :cond_1

    .line 122
    .line 123
    invoke-virtual {v1, p0}, Lm76;->f(Ljava/io/IOException;)Ljava/io/IOException;

    .line 124
    .line 125
    .line 126
    :cond_1
    throw v0
.end method

.method public final e(Lwg;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm76;->p0:Lwg;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_5

    .line 13
    :cond_0
    monitor-enter p0

    .line 14
    const/4 p1, 0x1

    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    :try_start_0
    iget-boolean v1, p0, Lm76;->l0:Z

    .line 19
    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    .line 26
    .line 27
    iget-boolean v1, p0, Lm76;->m0:Z

    .line 28
    .line 29
    if-eqz v1, :cond_7

    .line 30
    .line 31
    :cond_2
    if-eqz p2, :cond_3

    .line 32
    .line 33
    iput-boolean v0, p0, Lm76;->l0:Z

    .line 34
    .line 35
    :cond_3
    if-eqz p3, :cond_4

    .line 36
    .line 37
    iput-boolean v0, p0, Lm76;->m0:Z

    .line 38
    .line 39
    :cond_4
    iget-boolean p2, p0, Lm76;->l0:Z

    .line 40
    .line 41
    if-nez p2, :cond_5

    .line 42
    .line 43
    iget-boolean p3, p0, Lm76;->m0:Z

    .line 44
    .line 45
    if-nez p3, :cond_5

    .line 46
    .line 47
    move p3, p1

    .line 48
    goto :goto_1

    .line 49
    :cond_5
    move p3, v0

    .line 50
    :goto_1
    if-nez p2, :cond_6

    .line 51
    .line 52
    iget-boolean p2, p0, Lm76;->m0:Z

    .line 53
    .line 54
    if-nez p2, :cond_6

    .line 55
    .line 56
    iget-boolean p2, p0, Lm76;->n0:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    if-nez p2, :cond_6

    .line 59
    .line 60
    move v0, p1

    .line 61
    :cond_6
    move p2, v0

    .line 62
    move v0, p3

    .line 63
    goto :goto_3

    .line 64
    :goto_2
    monitor-exit p0

    .line 65
    throw p1

    .line 66
    :cond_7
    move p2, v0

    .line 67
    :goto_3
    monitor-exit p0

    .line 68
    if-eqz v0, :cond_8

    .line 69
    .line 70
    const/4 p3, 0x0

    .line 71
    iput-object p3, p0, Lm76;->p0:Lwg;

    .line 72
    .line 73
    iget-object p3, p0, Lm76;->j0:Lp76;

    .line 74
    .line 75
    if-eqz p3, :cond_8

    .line 76
    .line 77
    monitor-enter p3

    .line 78
    :try_start_1
    iget v0, p3, Lp76;->m:I

    .line 79
    .line 80
    add-int/2addr v0, p1

    .line 81
    iput v0, p3, Lp76;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    .line 83
    monitor-exit p3

    .line 84
    goto :goto_4

    .line 85
    :catchall_1
    move-exception p0

    .line 86
    :try_start_2
    monitor-exit p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 87
    throw p0

    .line 88
    :cond_8
    :goto_4
    if-eqz p2, :cond_9

    .line 89
    .line 90
    invoke-virtual {p0, p4}, Lm76;->b(Ljava/io/IOException;)Ljava/io/IOException;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_9
    :goto_5
    return-object p4
.end method

.method public final f(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lm76;->n0:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Lm76;->n0:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Lm76;->l0:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lm76;->m0:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit p0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lm76;->b(Ljava/io/IOException;)Ljava/io/IOException;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    return-object p1

    .line 30
    :goto_1
    monitor-exit p0

    .line 31
    throw p1
.end method

.method public final g()Ljava/net/Socket;
    .locals 6

    .line 1
    iget-object v0, p0, Lm76;->j0:Lp76;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lks8;->a:[B

    .line 7
    .line 8
    iget-object v1, v0, Lp76;->p:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, -0x1

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ljava/lang/ref/Reference;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {v4, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v3, v5

    .line 43
    :goto_1
    const/4 v2, 0x0

    .line 44
    if-eq v3, v5, :cond_5

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Lm76;->j0:Lp76;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    iput-wide v3, v0, Lp76;->q:J

    .line 62
    .line 63
    iget-object p0, p0, Lm76;->Z:Lry1;

    .line 64
    .line 65
    iget-object v1, p0, Lry1;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Le28;

    .line 68
    .line 69
    iget-object v3, p0, Lry1;->d:Ljava/io/Serializable;

    .line 70
    .line 71
    check-cast v3, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 72
    .line 73
    sget-object v4, Lks8;->a:[B

    .line 74
    .line 75
    iget-boolean v4, v0, Lp76;->j:Z

    .line 76
    .line 77
    if-nez v4, :cond_2

    .line 78
    .line 79
    iget-object p0, p0, Lry1;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Lf23;

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    invoke-virtual {v1, p0, v3, v4}, Le28;->c(Lw18;J)V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :cond_2
    const/4 p0, 0x1

    .line 90
    iput-boolean p0, v0, Lp76;->j:Z

    .line 91
    .line 92
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_3

    .line 100
    .line 101
    invoke-virtual {v1}, Le28;->a()V

    .line 102
    .line 103
    .line 104
    :cond_3
    iget-object p0, v0, Lp76;->d:Ljava/net/Socket;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_4
    return-object v2

    .line 111
    :cond_5
    const-string p0, "Check failed."

    .line 112
    .line 113
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v2
.end method
