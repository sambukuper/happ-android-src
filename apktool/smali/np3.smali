.class public final Lnp3;
.super Lz75;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final i0:Ll20;


# instance fields
.field public final X:Lio3;

.field public Y:Ll37;

.field public final Z:Lqf1;

.field public f0:Lj50;

.field public g0:Lil1;

.field public h0:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v2, Lfj3;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc24;

    .line 7
    .line 8
    const/16 v1, 0x30

    .line 9
    .line 10
    invoke-direct {v0, v1, v1}, Lc24;-><init>(II)V

    .line 11
    .line 12
    .line 13
    iput-object v0, v2, Lfj3;->X:Lc24;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, v2, Lfj3;->Y:Z

    .line 17
    .line 18
    new-instance v0, Ll20;

    .line 19
    .line 20
    sget-object v3, Luh8;->Z:Luh8;

    .line 21
    .line 22
    sget-object v4, Lej7;->n0:Lej7;

    .line 23
    .line 24
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    sget-object v6, Lm10;->a:Ll10;

    .line 29
    .line 30
    new-instance v7, Lmd0;

    .line 31
    .line 32
    const/4 v1, 0x6

    .line 33
    invoke-direct {v7, v1}, Lmd0;-><init>(B)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct/range {v0 .. v7}, Ll20;-><init>(Lb30;Lfj3;Luh8;Ljava/text/DateFormat;Ljava/util/Locale;Ll10;Lmd0;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lnp3;->i0:Ll20;

    .line 41
    .line 42
    return-void
.end method

.method public constructor <init>()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lio3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, Lio3;-><init>(Lnp3;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    const v3, 0x3f19999a    # 0.6f

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/16 v5, 0x40

    .line 19
    .line 20
    invoke-direct {v2, v5, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lnp3;->X:Lio3;

    .line 24
    .line 25
    iget-object v2, v1, Lio3;->f0:Lz75;

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iput-object v0, v1, Lio3;->f0:Lz75;

    .line 30
    .line 31
    :cond_0
    new-instance v8, Lmj7;

    .line 32
    .line 33
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v10, Lc24;

    .line 37
    .line 38
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lc24;

    .line 42
    .line 43
    const/16 v2, 0x14

    .line 44
    .line 45
    const/16 v3, 0xc8

    .line 46
    .line 47
    invoke-direct {v1, v2, v3}, Lc24;-><init>(II)V

    .line 48
    .line 49
    .line 50
    iput-object v1, v10, Lc24;->X:Ljava/io/Serializable;

    .line 51
    .line 52
    sget-object v1, Luh8;->Y:[Ldh8;

    .line 53
    .line 54
    new-instance v9, Lu97;

    .line 55
    .line 56
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v12, Lb30;

    .line 60
    .line 61
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    sget-object v1, Lnp3;->i0:Ll20;

    .line 65
    .line 66
    iget-object v2, v1, Ll20;->Y:Lhi5;

    .line 67
    .line 68
    if-ne v2, v12, :cond_1

    .line 69
    .line 70
    move-object v7, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    new-instance v11, Ll20;

    .line 73
    .line 74
    iget-object v13, v1, Ll20;->Z:Lfj3;

    .line 75
    .line 76
    iget-object v14, v1, Ll20;->X:Luh8;

    .line 77
    .line 78
    iget-object v15, v1, Ll20;->g0:Ljava/text/DateFormat;

    .line 79
    .line 80
    iget-object v2, v1, Ll20;->h0:Ljava/util/Locale;

    .line 81
    .line 82
    iget-object v3, v1, Ll20;->i0:Ll10;

    .line 83
    .line 84
    iget-object v1, v1, Ll20;->f0:Lmd0;

    .line 85
    .line 86
    move-object/from16 v18, v1

    .line 87
    .line 88
    move-object/from16 v16, v2

    .line 89
    .line 90
    move-object/from16 v17, v3

    .line 91
    .line 92
    invoke-direct/range {v11 .. v18}, Ll20;-><init>(Lb30;Lfj3;Luh8;Ljava/text/DateFormat;Ljava/util/Locale;Ll10;Lmd0;)V

    .line 93
    .line 94
    .line 95
    move-object v7, v11

    .line 96
    :goto_0
    new-instance v11, Lmd0;

    .line 97
    .line 98
    sget-object v1, Lep3;->g0:Lep3;

    .line 99
    .line 100
    const/4 v1, 0x5

    .line 101
    invoke-direct {v11, v1}, Lmd0;-><init>(B)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lov0;

    .line 105
    .line 106
    new-instance v2, Loz4;

    .line 107
    .line 108
    sget v2, Loz4;->X:I

    .line 109
    .line 110
    new-array v2, v2, [I

    .line 111
    .line 112
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v6, Ll37;

    .line 116
    .line 117
    sget-object v12, Lob1;->a:Lpb1;

    .line 118
    .line 119
    invoke-direct/range {v6 .. v12}, Ll37;-><init>(Ll20;Lmj7;Lu97;Lc24;Lmd0;Lpb1;)V

    .line 120
    .line 121
    .line 122
    iput-object v6, v0, Lnp3;->Y:Ll37;

    .line 123
    .line 124
    new-instance v6, Lil1;

    .line 125
    .line 126
    move-object v13, v12

    .line 127
    move-object v12, v1

    .line 128
    invoke-direct/range {v6 .. v13}, Lil1;-><init>(Ll20;Lmj7;Lu97;Lc24;Lmd0;Lov0;Lpb1;)V

    .line 129
    .line 130
    .line 131
    iput-object v6, v0, Lnp3;->g0:Lil1;

    .line 132
    .line 133
    iget-object v1, v0, Lnp3;->Y:Ll37;

    .line 134
    .line 135
    sget-object v2, Lxp4;->v0:Lxp4;

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Lvp4;->f(Lxp4;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_2

    .line 142
    .line 143
    const/4 v1, 0x0

    .line 144
    invoke-virtual {v0, v2, v1}, Lnp3;->c(Lxp4;Z)V

    .line 145
    .line 146
    .line 147
    :cond_2
    new-instance v1, Lqf1;

    .line 148
    .line 149
    invoke-direct {v1}, Lt37;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-object v1, v0, Lnp3;->Z:Lqf1;

    .line 153
    .line 154
    new-instance v1, Lc24;

    .line 155
    .line 156
    const/16 v2, 0x1f4

    .line 157
    .line 158
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    const/16 v3, 0x7d0

    .line 163
    .line 164
    invoke-direct {v1, v2, v3}, Lc24;-><init>(II)V

    .line 165
    .line 166
    .line 167
    new-instance v1, Ljava/util/HashMap;

    .line 168
    .line 169
    const/16 v2, 0x8

    .line 170
    .line 171
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 172
    .line 173
    .line 174
    new-instance v1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 175
    .line 176
    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 177
    .line 178
    .line 179
    sget-object v1, Lj50;->j0:Lj50;

    .line 180
    .line 181
    iput-object v1, v0, Lnp3;->f0:Lj50;

    .line 182
    .line 183
    return-void
.end method


# virtual methods
.method public final a(Ll37;)Lqf1;
    .locals 2

    .line 1
    iget-object v0, p0, Lnp3;->f0:Lj50;

    .line 2
    .line 3
    iget-object p0, p0, Lnp3;->Z:Lqf1;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Lqf1;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1, v0}, Lt37;-><init>(Lt37;Ll37;Los4;)V

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public final b(Lr59;Lds0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnp3;->Y:Ll37;

    .line 2
    .line 3
    sget-object v1, Ln37;->l0:Ln37;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ll37;->j(Ln37;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    instance-of v1, p2, Ljava/io/Closeable;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move-object v1, p2

    .line 16
    check-cast v1, Ljava/io/Closeable;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :try_start_0
    invoke-virtual {p0, v0}, Lnp3;->a(Ll37;)Lqf1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0, p1, p2}, Lqf1;->F(Leq2;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 24
    .line 25
    .line 26
    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lr59;->close()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p0

    .line 34
    move-object v1, v2

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception p0

    .line 37
    :goto_0
    invoke-static {p1, v1, p0}, Lit0;->f(Lr59;Ljava/io/Closeable;Ljava/lang/Exception;)V

    .line 38
    .line 39
    .line 40
    throw v2

    .line 41
    :cond_0
    :try_start_2
    invoke-virtual {p0, v0}, Lnp3;->a(Ll37;)Lqf1;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0, p1, p2}, Lqf1;->F(Leq2;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lr59;->close()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_2
    move-exception p0

    .line 53
    sget-object p2, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 54
    .line 55
    sget-object p2, Lqo3;->f0:Lqo3;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lso3;->j1(Lqo3;)Lso3;

    .line 58
    .line 59
    .line 60
    :try_start_3
    invoke-virtual {p1}, Lr59;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catch_3
    move-exception p1

    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    instance-of p1, p0, Ljava/io/IOException;

    .line 69
    .line 70
    if-nez p1, :cond_1

    .line 71
    .line 72
    invoke-static {p0}, Lit0;->w(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Lu52;->q(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    check-cast p0, Ljava/io/IOException;

    .line 80
    .line 81
    throw p0
.end method

.method public final c(Lxp4;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lnp3;->Y:Ll37;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    filled-new-array {p1}, [Lxp4;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-wide v3, v0, Lvp4;->X:J

    .line 11
    .line 12
    aget-object v2, v2, v1

    .line 13
    .line 14
    iget-wide v5, v2, Lxp4;->Y:J

    .line 15
    .line 16
    or-long/2addr v5, v3

    .line 17
    cmp-long v2, v5, v3

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0, v5, v6}, Ll37;->g(J)Lwp4;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    check-cast v0, Ll37;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    filled-new-array {p1}, [Lxp4;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-wide v3, v0, Lvp4;->X:J

    .line 34
    .line 35
    aget-object v2, v2, v1

    .line 36
    .line 37
    iget-wide v5, v2, Lxp4;->Y:J

    .line 38
    .line 39
    not-long v5, v5

    .line 40
    and-long/2addr v5, v3

    .line 41
    cmp-long v2, v5, v3

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v0, v5, v6}, Ll37;->g(J)Lwp4;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :goto_1
    iput-object v0, p0, Lnp3;->Y:Ll37;

    .line 52
    .line 53
    iget-object v0, p0, Lnp3;->g0:Lil1;

    .line 54
    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    filled-new-array {p1}, [Lxp4;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-wide v2, v0, Lvp4;->X:J

    .line 62
    .line 63
    aget-object p1, p1, v1

    .line 64
    .line 65
    iget-wide p1, p1, Lxp4;->Y:J

    .line 66
    .line 67
    or-long/2addr p1, v2

    .line 68
    cmp-long v1, p1, v2

    .line 69
    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-virtual {v0, p1, p2}, Lil1;->g(J)Lwp4;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_2
    check-cast v0, Lil1;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    filled-new-array {p1}, [Lxp4;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-wide v2, v0, Lvp4;->X:J

    .line 85
    .line 86
    aget-object p1, p1, v1

    .line 87
    .line 88
    iget-wide p1, p1, Lxp4;->Y:J

    .line 89
    .line 90
    not-long p1, p1

    .line 91
    and-long/2addr p1, v2

    .line 92
    cmp-long v1, p1, v2

    .line 93
    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    invoke-virtual {v0, p1, p2}, Lil1;->g(J)Lwp4;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    goto :goto_2

    .line 102
    :goto_3
    iput-object v0, p0, Lnp3;->g0:Lil1;

    .line 103
    .line 104
    return-void
.end method

.method public final d(Lih4;)Lr59;
    .locals 12

    .line 1
    iget-object v0, p0, Lnp3;->X:Lio3;

    .line 2
    .line 3
    iget-object v1, v0, Lio3;->g0:Lmd0;

    .line 4
    .line 5
    new-instance v2, Lx41;

    .line 6
    .line 7
    invoke-direct {v2, p1, v1}, Lx41;-><init>(Lih4;Lmd0;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Lih4;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lb38;

    .line 13
    .line 14
    iget-object v1, v1, Lb38;->a:Lm90;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move v5, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v5, v4

    .line 23
    :goto_0
    if-nez v1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    iget v6, v0, Lio3;->X:I

    .line 27
    .line 28
    invoke-static {v1, v6}, Lie2;->a(II)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    sget-object v1, Lsq3;->Y:Lsq3;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v1, v0, Lio3;->Z:Lsq3;

    .line 38
    .line 39
    :goto_1
    invoke-virtual {v1}, Lsq3;->a()Lm90;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :cond_2
    new-instance v7, Lk43;

    .line 44
    .line 45
    iget-object v6, v0, Lio3;->h0:Lmd0;

    .line 46
    .line 47
    invoke-direct {v7, v6, v1, v2}, Lk43;-><init>(Lmd0;Lm90;Lx41;)V

    .line 48
    .line 49
    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    iput-boolean v4, v7, Lk43;->Z:Z

    .line 53
    .line 54
    :cond_3
    new-instance v6, Lr59;

    .line 55
    .line 56
    iget v8, v0, Lio3;->Y:I

    .line 57
    .line 58
    iget-object v9, v0, Lio3;->f0:Lz75;

    .line 59
    .line 60
    iget-char v11, v0, Lio3;->j0:C

    .line 61
    .line 62
    move-object v10, p1

    .line 63
    invoke-direct/range {v6 .. v11}, Lr59;-><init>(Lk43;ILz75;Lih4;C)V

    .line 64
    .line 65
    .line 66
    iget-object p1, v0, Lio3;->i0:Lr37;

    .line 67
    .line 68
    sget-object v0, Lio3;->m0:Lr37;

    .line 69
    .line 70
    if-eq p1, v0, :cond_4

    .line 71
    .line 72
    iput-object p1, v6, Lso3;->n0:Lr37;

    .line 73
    .line 74
    :cond_4
    iget-object p0, p0, Lnp3;->Y:Ll37;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object p1, Ln37;->f0:Ln37;

    .line 80
    .line 81
    iget v0, p0, Ll37;->n0:I

    .line 82
    .line 83
    iget p1, p1, Ln37;->Y:I

    .line 84
    .line 85
    and-int/2addr p1, v0

    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    iget-object p1, v6, Lro3;->X:Lit5;

    .line 89
    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0}, Ll37;->h()Lit5;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    iput-object p0, v6, Lro3;->X:Lit5;

    .line 99
    .line 100
    :cond_5
    sget-object p0, Ln37;->w0:Ln37;

    .line 101
    .line 102
    iget p0, p0, Ln37;->Y:I

    .line 103
    .line 104
    and-int/2addr p0, v0

    .line 105
    if-eqz p0, :cond_6

    .line 106
    .line 107
    move p0, v3

    .line 108
    goto :goto_2

    .line 109
    :cond_6
    move p0, v4

    .line 110
    :goto_2
    if-eqz p0, :cond_d

    .line 111
    .line 112
    if-eqz p0, :cond_7

    .line 113
    .line 114
    sget-object p0, Lqo3;->l0:Lqo3;

    .line 115
    .line 116
    iget p0, p0, Lqo3;->Y:I

    .line 117
    .line 118
    :goto_3
    move p1, p0

    .line 119
    goto :goto_4

    .line 120
    :cond_7
    move p0, v4

    .line 121
    goto :goto_3

    .line 122
    :goto_4
    iget v0, v6, Leq2;->Z:I

    .line 123
    .line 124
    not-int v1, p1

    .line 125
    and-int/2addr v1, v0

    .line 126
    and-int/2addr p0, p1

    .line 127
    or-int/2addr p0, v1

    .line 128
    xor-int p1, v0, p0

    .line 129
    .line 130
    if-eqz p1, :cond_d

    .line 131
    .line 132
    iput p0, v6, Leq2;->Z:I

    .line 133
    .line 134
    sget v0, Leq2;->j0:I

    .line 135
    .line 136
    and-int/2addr v0, p1

    .line 137
    if-nez v0, :cond_8

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_8
    sget-object v0, Lqo3;->k0:Lqo3;

    .line 141
    .line 142
    invoke-virtual {v0, p0}, Lqo3;->a(I)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    iput-boolean v0, v6, Leq2;->g0:Z

    .line 147
    .line 148
    sget-object v0, Lqo3;->j0:Lqo3;

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Lqo3;->a(I)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_a

    .line 155
    .line 156
    invoke-virtual {v0, p0}, Lqo3;->a(I)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_9

    .line 161
    .line 162
    const/16 v0, 0x7f

    .line 163
    .line 164
    iput v0, v6, Lso3;->m0:I

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_9
    iput v4, v6, Lso3;->m0:I

    .line 168
    .line 169
    :cond_a
    :goto_5
    sget-object v0, Lqo3;->m0:Lqo3;

    .line 170
    .line 171
    invoke-virtual {v0, p1}, Lqo3;->a(I)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-eqz p1, :cond_c

    .line 176
    .line 177
    invoke-virtual {v0, p0}, Lqo3;->a(I)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    iget-object v0, v6, Leq2;->h0:Lfs3;

    .line 182
    .line 183
    if-eqz p1, :cond_b

    .line 184
    .line 185
    iget-object p1, v0, Lfs3;->e:Lz47;

    .line 186
    .line 187
    if-nez p1, :cond_c

    .line 188
    .line 189
    new-instance p1, Lz47;

    .line 190
    .line 191
    invoke-direct {p1, v6}, Lz47;-><init>(Leq2;)V

    .line 192
    .line 193
    .line 194
    iput-object p1, v0, Lfs3;->e:Lz47;

    .line 195
    .line 196
    iput-object v0, v6, Leq2;->h0:Lfs3;

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_b
    const/4 p1, 0x0

    .line 200
    iput-object p1, v0, Lfs3;->e:Lz47;

    .line 201
    .line 202
    iput-object v0, v6, Leq2;->h0:Lfs3;

    .line 203
    .line 204
    :cond_c
    :goto_6
    sget-object p1, Lqo3;->h0:Lqo3;

    .line 205
    .line 206
    invoke-virtual {p1, p0}, Lqo3;->a(I)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    xor-int/2addr p1, v3

    .line 211
    iput-boolean p1, v6, Lso3;->o0:Z

    .line 212
    .line 213
    sget-object p1, Lqo3;->o0:Lqo3;

    .line 214
    .line 215
    invoke-virtual {p1, p0}, Lqo3;->a(I)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    iput-boolean p0, v6, Lso3;->p0:Z

    .line 220
    .line 221
    :cond_d
    return-object v6
.end method

.method public final e(Lrx4;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_a

    .line 2
    .line 3
    check-cast p1, Lv97;

    .line 4
    .line 5
    iget-object v0, p1, Lv97;->X:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lrx4;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lnp3;->e(Lrx4;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v1, Lxp4;->D0:Lxp4;

    .line 30
    .line 31
    iget-object v2, p0, Lnp3;->Y:Ll37;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lvp4;->f(Lxp4;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v1, p0, Lnp3;->h0:Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lnp3;->h0:Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    :cond_1
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_2
    iget-object p1, p1, Lv97;->Y:Ly97;

    .line 58
    .line 59
    if-eqz p1, :cond_9

    .line 60
    .line 61
    iget-object v0, p0, Lnp3;->f0:Lj50;

    .line 62
    .line 63
    iget-object v1, v0, Lf30;->g0:Ls37;

    .line 64
    .line 65
    iget-object v2, v1, Ls37;->X:[Lu37;

    .line 66
    .line 67
    array-length v3, v2

    .line 68
    const/4 v4, 0x0

    .line 69
    move v5, v4

    .line 70
    :goto_1
    const/4 v6, 0x1

    .line 71
    if-ge v5, v3, :cond_6

    .line 72
    .line 73
    aget-object v7, v2, v5

    .line 74
    .line 75
    if-ne v7, p1, :cond_5

    .line 76
    .line 77
    if-nez v5, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-virtual {v7}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-static {v7, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v2, v4, v7, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    aput-object p1, v7, v4

    .line 98
    .line 99
    add-int/2addr v5, v6

    .line 100
    sub-int/2addr v3, v5

    .line 101
    if-lez v3, :cond_4

    .line 102
    .line 103
    invoke-static {v2, v5, v7, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 104
    .line 105
    .line 106
    :cond_4
    move-object v2, v7

    .line 107
    goto :goto_2

    .line 108
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    add-int/lit8 v7, v3, 0x1

    .line 120
    .line 121
    invoke-static {v5, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, [Ljava/lang/Object;

    .line 126
    .line 127
    if-lez v3, :cond_7

    .line 128
    .line 129
    invoke-static {v2, v4, v5, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 130
    .line 131
    .line 132
    :cond_7
    aput-object p1, v5, v4

    .line 133
    .line 134
    move-object v2, v5

    .line 135
    :goto_2
    check-cast v2, [Lu37;

    .line 136
    .line 137
    new-instance p1, Ls37;

    .line 138
    .line 139
    iget-object v3, v1, Ls37;->Y:[Lu37;

    .line 140
    .line 141
    iget-object v1, v1, Ls37;->Z:[Lkx5;

    .line 142
    .line 143
    invoke-direct {p1, v2, v3, v1}, Ls37;-><init>([Lu37;[Lu37;[Lkx5;)V

    .line 144
    .line 145
    .line 146
    iget-object v1, v0, Lf30;->g0:Ls37;

    .line 147
    .line 148
    if-ne v1, p1, :cond_8

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_8
    new-instance v0, Lj50;

    .line 152
    .line 153
    invoke-direct {v0, p1}, Lf30;-><init>(Ls37;)V

    .line 154
    .line 155
    .line 156
    :goto_3
    iput-object v0, p0, Lnp3;->f0:Lj50;

    .line 157
    .line 158
    :cond_9
    :goto_4
    return-void

    .line 159
    :cond_a
    const-string p0, "argument \"module\" is null"

    .line 160
    .line 161
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final f(Lds0;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    iget-object v1, p0, Lnp3;->X:Lio3;

    .line 3
    .line 4
    iget v2, v1, Lio3;->X:I

    .line 5
    .line 6
    invoke-static {v0, v2}, Lie2;->a(II)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lsq3;->Y:Lsq3;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, v1, Lio3;->Z:Lsq3;

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0}, Lsq3;->a()Lm90;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :try_start_0
    new-instance v1, Lih4;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lih4;-><init>(Lm90;)V
    :try_end_0
    .catch Llq3; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 24
    .line 25
    .line 26
    :try_start_1
    invoke-virtual {p0, v1}, Lnp3;->d(Lih4;)Lr59;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0, p1}, Lnp3;->b(Lr59;Lds0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lih4;->p()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    return-object p0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 40
    :catchall_1
    move-exception p0

    .line 41
    :try_start_3
    throw p0
    :try_end_3
    .catch Llq3; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 42
    :catchall_2
    move-exception p0

    .line 43
    throw p0

    .line 44
    :catch_0
    move-exception p0

    .line 45
    new-instance p1, Lpp3;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {p0}, Lit0;->h(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v2, "Unexpected IOException (of type "

    .line 62
    .line 63
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v0, "): "

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-direct {p1, v0, p0}, Lpp3;-><init>(Leq2;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :catch_1
    move-exception p0

    .line 87
    throw p0
.end method
