.class public final Loh7;
.super La3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxe2;
.implements Lwo2;
.implements Lmh7;
.implements Lw05;


# static fields
.field public static final synthetic h0:J


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public g0:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Loh7;

    .line 4
    .line 5
    const-string v2, "_state$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Loh7;->h0:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loh7;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lze2;Lq51;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, Lnh7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lnh7;

    .line 7
    .line 8
    iget v1, v0, Lnh7;->m0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lnh7;->m0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lnh7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lnh7;-><init>(Loh7;Lq51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lnh7;->k0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lnh7;->m0:I

    .line 28
    .line 29
    sget-object v2, Lc71;->X:Lc71;

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v5, :cond_3

    .line 38
    .line 39
    if-eq v1, v4, :cond_2

    .line 40
    .line 41
    if-ne v1, v3, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lnh7;->i0:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v1, v0, Lnh7;->h0:Lbm3;

    .line 46
    .line 47
    iget-object v7, v0, Lnh7;->g0:Lqh7;

    .line 48
    .line 49
    iget-object v8, v0, Lnh7;->f0:Lze2;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v6

    .line 64
    :cond_2
    iget-object p1, v0, Lnh7;->j0:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v1, v0, Lnh7;->h0:Lbm3;

    .line 67
    .line 68
    iget-object v7, v0, Lnh7;->g0:Lqh7;

    .line 69
    .line 70
    iget-object v8, v0, Lnh7;->f0:Lze2;

    .line 71
    .line 72
    :try_start_1
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_3
    iget-object v7, v0, Lnh7;->g0:Lqh7;

    .line 77
    .line 78
    iget-object p1, v0, Lnh7;->f0:Lze2;

    .line 79
    .line 80
    :try_start_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La3;->d()Lb3;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Lqh7;

    .line 92
    .line 93
    move-object v7, p2

    .line 94
    :goto_1
    :try_start_3
    iget-object p2, v0, Ls51;->Y:Ls61;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget-object v1, Loy1;->E0:Loy1;

    .line 100
    .line 101
    invoke-interface {p2, v1}, Ls61;->H0(Lr61;)Lq61;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Lbm3;

    .line 106
    .line 107
    move-object v8, p1

    .line 108
    move-object v1, p2

    .line 109
    move-object p1, v6

    .line 110
    :cond_5
    :goto_2
    sget-object p2, Liu;->a:Lsun/misc/Unsafe;

    .line 111
    .line 112
    sget-wide v9, Loh7;->h0:J

    .line 113
    .line 114
    invoke-virtual {p2, p0, v9, v10}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    invoke-interface {v1}, Lbm3;->k()Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    invoke-interface {v1}, Lbm3;->R()Ljava/util/concurrent/CancellationException;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    throw p1

    .line 132
    :cond_7
    :goto_3
    if-eqz p1, :cond_8

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    if-nez v9, :cond_b

    .line 139
    .line 140
    :cond_8
    sget-object p1, Ld75;->a:Lz31;

    .line 141
    .line 142
    if-ne p2, p1, :cond_9

    .line 143
    .line 144
    move-object p1, v6

    .line 145
    goto :goto_4

    .line 146
    :cond_9
    move-object p1, p2

    .line 147
    :goto_4
    iput-object v8, v0, Lnh7;->f0:Lze2;

    .line 148
    .line 149
    iput-object v7, v0, Lnh7;->g0:Lqh7;

    .line 150
    .line 151
    iput-object v1, v0, Lnh7;->h0:Lbm3;

    .line 152
    .line 153
    iput-object v6, v0, Lnh7;->i0:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object p2, v0, Lnh7;->j0:Ljava/lang/Object;

    .line 156
    .line 157
    iput v4, v0, Lnh7;->m0:I

    .line 158
    .line 159
    invoke-interface {v8, p1, v0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    if-ne p1, v2, :cond_a

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_a
    move-object p1, p2

    .line 167
    :cond_b
    :goto_5
    iget-object p2, v7, Lqh7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 168
    .line 169
    sget-object v9, Lph7;->a:Lz31;

    .line 170
    .line 171
    invoke-virtual {p2, v9}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    sget-object v10, Lph7;->b:Lz31;

    .line 179
    .line 180
    if-ne p2, v10, :cond_c

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_c
    iput-object v8, v0, Lnh7;->f0:Lze2;

    .line 184
    .line 185
    iput-object v7, v0, Lnh7;->g0:Lqh7;

    .line 186
    .line 187
    iput-object v1, v0, Lnh7;->h0:Lbm3;

    .line 188
    .line 189
    iput-object p1, v0, Lnh7;->i0:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v6, v0, Lnh7;->j0:Ljava/lang/Object;

    .line 192
    .line 193
    iput v3, v0, Lnh7;->m0:I

    .line 194
    .line 195
    sget-object p2, Ldn8;->a:Ldn8;

    .line 196
    .line 197
    new-instance v10, Lmm0;

    .line 198
    .line 199
    invoke-static {v0}, Lmb6;->H(Lq51;)Lq51;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    invoke-direct {v10, v5, v11}, Lmm0;-><init>(ILq51;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v10}, Lmm0;->s()V

    .line 207
    .line 208
    .line 209
    iget-object v11, v7, Lqh7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 210
    .line 211
    :cond_d
    invoke-virtual {v11, v9, v10}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    if-eqz v12, :cond_e

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_e
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    if-eq v12, v9, :cond_d

    .line 223
    .line 224
    invoke-virtual {v10, p2}, Lmm0;->f(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :goto_6
    invoke-virtual {v10}, Lmm0;->q()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 231
    if-ne v9, v2, :cond_f

    .line 232
    .line 233
    move-object p2, v9

    .line 234
    :cond_f
    if-ne p2, v2, :cond_5

    .line 235
    .line 236
    :goto_7
    return-object v2

    .line 237
    :goto_8
    invoke-virtual {p0, v7}, La3;->i(Lb3;)V

    .line 238
    .line 239
    .line 240
    throw p1
.end method

.method public final b(Ls61;ILl90;)Lxe2;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, Ll90;->Y:Ll90;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lv77;->c(Lr77;Ls61;ILl90;)Lxe2;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_1
    return-object p0
.end method

.method public final e()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "MutableStateFlow.resetReplayCache is not supported"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final f()Lb3;
    .locals 0

    .line 1
    new-instance p0, Lqh7;

    .line 2
    .line 3
    invoke-direct {p0}, Lqh7;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final g(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Loh7;->m(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Loh7;->h0:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Ld75;->a:Lz31;

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    :cond_0
    return-object p0
.end method

.method public final h()[Lb3;
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    new-array p0, p0, [Lqh7;

    .line 3
    .line 4
    return-object p0
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, Ld75;->a:Lz31;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    move-object p1, v0

    .line 6
    :cond_0
    if-nez p2, :cond_1

    .line 7
    .line 8
    move-object p2, v0

    .line 9
    :cond_1
    invoke-virtual {p0, p1, p2}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Loh7;->m(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Ld75;->a:Lz31;

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0, p1}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 3
    .line 4
    sget-wide v1, Loh7;->h0:J

    .line 5
    .line 6
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-static {v3, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return v4

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_0
    :try_start_1
    invoke-static {v3, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    const/4 v3, 0x1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return v3

    .line 33
    :cond_1
    :try_start_2
    invoke-virtual {v0, p0, v1, v2, p2}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Loh7;->g0:I

    .line 37
    .line 38
    and-int/lit8 p2, p1, 0x1

    .line 39
    .line 40
    if-nez p2, :cond_b

    .line 41
    .line 42
    add-int/2addr p1, v3

    .line 43
    iput p1, p0, Loh7;->g0:I

    .line 44
    .line 45
    iget-object p2, p0, La3;->X:[Lb3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    .line 47
    monitor-exit p0

    .line 48
    :goto_0
    check-cast p2, [Lqh7;

    .line 49
    .line 50
    if-eqz p2, :cond_9

    .line 51
    .line 52
    array-length v0, p2

    .line 53
    move v1, v4

    .line 54
    :goto_1
    if-ge v1, v0, :cond_9

    .line 55
    .line 56
    aget-object v2, p2, v1

    .line 57
    .line 58
    if-eqz v2, :cond_8

    .line 59
    .line 60
    iget-object v2, v2, Lqh7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 61
    .line 62
    :goto_2
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    sget-object v6, Lph7;->b:Lz31;

    .line 70
    .line 71
    if-ne v5, v6, :cond_3

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    sget-object v7, Lph7;->a:Lz31;

    .line 75
    .line 76
    if-ne v5, v7, :cond_6

    .line 77
    .line 78
    :cond_4
    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_5

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    if-eq v7, v5, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    invoke-virtual {v2, v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_7

    .line 97
    .line 98
    check-cast v5, Lmm0;

    .line 99
    .line 100
    sget-object v2, Ldn8;->a:Ldn8;

    .line 101
    .line 102
    invoke-virtual {v5, v2}, Lmm0;->f(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    if-eq v6, v5, :cond_6

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_8
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_9
    monitor-enter p0

    .line 117
    :try_start_3
    iget p2, p0, Loh7;->g0:I

    .line 118
    .line 119
    if-ne p2, p1, :cond_a

    .line 120
    .line 121
    add-int/2addr p1, v3

    .line 122
    iput p1, p0, Loh7;->g0:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 123
    .line 124
    monitor-exit p0

    .line 125
    return v3

    .line 126
    :catchall_1
    move-exception p1

    .line 127
    goto :goto_4

    .line 128
    :cond_a
    :try_start_4
    iget-object p1, p0, La3;->X:[Lb3;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 129
    .line 130
    monitor-exit p0

    .line 131
    move v8, p2

    .line 132
    move-object p2, p1

    .line 133
    move p1, v8

    .line 134
    goto :goto_0

    .line 135
    :goto_4
    monitor-exit p0

    .line 136
    throw p1

    .line 137
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 138
    .line 139
    :try_start_5
    iput p1, p0, Loh7;->g0:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 140
    .line 141
    monitor-exit p0

    .line 142
    return v3

    .line 143
    :goto_5
    monitor-exit p0

    .line 144
    throw p1
.end method
