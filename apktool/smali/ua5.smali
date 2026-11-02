.class public final Lua5;
.super Laq7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Lm5;

.field public final h0:Lcn2;

.field public final i0:Ljv5;

.field public final j0:Ljava/util/AbstractQueue;

.field public final k0:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final l0:Ljava/util/concurrent/atomic/AtomicReference;

.field public final m0:Lk37;

.field public volatile n0:Z

.field public volatile o0:Z


# direct methods
.method public constructor <init>(Lm5;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Laq7;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lua5;->g0:Lm5;

    .line 5
    .line 6
    sget-object p1, Los8;->X:Los8;

    .line 7
    .line 8
    iput-object p1, p0, Lua5;->h0:Lcn2;

    .line 9
    .line 10
    new-instance p1, Ljv5;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lua5;->i0:Ljv5;

    .line 16
    .line 17
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lua5;->k0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    .line 24
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lua5;->l0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    .line 31
    sget-object p1, Lsn8;->a:Lsun/misc/Unsafe;

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    sget-boolean p1, Lsn8;->b:Z

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    new-instance p1, Lxf7;

    .line 41
    .line 42
    invoke-direct {p1, v0}, Lyf7;-><init>(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance p1, Lbg7;

    .line 47
    .line 48
    invoke-direct {p1, v0}, Lbg7;-><init>(I)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iput-object p1, p0, Lua5;->j0:Ljava/util/AbstractQueue;

    .line 52
    .line 53
    new-instance p1, Lk37;

    .line 54
    .line 55
    invoke-direct {p1}, Lk37;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lua5;->m0:Lk37;

    .line 59
    .line 60
    const-wide/16 v0, 0x2

    .line 61
    .line 62
    invoke-virtual {p0, v0, v1}, Laq7;->e(J)V

    .line 63
    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lua5;->n0:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lua5;->g()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final g()V
    .locals 8

    .line 1
    iget-object v0, p0, Lua5;->k0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    :goto_0
    iget-object v0, p0, Lua5;->g0:Lm5;

    .line 12
    .line 13
    iget-object v0, v0, Laq7;->X:Lk01;

    .line 14
    .line 15
    iget-boolean v0, v0, Lk01;->Y:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_1
    iget-boolean v0, p0, Lua5;->o0:Z

    .line 22
    .line 23
    if-nez v0, :cond_d

    .line 24
    .line 25
    iget-boolean v0, p0, Lua5;->n0:Z

    .line 26
    .line 27
    iget-object v1, p0, Lua5;->j0:Ljava/util/AbstractQueue;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    move v3, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 v3, 0x0

    .line 39
    :goto_1
    if-eqz v0, :cond_5

    .line 40
    .line 41
    if-eqz v3, :cond_5

    .line 42
    .line 43
    iget-object v0, p0, Lua5;->l0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    invoke-static {v0}, Lm42;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    iget-object p0, p0, Lua5;->g0:Lm5;

    .line 52
    .line 53
    invoke-virtual {p0}, Lm5;->b()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    sget-object v1, Lm42;->X:Ljava/lang/Throwable;

    .line 58
    .line 59
    if-ne v0, v1, :cond_4

    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    iget-object p0, p0, Lua5;->g0:Lm5;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lm5;->onError(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_5
    if-nez v3, :cond_d

    .line 69
    .line 70
    :try_start_0
    iget-object v0, p0, Lua5;->h0:Lcn2;

    .line 71
    .line 72
    sget-object v3, Lch3;->d:Lmd0;

    .line 73
    .line 74
    if-ne v1, v3, :cond_6

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    :cond_6
    invoke-interface {v0, v1}, Lcn2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lq85;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    if-nez v0, :cond_7

    .line 84
    .line 85
    new-instance v0, Ljava/lang/NullPointerException;

    .line 86
    .line 87
    const-string v1, "The source returned by the mapper was null"

    .line 88
    .line 89
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lua5;->h(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_7
    sget-object v1, Lg02;->X:Lq85;

    .line 97
    .line 98
    const-wide/16 v3, 0x1

    .line 99
    .line 100
    if-eq v0, v1, :cond_c

    .line 101
    .line 102
    instance-of v1, v0, Low6;

    .line 103
    .line 104
    if-eqz v1, :cond_8

    .line 105
    .line 106
    check-cast v0, Low6;

    .line 107
    .line 108
    iput-boolean v2, p0, Lua5;->o0:Z

    .line 109
    .line 110
    iget-object v1, p0, Lua5;->i0:Ljv5;

    .line 111
    .line 112
    new-instance v2, Lo8;

    .line 113
    .line 114
    iget-object v0, v0, Low6;->Y:Ljava/lang/Object;

    .line 115
    .line 116
    const/4 v5, 0x6

    .line 117
    invoke-direct {v2, v0, p0, v5}, Lo8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ljv5;->b(Liv5;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_8
    new-instance v1, Lta5;

    .line 125
    .line 126
    invoke-direct {v1, p0}, Lta5;-><init>(Lua5;)V

    .line 127
    .line 128
    .line 129
    iget-object v5, p0, Lua5;->m0:Lk37;

    .line 130
    .line 131
    iget-object v5, v5, Lk37;->X:Ld37;

    .line 132
    .line 133
    :cond_9
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    check-cast v6, Lcq7;

    .line 138
    .line 139
    sget-object v7, Lko8;->X:Lko8;

    .line 140
    .line 141
    if-ne v6, v7, :cond_a

    .line 142
    .line 143
    invoke-virtual {v1}, Laq7;->c()V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_a
    invoke-virtual {v5, v6, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-eqz v7, :cond_9

    .line 152
    .line 153
    if-eqz v6, :cond_b

    .line 154
    .line 155
    invoke-interface {v6}, Lcq7;->c()V

    .line 156
    .line 157
    .line 158
    :cond_b
    :goto_2
    iget-object v5, v1, Laq7;->X:Lk01;

    .line 159
    .line 160
    iget-boolean v5, v5, Lk01;->Y:Z

    .line 161
    .line 162
    if-nez v5, :cond_e

    .line 163
    .line 164
    iput-boolean v2, p0, Lua5;->o0:Z

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Lq85;->d(Laq7;)V

    .line 167
    .line 168
    .line 169
    :goto_3
    invoke-virtual {p0, v3, v4}, Laq7;->e(J)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_c
    invoke-virtual {p0, v3, v4}, Laq7;->e(J)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :catchall_0
    move-exception v0

    .line 179
    invoke-static {v0}, Lvr3;->c0(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v0}, Lua5;->h(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_d
    :goto_4
    iget-object v0, p0, Lua5;->k0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-nez v0, :cond_0

    .line 193
    .line 194
    :cond_e
    :goto_5
    return-void
.end method

.method public final h(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Laq7;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lua5;->l0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lm42;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v0}, Lm42;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v0, Lm42;->X:Ljava/lang/Throwable;

    .line 17
    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p0, p0, Lua5;->g0:Lm5;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lm5;->onError(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-static {p1}, Ljr6;->b(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final i(J)V
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v2, :cond_4

    .line 7
    .line 8
    iget-object v2, p0, Lua5;->i0:Ljv5;

    .line 9
    .line 10
    cmp-long v4, p1, v0

    .line 11
    .line 12
    if-lez v4, :cond_3

    .line 13
    .line 14
    monitor-enter v2

    .line 15
    :try_start_0
    iget-boolean v4, v2, Ljv5;->Z:Z

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-wide v0, v2, Ljv5;->g0:J

    .line 20
    .line 21
    add-long/2addr v0, p1

    .line 22
    iput-wide v0, v2, Ljv5;->g0:J

    .line 23
    .line 24
    monitor-exit v2

    .line 25
    goto :goto_3

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_2

    .line 28
    :cond_0
    const/4 v4, 0x1

    .line 29
    iput-boolean v4, v2, Ljv5;->Z:Z

    .line 30
    .line 31
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :try_start_1
    iget-wide v4, v2, Ljv5;->X:J

    .line 33
    .line 34
    const-wide v6, 0x7fffffffffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    cmp-long v6, v4, v6

    .line 40
    .line 41
    if-eqz v6, :cond_2

    .line 42
    .line 43
    sub-long/2addr v4, p1

    .line 44
    cmp-long p1, v4, v0

    .line 45
    .line 46
    if-ltz p1, :cond_1

    .line 47
    .line 48
    iput-wide v4, v2, Ljv5;->X:J

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_1
    move-exception p0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p1, "more items arrived than were requested"

    .line 56
    .line 57
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljv5;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :goto_1
    monitor-enter v2

    .line 66
    :try_start_2
    iput-boolean v3, v2, Ljv5;->Z:Z

    .line 67
    .line 68
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 69
    throw p0

    .line 70
    :catchall_2
    move-exception p0

    .line 71
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 72
    throw p0

    .line 73
    :goto_2
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 74
    throw p0

    .line 75
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const-string p1, "n > 0 required"

    .line 79
    .line 80
    invoke-static {p1}, Lbt;->q(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_3
    iput-boolean v3, p0, Lua5;->o0:Z

    .line 84
    .line 85
    invoke-virtual {p0}, Lua5;->g()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lua5;->l0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lm42;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lua5;->n0:Z

    .line 11
    .line 12
    iget-object p1, p0, Lua5;->l0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-static {p1}, Lm42;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lm42;->X:Ljava/lang/Throwable;

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lua5;->g0:Lm5;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lm5;->onError(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p0, p0, Lua5;->m0:Lk37;

    .line 29
    .line 30
    invoke-virtual {p0}, Lk37;->c()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-static {p1}, Ljr6;->b(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lch3;->d:Lmd0;

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lua5;->j0:Ljava/util/AbstractQueue;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Laq7;->c()V

    .line 14
    .line 15
    .line 16
    new-instance p1, Law4;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lua5;->onError(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0}, Lua5;->g()V

    .line 26
    .line 27
    .line 28
    return-void
.end method
